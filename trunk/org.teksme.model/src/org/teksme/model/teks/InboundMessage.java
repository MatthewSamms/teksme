/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inbound Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.InboundMessage#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.teksme.model.teks.InboundMessage#getMessageType <em>Message Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getInboundMessage()
 * @model
 * @generated
 */
public interface InboundMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Number</em>' attribute.
	 * @see #setPartNumber(String)
	 * @see org.teksme.model.teks.TeksPackage#getInboundMessage_PartNumber()
	 * @model
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.InboundMessage#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see org.teksme.model.teks.TeksPackage#getInboundMessage_MessageType()
	 * @model
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.InboundMessage#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

} // InboundMessage
