/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lit_petriNets.impl;

import java.util.Collection;

import lit_petriNets.Lit_petriNetsPackage;
import lit_petriNets.Net;
import lit_petriNets.PTArc;
import lit_petriNets.TPArc;
import lit_petriNets.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lit_petriNets.impl.TransitionImpl#getNet <em>Net</em>}</li>
 *   <li>{@link lit_petriNets.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link lit_petriNets.impl.TransitionImpl#getIn <em>In</em>}</li>
 *   <li>{@link lit_petriNets.impl.TransitionImpl#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<PTArc> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<TPArc> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lit_petriNetsPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net getNet() {
		if (eContainerFeatureID() != Lit_petriNetsPackage.TRANSITION__NET) return null;
		return (Net)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Net newNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNet, Lit_petriNetsPackage.TRANSITION__NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Net newNet) {
		if (newNet != eInternalContainer() || (eContainerFeatureID() != Lit_petriNetsPackage.TRANSITION__NET && newNet != null)) {
			if (EcoreUtil.isAncestor(this, newNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, Lit_petriNetsPackage.NET__TRANSITIONS, Net.class, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lit_petriNetsPackage.TRANSITION__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lit_petriNetsPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PTArc> getIn() {
		if (in == null) {
			in = new EObjectWithInverseResolvingEList<PTArc>(PTArc.class, this, Lit_petriNetsPackage.TRANSITION__IN, Lit_petriNetsPackage.PT_ARC__DST);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPArc> getOut() {
		if (out == null) {
			out = new EObjectWithInverseResolvingEList<TPArc>(TPArc.class, this, Lit_petriNetsPackage.TRANSITION__OUT, Lit_petriNetsPackage.TP_ARC__SRC);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Lit_petriNetsPackage.TRANSITION__NET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNet((Net)otherEnd, msgs);
			case Lit_petriNetsPackage.TRANSITION__IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
			case Lit_petriNetsPackage.TRANSITION__OUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Lit_petriNetsPackage.TRANSITION__NET:
				return basicSetNet(null, msgs);
			case Lit_petriNetsPackage.TRANSITION__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case Lit_petriNetsPackage.TRANSITION__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Lit_petriNetsPackage.TRANSITION__NET:
				return eInternalContainer().eInverseRemove(this, Lit_petriNetsPackage.NET__TRANSITIONS, Net.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lit_petriNetsPackage.TRANSITION__NET:
				return getNet();
			case Lit_petriNetsPackage.TRANSITION__NAME:
				return getName();
			case Lit_petriNetsPackage.TRANSITION__IN:
				return getIn();
			case Lit_petriNetsPackage.TRANSITION__OUT:
				return getOut();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Lit_petriNetsPackage.TRANSITION__NET:
				setNet((Net)newValue);
				return;
			case Lit_petriNetsPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case Lit_petriNetsPackage.TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends PTArc>)newValue);
				return;
			case Lit_petriNetsPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends TPArc>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Lit_petriNetsPackage.TRANSITION__NET:
				setNet((Net)null);
				return;
			case Lit_petriNetsPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Lit_petriNetsPackage.TRANSITION__IN:
				getIn().clear();
				return;
			case Lit_petriNetsPackage.TRANSITION__OUT:
				getOut().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Lit_petriNetsPackage.TRANSITION__NET:
				return getNet() != null;
			case Lit_petriNetsPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Lit_petriNetsPackage.TRANSITION__IN:
				return in != null && !in.isEmpty();
			case Lit_petriNetsPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
