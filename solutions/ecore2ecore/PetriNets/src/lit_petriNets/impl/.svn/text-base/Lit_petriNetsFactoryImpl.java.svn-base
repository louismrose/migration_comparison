/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lit_petriNets.impl;

import lit_petriNets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lit_petriNetsFactoryImpl extends EFactoryImpl implements Lit_petriNetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lit_petriNetsFactory init() {
		try {
			Lit_petriNetsFactory theLit_petriNetsFactory = (Lit_petriNetsFactory)EPackage.Registry.INSTANCE.getEFactory("lit_petriNets_after"); 
			if (theLit_petriNetsFactory != null) {
				return theLit_petriNetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lit_petriNetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lit_petriNetsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Lit_petriNetsPackage.NET: return createNet();
			case Lit_petriNetsPackage.PLACE: return createPlace();
			case Lit_petriNetsPackage.TRANSITION: return createTransition();
			case Lit_petriNetsPackage.PT_ARC: return createPTArc();
			case Lit_petriNetsPackage.TP_ARC: return createTPArc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net createNet() {
		NetImpl net = new NetImpl();
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTArc createPTArc() {
		PTArcImpl ptArc = new PTArcImpl();
		return ptArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPArc createTPArc() {
		TPArcImpl tpArc = new TPArcImpl();
		return tpArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lit_petriNetsPackage getLit_petriNetsPackage() {
		return (Lit_petriNetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lit_petriNetsPackage getPackage() {
		return Lit_petriNetsPackage.eINSTANCE;
	}

} //Lit_petriNetsFactoryImpl
