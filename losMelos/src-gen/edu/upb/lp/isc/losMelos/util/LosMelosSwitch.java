/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.losMelos.util;

import edu.upb.lp.isc.losMelos.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.isc.losMelos.LosMelosPackage
 * @generated
 */
public class LosMelosSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LosMelosPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LosMelosSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LosMelosPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LosMelosPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.DEFINICIONES:
      {
        Definiciones definiciones = (Definiciones)theEObject;
        T result = caseDefiniciones(definiciones);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.FUNCIONES:
      {
        Funciones funciones = (Funciones)theEObject;
        T result = caseFunciones(funciones);
        if (result == null) result = caseDefiniciones(funciones);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.VARIABLES:
      {
        Variables variables = (Variables)theEObject;
        T result = caseVariables(variables);
        if (result == null) result = caseDefiniciones(variables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPRESION:
      {
        Expresion expresion = (Expresion)theEObject;
        T result = caseExpresion(expresion);
        if (result == null) result = caseExprThen(expresion);
        if (result == null) result = caseExprElse(expresion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.LLAMADA_PARAMETRO:
      {
        LlamadaParametro llamadaParametro = (LlamadaParametro)theEObject;
        T result = caseLlamadaParametro(llamadaParametro);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPRESION_VAR:
      {
        ExpresionVar expresionVar = (ExpresionVar)theEObject;
        T result = caseExpresionVar(expresionVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.BASICA:
      {
        Basica basica = (Basica)theEObject;
        T result = caseBasica(basica);
        if (result == null) result = caseExpresion(basica);
        if (result == null) result = caseExprThen(basica);
        if (result == null) result = caseExprElse(basica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_STRING:
      {
        ExprString exprString = (ExprString)theEObject;
        T result = caseExprString(exprString);
        if (result == null) result = caseExpresionVar(exprString);
        if (result == null) result = caseBasica(exprString);
        if (result == null) result = caseElementList(exprString);
        if (result == null) result = caseExpresion(exprString);
        if (result == null) result = caseExprThen(exprString);
        if (result == null) result = caseExprElse(exprString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_NUMBER:
      {
        ExprNumber exprNumber = (ExprNumber)theEObject;
        T result = caseExprNumber(exprNumber);
        if (result == null) result = caseBasica(exprNumber);
        if (result == null) result = caseExpresion(exprNumber);
        if (result == null) result = caseExprThen(exprNumber);
        if (result == null) result = caseExprElse(exprNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_INT:
      {
        ExprInt exprInt = (ExprInt)theEObject;
        T result = caseExprInt(exprInt);
        if (result == null) result = caseExpresionVar(exprInt);
        if (result == null) result = caseExprNumber(exprInt);
        if (result == null) result = caseElementList(exprInt);
        if (result == null) result = caseBasica(exprInt);
        if (result == null) result = caseExpresion(exprInt);
        if (result == null) result = caseExprThen(exprInt);
        if (result == null) result = caseExprElse(exprInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_ARITHMETIC:
      {
        ExprArithmetic exprArithmetic = (ExprArithmetic)theEObject;
        T result = caseExprArithmetic(exprArithmetic);
        if (result == null) result = caseExprNumber(exprArithmetic);
        if (result == null) result = caseEjecuciones(exprArithmetic);
        if (result == null) result = caseBasica(exprArithmetic);
        if (result == null) result = caseExpresion(exprArithmetic);
        if (result == null) result = caseExprThen(exprArithmetic);
        if (result == null) result = caseExprElse(exprArithmetic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_PARAM:
      {
        ExprParam exprParam = (ExprParam)theEObject;
        T result = caseExprParam(exprParam);
        if (result == null) result = caseBasica(exprParam);
        if (result == null) result = caseExpresion(exprParam);
        if (result == null) result = caseExprThen(exprParam);
        if (result == null) result = caseExprElse(exprParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.LLAMADA_FUNCION:
      {
        LlamadaFuncion llamadaFuncion = (LlamadaFuncion)theEObject;
        T result = caseLlamadaFuncion(llamadaFuncion);
        if (result == null) result = caseExpresion(llamadaFuncion);
        if (result == null) result = caseEjecuciones(llamadaFuncion);
        if (result == null) result = caseExprThen(llamadaFuncion);
        if (result == null) result = caseExprElse(llamadaFuncion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_BOOL:
      {
        ExprBool exprBool = (ExprBool)theEObject;
        T result = caseExprBool(exprBool);
        if (result == null) result = caseExpresion(exprBool);
        if (result == null) result = caseExpresionVar(exprBool);
        if (result == null) result = caseElementList(exprBool);
        if (result == null) result = caseEjecuciones(exprBool);
        if (result == null) result = caseExprThen(exprBool);
        if (result == null) result = caseExprElse(exprBool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.VAL_BOOL:
      {
        ValBool valBool = (ValBool)theEObject;
        T result = caseValBool(valBool);
        if (result == null) result = caseExprBool(valBool);
        if (result == null) result = caseExpresion(valBool);
        if (result == null) result = caseExpresionVar(valBool);
        if (result == null) result = caseElementList(valBool);
        if (result == null) result = caseEjecuciones(valBool);
        if (result == null) result = caseExprThen(valBool);
        if (result == null) result = caseExprElse(valBool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.COMP_BOOL:
      {
        CompBool compBool = (CompBool)theEObject;
        T result = caseCompBool(compBool);
        if (result == null) result = caseExprBool(compBool);
        if (result == null) result = caseExpresion(compBool);
        if (result == null) result = caseExpresionVar(compBool);
        if (result == null) result = caseElementList(compBool);
        if (result == null) result = caseEjecuciones(compBool);
        if (result == null) result = caseExprThen(compBool);
        if (result == null) result = caseExprElse(compBool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.OP_BOOL:
      {
        OpBool opBool = (OpBool)theEObject;
        T result = caseOpBool(opBool);
        if (result == null) result = caseExprBool(opBool);
        if (result == null) result = caseExpresion(opBool);
        if (result == null) result = caseExpresionVar(opBool);
        if (result == null) result = caseElementList(opBool);
        if (result == null) result = caseEjecuciones(opBool);
        if (result == null) result = caseExprThen(opBool);
        if (result == null) result = caseExprElse(opBool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_IF:
      {
        ExprIf exprIf = (ExprIf)theEObject;
        T result = caseExprIf(exprIf);
        if (result == null) result = caseExpresion(exprIf);
        if (result == null) result = caseEjecuciones(exprIf);
        if (result == null) result = caseExprThen(exprIf);
        if (result == null) result = caseExprElse(exprIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_THEN:
      {
        ExprThen exprThen = (ExprThen)theEObject;
        T result = caseExprThen(exprThen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_ELSE:
      {
        ExprElse exprElse = (ExprElse)theEObject;
        T result = caseExprElse(exprElse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_LIST:
      {
        ExprList exprList = (ExprList)theEObject;
        T result = caseExprList(exprList);
        if (result == null) result = caseExpresionVar(exprList);
        if (result == null) result = caseEjecuciones(exprList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_LIST2:
      {
        ExprList2 exprList2 = (ExprList2)theEObject;
        T result = caseExprList2(exprList2);
        if (result == null) result = caseExpresion(exprList2);
        if (result == null) result = caseExprThen(exprList2);
        if (result == null) result = caseExprElse(exprList2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.ELEMENT_LIST:
      {
        ElementList elementList = (ElementList)theEObject;
        T result = caseElementList(elementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.FUNC_LIST:
      {
        FuncList funcList = (FuncList)theEObject;
        T result = caseFuncList(funcList);
        if (result == null) result = caseExpresion(funcList);
        if (result == null) result = caseEjecuciones(funcList);
        if (result == null) result = caseExprThen(funcList);
        if (result == null) result = caseExprElse(funcList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_CAR:
      {
        ExprCar exprCar = (ExprCar)theEObject;
        T result = caseExprCar(exprCar);
        if (result == null) result = caseFuncList(exprCar);
        if (result == null) result = caseExpresion(exprCar);
        if (result == null) result = caseEjecuciones(exprCar);
        if (result == null) result = caseExprThen(exprCar);
        if (result == null) result = caseExprElse(exprCar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_CDR:
      {
        ExprCdr exprCdr = (ExprCdr)theEObject;
        T result = caseExprCdr(exprCdr);
        if (result == null) result = caseFuncList(exprCdr);
        if (result == null) result = caseExpresion(exprCdr);
        if (result == null) result = caseEjecuciones(exprCdr);
        if (result == null) result = caseExprThen(exprCdr);
        if (result == null) result = caseExprElse(exprCdr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_CONS:
      {
        ExprCons exprCons = (ExprCons)theEObject;
        T result = caseExprCons(exprCons);
        if (result == null) result = caseFuncList(exprCons);
        if (result == null) result = caseExpresion(exprCons);
        if (result == null) result = caseEjecuciones(exprCons);
        if (result == null) result = caseExprThen(exprCons);
        if (result == null) result = caseExprElse(exprCons);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_IS_EMPTY:
      {
        ExprIsEmpty exprIsEmpty = (ExprIsEmpty)theEObject;
        T result = caseExprIsEmpty(exprIsEmpty);
        if (result == null) result = caseFuncList(exprIsEmpty);
        if (result == null) result = caseExpresion(exprIsEmpty);
        if (result == null) result = caseEjecuciones(exprIsEmpty);
        if (result == null) result = caseExprThen(exprIsEmpty);
        if (result == null) result = caseExprElse(exprIsEmpty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_LENGTH:
      {
        ExprLength exprLength = (ExprLength)theEObject;
        T result = caseExprLength(exprLength);
        if (result == null) result = caseFuncList(exprLength);
        if (result == null) result = caseExpresion(exprLength);
        if (result == null) result = caseEjecuciones(exprLength);
        if (result == null) result = caseExprThen(exprLength);
        if (result == null) result = caseExprElse(exprLength);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EXPR_PRINT:
      {
        ExprPrint exprPrint = (ExprPrint)theEObject;
        T result = caseExprPrint(exprPrint);
        if (result == null) result = caseBasica(exprPrint);
        if (result == null) result = caseExpresion(exprPrint);
        if (result == null) result = caseExprThen(exprPrint);
        if (result == null) result = caseExprElse(exprPrint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LosMelosPackage.EJECUCIONES:
      {
        Ejecuciones ejecuciones = (Ejecuciones)theEObject;
        T result = caseEjecuciones(ejecuciones);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definiciones</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definiciones</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefiniciones(Definiciones object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Funciones</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Funciones</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunciones(Funciones object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariables(Variables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpresion(Expresion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Llamada Parametro</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Llamada Parametro</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLlamadaParametro(LlamadaParametro object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expresion Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expresion Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpresionVar(ExpresionVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasica(Basica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprString(ExprString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprNumber(ExprNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprInt(ExprInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Arithmetic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Arithmetic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprArithmetic(ExprArithmetic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprParam(ExprParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Llamada Funcion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Llamada Funcion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLlamadaFuncion(LlamadaFuncion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBool(ExprBool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Val Bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Val Bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValBool(ValBool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comp Bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comp Bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompBool(CompBool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpBool(OpBool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprIf(ExprIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Then</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Then</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprThen(ExprThen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Else</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Else</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprElse(ExprElse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprList(ExprList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr List2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr List2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprList2(ExprList2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementList(ElementList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncList(FuncList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Car</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Car</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprCar(ExprCar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Cdr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Cdr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprCdr(ExprCdr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Cons</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Cons</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprCons(ExprCons object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Is Empty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Is Empty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprIsEmpty(ExprIsEmpty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Length</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Length</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLength(ExprLength object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Print</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Print</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprPrint(ExprPrint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ejecuciones</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ejecuciones</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEjecuciones(Ejecuciones object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LosMelosSwitch
