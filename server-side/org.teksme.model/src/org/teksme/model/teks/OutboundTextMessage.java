/**
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version 
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 * 
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
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getRetryCount <em>Retry Count</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getRefNo <em>Ref No</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getTeksRef <em>Teks Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getRecipientList <em>Recipient</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getFromList <em>From</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getDeliveryDelayTimeList <em>Delivery Delay Time</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getValidityTimeframeList <em>Validity Timeframe</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getClientMsgIdList <em>Client Msg Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getDeliveryQueuePriorityList <em>Delivery Queue Priority</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getDeliveryAckList <em>Delivery Ack</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getCallbackCodeList <em>Callback Code</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getConcatenatedList <em>Concatenated</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getMessageStatusList <em>Message Status</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getMobileOriginatedList <em>Mobile Originated</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getFailureCauseList <em>Failure Cause</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getEncodingList <em>Encoding</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundTextMessage#getDeliveryScheduledTimeList <em>Delivery Scheduled Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage()
 * @model
 * @generated
 */
public interface OutboundTextMessage extends Message {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String[] getFrom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String getFrom(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getFromLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setFrom(String[] newFrom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setFrom(int index, String element);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_From()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getFromList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer[] getDeliveryDelayTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer getDeliveryDelayTime(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getDeliveryDelayTimeLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDeliveryDelayTime(Integer[] newDeliveryDelayTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDeliveryDelayTime(int index, Integer element);

	/**
	 * Returns the value of the '<em><b>Delivery Delay Time</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Delay Time</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Delay Time</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_DeliveryDelayTime()
	 * @model
	 * @generated
	 */
	EList<Integer> getDeliveryDelayTimeList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer[] getValidityTimeframe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer getValidityTimeframe(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getValidityTimeframeLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setValidityTimeframe(Integer[] newValidityTimeframe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setValidityTimeframe(int index, Integer element);

	/**
	 * Returns the value of the '<em><b>Validity Timeframe</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Timeframe</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Timeframe</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_ValidityTimeframe()
	 * @model
	 * @generated
	 */
	EList<Integer> getValidityTimeframeList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String[] getClientMsgId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String getClientMsgId(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getClientMsgIdLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setClientMsgId(String[] newClientMsgId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setClientMsgId(int index, String element);

	/**
	 * Returns the value of the '<em><b>Client Msg Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Msg Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Msg Id</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_ClientMsgId()
	 * @model
	 * @generated
	 */
	EList<String> getClientMsgIdList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer[] getDeliveryQueuePriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer getDeliveryQueuePriority(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getDeliveryQueuePriorityLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDeliveryQueuePriority(Integer[] newDeliveryQueuePriority);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDeliveryQueuePriority(int index, Integer element);

	/**
	 * Returns the value of the '<em><b>Delivery Queue Priority</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Queue Priority</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Queue Priority</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_DeliveryQueuePriority()
	 * @model
	 * @generated
	 */
	EList<Integer> getDeliveryQueuePriorityList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Boolean[] getDeliveryAck();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Boolean getDeliveryAck(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getDeliveryAckLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDeliveryAck(Boolean[] newDeliveryAck);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDeliveryAck(int index, Boolean element);

	/**
	 * Returns the value of the '<em><b>Delivery Ack</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Ack</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Ack</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_DeliveryAck()
	 * @model
	 * @generated
	 */
	EList<Boolean> getDeliveryAckList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer[] getCallbackCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer getCallbackCode(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getCallbackCodeLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCallbackCode(Integer[] newCallbackCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCallbackCode(int index, Integer element);

	/**
	 * Returns the value of the '<em><b>Callback Code</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback Code</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_CallbackCode()
	 * @model
	 * @generated
	 */
	EList<Integer> getCallbackCodeList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer[] getConcatenated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer getConcatenated(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getConcatenatedLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setConcatenated(Integer[] newConcatenated);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setConcatenated(int index, Integer element);

	/**
	 * Returns the value of the '<em><b>Concatenated</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concatenated</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concatenated</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_Concatenated()
	 * @model
	 * @generated
	 */
	EList<Integer> getConcatenatedList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessageStatuses[] getMessageStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessageStatuses getMessageStatus(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getMessageStatusLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMessageStatus(MessageStatuses[] newMessageStatus);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMessageStatus(int index, MessageStatuses element);

	/**
	 * Returns the value of the '<em><b>Message Status</b></em>' attribute list.
	 * The list contents are of type {@link org.teksme.model.teks.MessageStatuses}.
	 * The literals are from the enumeration {@link org.teksme.model.teks.MessageStatuses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Status</em>' attribute list.
	 * @see org.teksme.model.teks.MessageStatuses
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_MessageStatus()
	 * @model
	 * @generated
	 */
	EList<MessageStatuses> getMessageStatusList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer[] getMobileOriginated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Integer getMobileOriginated(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getMobileOriginatedLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMobileOriginated(Integer[] newMobileOriginated);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setMobileOriginated(int index, Integer element);

	/**
	 * Returns the value of the '<em><b>Mobile Originated</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile Originated</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile Originated</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_MobileOriginated()
	 * @model
	 * @generated
	 */
	EList<Integer> getMobileOriginatedList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailureCauses[] getFailureCause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailureCauses getFailureCause(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getFailureCauseLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setFailureCause(FailureCauses[] newFailureCause);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setFailureCause(int index, FailureCauses element);

	/**
	 * Returns the value of the '<em><b>Failure Cause</b></em>' attribute list.
	 * The list contents are of type {@link org.teksme.model.teks.FailureCauses}.
	 * The literals are from the enumeration {@link org.teksme.model.teks.FailureCauses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Cause</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Cause</em>' attribute list.
	 * @see org.teksme.model.teks.FailureCauses
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_FailureCause()
	 * @model
	 * @generated
	 */
	EList<FailureCauses> getFailureCauseList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String[] getEncoding();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String getEncoding(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getEncodingLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setEncoding(String[] newEncoding);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setEncoding(int index, String element);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_Encoding()
	 * @model
	 * @generated
	 */
	EList<String> getEncodingList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Date[] getDeliveryScheduledTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Date getDeliveryScheduledTime(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getDeliveryScheduledTimeLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDeliveryScheduledTime(Date[] newDeliveryScheduledTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDeliveryScheduledTime(int index, Date element);

	/**
	 * Returns the value of the '<em><b>Delivery Scheduled Time</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Scheduled Time</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Scheduled Time</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getOutboundTextMessage_DeliveryScheduledTime()
	 * @model
	 * @generated
	 */
	EList<Date> getDeliveryScheduledTimeList();

} // OutboundTextMessage
