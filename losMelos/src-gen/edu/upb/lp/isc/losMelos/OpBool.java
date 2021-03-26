/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.losMelos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Bool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losMelos.OpBool#getOp1 <em>Op1</em>}</li>
 *   <li>{@link edu.upb.lp.isc.losMelos.OpBool#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getOpBool()
 * @model
 * @generated
 */
public interface OpBool extends ExprBool
{
  /**
   * Returns the value of the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op1</em>' containment reference.
   * @see #setOp1(ExprBool)
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getOpBool_Op1()
   * @model containment="true"
   * @generated
   */
  ExprBool getOp1();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losMelos.OpBool#getOp1 <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op1</em>' containment reference.
   * @see #getOp1()
   * @generated
   */
  void setOp1(ExprBool value);

  /**
   * Returns the value of the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' containment reference.
   * @see #setOp2(ExprBool)
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getOpBool_Op2()
   * @model containment="true"
   * @generated
   */
  ExprBool getOp2();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losMelos.OpBool#getOp2 <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' containment reference.
   * @see #getOp2()
   * @generated
   */
  void setOp2(ExprBool value);

} // OpBool