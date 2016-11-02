package ingraph.optimization.transformations.relalg2rete

import ingraph.optimization.patterns.ExpandOperatorMatcher
import ingraph.optimization.patterns.ExpandVertexMatcher
import ingraph.optimization.transformations.AbstractRelalgTransformation
import org.apache.log4j.Level
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil
import relalg.RelalgContainer

class Relalg2ReteTransformation extends AbstractRelalgTransformation {

	new() {
		ViatraQueryLoggingUtil.getDefaultLogger().setLevel(Level.OFF)
	}

	def log(String log) {
//		println(log)
	}

	def transformToRete(RelalgContainer container) {
		val statements = register(container)
		statements.fireWhilePossible(expandVertexRule)
		statements.fireWhilePossible(expandOperatorRule)
		return container
	}

	/**
	 * Replace the GetVertexOperator + ExpandOperator pairs with a single GetEdgesOperator
	 */
	protected def expandVertexRule() {
		createRule() //
		.precondition(ExpandVertexMatcher.querySpecification) //
		.action [ //
			val expandOperator = expandOperator
			log("expandVertexRule fired for " + expandOperator.edgeVariable.name)

			val getEdgesOperator = createGetEdgesOperator => [
				sourceVertexVariable = expandOperator.source
				targetVertexVariable = expandOperator.target
				edgeVariable = expandOperator.edgeVariable
				container = expandOperator.container
			]

			changeOperator(parentOperator, expandOperator, getEdgesOperator)
		].build
	}

	/**
	 * Replace a single expand operator with a GetEdgesOperator and a JoinOperator
	 */
	protected def expandOperatorRule() {
		createRule() //
		.precondition(ExpandOperatorMatcher.querySpecification) //
		.action [ //
			val expandOperator = expandOperator
			log("expandOperatorRule fired for " + expandOperator.edgeVariable.name)

			val getEdgesOperator = createGetEdgesOperator => [
				sourceVertexVariable = expandOperator.source
				targetVertexVariable = expandOperator.target
				edgeVariable = expandOperator.edgeVariable
				container = expandOperator.container
			]
			val joinOperator = createJoinOperator => [
				leftInput = expandOperator.getInput
				rightInput = getEdgesOperator
				container = expandOperator.container
			]

			changeOperator(parentOperator, expandOperator, joinOperator)
		].build
	}

}
