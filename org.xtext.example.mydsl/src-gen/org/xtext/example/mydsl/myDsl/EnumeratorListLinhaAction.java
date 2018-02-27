/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerator List Linha Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EnumeratorListLinhaAction#getEnumerator <em>Enumerator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EnumeratorListLinhaAction#getEnumerator_list_linha <em>Enumerator list linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnumeratorListLinhaAction()
 * @model
 * @generated
 */
public interface EnumeratorListLinhaAction extends enumerator_list_linha
{
  /**
   * Returns the value of the '<em><b>Enumerator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerator</em>' containment reference.
   * @see #setEnumerator(enumerator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnumeratorListLinhaAction_Enumerator()
   * @model containment="true"
   * @generated
   */
  enumerator getEnumerator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EnumeratorListLinhaAction#getEnumerator <em>Enumerator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerator</em>' containment reference.
   * @see #getEnumerator()
   * @generated
   */
  void setEnumerator(enumerator value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnumeratorListLinhaAction_Enumerator_list_linha()
   * @model containment="true"
   * @generated
   */
  enumerator_list_linha getEnumerator_list_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EnumeratorListLinhaAction#getEnumerator_list_linha <em>Enumerator list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerator list linha</em>' containment reference.
   * @see #getEnumerator_list_linha()
   * @generated
   */
  void setEnumerator_list_linha(enumerator_list_linha value);

} // EnumeratorListLinhaAction
