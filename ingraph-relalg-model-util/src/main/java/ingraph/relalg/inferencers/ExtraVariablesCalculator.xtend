package ingraph.relalg.inferencers

import ingraph.logger.IngraphLogger
import ingraph.relalg.calculators.VariableExtractor
import ingraph.relalg.collectors.CollectionHelper
import ingraph.relalg.util.ElementVariableExtractor
import java.util.List
import relalg.AbstractJoinOperator
import relalg.AttributeVariable
import relalg.ExpressionVariable
import relalg.FunctionExpression
import relalg.NullaryOperator
import relalg.Operator
import relalg.ProjectionOperator
import relalg.RelalgContainer
import relalg.TernaryOperator
import relalg.UnaryOperator
import relalg.UnionOperator
import relalg.Variable

/**
 * Infers extra variables. For example, a projection or a selection may need extra variables for projecting attributes or evaluating conditions.
 */
class ExtraVariablesCalculator {

	extension IngraphLogger logger = new IngraphLogger(ExtraVariablesCalculator.name)
	extension VariableExtractor variableExtractor = new VariableExtractor
	extension CollectionHelper listUnionCalculator = new CollectionHelper
	extension ElementVariableExtractor elementVariableExtractor = new ElementVariableExtractor

	def calculateExtraVariables(RelalgContainer container) {
		if (!container.incrementalPlan) {
			throw new IllegalStateException("ExtraVariablesCalculator must be executed on an incremental query plan")
		}

		if (!container.isExternalSchemaInferred) {
			throw new IllegalStateException("ExternalSchemaCalculator must be executed before ExtraVariableCalculator")
		} else if (container.isExtraVariablesInferred) {
			throw new IllegalStateException("ExtraVariablesCalculator on relalg container was already executed")
		} else {
			container.extraVariablesInferred = true
		}

		container.rootExpression.fillExtraVariables(#[])
		container
	}

	private def dispatch void fillExtraVariables(NullaryOperator op, List<Variable> extraVariables) {
		op.extraVariables.addAll(extraVariables)
	}

	// some unary operators, such as selection, projection and grouping, often require extra variables
	private def dispatch void fillExtraVariables(UnaryOperator op, List<Variable> extraVariables) {
		op.extraVariables.addAll(extraVariables)

		val newExtraVariables = extractUnaryOperatorExtraVariables(op)
		var inputExtraVariables = uniqueUnion(extraVariables, newExtraVariables)

		if (op instanceof ProjectionOperator) {
			inputExtraVariables = inputExtraVariables.minus(op.calculatedVariables)
		}

		val filteredInputExtraVariables = inputExtraVariables.propagateTo(op.input)
		op.input.fillExtraVariables(filteredInputExtraVariables)
	}

	private def dispatch void fillExtraVariables(UnionOperator op, List<Variable> extraVariables) {
		op.extraVariables.addAll(extraVariables)
		op.leftInput.fillExtraVariables(extraVariables)
		op.rightInput.fillExtraVariables(extraVariables)
	}

	private def propagateTo(List<Variable> extraVariables, Operator inputOp) {
		val inputSchemaNames = inputOp.externalSchema.map[toString]

		val attributes = extraVariables.filter(AttributeVariable).filter[
			!inputSchemaNames.contains( it.toString ) && // do not propagate if it is already there
																										// TODO check this for joins - e.g. if it is available on the left input, do not propagate to the right 
			inputSchemaNames.contains( it.baseVariable.extractElementVariable.toString )
		]
		val functions = extraVariables.filter(ExpressionVariable).filter[expression instanceof FunctionExpression] // TODO this should involve a decision
				.filter[!inputSchemaNames.contains( it.toString )]

		uniqueUnion(attributes, functions)
	}

	private def dispatch void fillExtraVariables(AbstractJoinOperator op, List<Variable> extraVariables) {
		op.extraVariables.addAll(extraVariables)
		val leftExtraVariables = extraVariables.propagateTo(op.leftInput)
		val rightExtraVariables = extraVariables.propagateTo(op.rightInput)

		// remove duplicates as we only need each extra variable once
		// we choose "right\left" as it works for both equijoin and antijoin operators,
		// as extra attributes that are available from both the left and right input
		rightExtraVariables.removeAll(leftExtraVariables)

		// val orderedExtraVariables = union(leftExtraVariables, rightExtraVariables)
		op.leftInput.fillExtraVariables(leftExtraVariables)
		op.rightInput.fillExtraVariables(rightExtraVariables)
	}

}