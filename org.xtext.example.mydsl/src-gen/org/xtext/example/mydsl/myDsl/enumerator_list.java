/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enumerator list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.enumerator_list#getEnumarator <em>Enumarator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.enumerator_list#getEnumerator_list_linha <em>Enumerator list linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getenumerator_list()
 * @model
 * @generated
 */
public interface enumerator_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Enumarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumarator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumarator</em>' containment reference.
   * @see #setEnumarator(enumerator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getenumerator_list_Enumarator()
   * @model containment="true"
   * @generated
   */
  enumerator getEnumarator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.enumerator_list#getEnumarator <em>Enumarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumarator</em>' containment reference.
   * @see #getEnumarator()
   * @generated
   */
  void setEnumarator(enumerator value);

  /**
   * Returns the value of the '<em><b>Enumerator list linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerator list linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerator list linha</em>' containment reference.
   * @see #setEnumerator_list_linha(enumerator_list_linha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getenumerator_list_Enumerator_list_linha()
   * @model containment="true"
   * @generated
   */
  enumerator_list_linha getEnumerator_list_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.enumerator_list#getEnumerator_list_linha <em>Enumerator list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerator list linha</em>' containment reference.
   * @see #getEnumerator_list_linha()
   * @generated
   */
  void setEnumerator_list_linha(enumerator_list_linha value);

} // enumerator_list