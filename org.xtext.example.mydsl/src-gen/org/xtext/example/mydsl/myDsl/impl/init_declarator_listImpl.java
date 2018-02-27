/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.init_declarator;
import org.xtext.example.mydsl.myDsl.init_declarator_list;
import org.xtext.example.mydsl.myDsl.init_declarator_list_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>init declarator list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.init_declarator_listImpl#getInit_declarator <em>Init declarator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.init_declarator_listImpl#getInit_declarator_list_linha <em>Init declarator list linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class init_declarator_listImpl extends MinimalEObjectImpl.Container implements init_declarator_list
{
  /**
   * The cached value of the '{@link #getInit_declarator() <em>Init declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit_declarator()
   * @generated
   * @ordered
   */
  protected init_declarator init_declarator;

  /**
   * The cached value of the '{@link #getInit_declarator_list_linha() <em>Init declarator list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit_declarator_list_linha()
   * @generated
   * @ordered
   */
  protected init_declarator_list_linha init_declarator_list_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected init_declarator_listImpl()
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
    return MyDslPackage.Literals.INIT_DECLARATOR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public init_declarator getInit_declarator()
  {
    return init_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit_declarator(init_declarator newInit_declarator, NotificationChain msgs)
  {
    init_declarator oldInit_declarator = init_declarator;
    init_declarator = newInit_declarator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR, oldInit_declarator, newInit_declarator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit_declarator(init_declarator newInit_declarator)
  {
    if (newInit_declarator != init_declarator)
    {
      NotificationChain msgs = null;
      if (init_declarator != null)
        msgs = ((InternalEObject)init_declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR, null, msgs);
      if (newInit_declarator != null)
        msgs = ((InternalEObject)newInit_declarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR, null, msgs);
      msgs = basicSetInit_declarator(newInit_declarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR, newInit_declarator, newInit_declarator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public init_declarator_list_linha getInit_declarator_list_linha()
  {
    return init_declarator_list_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit_declarator_list_linha(init_declarator_list_linha newInit_declarator_list_linha, NotificationChain msgs)
  {
    init_declarator_list_linha oldInit_declarator_list_linha = init_declarator_list_linha;
    init_declarator_list_linha = newInit_declarator_list_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA, oldInit_declarator_list_linha, newInit_declarator_list_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit_declarator_list_linha(init_declarator_list_linha newInit_declarator_list_linha)
  {
    if (newInit_declarator_list_linha != init_declarator_list_linha)
    {
      NotificationChain msgs = null;
      if (init_declarator_list_linha != null)
        msgs = ((InternalEObject)init_declarator_list_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA, null, msgs);
      if (newInit_declarator_list_linha != null)
        msgs = ((InternalEObject)newInit_declarator_list_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA, null, msgs);
      msgs = basicSetInit_declarator_list_linha(newInit_declarator_list_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA, newInit_declarator_list_linha, newInit_declarator_list_linha));
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
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR:
        return basicSetInit_declarator(null, msgs);
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA:
        return basicSetInit_declarator_list_linha(null, msgs);
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
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR:
        return getInit_declarator();
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA:
        return getInit_declarator_list_linha();
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
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR:
        setInit_declarator((init_declarator)newValue);
        return;
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA:
        setInit_declarator_list_linha((init_declarator_list_linha)newValue);
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
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR:
        setInit_declarator((init_declarator)null);
        return;
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA:
        setInit_declarator_list_linha((init_declarator_list_linha)null);
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
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR:
        return init_declarator != null;
      case MyDslPackage.INIT_DECLARATOR_LIST__INIT_DECLARATOR_LIST_LINHA:
        return init_declarator_list_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //init_declarator_listImpl
