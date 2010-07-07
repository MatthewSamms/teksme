/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Message#getId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getText <em>Text</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getCommunicationChannelList <em>Communication Channel</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getGatewayId <em>Gateway Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getMessageCharCount <em>Message Char Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getMessage()
 * @model abstract="true"
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Encoding()
	 * @model
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChannelKind[] getCommunicationChannel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChannelKind getCommunicationChannel(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getCommunicationChannelLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCommunicationChannel(ChannelKind[] newCommunicationChannel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCommunicationChannel(int index, ChannelKind element);

	/**
	 * Returns the value of the '<em><b>Communication Channel</b></em>' attribute list.
	 * The list contents are of type {@link org.teksme.model.teks.ChannelKind}.
	 * The literals are from the enumeration {@link org.teksme.model.teks.ChannelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Channel</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Channel</em>' attribute list.
	 * @see org.teksme.model.teks.ChannelKind
	 * @see org.teksme.model.teks.TeksPackage#getMessage_CommunicationChannel()
	 * @model
	 * @generated
	 */
	EList<ChannelKind> getCommunicationChannelList();

	/**
	 * Returns the value of the '<em><b>Gateway Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Id</em>' attribute.
	 * @see #setGatewayId(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_GatewayId()
	 * @model
	 * @generated
	 */
	String getGatewayId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getGatewayId <em>Gateway Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Id</em>' attribute.
	 * @see #getGatewayId()
	 * @generated
	 */
	void setGatewayId(String value);

	/**
	 * Returns the value of the '<em><b>Message Char Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Char Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Char Count</em>' attribute.
	 * @see #setMessageCharCount(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_MessageCharCount()
	 * @model
	 * @generated
	 */
	String getMessageCharCount();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getMessageCharCount <em>Message Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Char Count</em>' attribute.
	 * @see #getMessageCharCount()
	 * @generated
	 */
	void setMessageCharCount(String value);

} // Message
