/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>alignment specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.alignment_specifier#getType_name <em>Type name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.alignment_specifier#getConstant_expression <em>Constant expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getalignment_specifier()
 * @model
 * @generated
 */
public interface alignment_specifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Type name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type name</em>' containment reference.
   * @see #setType_name(type_name)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getalignment_specifier_Type_name()
   * @model containment="true"
   * @generated
   */
  type_name getType_name();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.alignment_specifier#getType_name <em>Type name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type name</em>' containment reference.
   * @see #getType_name()
   * @generated
   */
  void setType_name(type_name value);

  /**
   * Returns the value of the '<em><b>Constant expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant expression</em>' containment reference.
   * @see #setConstant_expression(constant_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getalignment_specifier_Constant_expression()
   * @model containment="true"
   * @generated
   */
  constant_expression getConstant_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.alignment_specifier#getConstant_expression <em>Constant expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant expression</em>' containment reference.
   * @see #getConstant_expression()
   * @generated
   */
  void setConstant_expression(constant_expression value);

} // alignment_specifier
