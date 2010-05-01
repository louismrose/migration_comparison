/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lit_petriNets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lit_petriNets.PTArc#getSrc <em>Src</em>}</li>
 *   <li>{@link lit_petriNets.PTArc#getDst <em>Dst</em>}</li>
 * </ul>
 * </p>
 *
 * @see lit_petriNets.Lit_petriNetsPackage#getPTArc()
 * @model
 * @generated
 */
public interface PTArc extends Arc {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lit_petriNets.Place#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Place)
	 * @see lit_petriNets.Lit_petriNetsPackage#getPTArc_Src()
	 * @see lit_petriNets.Place#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Place getSrc();

	/**
	 * Sets the value of the '{@link lit_petriNets.PTArc#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Place value);

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lit_petriNets.Transition#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst</em>' reference.
	 * @see #setDst(Transition)
	 * @see lit_petriNets.Lit_petriNetsPackage#getPTArc_Dst()
	 * @see lit_petriNets.Transition#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Transition getDst();

	/**
	 * Sets the value of the '{@link lit_petriNets.PTArc#getDst <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' reference.
	 * @see #getDst()
	 * @generated
	 */
	void setDst(Transition value);

} // PTArc
