/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import java.io.Serializable;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.teksme.model.teks.Message#getTextMessage <em>Text Message
 * </em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getTimestamp <em>Timestamp</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getId <em>Id</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getTypeList <em>Type</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getGateway <em>Gateway</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getCharset <em>Charset</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getHeaderData <em>Header Data</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getFrom <em>From</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getToList <em>To</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getUsername <em>Username</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getPassword <em>Password</em>}</li>
 * <li>{@link org.teksme.model.teks.Message#getApiId <em>Api Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.teksme.model.teks.TeksPackage#getMessage()
 * @model abstract="true"
 * @generated
 */
public interface Message extends EObject, Serializable {
	/**
	 * Returns the value of the '<em><b>Text Message</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Text Message</em>' attribute.
	 * @see #setTextMessage(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_TextMessage()
	 * @model
	 * @generated
	 */
	String getTextMessage();

	/**
	 * Sets the value of the '
	 * {@link org.teksme.model.teks.Message#getTextMessage
	 * <em>Text Message</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Text Message</em>' attribute.
	 * @see #getTextMessage()
	 * @generated
	 */
	void setTextMessage(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getTimestamp
	 * <em>Timestamp</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MessageType[] getType();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MessageType getType(int index);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	int getTypeLength();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	void setType(MessageType[] newType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	void setType(int index, MessageType element);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list. The list
	 * contents are of type {@link org.teksme.model.teks.MessageType}. The
	 * literals are from the enumeration
	 * {@link org.teksme.model.teks.MessageType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see org.teksme.model.teks.MessageType
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Type()
	 * @model
	 * @generated
	 */
	EList<MessageType> getTypeList();

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Gateway()
	 * @model
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getGateway
	 * <em>Gateway</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charset</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Charset()
	 * @model
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getCharset
	 * <em>Charset</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * Returns the value of the '<em><b>Header Data</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Data</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Header Data</em>' attribute.
	 * @see #setHeaderData(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_HeaderData()
	 * @model
	 * @generated
	 */
	String getHeaderData();

	/**
	 * Sets the value of the '
	 * {@link org.teksme.model.teks.Message#getHeaderData <em>Header Data</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Header Data</em>' attribute.
	 * @see #getHeaderData()
	 * @generated
	 */
	void setHeaderData(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_From()
	 * @model
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getFrom
	 * <em>From</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String[] getTo();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String getTo(int index);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	int getToLength();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	void setTo(String[] newTo);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	void setTo(int index, String element);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute list. The list
	 * contents are of type {@link java.lang.String}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getMessage_To()
	 * @model
	 * @generated
	 */
	EList<String> getToList();

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getUsername
	 * <em>Username</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getPassword
	 * <em>Password</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Api Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Id</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Api Id</em>' attribute.
	 * @see #setApiId(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_ApiId()
	 * @model
	 * @generated
	 */
	String getApiId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getApiId
	 * <em>Api Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Api Id</em>' attribute.
	 * @see #getApiId()
	 * @generated
	 */
	void setApiId(String value);

} // Message
