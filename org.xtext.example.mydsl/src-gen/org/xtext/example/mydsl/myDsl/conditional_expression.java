/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>conditional expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.conditional_expression#getLogical_or_expression <em>Logical or expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.conditional_expression#getConditional_expression_linha <em>Conditional expression linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getconditional_expression()
 * @model
 * @generated
 */
public interface conditional_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Logical or expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical or expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical or expression</em>' containment reference.
   * @see #setLogical_or_expression(logical_or_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getconditional_expression_Logical_or_expression()
   * @model containment="true"
   * @generated
   */
  logical_or_expression getLogical_or_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.conditional_expression#getLogical_or_expression <em>Logical or expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical or expression</em>' containment reference.
   * @see #getLogical_or_expression()
   * @generated
   */
  void setLogical_or_expression(logical_or_expression value);

  /**
   * Returns the value of the '<em><b>Conditional expression linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional expression linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional expression linha</em>' containment reference.
   * @see #setConditional_expression_linha(conditional_expression_linha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getconditional_expression_Conditional_expression_linha()
   * @model containment="true"
   * @generated
   */
  conditional_expression_linha getConditional_expression_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.conditional_expression#getConditional_expression_linha <em>Conditional expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional expression linha</em>' containment reference.
   * @see #getConditional_expression_linha()
   * @generated
   */
  void setConditional_expression_linha(conditional_expression_linha value);

} // conditional_expression