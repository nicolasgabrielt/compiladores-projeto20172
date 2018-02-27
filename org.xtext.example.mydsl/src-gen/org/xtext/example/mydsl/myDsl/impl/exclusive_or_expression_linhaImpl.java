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
import org.xtext.example.mydsl.myDsl.and_expression;
import org.xtext.example.mydsl.myDsl.exclusive_or_expression_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>exclusive or expression linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.exclusive_or_expression_linhaImpl#getAnd_expression <em>And expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.exclusive_or_expression_linhaImpl#getExclusive_or_expression_linha <em>Exclusive or expression linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class exclusive_or_expression_linhaImpl extends MinimalEObjectImpl.Container implements exclusive_or_expression_linha
{
  /**
   * The cached value of the '{@link #getAnd_expression() <em>And expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd_expression()
   * @generated
   * @ordered
   */
  protected and_expression and_expression;

  /**
   * The cached value of the '{@link #getExclusive_or_expression_linha() <em>Exclusive or expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusive_or_expression_linha()
   * @generated
   * @ordered
   */
  protected exclusive_or_expression_linha exclusive_or_expression_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected exclusive_or_expression_linhaImpl()
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
    return MyDslPackage.Literals.EXCLUSIVE_OR_EXPRESSION_LINHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public and_expression getAnd_expression()
  {
    return and_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnd_expression(and_expression newAnd_expression, NotificationChain msgs)
  {
    and_expression oldAnd_expression = and_expression;
    and_expression = newAnd_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION, oldAnd_expression, newAnd_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnd_expression(and_expression newAnd_expression)
  {
    if (newAnd_expression != and_expression)
    {
      NotificationChain msgs = null;
      if (and_expression != null)
        msgs = ((InternalEObject)and_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION, null, msgs);
      if (newAnd_expression != null)
        msgs = ((InternalEObject)newAnd_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION, null, msgs);
      msgs = basicSetAnd_expression(newAnd_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION, newAnd_expression, newAnd_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exclusive_or_expression_linha getExclusive_or_expression_linha()
  {
    return exclusive_or_expression_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExclusive_or_expression_linha(exclusive_or_expression_linha newExclusive_or_expression_linha, NotificationChain msgs)
  {
    exclusive_or_expression_linha oldExclusive_or_expression_linha = exclusive_or_expression_linha;
    exclusive_or_expression_linha = newExclusive_or_expression_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA, oldExclusive_or_expression_linha, newExclusive_or_expression_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclusive_or_expression_linha(exclusive_or_expression_linha newExclusive_or_expression_linha)
  {
    if (newExclusive_or_expression_linha != exclusive_or_expression_linha)
    {
      NotificationChain msgs = null;
      if (exclusive_or_expression_linha != null)
        msgs = ((InternalEObject)exclusive_or_expression_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA, null, msgs);
      if (newExclusive_or_expression_linha != null)
        msgs = ((InternalEObject)newExclusive_or_expression_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA, null, msgs);
      msgs = basicSetExclusive_or_expression_linha(newExclusive_or_expression_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA, newExclusive_or_expression_linha, newExclusive_or_expression_linha));
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION:
        return basicSetAnd_expression(null, msgs);
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA:
        return basicSetExclusive_or_expression_linha(null, msgs);
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION:
        return getAnd_expression();
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA:
        return getExclusive_or_expression_linha();
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION:
        setAnd_expression((and_expression)newValue);
        return;
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA:
        setExclusive_or_expression_linha((exclusive_or_expression_linha)newValue);
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION:
        setAnd_expression((and_expression)null);
        return;
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA:
        setExclusive_or_expression_linha((exclusive_or_expression_linha)null);
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__AND_EXPRESSION:
        return and_expression != null;
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION_LINHA__EXCLUSIVE_OR_EXPRESSION_LINHA:
        return exclusive_or_expression_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //exclusive_or_expression_linhaImpl
