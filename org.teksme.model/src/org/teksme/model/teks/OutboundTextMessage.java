/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outbound Text Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getMessageHandler <em>Message Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage()
 * @model
 * @generated
 */
public interface OutboundTextMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Message Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Handler</em>' attribute.
	 * @see #setMessageHandler(String)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_MessageHandler()
	 * @model
	 * @generated
	 */
	String getMessageHandler();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getMessageHandler <em>Message Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Handler</em>' attribute.
	 * @see #getMessageHandler()
	 * @generated
	 */
	void setMessageHandler(String value);

} // OutboundTextMessage
