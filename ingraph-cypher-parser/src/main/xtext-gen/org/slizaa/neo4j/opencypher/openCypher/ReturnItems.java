/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getOrder <em>Order</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getSkip <em>Skip</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getAll <em>All</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getReturnItems()
 * @model
 * @generated
 */
public interface ReturnItems extends ReturnBody
{
  /**
   * Returns the value of the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' containment reference.
   * @see #setOrder(Order)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getReturnItems_Order()
   * @model containment="true"
   * @generated
   */
  Order getOrder();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getOrder <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' containment reference.
   * @see #getOrder()
   * @generated
   */
  void setOrder(Order value);

  /**
   * Returns the value of the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip</em>' containment reference.
   * @see #setSkip(Skip)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getReturnItems_Skip()
   * @model containment="true"
   * @generated
   */
  Skip getSkip();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getSkip <em>Skip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip</em>' containment reference.
   * @see #getSkip()
   * @generated
   */
  void setSkip(Skip value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference.
   * @see #setLimit(Limit)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getReturnItems_Limit()
   * @model containment="true"
   * @generated
   */
  Limit getLimit();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getLimit <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' containment reference.
   * @see #getLimit()
   * @generated
   */
  void setLimit(Limit value);

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(String)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getReturnItems_All()
   * @model
   * @generated
   */
  String getAll();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.ReturnItems#getAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #getAll()
   * @generated
   */
  void setAll(String value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.opencypher.openCypher.ReturnItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getReturnItems_Items()
   * @model containment="true"
   * @generated
   */
  EList<ReturnItem> getItems();

} // ReturnItems
