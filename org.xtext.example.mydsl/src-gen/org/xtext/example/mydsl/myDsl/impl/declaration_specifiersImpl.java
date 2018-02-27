/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.alignment_specifier;
import org.xtext.example.mydsl.myDsl.declaration_specifiers;
import org.xtext.example.mydsl.myDsl.type_qualifier;
import org.xtext.example.mydsl.myDsl.type_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declaration specifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_specifiersImpl#getStorage_class_specifier <em>Storage class specifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_specifiersImpl#getDeclaration_specifiers <em>Declaration specifiers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_specifiersImpl#getType_specifier <em>Type specifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_specifiersImpl#getType_qualifier <em>Type qualifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_specifiersImpl#getFunction_specifier <em>Function specifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_specifiersImpl#getAlignment_specifier <em>Alignment specifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class declaration_specifiersImpl extends MinimalEObjectImpl.Container implements declaration_specifiers
{
  /**
   * The default value of the '{@link #getStorage_class_specifier() <em>Storage class specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorage_class_specifier()
   * @generated
   * @ordered
   */
  protected static final String STORAGE_CLASS_SPECIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStorage_class_specifier() <em>Storage class specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorage_class_specifier()
   * @generated
   * @ordered
   */
  protected String storage_class_specifier = STORAGE_CLASS_SPECIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeclaration_specifiers() <em>Declaration specifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration_specifiers()
   * @generated
   * @ordered
   */
  protected EList<declaration_specifiers> declaration_specifiers;

  /**
   * The cached value of the '{@link #getType_specifier() <em>Type specifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_specifier()
   * @generated
   * @ordered
   */
  protected type_specifier type_specifier;

  /**
   * The cached value of the '{@link #getType_qualifier() <em>Type qualifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_qualifier()
   * @generated
   * @ordered
   */
  protected type_qualifier type_qualifier;

  /**
   * The default value of the '{@link #getFunction_specifier() <em>Function specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_specifier()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_SPECIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunction_specifier() <em>Function specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_specifier()
   * @generated
   * @ordered
   */
  protected String function_specifier = FUNCTION_SPECIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlignment_specifier() <em>Alignment specifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment_specifier()
   * @generated
   * @ordered
   */
  protected alignment_specifier alignment_specifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaration_specifiersImpl()
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
    return MyDslPackage.Literals.DECLARATION_SPECIFIERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStorage_class_specifier()
  {
    return storage_class_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorage_class_specifier(String newStorage_class_specifier)
  {
    String oldStorage_class_specifier = storage_class_specifier;
    storage_class_specifier = newStorage_class_specifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_SPECIFIERS__STORAGE_CLASS_SPECIFIER, oldStorage_class_specifier, storage_class_specifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<declaration_specifiers> getDeclaration_specifiers()
  {
    if (declaration_specifiers == null)
    {
      declaration_specifiers = new EObjectContainmentEList<declaration_specifiers>(declaration_specifiers.class, this, MyDslPackage.DECLARATION_SPECIFIERS__DECLARATION_SPECIFIERS);
    }
    return declaration_specifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier getType_specifier()
  {
    return type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_specifier(type_specifier newType_specifier, NotificationChain msgs)
  {
    type_specifier oldType_specifier = type_specifier;
    type_specifier = newType_specifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER, oldType_specifier, newType_specifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_specifier(type_specifier newType_specifier)
  {
    if (newType_specifier != type_specifier)
    {
      NotificationChain msgs = null;
      if (type_specifier != null)
        msgs = ((InternalEObject)type_specifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER, null, msgs);
      if (newType_specifier != null)
        msgs = ((InternalEObject)newType_specifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER, null, msgs);
      msgs = basicSetType_specifier(newType_specifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER, newType_specifier, newType_specifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_qualifier getType_qualifier()
  {
    return type_qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_qualifier(type_qualifier newType_qualifier, NotificationChain msgs)
  {
    type_qualifier oldType_qualifier = type_qualifier;
    type_qualifier = newType_qualifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER, oldType_qualifier, newType_qualifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_qualifier(type_qualifier newType_qualifier)
  {
    if (newType_qualifier != type_qualifier)
    {
      NotificationChain msgs = null;
      if (type_qualifier != null)
        msgs = ((InternalEObject)type_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER, null, msgs);
      if (newType_qualifier != null)
        msgs = ((InternalEObject)newType_qualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER, null, msgs);
      msgs = basicSetType_qualifier(newType_qualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER, newType_qualifier, newType_qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunction_specifier()
  {
    return function_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction_specifier(String newFunction_specifier)
  {
    String oldFunction_specifier = function_specifier;
    function_specifier = newFunction_specifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_SPECIFIERS__FUNCTION_SPECIFIER, oldFunction_specifier, function_specifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public alignment_specifier getAlignment_specifier()
  {
    return alignment_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignment_specifier(alignment_specifier newAlignment_specifier, NotificationChain msgs)
  {
    alignment_specifier oldAlignment_specifier = alignment_specifier;
    alignment_specifier = newAlignment_specifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER, oldAlignment_specifier, newAlignment_specifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignment_specifier(alignment_specifier newAlignment_specifier)
  {
    if (newAlignment_specifier != alignment_specifier)
    {
      NotificationChain msgs = null;
      if (alignment_specifier != null)
        msgs = ((InternalEObject)alignment_specifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER, null, msgs);
      if (newAlignment_specifier != null)
        msgs = ((InternalEObject)newAlignment_specifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER, null, msgs);
      msgs = basicSetAlignment_specifier(newAlignment_specifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER, newAlignment_specifier, newAlignment_specifier));
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
      case MyDslPackage.DECLARATION_SPECIFIERS__DECLARATION_SPECIFIERS:
        return ((InternalEList<?>)getDeclaration_specifiers()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER:
        return basicSetType_specifier(null, msgs);
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER:
        return basicSetType_qualifier(null, msgs);
      case MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER:
        return basicSetAlignment_specifier(null, msgs);
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
      case MyDslPackage.DECLARATION_SPECIFIERS__STORAGE_CLASS_SPECIFIER:
        return getStorage_class_specifier();
      case MyDslPackage.DECLARATION_SPECIFIERS__DECLARATION_SPECIFIERS:
        return getDeclaration_specifiers();
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER:
        return getType_specifier();
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER:
        return getType_qualifier();
      case MyDslPackage.DECLARATION_SPECIFIERS__FUNCTION_SPECIFIER:
        return getFunction_specifier();
      case MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER:
        return getAlignment_specifier();
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
      case MyDslPackage.DECLARATION_SPECIFIERS__STORAGE_CLASS_SPECIFIER:
        setStorage_class_specifier((String)newValue);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__DECLARATION_SPECIFIERS:
        getDeclaration_specifiers().clear();
        getDeclaration_specifiers().addAll((Collection<? extends declaration_specifiers>)newValue);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER:
        setType_specifier((type_specifier)newValue);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER:
        setType_qualifier((type_qualifier)newValue);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__FUNCTION_SPECIFIER:
        setFunction_specifier((String)newValue);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER:
        setAlignment_specifier((alignment_specifier)newValue);
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
      case MyDslPackage.DECLARATION_SPECIFIERS__STORAGE_CLASS_SPECIFIER:
        setStorage_class_specifier(STORAGE_CLASS_SPECIFIER_EDEFAULT);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__DECLARATION_SPECIFIERS:
        getDeclaration_specifiers().clear();
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER:
        setType_specifier((type_specifier)null);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER:
        setType_qualifier((type_qualifier)null);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__FUNCTION_SPECIFIER:
        setFunction_specifier(FUNCTION_SPECIFIER_EDEFAULT);
        return;
      case MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER:
        setAlignment_specifier((alignment_specifier)null);
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
      case MyDslPackage.DECLARATION_SPECIFIERS__STORAGE_CLASS_SPECIFIER:
        return STORAGE_CLASS_SPECIFIER_EDEFAULT == null ? storage_class_specifier != null : !STORAGE_CLASS_SPECIFIER_EDEFAULT.equals(storage_class_specifier);
      case MyDslPackage.DECLARATION_SPECIFIERS__DECLARATION_SPECIFIERS:
        return declaration_specifiers != null && !declaration_specifiers.isEmpty();
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_SPECIFIER:
        return type_specifier != null;
      case MyDslPackage.DECLARATION_SPECIFIERS__TYPE_QUALIFIER:
        return type_qualifier != null;
      case MyDslPackage.DECLARATION_SPECIFIERS__FUNCTION_SPECIFIER:
        return FUNCTION_SPECIFIER_EDEFAULT == null ? function_specifier != null : !FUNCTION_SPECIFIER_EDEFAULT.equals(function_specifier);
      case MyDslPackage.DECLARATION_SPECIFIERS__ALIGNMENT_SPECIFIER:
        return alignment_specifier != null;
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
    result.append(" (storage_class_specifier: ");
    result.append(storage_class_specifier);
    result.append(", function_specifier: ");
    result.append(function_specifier);
    result.append(')');
    return result.toString();
  }

} //declaration_specifiersImpl
