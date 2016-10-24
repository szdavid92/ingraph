/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.slizaa.neo4j.opencypher.openCypher.DropRelationshipPropertyExistenceConstraint;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;
import org.slizaa.neo4j.opencypher.openCypher.RelationshipPropertyExistenceConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Relationship Property Existence Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.DropRelationshipPropertyExistenceConstraintImpl#getRelationshipPropertyExistenceConstraint <em>Relationship Property Existence Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropRelationshipPropertyExistenceConstraintImpl extends CommandImpl implements DropRelationshipPropertyExistenceConstraint
{
  /**
   * The cached value of the '{@link #getRelationshipPropertyExistenceConstraint() <em>Relationship Property Existence Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationshipPropertyExistenceConstraint()
   * @generated
   * @ordered
   */
  protected RelationshipPropertyExistenceConstraint relationshipPropertyExistenceConstraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DropRelationshipPropertyExistenceConstraintImpl()
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
    return OpenCypherPackage.Literals.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipPropertyExistenceConstraint getRelationshipPropertyExistenceConstraint()
  {
    return relationshipPropertyExistenceConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationshipPropertyExistenceConstraint(RelationshipPropertyExistenceConstraint newRelationshipPropertyExistenceConstraint, NotificationChain msgs)
  {
    RelationshipPropertyExistenceConstraint oldRelationshipPropertyExistenceConstraint = relationshipPropertyExistenceConstraint;
    relationshipPropertyExistenceConstraint = newRelationshipPropertyExistenceConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT, oldRelationshipPropertyExistenceConstraint, newRelationshipPropertyExistenceConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationshipPropertyExistenceConstraint(RelationshipPropertyExistenceConstraint newRelationshipPropertyExistenceConstraint)
  {
    if (newRelationshipPropertyExistenceConstraint != relationshipPropertyExistenceConstraint)
    {
      NotificationChain msgs = null;
      if (relationshipPropertyExistenceConstraint != null)
        msgs = ((InternalEObject)relationshipPropertyExistenceConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT, null, msgs);
      if (newRelationshipPropertyExistenceConstraint != null)
        msgs = ((InternalEObject)newRelationshipPropertyExistenceConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT, null, msgs);
      msgs = basicSetRelationshipPropertyExistenceConstraint(newRelationshipPropertyExistenceConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT, newRelationshipPropertyExistenceConstraint, newRelationshipPropertyExistenceConstraint));
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
      case OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT:
        return basicSetRelationshipPropertyExistenceConstraint(null, msgs);
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
      case OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT:
        return getRelationshipPropertyExistenceConstraint();
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
      case OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT:
        setRelationshipPropertyExistenceConstraint((RelationshipPropertyExistenceConstraint)newValue);
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
      case OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT:
        setRelationshipPropertyExistenceConstraint((RelationshipPropertyExistenceConstraint)null);
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
      case OpenCypherPackage.DROP_RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT:
        return relationshipPropertyExistenceConstraint != null;
    }
    return super.eIsSet(featureID);
  }

} //DropRelationshipPropertyExistenceConstraintImpl
