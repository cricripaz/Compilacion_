/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.losMelos.impl;

import edu.upb.lp.isc.losMelos.CompBool;
import edu.upb.lp.isc.losMelos.Expresion;
import edu.upb.lp.isc.losMelos.LosMelosPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Bool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losMelos.impl.CompBoolImpl#getVal3 <em>Val3</em>}</li>
 *   <li>{@link edu.upb.lp.isc.losMelos.impl.CompBoolImpl#getVal4 <em>Val4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompBoolImpl extends ExprBoolImpl implements CompBool
{
  /**
   * The cached value of the '{@link #getVal3() <em>Val3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal3()
   * @generated
   * @ordered
   */
  protected Expresion val3;

  /**
   * The cached value of the '{@link #getVal4() <em>Val4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal4()
   * @generated
   * @ordered
   */
  protected Expresion val4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompBoolImpl()
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
    return LosMelosPackage.Literals.COMP_BOOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getVal3()
  {
    return val3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal3(Expresion newVal3, NotificationChain msgs)
  {
    Expresion oldVal3 = val3;
    val3 = newVal3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LosMelosPackage.COMP_BOOL__VAL3, oldVal3, newVal3);
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
  public void setVal3(Expresion newVal3)
  {
    if (newVal3 != val3)
    {
      NotificationChain msgs = null;
      if (val3 != null)
        msgs = ((InternalEObject)val3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LosMelosPackage.COMP_BOOL__VAL3, null, msgs);
      if (newVal3 != null)
        msgs = ((InternalEObject)newVal3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LosMelosPackage.COMP_BOOL__VAL3, null, msgs);
      msgs = basicSetVal3(newVal3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LosMelosPackage.COMP_BOOL__VAL3, newVal3, newVal3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getVal4()
  {
    return val4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal4(Expresion newVal4, NotificationChain msgs)
  {
    Expresion oldVal4 = val4;
    val4 = newVal4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LosMelosPackage.COMP_BOOL__VAL4, oldVal4, newVal4);
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
  public void setVal4(Expresion newVal4)
  {
    if (newVal4 != val4)
    {
      NotificationChain msgs = null;
      if (val4 != null)
        msgs = ((InternalEObject)val4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LosMelosPackage.COMP_BOOL__VAL4, null, msgs);
      if (newVal4 != null)
        msgs = ((InternalEObject)newVal4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LosMelosPackage.COMP_BOOL__VAL4, null, msgs);
      msgs = basicSetVal4(newVal4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LosMelosPackage.COMP_BOOL__VAL4, newVal4, newVal4));
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
      case LosMelosPackage.COMP_BOOL__VAL3:
        return basicSetVal3(null, msgs);
      case LosMelosPackage.COMP_BOOL__VAL4:
        return basicSetVal4(null, msgs);
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
      case LosMelosPackage.COMP_BOOL__VAL3:
        return getVal3();
      case LosMelosPackage.COMP_BOOL__VAL4:
        return getVal4();
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
      case LosMelosPackage.COMP_BOOL__VAL3:
        setVal3((Expresion)newValue);
        return;
      case LosMelosPackage.COMP_BOOL__VAL4:
        setVal4((Expresion)newValue);
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
      case LosMelosPackage.COMP_BOOL__VAL3:
        setVal3((Expresion)null);
        return;
      case LosMelosPackage.COMP_BOOL__VAL4:
        setVal4((Expresion)null);
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
      case LosMelosPackage.COMP_BOOL__VAL3:
        return val3 != null;
      case LosMelosPackage.COMP_BOOL__VAL4:
        return val4 != null;
    }
    return super.eIsSet(featureID);
  }

} //CompBoolImpl
