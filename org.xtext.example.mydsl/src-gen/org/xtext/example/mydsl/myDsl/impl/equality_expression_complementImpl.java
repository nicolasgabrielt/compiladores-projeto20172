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
import org.xtext.example.mydsl.myDsl.equality_expression_complement;
import org.xtext.example.mydsl.myDsl.relational_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>equality expression complement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.equality_expression_complementImpl#getIgual <em>Igual</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.equality_expression_complementImpl#getRelational_expression <em>Relational expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.equality_expression_complementImpl#getMenor <em>Menor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.equality_expression_complementImpl#getMaior <em>Maior</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.equality_expression_complementImpl#getMenor_igual <em>Menor igual</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.equality_expression_complementImpl#getMaior_igual <em>Maior igual</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.equality_expression_complementImpl#getN_igual <em>Nigual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class equality_expression_complementImpl extends MinimalEObjectImpl.Container implements equality_expression_complement
{
  /**
   * The default value of the '{@link #getIgual() <em>Igual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgual()
   * @generated
   * @ordered
   */
  protected static final String IGUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIgual() <em>Igual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgual()
   * @generated
   * @ordered
   */
  protected String igual = IGUAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelational_expression() <em>Relational expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelational_expression()
   * @generated
   * @ordered
   */
  protected relational_expression relational_expression;

  /**
   * The default value of the '{@link #getMenor() <em>Menor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenor()
   * @generated
   * @ordered
   */
  protected static final String MENOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMenor() <em>Menor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenor()
   * @generated
   * @ordered
   */
  protected String menor = MENOR_EDEFAULT;

  /**
   * The default value of the '{@link #getMaior() <em>Maior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaior()
   * @generated
   * @ordered
   */
  protected static final String MAIOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaior() <em>Maior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaior()
   * @generated
   * @ordered
   */
  protected String maior = MAIOR_EDEFAULT;

  /**
   * The default value of the '{@link #getMenor_igual() <em>Menor igual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenor_igual()
   * @generated
   * @ordered
   */
  protected static final String MENOR_IGUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMenor_igual() <em>Menor igual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenor_igual()
   * @generated
   * @ordered
   */
  protected String menor_igual = MENOR_IGUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMaior_igual() <em>Maior igual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaior_igual()
   * @generated
   * @ordered
   */
  protected static final String MAIOR_IGUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaior_igual() <em>Maior igual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaior_igual()
   * @generated
   * @ordered
   */
  protected String maior_igual = MAIOR_IGUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getN_igual() <em>Nigual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_igual()
   * @generated
   * @ordered
   */
  protected static final String NIGUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getN_igual() <em>Nigual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_igual()
   * @generated
   * @ordered
   */
  protected String n_igual = NIGUAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected equality_expression_complementImpl()
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
    return MyDslPackage.Literals.EQUALITY_EXPRESSION_COMPLEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIgual()
  {
    return igual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIgual(String newIgual)
  {
    String oldIgual = igual;
    igual = newIgual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__IGUAL, oldIgual, igual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relational_expression getRelational_expression()
  {
    return relational_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelational_expression(relational_expression newRelational_expression, NotificationChain msgs)
  {
    relational_expression oldRelational_expression = relational_expression;
    relational_expression = newRelational_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION, oldRelational_expression, newRelational_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelational_expression(relational_expression newRelational_expression)
  {
    if (newRelational_expression != relational_expression)
    {
      NotificationChain msgs = null;
      if (relational_expression != null)
        msgs = ((InternalEObject)relational_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION, null, msgs);
      if (newRelational_expression != null)
        msgs = ((InternalEObject)newRelational_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION, null, msgs);
      msgs = basicSetRelational_expression(newRelational_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION, newRelational_expression, newRelational_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMenor()
  {
    return menor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenor(String newMenor)
  {
    String oldMenor = menor;
    menor = newMenor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR, oldMenor, menor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaior()
  {
    return maior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaior(String newMaior)
  {
    String oldMaior = maior;
    maior = newMaior;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR, oldMaior, maior));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMenor_igual()
  {
    return menor_igual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenor_igual(String newMenor_igual)
  {
    String oldMenor_igual = menor_igual;
    menor_igual = newMenor_igual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR_IGUAL, oldMenor_igual, menor_igual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaior_igual()
  {
    return maior_igual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaior_igual(String newMaior_igual)
  {
    String oldMaior_igual = maior_igual;
    maior_igual = newMaior_igual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR_IGUAL, oldMaior_igual, maior_igual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getN_igual()
  {
    return n_igual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN_igual(String newN_igual)
  {
    String oldN_igual = n_igual;
    n_igual = newN_igual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__NIGUAL, oldN_igual, n_igual));
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
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION:
        return basicSetRelational_expression(null, msgs);
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
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__IGUAL:
        return getIgual();
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION:
        return getRelational_expression();
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR:
        return getMenor();
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR:
        return getMaior();
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR_IGUAL:
        return getMenor_igual();
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR_IGUAL:
        return getMaior_igual();
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__NIGUAL:
        return getN_igual();
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
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__IGUAL:
        setIgual((String)newValue);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION:
        setRelational_expression((relational_expression)newValue);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR:
        setMenor((String)newValue);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR:
        setMaior((String)newValue);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR_IGUAL:
        setMenor_igual((String)newValue);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR_IGUAL:
        setMaior_igual((String)newValue);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__NIGUAL:
        setN_igual((String)newValue);
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
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__IGUAL:
        setIgual(IGUAL_EDEFAULT);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION:
        setRelational_expression((relational_expression)null);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR:
        setMenor(MENOR_EDEFAULT);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR:
        setMaior(MAIOR_EDEFAULT);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR_IGUAL:
        setMenor_igual(MENOR_IGUAL_EDEFAULT);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR_IGUAL:
        setMaior_igual(MAIOR_IGUAL_EDEFAULT);
        return;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__NIGUAL:
        setN_igual(NIGUAL_EDEFAULT);
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
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__IGUAL:
        return IGUAL_EDEFAULT == null ? igual != null : !IGUAL_EDEFAULT.equals(igual);
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__RELATIONAL_EXPRESSION:
        return relational_expression != null;
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR:
        return MENOR_EDEFAULT == null ? menor != null : !MENOR_EDEFAULT.equals(menor);
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR:
        return MAIOR_EDEFAULT == null ? maior != null : !MAIOR_EDEFAULT.equals(maior);
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MENOR_IGUAL:
        return MENOR_IGUAL_EDEFAULT == null ? menor_igual != null : !MENOR_IGUAL_EDEFAULT.equals(menor_igual);
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__MAIOR_IGUAL:
        return MAIOR_IGUAL_EDEFAULT == null ? maior_igual != null : !MAIOR_IGUAL_EDEFAULT.equals(maior_igual);
      case MyDslPackage.EQUALITY_EXPRESSION_COMPLEMENT__NIGUAL:
        return NIGUAL_EDEFAULT == null ? n_igual != null : !NIGUAL_EDEFAULT.equals(n_igual);
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
    result.append(" (igual: ");
    result.append(igual);
    result.append(", menor: ");
    result.append(menor);
    result.append(", maior: ");
    result.append(maior);
    result.append(", menor_igual: ");
    result.append(menor_igual);
    result.append(", maior_igual: ");
    result.append(maior_igual);
    result.append(", n_igual: ");
    result.append(n_igual);
    result.append(')');
    return result.toString();
  }

} //equality_expression_complementImpl