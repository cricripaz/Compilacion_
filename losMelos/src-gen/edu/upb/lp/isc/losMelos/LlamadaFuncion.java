/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.losMelos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Llamada Funcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losMelos.LlamadaFuncion#getNamefuncion <em>Namefuncion</em>}</li>
 *   <li>{@link edu.upb.lp.isc.losMelos.LlamadaFuncion#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getLlamadaFuncion()
 * @model
 * @generated
 */
public interface LlamadaFuncion extends Expresion, Ejecuciones
{
  /**
   * Returns the value of the '<em><b>Namefuncion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namefuncion</em>' reference.
   * @see #setNamefuncion(Funciones)
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getLlamadaFuncion_Namefuncion()
   * @model
   * @generated
   */
  Funciones getNamefuncion();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losMelos.LlamadaFuncion#getNamefuncion <em>Namefuncion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namefuncion</em>' reference.
   * @see #getNamefuncion()
   * @generated
   */
  void setNamefuncion(Funciones value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.losMelos.Expresion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see edu.upb.lp.isc.losMelos.LosMelosPackage#getLlamadaFuncion_Param()
   * @model containment="true"
   * @generated
   */
  EList<Expresion> getParam();

} // LlamadaFuncion
