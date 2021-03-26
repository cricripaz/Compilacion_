/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.losMelos.impl;

import edu.upb.lp.isc.losMelos.ExprBool;
import edu.upb.lp.isc.losMelos.LosMelosPackage;
import edu.upb.lp.isc.losMelos.OpBool;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Bool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losMelos.impl.OpBoolImpl#getOp1 <em>Op1</em>}</li>
 *   <li>{@link edu.upb.lp.isc.losMelos.impl.OpBoolImpl#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpBoolImpl extends ExprBoolImpl implements OpBool
{
  /**
   * The cached value of the '{@link #getOp1() <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp1()
   * @generated
   * @ordered
   */
  protected ExprBool op1;

  /**
   * The cached value of the '{@link #getOp2() <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected ExprBool op2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpBoolImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LosMelosPackage.Literals.OP_BOOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprBool getOp1()
  {
    return op1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp1(ExprBool newOp1, NotificationChain msgs)
  {
    ExprBool oldOp1 = op1;
    op1 = newOp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LosMelosPackage.OP_BOOL__OP1, oldOp1, newOp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp1(ExprBool newOp1)
  {
    if (newOp1 != op1)
    {
      NotificationChain msgs = null;
      if (op1 != null)
        msgs = ((InternalEObject)op1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LosMelosPackage.OP_BOOL__OP1, null, msgs);
      if (newOp1 != null)
        msgs = ((InternalEObject)newOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LosMelosPackage.OP_BOOL__OP1, null, msgs);
      msgs = basicSetOp1(newOp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LosMelosPackage.OP_BOOL__OP1, newOp1, newOp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprBool getOp2()
  {
    return op2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp2(ExprBool newOp2, NotificationChain msgs)
  {
    ExprBool oldOp2 = op2;
    op2 = newOp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LosMelosPackage.OP_BOOL__OP2, oldOp2, newOp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp2(ExprBool newOp2)
  {
    if (newOp2 != op2)
    {
      NotificationChain msgs = null;
      if (op2 != null)
        msgs = ((InternalEObject)op2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LosMelosPackage.OP_BOOL__OP2, null, msgs);
      if (newOp2 != null)
        msgs = ((InternalEObject)newOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LosMelosPackage.OP_BOOL__OP2, null, msgs);
      msgs = basicSetOp2(newOp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LosMelosPackage.OP_BOOL__OP2, newOp2, newOp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LosMelosPackage.OP_BOOL__OP1:
        return basicSetOp1(null, msgs);
      case LosMelosPackage.OP_BOOL__OP2:
        return basicSetOp2(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LosMelosPackage.OP_BOOL__OP1:
        return getOp1();
      case LosMelosPackage.OP_BOOL__OP2:
        return getOp2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LosMelosPackage.OP_BOOL__OP1:
        setOp1((ExprBool)newValue);
        return;
      case LosMelosPackage.OP_BOOL__OP2:
        setOp2((ExprBool)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LosMelosPackage.OP_BOOL__OP1:
        setOp1((ExprBool)null);
        return;
      case LosMelosPackage.OP_BOOL__OP2:
        setOp2((ExprBool)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LosMelosPackage.OP_BOOL__OP1:
        return op1 != null;
      case LosMelosPackage.OP_BOOL__OP2:
        return op2 != null;
    }
    return super.eIsSet(featureID);
  }

} //OpBoolImpl