/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>initializer list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.initializer_list#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.initializer_list#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.initializer_list#getInit_declarator_list_linha <em>Init declarator list linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list()
 * @model
 * @generated
 */
public interface initializer_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Designation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Designation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Designation</em>' containment reference.
   * @see #setDesignation(designation)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list_Designation()
   * @model containment="true"
   * @generated
   */
  designation getDesignation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.initializer_list#getDesignation <em>Designation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Designation</em>' containment reference.
   * @see #getDesignation()
   * @generated
   */
  void setDesignation(designation value);

  /**
   * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initializer</em>' containment reference.
   * @see #setInitializer(initializer)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list_Initializer()
   * @model containment="true"
   * @generated
   */
  initializer getInitializer();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.initializer_list#getInitializer <em>Initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initializer</em>' containment reference.
   * @see #getInitializer()
   * @generated
   */
  void setInitializer(initializer value);

  /**
   * Returns the value of the '<em><b>Init declarator list linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init declarator list linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init declarator list linha</em>' containment reference.
   * @see #setInit_declarator_list_linha(init_declarator_list_linha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getinitializer_list_Init_declarator_list_linha()
   * @model containment="true"
   * @generated
   */
  init_declarator_list_linha getInit_declarator_list_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.initializer_list#getInit_declarator_list_linha <em>Init declarator list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init declarator list linha</em>' containment reference.
   * @see #getInit_declarator_list_linha()
   * @generated
   */
  void setInit_declarator_list_linha(init_declarator_list_linha value);

} // initializer_list
