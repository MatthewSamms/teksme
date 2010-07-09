/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outbound Text Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getFrom <em>From</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getRecipientList <em>Recipient</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#isStatusReport <em>Status Report</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getRetryCount <em>Retry Count</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getMessageStatus <em>Message Status</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getFailureCause <em>Failure Cause</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getDispatchDate <em>Dispatch Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getRefNo <em>Ref No</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getTeksRef <em>Teks Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage()
 * @model
 * @generated
 */
public interface OutboundTextMessage extends Message {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_From()
	 * @model
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String[] getRecipient();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String getRecipient(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getRecipientLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setRecipient(String[] newRecipient);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setRecipient(int index, String element);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_Recipient()
	 * @model
	 * @generated
	 */
	EList<String> getRecipientList();

	/**
	 * Returns the value of the '<em><b>Status Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Report</em>' attribute.
	 * @see #setStatusReport(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_StatusReport()
	 * @model
	 * @generated
	 */
	boolean isStatusReport();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#isStatusReport <em>Status Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Report</em>' attribute.
	 * @see #isStatusReport()
	 * @generated
	 */
	void setStatusReport(boolean value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Count</em>' attribute.
	 * @see #setRetryCount(int)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_RetryCount()
	 * @model
	 * @generated
	 */
	int getRetryCount();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getRetryCount <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Count</em>' attribute.
	 * @see #getRetryCount()
	 * @generated
	 */
	void setRetryCount(int value);

	/**
	 * Returns the value of the '<em><b>Message Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.teksme.model.teks.MessageStatuses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Status</em>' attribute.
	 * @see org.teksme.model.teks.MessageStatuses
	 * @see #setMessageStatus(MessageStatuses)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_MessageStatus()
	 * @model
	 * @generated
	 */
	MessageStatuses getMessageStatus();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getMessageStatus <em>Message Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Status</em>' attribute.
	 * @see org.teksme.model.teks.MessageStatuses
	 * @see #getMessageStatus()
	 * @generated
	 */
	void setMessageStatus(MessageStatuses value);

	/**
	 * Returns the value of the '<em><b>Failure Cause</b></em>' attribute.
	 * The literals are from the enumeration {@link org.teksme.model.teks.FailureCauses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Cause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Cause</em>' attribute.
	 * @see org.teksme.model.teks.FailureCauses
	 * @see #setFailureCause(FailureCauses)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_FailureCause()
	 * @model
	 * @generated
	 */
	FailureCauses getFailureCause();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getFailureCause <em>Failure Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Cause</em>' attribute.
	 * @see org.teksme.model.teks.FailureCauses
	 * @see #getFailureCause()
	 * @generated
	 */
	void setFailureCause(FailureCauses value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Period</em>' attribute.
	 * @see #setValidityPeriod(int)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_ValidityPeriod()
	 * @model
	 * @generated
	 */
	int getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getValidityPeriod <em>Validity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' attribute.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Dispatch Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatch Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatch Date</em>' attribute.
	 * @see #setDispatchDate(Date)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_DispatchDate()
	 * @model
	 * @generated
	 */
	Date getDispatchDate();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getDispatchDate <em>Dispatch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatch Date</em>' attribute.
	 * @see #getDispatchDate()
	 * @generated
	 */
	void setDispatchDate(Date value);

	/**
	 * Returns the value of the '<em><b>Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref No</em>' attribute.
	 * @see #setRefNo(String)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_RefNo()
	 * @model
	 * @generated
	 */
	String getRefNo();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getRefNo <em>Ref No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref No</em>' attribute.
	 * @see #getRefNo()
	 * @generated
	 */
	void setRefNo(String value);

	/**
	 * Returns the value of the '<em><b>Teks Ref</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.Teks#getOutboundMessageList <em>Outbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teks Ref</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teks Ref</em>' container reference.
	 * @see #setTeksRef(Teks)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_TeksRef()
	 * @see org.teksme.model.teks.Teks#getOutboundMessageList
	 * @model opposite="outboundMessage" transient="false"
	 * @generated
	 */
	Teks getTeksRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundTextMessage#getTeksRef <em>Teks Ref</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teks Ref</em>' container reference.
	 * @see #getTeksRef()
	 * @generated
	 */
	void setTeksRef(Teks value);

} // OutboundTextMessage
