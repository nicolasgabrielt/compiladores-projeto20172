/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.TypeQualifierListLinhaAtion;
import org.xtext.example.mydsl.myDsl.type_qualifier;
import org.xtext.example.mydsl.myDsl.type_qualifier_list_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Qualifier List Linha Ation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeQualifierListLinhaAtionImpl#getType_qualifier <em>Type qualifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeQualifierListLinhaAtionImpl#getType_qualifier_list_linha <em>Type qualifier list linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeQualifierListLinhaAtionImpl extends type_qualifier_list_linhaImpl implements TypeQualifierListLinhaAtion
{
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
   * The cached value of the '{@link #getType_qualifier_list_linha() <em>Type qualifier list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_qualifier_list_linha()
   * @generated
   * @ordered
   */
  protected type_qualifier_list_linha type_qualifier_list_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeQualifierListLinhaAtionImpl()
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
    return MyDslPackage.Literals.TYPE_QUALIFIER_LIST_LINHA_ATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER, oldType_qualifier, newType_qualifier);
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
        msgs = ((InternalEObject)type_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER, null, msgs);
      if (newType_qualifier != null)
        msgs = ((InternalEObject)newType_qualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER, null, msgs);
      msgs = basicSetType_qualifier(newType_qualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER, newType_qualifier, newType_qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_qualifier_list_linha getType_qualifier_list_linha()
  {
    return type_qualifier_list_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_qualifier_list_linha(type_qualifier_list_linha newType_qualifier_list_linha, NotificationChain msgs)
  {
    type_qualifier_list_linha oldType_qualifier_list_linha = type_qualifier_list_linha;
    type_qualifier_list_linha = newType_qualifier_list_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA, oldType_qualifier_list_linha, newType_qualifier_list_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_qualifier_list_linha(type_qualifier_list_linha newType_qualifier_list_linha)
  {
    if (newType_qualifier_list_linha != type_qualifier_list_linha)
    {
      NotificationChain msgs = null;
      if (type_qualifier_list_linha != null)
        msgs = ((InternalEObject)type_qualifier_list_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA, null, msgs);
      if (newType_qualifier_list_linha != null)
        msgs = ((InternalEObject)newType_qualifier_list_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA, null, msgs);
      msgs = basicSetType_qualifier_list_linha(newType_qualifier_list_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA, newType_qualifier_list_linha, newType_qualifier_list_linha));
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER:
        return basicSetType_qualifier(null, msgs);
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA:
        return basicSetType_qualifier_list_linha(null, msgs);
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER:
        return getType_qualifier();
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA:
        return getType_qualifier_list_linha();
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER:
        setType_qualifier((type_qualifier)newValue);
        return;
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA:
        setType_qualifier_list_linha((type_qualifier_list_linha)newValue);
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER:
        setType_qualifier((type_qualifier)null);
        return;
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA:
        setType_qualifier_list_linha((type_qualifier_list_linha)null);
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
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER:
        return type_qualifier != null;
      case MyDslPackage.TYPE_QUALIFIER_LIST_LINHA_ATION__TYPE_QUALIFIER_LIST_LINHA:
        return type_qualifier_list_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeQualifierListLinhaAtionImpl
