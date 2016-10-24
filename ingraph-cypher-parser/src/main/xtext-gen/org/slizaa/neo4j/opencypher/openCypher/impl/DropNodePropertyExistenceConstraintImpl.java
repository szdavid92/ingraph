/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.slizaa.neo4j.opencypher.openCypher.DropNodePropertyExistenceConstraint;
import org.slizaa.neo4j.opencypher.openCypher.NodePropertyExistenceConstraint;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Node Property Existence Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.DropNodePropertyExistenceConstraintImpl#getNodePropertyExistenceConstraint <em>Node Property Existence Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropNodePropertyExistenceConstraintImpl extends CommandImpl implements DropNodePropertyExistenceConstraint
{
  /**
   * The cached value of the '{@link #getNodePropertyExistenceConstraint() <em>Node Property Existence Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodePropertyExistenceConstraint()
   * @generated
   * @ordered
   */
  protected NodePropertyExistenceConstraint nodePropertyExistenceConstraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DropNodePropertyExistenceConstraintImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OpenCypherPackage.Literals.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePropertyExistenceConstraint getNodePropertyExistenceConstraint()
  {
    return nodePropertyExistenceConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodePropertyExistenceConstraint(NodePropertyExistenceConstraint newNodePropertyExistenceConstraint, NotificationChain msgs)
  {
    NodePropertyExistenceConstraint oldNodePropertyExistenceConstraint = nodePropertyExistenceConstraint;
    nodePropertyExistenceConstraint = newNodePropertyExistenceConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT, oldNodePropertyExistenceConstraint, newNodePropertyExistenceConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodePropertyExistenceConstraint(NodePropertyExistenceConstraint newNodePropertyExistenceConstraint)
  {
    if (newNodePropertyExistenceConstraint != nodePropertyExistenceConstraint)
    {
      NotificationChain msgs = null;
      if (nodePropertyExistenceConstraint != null)
        msgs = ((InternalEObject)nodePropertyExistenceConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT, null, msgs);
      if (newNodePropertyExistenceConstraint != null)
        msgs = ((InternalEObject)newNodePropertyExistenceConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT, null, msgs);
      msgs = basicSetNodePropertyExistenceConstraint(newNodePropertyExistenceConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT, newNodePropertyExistenceConstraint, newNodePropertyExistenceConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT:
        return basicSetNodePropertyExistenceConstraint(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT:
        return getNodePropertyExistenceConstraint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT:
        setNodePropertyExistenceConstraint((NodePropertyExistenceConstraint)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT:
        setNodePropertyExistenceConstraint((NodePropertyExistenceConstraint)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.DROP_NODE_PROPERTY_EXISTENCE_CONSTRAINT__NODE_PROPERTY_EXISTENCE_CONSTRAINT:
        return nodePropertyExistenceConstraint != null;
    }
    return super.eIsSet(featureID);
  }

} //DropNodePropertyExistenceConstraintImpl
