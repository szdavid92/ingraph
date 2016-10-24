/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.RangeLiteral#getLower <em>Lower</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.RangeLiteral#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRangeLiteral()
 * @model
 * @generated
 */
public interface RangeLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(String)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRangeLiteral_Lower()
   * @model
   * @generated
   */
  String getLower();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.RangeLiteral#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(String value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(String)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRangeLiteral_Upper()
   * @model
   * @generated
   */
  String getUpper();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.RangeLiteral#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(String value);

} // RangeLiteral
