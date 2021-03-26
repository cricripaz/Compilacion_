/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.losMelos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Arithmetic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losMelos.ExprArithmetic#getSimbolo <em>Simbolo</em>}</li>
 *   <li>{@link edu.upb.lp.isc.losMelos.ExprArithmetic#getVal1 <em>Val1</em>}</li>
 *   <li>{@link edu.upb.lp.isc.losMelos.ExprArithmetic#getVal2 <em>Val2</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getExprArithmetic()
 * @model
 * @generated
 */
public interface ExprArithmetic extends ExprNumber, Ejecuciones
{
  /**
   * Returns the value of the '<em><b>Simbolo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simbolo</em>' attribute.
   * @see #setSimbolo(String)
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getExprArithmetic_Simbolo()
   * @model
   * @generated
   */
  String getSimbolo();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losMelos.ExprArithmetic#getSimbolo <em>Simbolo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simbolo</em>' attribute.
   * @see #getSimbolo()
   * @generated
   */
  void setSimbolo(String value);

  /**
   * Returns the value of the '<em><b>Val1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val1</em>' containment reference.
   * @see #setVal1(Expresion)
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getExprArithmetic_Val1()
   * @model containment="true"
   * @generated
   */
  Expresion getVal1();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losMelos.ExprArithmetic#getVal1 <em>Val1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val1</em>' containment reference.
   * @see #getVal1()
   * @generated
   */
  void setVal1(Expresion value);

  /**
   * Returns the value of the '<em><b>Val2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val2</em>' containment reference.
   * @see #setVal2(Expresion)
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getExprArithmetic_Val2()
   * @model containment="true"
   * @generated
   */
  Expresion getVal2();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losMelos.ExprArithmetic#getVal2 <em>Val2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val2</em>' containment reference.
   * @see #getVal2()
   * @generated
   */
  void setVal2(Expresion value);

} // ExprArithmetic
