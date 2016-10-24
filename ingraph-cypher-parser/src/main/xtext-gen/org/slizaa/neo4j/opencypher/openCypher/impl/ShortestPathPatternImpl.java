/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.openCypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.neo4j.opencypher.openCypher.Expression;
import org.slizaa.neo4j.opencypher.openCypher.Expression3Part;
import org.slizaa.neo4j.opencypher.openCypher.NodeLabel;
import org.slizaa.neo4j.opencypher.openCypher.NodeLabels;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage;
import org.slizaa.neo4j.opencypher.openCypher.PatternElement;
import org.slizaa.neo4j.opencypher.openCypher.PropertyExpression;
import org.slizaa.neo4j.opencypher.openCypher.PropertyLookup;
import org.slizaa.neo4j.opencypher.openCypher.RemoveItem;
import org.slizaa.neo4j.opencypher.openCypher.ShortestPathPattern;
import org.slizaa.neo4j.opencypher.openCypher.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shortest Path Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ShortestPathPatternImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ShortestPathPatternImpl#getNodeLabels <em>Node Labels</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ShortestPathPatternImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ShortestPathPatternImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ShortestPathPatternImpl#getExpression3Parts <em>Expression3 Parts</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ShortestPathPatternImpl#getNodeLabelList <em>Node Label List</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ShortestPathPatternImpl#getPropertyLookup <em>Property Lookup</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.impl.ShortestPathPatternImpl#getPatternElement <em>Pattern Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortestPathPatternImpl extends AnonymousPatternPartImpl implements ShortestPathPattern
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * The cached value of the '{@link #getNodeLabels() <em>Node Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeLabels()
   * @generated
   * @ordered
   */
  protected NodeLabels nodeLabels;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The cached value of the '{@link #getExpression3Parts() <em>Expression3 Parts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression3Parts()
   * @generated
   * @ordered
   */
  protected EList<Expression3Part> expression3Parts;

  /**
   * The cached value of the '{@link #getNodeLabelList() <em>Node Label List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeLabelList()
   * @generated
   * @ordered
   */
  protected EList<NodeLabel> nodeLabelList;

  /**
   * The cached value of the '{@link #getPropertyLookup() <em>Property Lookup</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyLookup()
   * @generated
   * @ordered
   */
  protected EList<PropertyLookup> propertyLookup;

  /**
   * The cached value of the '{@link #getPatternElement() <em>Pattern Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternElement()
   * @generated
   * @ordered
   */
  protected PatternElement patternElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShortestPathPatternImpl()
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
    return OpenCypherPackage.Literals.SHORTEST_PATH_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLabels getNodeLabels()
  {
    return nodeLabels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeLabels(NodeLabels newNodeLabels, NotificationChain msgs)
  {
    NodeLabels oldNodeLabels = nodeLabels;
    nodeLabels = newNodeLabels;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS, oldNodeLabels, newNodeLabels);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeLabels(NodeLabels newNodeLabels)
  {
    if (newNodeLabels != nodeLabels)
    {
      NotificationChain msgs = null;
      if (nodeLabels != null)
        msgs = ((InternalEObject)nodeLabels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS, null, msgs);
      if (newNodeLabels != null)
        msgs = ((InternalEObject)newNodeLabels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS, null, msgs);
      msgs = basicSetNodeLabels(newNodeLabels, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS, newNodeLabels, newNodeLabels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression3Part> getExpression3Parts()
  {
    if (expression3Parts == null)
    {
      expression3Parts = new EObjectContainmentEList<Expression3Part>(Expression3Part.class, this, OpenCypherPackage.SHORTEST_PATH_PATTERN__EXPRESSION3_PARTS);
    }
    return expression3Parts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeLabel> getNodeLabelList()
  {
    if (nodeLabelList == null)
    {
      nodeLabelList = new EObjectContainmentEList<NodeLabel>(NodeLabel.class, this, OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABEL_LIST);
    }
    return nodeLabelList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyLookup> getPropertyLookup()
  {
    if (propertyLookup == null)
    {
      propertyLookup = new EObjectContainmentEList<PropertyLookup>(PropertyLookup.class, this, OpenCypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUP);
    }
    return propertyLookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternElement getPatternElement()
  {
    return patternElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatternElement(PatternElement newPatternElement, NotificationChain msgs)
  {
    PatternElement oldPatternElement = patternElement;
    patternElement = newPatternElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT, oldPatternElement, newPatternElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatternElement(PatternElement newPatternElement)
  {
    if (newPatternElement != patternElement)
    {
      NotificationChain msgs = null;
      if (patternElement != null)
        msgs = ((InternalEObject)patternElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT, null, msgs);
      if (newPatternElement != null)
        msgs = ((InternalEObject)newPatternElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT, null, msgs);
      msgs = basicSetPatternElement(newPatternElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT, newPatternElement, newPatternElement));
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
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE:
        return basicSetVariable(null, msgs);
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        return basicSetNodeLabels(null, msgs);
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT:
        return basicSetLeft(null, msgs);
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__EXPRESSION3_PARTS:
        return ((InternalEList<?>)getExpression3Parts()).basicRemove(otherEnd, msgs);
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABEL_LIST:
        return ((InternalEList<?>)getNodeLabelList()).basicRemove(otherEnd, msgs);
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUP:
        return ((InternalEList<?>)getPropertyLookup()).basicRemove(otherEnd, msgs);
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        return basicSetPatternElement(null, msgs);
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
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE:
        return getVariable();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        return getNodeLabels();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__OPERATOR:
        return getOperator();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT:
        return getLeft();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__EXPRESSION3_PARTS:
        return getExpression3Parts();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABEL_LIST:
        return getNodeLabelList();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUP:
        return getPropertyLookup();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        return getPatternElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        setNodeLabels((NodeLabels)newValue);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__OPERATOR:
        setOperator((String)newValue);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT:
        setLeft((Expression)newValue);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__EXPRESSION3_PARTS:
        getExpression3Parts().clear();
        getExpression3Parts().addAll((Collection<? extends Expression3Part>)newValue);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABEL_LIST:
        getNodeLabelList().clear();
        getNodeLabelList().addAll((Collection<? extends NodeLabel>)newValue);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUP:
        getPropertyLookup().clear();
        getPropertyLookup().addAll((Collection<? extends PropertyLookup>)newValue);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        setPatternElement((PatternElement)newValue);
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
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE:
        setVariable((Variable)null);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        setNodeLabels((NodeLabels)null);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT:
        setLeft((Expression)null);
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__EXPRESSION3_PARTS:
        getExpression3Parts().clear();
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABEL_LIST:
        getNodeLabelList().clear();
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUP:
        getPropertyLookup().clear();
        return;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        setPatternElement((PatternElement)null);
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
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE:
        return variable != null;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        return nodeLabels != null;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT:
        return left != null;
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__EXPRESSION3_PARTS:
        return expression3Parts != null && !expression3Parts.isEmpty();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABEL_LIST:
        return nodeLabelList != null && !nodeLabelList.isEmpty();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUP:
        return propertyLookup != null && !propertyLookup.isEmpty();
      case OpenCypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        return patternElement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == RemoveItem.class)
    {
      switch (derivedFeatureID)
      {
        case OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE: return OpenCypherPackage.REMOVE_ITEM__VARIABLE;
        case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS: return OpenCypherPackage.REMOVE_ITEM__NODE_LABELS;
        default: return -1;
      }
    }
    if (baseClass == PropertyExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case OpenCypherPackage.SHORTEST_PATH_PATTERN__OPERATOR: return OpenCypherPackage.EXPRESSION__OPERATOR;
        case OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT: return OpenCypherPackage.EXPRESSION__LEFT;
        case OpenCypherPackage.SHORTEST_PATH_PATTERN__EXPRESSION3_PARTS: return OpenCypherPackage.EXPRESSION__EXPRESSION3_PARTS;
        case OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABEL_LIST: return OpenCypherPackage.EXPRESSION__NODE_LABEL_LIST;
        case OpenCypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUP: return OpenCypherPackage.EXPRESSION__PROPERTY_LOOKUP;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == RemoveItem.class)
    {
      switch (baseFeatureID)
      {
        case OpenCypherPackage.REMOVE_ITEM__VARIABLE: return OpenCypherPackage.SHORTEST_PATH_PATTERN__VARIABLE;
        case OpenCypherPackage.REMOVE_ITEM__NODE_LABELS: return OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS;
        default: return -1;
      }
    }
    if (baseClass == PropertyExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case OpenCypherPackage.EXPRESSION__OPERATOR: return OpenCypherPackage.SHORTEST_PATH_PATTERN__OPERATOR;
        case OpenCypherPackage.EXPRESSION__LEFT: return OpenCypherPackage.SHORTEST_PATH_PATTERN__LEFT;
        case OpenCypherPackage.EXPRESSION__EXPRESSION3_PARTS: return OpenCypherPackage.SHORTEST_PATH_PATTERN__EXPRESSION3_PARTS;
        case OpenCypherPackage.EXPRESSION__NODE_LABEL_LIST: return OpenCypherPackage.SHORTEST_PATH_PATTERN__NODE_LABEL_LIST;
        case OpenCypherPackage.EXPRESSION__PROPERTY_LOOKUP: return OpenCypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUP;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //ShortestPathPatternImpl
