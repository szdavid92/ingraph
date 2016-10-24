/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.Merge#getPatternPart <em>Pattern Part</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.Merge#getMergeActions <em>Merge Actions</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getMerge()
 * @model
 * @generated
 */
public interface Merge extends Clause
{
  /**
   * Returns the value of the '<em><b>Pattern Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Part</em>' containment reference.
   * @see #setPatternPart(PatternPart)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getMerge_PatternPart()
   * @model containment="true"
   * @generated
   */
  PatternPart getPatternPart();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.Merge#getPatternPart <em>Pattern Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern Part</em>' containment reference.
   * @see #getPatternPart()
   * @generated
   */
  void setPatternPart(PatternPart value);

  /**
   * Returns the value of the '<em><b>Merge Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.opencypher.openCypher.MergeAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Merge Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Merge Actions</em>' containment reference list.
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getMerge_MergeActions()
   * @model containment="true"
   * @generated
   */
  EList<MergeAction> getMergeActions();

} // Merge
