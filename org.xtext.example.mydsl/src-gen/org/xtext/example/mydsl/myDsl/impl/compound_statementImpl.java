/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.block_item_list;
import org.xtext.example.mydsl.myDsl.compound_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compound statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.compound_statementImpl#getBlock_item_list <em>Block item list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class compound_statementImpl extends MinimalEObjectImpl.Container implements compound_statement
{
  /**
   * The cached value of the '{@link #getBlock_item_list() <em>Block item list</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock_item_list()
   * @generated
   * @ordered
   */
  protected EList<block_item_list> block_item_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compound_statementImpl()
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
    return MyDslPackage.Literals.COMPOUND_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<block_item_list> getBlock_item_list()
  {
    if (block_item_list == null)
    {
      block_item_list = new EObjectContainmentEList<block_item_list>(block_item_list.class, this, MyDslPackage.COMPOUND_STATEMENT__BLOCK_ITEM_LIST);
    }
    return block_item_list;
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
      case MyDslPackage.COMPOUND_STATEMENT__BLOCK_ITEM_LIST:
        return ((InternalEList<?>)getBlock_item_list()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.COMPOUND_STATEMENT__BLOCK_ITEM_LIST:
        return getBlock_item_list();
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
      case MyDslPackage.COMPOUND_STATEMENT__BLOCK_ITEM_LIST:
        getBlock_item_list().clear();
        getBlock_item_list().addAll((Collection<? extends block_item_list>)newValue);
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
      case MyDslPackage.COMPOUND_STATEMENT__BLOCK_ITEM_LIST:
        getBlock_item_list().clear();
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
      case MyDslPackage.COMPOUND_STATEMENT__BLOCK_ITEM_LIST:
        return block_item_list != null && !block_item_list.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //compound_statementImpl
