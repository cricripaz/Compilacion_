/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.losMelos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Cdr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losMelos.ExprCdr#getList <em>List</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getExprCdr()
 * @model
 * @generated
 */
public interface ExprCdr extends FuncList
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(EObject)
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getExprCdr_List()
   * @model containment="true"
   * @generated
   */
  EObject getList();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losMelos.ExprCdr#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(EObject value);

} // ExprCdr
