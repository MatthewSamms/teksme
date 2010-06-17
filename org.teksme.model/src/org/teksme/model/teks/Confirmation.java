/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confirmation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Confirmation#getAutoReply <em>Auto Reply</em>}</li>
 *   <li>{@link org.teksme.model.teks.Confirmation#getConfirmationList <em>Confirmation</em>}</li>
 *   <li>{@link org.teksme.model.teks.Confirmation#getCustomReply <em>Custom Reply</em>}</li>
 *   <li>{@link org.teksme.model.teks.Confirmation#getResponseRef <em>Response Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getConfirmation()
 * @model
 * @generated
 */
public interface Confirmation extends TeksElement {
	/**
	 * Returns the value of the '<em><b>Auto Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Reply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Reply</em>' containment reference.
	 * @see #setAutoReply(OutboundMessage)
	 * @see org.teksme.model.teks.TeksPackage#getConfirmation_AutoReply()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OutboundMessage getAutoReply();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Confirmation#getAutoReply <em>Auto Reply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Reply</em>' containment reference.
	 * @see #getAutoReply()
	 * @generated
	 */
	void setAutoReply(OutboundMessage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Confirmation[] getConfirmation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Confirmation getConfirmation(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getConfirmationLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setConfirmation(Confirmation[] newConfirmation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setConfirmation(int index, Confirmation element);

	/**
	 * Returns the value of the '<em><b>Confirmation</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.Confirmation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmation</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getConfirmation_Confirmation()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Confirmation> getConfirmationList();

	/**
	 * Returns the value of the '<em><b>Custom Reply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Reply</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Reply</em>' reference.
	 * @see #setCustomReply(CustomOutboundMessage)
	 * @see org.teksme.model.teks.TeksPackage#getConfirmation_CustomReply()
	 * @model
	 * @generated
	 */
	CustomOutboundMessage getCustomReply();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Confirmation#getCustomReply <em>Custom Reply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Reply</em>' reference.
	 * @see #getCustomReply()
	 * @generated
	 */
	void setCustomReply(CustomOutboundMessage value);

	/**
	 * Returns the value of the '<em><b>Response Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Ref</em>' reference.
	 * @see #setResponseRef(Response)
	 * @see org.teksme.model.teks.TeksPackage#getConfirmation_ResponseRef()
	 * @model keys="id"
	 * @generated
	 */
	Response getResponseRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Confirmation#getResponseRef <em>Response Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Ref</em>' reference.
	 * @see #getResponseRef()
	 * @generated
	 */
	void setResponseRef(Response value);

} // Confirmation
