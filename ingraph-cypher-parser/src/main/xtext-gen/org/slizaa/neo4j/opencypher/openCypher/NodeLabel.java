/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.NodeLabel#getLabelName <em>Label Name</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getNodeLabel()
 * @model
 * @generated
 */
public interface NodeLabel extends EObject
{
  /**
   * Returns the value of the '<em><b>Label Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Name</em>' attribute.
   * @see #setLabelName(String)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getNodeLabel_LabelName()
   * @model
   * @generated
   */
  String getLabelName();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.NodeLabel#getLabelName <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Name</em>' attribute.
   * @see #getLabelName()
   * @generated
   */
  void setLabelName(String value);

} // NodeLabel
