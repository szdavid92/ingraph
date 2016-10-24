/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.slizaa.neo4j.opencypher.openCypher.IdentifiedIndexLookup;
import org.slizaa.neo4j.opencypher.openCypher.LegacyParameter;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identified Index Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.IdentifiedIndexLookupImpl#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.IdentifiedIndexLookupImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.IdentifiedIndexLookupImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.IdentifiedIndexLookupImpl#getLegacyParameter <em>Legacy Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiedIndexLookupImpl extends NodeLookupImpl implements IdentifiedIndexLookup
{
  /**
   * The default value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexName()
   * @generated
   * @ordered
   */
  protected static final String INDEX_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexName()
   * @generated
   * @ordered
   */
  protected String indexName = INDEX_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLegacyParameter() <em>Legacy Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLegacyParameter()
   * @generated
   * @ordered
   */
  protected LegacyParameter legacyParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentifiedIndexLookupImpl()
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
    return OpenCypherPackage.Literals.IDENTIFIED_INDEX_LOOKUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIndexName()
  {
    return indexName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndexName(String newIndexName)
  {
    String oldIndexName = indexName;
    indexName = newIndexName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__INDEX_NAME, oldIndexName, indexName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegacyParameter getLegacyParameter()
  {
    return legacyParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLegacyParameter(LegacyParameter newLegacyParameter, NotificationChain msgs)
  {
    LegacyParameter oldLegacyParameter = legacyParameter;
    legacyParameter = newLegacyParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER, oldLegacyParameter, newLegacyParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLegacyParameter(LegacyParameter newLegacyParameter)
  {
    if (newLegacyParameter != legacyParameter)
    {
      NotificationChain msgs = null;
      if (legacyParameter != null)
        msgs = ((InternalEObject)legacyParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER, null, msgs);
      if (newLegacyParameter != null)
        msgs = ((InternalEObject)newLegacyParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER, null, msgs);
      msgs = basicSetLegacyParameter(newLegacyParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER, newLegacyParameter, newLegacyParameter));
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
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER:
        return basicSetLegacyParameter(null, msgs);
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
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__INDEX_NAME:
        return getIndexName();
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__KEY:
        return getKey();
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__VALUE:
        return getValue();
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER:
        return getLegacyParameter();
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
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__INDEX_NAME:
        setIndexName((String)newValue);
        return;
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__KEY:
        setKey((String)newValue);
        return;
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__VALUE:
        setValue((String)newValue);
        return;
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER:
        setLegacyParameter((LegacyParameter)newValue);
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
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__INDEX_NAME:
        setIndexName(INDEX_NAME_EDEFAULT);
        return;
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER:
        setLegacyParameter((LegacyParameter)null);
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
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__INDEX_NAME:
        return INDEX_NAME_EDEFAULT == null ? indexName != null : !INDEX_NAME_EDEFAULT.equals(indexName);
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case OpenCypherPackage.IDENTIFIED_INDEX_LOOKUP__LEGACY_PARAMETER:
        return legacyParameter != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (indexName: ");
    result.append(indexName);
    result.append(", key: ");
    result.append(key);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //IdentifiedIndexLookupImpl
