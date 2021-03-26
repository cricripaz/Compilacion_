/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.losMelos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losMelos.ExprInt#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getExprInt()
 * @model
 * @generated
 */
public interface ExprInt extends ExpresionVar, ExprNumber, ElementList
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(int)
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getExprInt_Var()
   * @model
   * @generated
   */
  int getVar();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losMelos.ExprInt#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(int value);

} // ExprInt