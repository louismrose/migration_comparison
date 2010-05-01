/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lit_petriNets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TP Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lit_petriNets.TPArc#getSrc <em>Src</em>}</li>
 *   <li>{@link lit_petriNets.TPArc#getDst <em>Dst</em>}</li>
 * </ul>
 * </p>
 *
 * @see lit_petriNets.Lit_petriNetsPackage#getTPArc()
 * @model
 * @generated
 */
public interface TPArc extends Arc {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lit_petriNets.Transition#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Transition)
	 * @see lit_petriNets.Lit_petriNetsPackage#getTPArc_Src()
	 * @see lit_petriNets.Transition#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Transition getSrc();

	/**
	 * Sets the value of the '{@link lit_petriNets.TPArc#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Transition value);

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link lit_petriNets.Place#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst</em>' reference.
	 * @see #setDst(Place)
	 * @see lit_petriNets.Lit_petriNetsPackage#getTPArc_Dst()
	 * @see lit_petriNets.Place#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Place getDst();

	/**
	 * Sets the value of the '{@link lit_petriNets.TPArc#getDst <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' reference.
	 * @see #getDst()
	 * @generated
	 */
	void setDst(Place value);

} // TPArc
