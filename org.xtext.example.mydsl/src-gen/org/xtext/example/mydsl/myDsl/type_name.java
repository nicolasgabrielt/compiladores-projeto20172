/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_name#getInitializer_list <em>Initializer list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_name#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.type_name#getAbstract_declarator <em>Abstract declarator</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_name()
 * @model
 * @generated
 */
public interface type_name extends postfix_expression
{
  /**
   * Returns the value of the '<em><b>Initializer list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initializer list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initializer list</em>' containment reference.
   * @see #setInitializer_list(initializer_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_name_Initializer_list()
   * @model containment="true"
   * @generated
   */
  initializer_list getInitializer_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_name#getInitializer_list <em>Initializer list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initializer list</em>' containment reference.
   * @see #getInitializer_list()
   * @generated
   */
  void setInitializer_list(initializer_list value);

  /**
   * Returns the value of the '<em><b>Specifier qualifier list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifier qualifier list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifier qualifier list</em>' containment reference.
   * @see #setSpecifier_qualifier_list(specifier_qualifier_list)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_name_Specifier_qualifier_list()
   * @model containment="true"
   * @generated
   */
  specifier_qualifier_list getSpecifier_qualifier_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_name#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specifier qualifier list</em>' containment reference.
   * @see #getSpecifier_qualifier_list()
   * @generated
   */
  void setSpecifier_qualifier_list(specifier_qualifier_list value);

  /**
   * Returns the value of the '<em><b>Abstract declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract declarator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract declarator</em>' containment reference.
   * @see #setAbstract_declarator(abstract_declarator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#gettype_name_Abstract_declarator()
   * @model containment="true"
   * @generated
   */
  abstract_declarator getAbstract_declarator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.type_name#getAbstract_declarator <em>Abstract declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract declarator</em>' containment reference.
   * @see #getAbstract_declarator()
   * @generated
   */
  void setAbstract_declarator(abstract_declarator value);

} // type_name
