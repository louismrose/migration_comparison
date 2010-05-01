/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lit_petriNets.impl;

import lit_petriNets.Lit_petriNetsPackage;
import lit_petriNets.Place;
import lit_petriNets.TPArc;
import lit_petriNets.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TP Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lit_petriNets.impl.TPArcImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link lit_petriNets.impl.TPArcImpl#getDst <em>Dst</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPArcImpl extends ArcImpl implements TPArc {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Transition src;

	/**
	 * The cached value of the '{@link #getDst() <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDst()
	 * @generated
	 * @ordered
	 */
	protected Place dst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lit_petriNetsPackage.Literals.TP_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject)src;
			src = (Transition)eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lit_petriNetsPackage.TP_ARC__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Transition newSrc, NotificationChain msgs) {
		Transition oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Lit_petriNetsPackage.TP_ARC__SRC, oldSrc, newSrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(Transition newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject)src).eInverseRemove(this, Lit_petriNetsPackage.TRANSITION__OUT, Transition.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject)newSrc).eInverseAdd(this, Lit_petriNetsPackage.TRANSITION__OUT, Transition.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lit_petriNetsPackage.TP_ARC__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getDst() {
		if (dst != null && dst.eIsProxy()) {
			InternalEObject oldDst = (InternalEObject)dst;
			dst = (Place)eResolveProxy(oldDst);
			if (dst != oldDst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lit_petriNetsPackage.TP_ARC__DST, oldDst, dst));
			}
		}
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetDst() {
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDst(Place newDst, NotificationChain msgs) {
		Place oldDst = dst;
		dst = newDst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Lit_petriNetsPackage.TP_ARC__DST, oldDst, newDst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDst(Place newDst) {
		if (newDst != dst) {
			NotificationChain msgs = null;
			if (dst != null)
				msgs = ((InternalEObject)dst).eInverseRemove(this, Lit_petriNetsPackage.PLACE__IN, Place.class, msgs);
			if (newDst != null)
				msgs = ((InternalEObject)newDst).eInverseAdd(this, Lit_petriNetsPackage.PLACE__IN, Place.class, msgs);
			msgs = basicSetDst(newDst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lit_petriNetsPackage.TP_ARC__DST, newDst, newDst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Lit_petriNetsPackage.TP_ARC__SRC:
				if (src != null)
					msgs = ((InternalEObject)src).eInverseRemove(this, Lit_petriNetsPackage.TRANSITION__OUT, Transition.class, msgs);
				return basicSetSrc((Transition)otherEnd, msgs);
			case Lit_petriNetsPackage.TP_ARC__DST:
				if (dst != null)
					msgs = ((InternalEObject)dst).eInverseRemove(this, Lit_petriNetsPackage.PLACE__IN, Place.class, msgs);
				return basicSetDst((Place)otherEnd, msgs);
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
			case Lit_petriNetsPackage.TP_ARC__SRC:
				return basicSetSrc(null, msgs);
			case Lit_petriNetsPackage.TP_ARC__DST:
				return basicSetDst(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lit_petriNetsPackage.TP_ARC__SRC:
				if (resolve) return getSrc();
				return basicGetSrc();
			case Lit_petriNetsPackage.TP_ARC__DST:
				if (resolve) return getDst();
				return basicGetDst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Lit_petriNetsPackage.TP_ARC__SRC:
				setSrc((Transition)newValue);
				return;
			case Lit_petriNetsPackage.TP_ARC__DST:
				setDst((Place)newValue);
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
			case Lit_petriNetsPackage.TP_ARC__SRC:
				setSrc((Transition)null);
				return;
			case Lit_petriNetsPackage.TP_ARC__DST:
				setDst((Place)null);
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
			case Lit_petriNetsPackage.TP_ARC__SRC:
				return src != null;
			case Lit_petriNetsPackage.TP_ARC__DST:
				return dst != null;
		}
		return super.eIsSet(featureID);
	}

} //TPArcImpl
