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
package org.teksme.model.teks.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.teksme.model.teks.FailureCauses;
import org.teksme.model.teks.MessageStatuses;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outbound Text Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getRetryCount <em>Retry Count</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getRefNo <em>Ref No</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getTeksRef <em>Teks Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getRecipientList <em>Recipient</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getFromList <em>From</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getDeliveryDelayTimeList <em>Delivery Delay Time</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getValidityTimeframeList <em>Validity Timeframe</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getClientMsgIdList <em>Client Msg Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getDeliveryQueuePriorityList <em>Delivery Queue Priority</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getDeliveryAckList <em>Delivery Ack</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getCallbackCodeList <em>Callback Code</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getConcatenatedList <em>Concatenated</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getMessageStatusList <em>Message Status</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getMobileOriginatedList <em>Mobile Originated</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getFailureCauseList <em>Failure Cause</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getEncodingList <em>Encoding</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getDeliveryScheduledTimeList <em>Delivery Scheduled Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutboundTextMessageImpl extends MessageImpl implements
		OutboundTextMessage {
	/**
	 * The default value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected int retryCount = RETRY_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefNo() <em>Ref No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefNo()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefNo() <em>Ref No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefNo()
	 * @generated
	 * @ordered
	 */
	protected String refNo = REF_NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecipientList() <em>Recipient</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recipient;

	/**
	 * The empty value for the '{@link #getRecipient() <em>Recipient</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected static final String[] RECIPIENT_EEMPTY_ARRAY = new String[0];

	/**
	 * The cached value of the '{@link #getFromList() <em>From</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> from;

	/**
	 * The empty value for the '{@link #getFrom() <em>From</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String[] FROM_EEMPTY_ARRAY = new String[0];

	/**
	 * The cached value of the '{@link #getDeliveryDelayTimeList() <em>Delivery Delay Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDelayTimeList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> deliveryDelayTime;

	/**
	 * The empty value for the '{@link #getDeliveryDelayTime() <em>Delivery Delay Time</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer[] DELIVERY_DELAY_TIME_EEMPTY_ARRAY = new Integer[0];

	/**
	 * The cached value of the '{@link #getValidityTimeframeList() <em>Validity Timeframe</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityTimeframeList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> validityTimeframe;

	/**
	 * The empty value for the '{@link #getValidityTimeframe() <em>Validity Timeframe</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityTimeframe()
	 * @generated
	 * @ordered
	 */
	protected static final Integer[] VALIDITY_TIMEFRAME_EEMPTY_ARRAY = new Integer[0];

	/**
	 * The cached value of the '{@link #getClientMsgIdList() <em>Client Msg Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientMsgIdList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> clientMsgId;

	/**
	 * The empty value for the '{@link #getClientMsgId() <em>Client Msg Id</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientMsgId()
	 * @generated
	 * @ordered
	 */
	protected static final String[] CLIENT_MSG_ID_EEMPTY_ARRAY = new String[0];

	/**
	 * The cached value of the '{@link #getDeliveryQueuePriorityList() <em>Delivery Queue Priority</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryQueuePriorityList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> deliveryQueuePriority;

	/**
	 * The empty value for the '{@link #getDeliveryQueuePriority() <em>Delivery Queue Priority</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryQueuePriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer[] DELIVERY_QUEUE_PRIORITY_EEMPTY_ARRAY = new Integer[0];

	/**
	 * The cached value of the '{@link #getDeliveryAckList() <em>Delivery Ack</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAckList()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> deliveryAck;

	/**
	 * The empty value for the '{@link #getDeliveryAck() <em>Delivery Ack</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAck()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean[] DELIVERY_ACK_EEMPTY_ARRAY = new Boolean[0];

	/**
	 * The cached value of the '{@link #getCallbackCodeList() <em>Callback Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackCodeList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> callbackCode;

	/**
	 * The empty value for the '{@link #getCallbackCode() <em>Callback Code</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer[] CALLBACK_CODE_EEMPTY_ARRAY = new Integer[0];

	/**
	 * The cached value of the '{@link #getConcatenatedList() <em>Concatenated</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcatenatedList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> concatenated;

	/**
	 * The empty value for the '{@link #getConcatenated() <em>Concatenated</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcatenated()
	 * @generated
	 * @ordered
	 */
	protected static final Integer[] CONCATENATED_EEMPTY_ARRAY = new Integer[0];

	/**
	 * The cached value of the '{@link #getMessageStatusList() <em>Message Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageStatusList()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageStatuses> messageStatus;

	/**
	 * The empty value for the '{@link #getMessageStatus() <em>Message Status</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MessageStatuses[] MESSAGE_STATUS_EEMPTY_ARRAY = new MessageStatuses[0];

	/**
	 * The cached value of the '{@link #getMobileOriginatedList() <em>Mobile Originated</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobileOriginatedList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> mobileOriginated;

	/**
	 * The empty value for the '{@link #getMobileOriginated() <em>Mobile Originated</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobileOriginated()
	 * @generated
	 * @ordered
	 */
	protected static final Integer[] MOBILE_ORIGINATED_EEMPTY_ARRAY = new Integer[0];

	/**
	 * The cached value of the '{@link #getFailureCauseList() <em>Failure Cause</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureCauseList()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureCauses> failureCause;

	/**
	 * The empty value for the '{@link #getFailureCause() <em>Failure Cause</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureCause()
	 * @generated
	 * @ordered
	 */
	protected static final FailureCauses[] FAILURE_CAUSE_EEMPTY_ARRAY = new FailureCauses[0];

	/**
	 * The cached value of the '{@link #getEncodingList() <em>Encoding</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> encoding;

	/**
	 * The empty value for the '{@link #getEncoding() <em>Encoding</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String[] ENCODING_EEMPTY_ARRAY = new String[0];

	/**
	 * The cached value of the '{@link #getDeliveryScheduledTimeList() <em>Delivery Scheduled Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryScheduledTimeList()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> deliveryScheduledTime;

	/**
	 * The empty value for the '{@link #getDeliveryScheduledTime() <em>Delivery Scheduled Time</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryScheduledTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date[] DELIVERY_SCHEDULED_TIME_EEMPTY_ARRAY = new Date[0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutboundTextMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.OUTBOUND_TEXT_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryCount() {
		return retryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryCount(int newRetryCount) {
		int oldRetryCount = retryCount;
		retryCount = newRetryCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT,
					oldRetryCount, retryCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefNo() {
		return refNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefNo(String newRefNo) {
		String oldRefNo = refNo;
		refNo = newRefNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO, oldRefNo, refNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teks getTeksRef() {
		if (eContainerFeatureID() != TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF)
			return null;
		return (Teks) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teks basicGetTeksRef() {
		if (eContainerFeatureID() != TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF)
			return null;
		return (Teks) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeksRef(Teks newTeksRef,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTeksRef,
				TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeksRef(Teks newTeksRef) {
		if (newTeksRef != eInternalContainer()
				|| (eContainerFeatureID() != TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF && newTeksRef != null)) {
			if (EcoreUtil.isAncestor(this, newTeksRef))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTeksRef != null)
				msgs = ((InternalEObject) newTeksRef).eInverseAdd(this,
						TeksPackage.TEKS__OUTBOUND_MESSAGE, Teks.class, msgs);
			msgs = basicSetTeksRef(newTeksRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF, newTeksRef,
					newTeksRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getRecipient() {
		if (recipient == null || recipient.isEmpty())
			return RECIPIENT_EEMPTY_ARRAY;
		BasicEList<String> list = (BasicEList<String>) recipient;
		list.shrink();
		return (String[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipient(int index) {
		return getRecipientList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecipientLength() {
		return recipient == null ? 0 : recipient.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(String[] newRecipient) {
		((BasicEList<String>) getRecipientList()).setData(newRecipient.length,
				newRecipient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(int index, String element) {
		getRecipientList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRecipientList() {
		if (recipient == null) {
			recipient = new EDataTypeUniqueEList<String>(String.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getFrom() {
		if (from == null || from.isEmpty())
			return FROM_EEMPTY_ARRAY;
		BasicEList<String> list = (BasicEList<String>) from;
		list.shrink();
		return (String[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom(int index) {
		return getFromList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFromLength() {
		return from == null ? 0 : from.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String[] newFrom) {
		((BasicEList<String>) getFromList()).setData(newFrom.length, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFrom(int index, String element) {
		getFromList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFromList() {
		if (from == null) {
			from = new EDataTypeEList<String>(String.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer[] getDeliveryDelayTime() {
		if (deliveryDelayTime == null || deliveryDelayTime.isEmpty())
			return DELIVERY_DELAY_TIME_EEMPTY_ARRAY;
		BasicEList<Integer> list = (BasicEList<Integer>) deliveryDelayTime;
		list.shrink();
		return (Integer[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDeliveryDelayTime(int index) {
		return getDeliveryDelayTimeList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeliveryDelayTimeLength() {
		return deliveryDelayTime == null ? 0 : deliveryDelayTime.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDelayTime(Integer[] newDeliveryDelayTime) {
		((BasicEList<Integer>) getDeliveryDelayTimeList()).setData(
				newDeliveryDelayTime.length, newDeliveryDelayTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDelayTime(int index, Integer element) {
		getDeliveryDelayTimeList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDeliveryDelayTimeList() {
		if (deliveryDelayTime == null) {
			deliveryDelayTime = new EDataTypeUniqueEList<Integer>(
					Integer.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_DELAY_TIME);
		}
		return deliveryDelayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer[] getValidityTimeframe() {
		if (validityTimeframe == null || validityTimeframe.isEmpty())
			return VALIDITY_TIMEFRAME_EEMPTY_ARRAY;
		BasicEList<Integer> list = (BasicEList<Integer>) validityTimeframe;
		list.shrink();
		return (Integer[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValidityTimeframe(int index) {
		return getValidityTimeframeList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValidityTimeframeLength() {
		return validityTimeframe == null ? 0 : validityTimeframe.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityTimeframe(Integer[] newValidityTimeframe) {
		((BasicEList<Integer>) getValidityTimeframeList()).setData(
				newValidityTimeframe.length, newValidityTimeframe);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setValidityTimeframe(int index, Integer element) {
		getValidityTimeframeList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getValidityTimeframeList() {
		if (validityTimeframe == null) {
			validityTimeframe = new EDataTypeUniqueEList<Integer>(
					Integer.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_TIMEFRAME);
		}
		return validityTimeframe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getClientMsgId() {
		if (clientMsgId == null || clientMsgId.isEmpty())
			return CLIENT_MSG_ID_EEMPTY_ARRAY;
		BasicEList<String> list = (BasicEList<String>) clientMsgId;
		list.shrink();
		return (String[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientMsgId(int index) {
		return getClientMsgIdList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClientMsgIdLength() {
		return clientMsgId == null ? 0 : clientMsgId.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientMsgId(String[] newClientMsgId) {
		((BasicEList<String>) getClientMsgIdList()).setData(
				newClientMsgId.length, newClientMsgId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setClientMsgId(int index, String element) {
		getClientMsgIdList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClientMsgIdList() {
		if (clientMsgId == null) {
			clientMsgId = new EDataTypeUniqueEList<String>(String.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__CLIENT_MSG_ID);
		}
		return clientMsgId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer[] getDeliveryQueuePriority() {
		if (deliveryQueuePriority == null || deliveryQueuePriority.isEmpty())
			return DELIVERY_QUEUE_PRIORITY_EEMPTY_ARRAY;
		BasicEList<Integer> list = (BasicEList<Integer>) deliveryQueuePriority;
		list.shrink();
		return (Integer[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDeliveryQueuePriority(int index) {
		return getDeliveryQueuePriorityList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeliveryQueuePriorityLength() {
		return deliveryQueuePriority == null ? 0 : deliveryQueuePriority.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryQueuePriority(Integer[] newDeliveryQueuePriority) {
		((BasicEList<Integer>) getDeliveryQueuePriorityList()).setData(
				newDeliveryQueuePriority.length, newDeliveryQueuePriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDeliveryQueuePriority(int index, Integer element) {
		getDeliveryQueuePriorityList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDeliveryQueuePriorityList() {
		if (deliveryQueuePriority == null) {
			deliveryQueuePriority = new EDataTypeUniqueEList<Integer>(
					Integer.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_QUEUE_PRIORITY);
		}
		return deliveryQueuePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean[] getDeliveryAck() {
		if (deliveryAck == null || deliveryAck.isEmpty())
			return DELIVERY_ACK_EEMPTY_ARRAY;
		BasicEList<Boolean> list = (BasicEList<Boolean>) deliveryAck;
		list.shrink();
		return (Boolean[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDeliveryAck(int index) {
		return getDeliveryAckList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeliveryAckLength() {
		return deliveryAck == null ? 0 : deliveryAck.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryAck(Boolean[] newDeliveryAck) {
		((BasicEList<Boolean>) getDeliveryAckList()).setData(
				newDeliveryAck.length, newDeliveryAck);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDeliveryAck(int index, Boolean element) {
		getDeliveryAckList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getDeliveryAckList() {
		if (deliveryAck == null) {
			deliveryAck = new EDataTypeUniqueEList<Boolean>(Boolean.class,
					this, TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_ACK);
		}
		return deliveryAck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer[] getCallbackCode() {
		if (callbackCode == null || callbackCode.isEmpty())
			return CALLBACK_CODE_EEMPTY_ARRAY;
		BasicEList<Integer> list = (BasicEList<Integer>) callbackCode;
		list.shrink();
		return (Integer[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCallbackCode(int index) {
		return getCallbackCodeList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCallbackCodeLength() {
		return callbackCode == null ? 0 : callbackCode.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallbackCode(Integer[] newCallbackCode) {
		((BasicEList<Integer>) getCallbackCodeList()).setData(
				newCallbackCode.length, newCallbackCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCallbackCode(int index, Integer element) {
		getCallbackCodeList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getCallbackCodeList() {
		if (callbackCode == null) {
			callbackCode = new EDataTypeUniqueEList<Integer>(Integer.class,
					this, TeksPackage.OUTBOUND_TEXT_MESSAGE__CALLBACK_CODE);
		}
		return callbackCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer[] getConcatenated() {
		if (concatenated == null || concatenated.isEmpty())
			return CONCATENATED_EEMPTY_ARRAY;
		BasicEList<Integer> list = (BasicEList<Integer>) concatenated;
		list.shrink();
		return (Integer[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getConcatenated(int index) {
		return getConcatenatedList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConcatenatedLength() {
		return concatenated == null ? 0 : concatenated.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcatenated(Integer[] newConcatenated) {
		((BasicEList<Integer>) getConcatenatedList()).setData(
				newConcatenated.length, newConcatenated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setConcatenated(int index, Integer element) {
		getConcatenatedList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getConcatenatedList() {
		if (concatenated == null) {
			concatenated = new EDataTypeUniqueEList<Integer>(Integer.class,
					this, TeksPackage.OUTBOUND_TEXT_MESSAGE__CONCATENATED);
		}
		return concatenated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageStatuses[] getMessageStatus() {
		if (messageStatus == null || messageStatus.isEmpty())
			return MESSAGE_STATUS_EEMPTY_ARRAY;
		BasicEList<MessageStatuses> list = (BasicEList<MessageStatuses>) messageStatus;
		list.shrink();
		return (MessageStatuses[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageStatuses getMessageStatus(int index) {
		return getMessageStatusList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMessageStatusLength() {
		return messageStatus == null ? 0 : messageStatus.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageStatus(MessageStatuses[] newMessageStatus) {
		((BasicEList<MessageStatuses>) getMessageStatusList()).setData(
				newMessageStatus.length, newMessageStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageStatus(int index, MessageStatuses element) {
		getMessageStatusList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageStatuses> getMessageStatusList() {
		if (messageStatus == null) {
			messageStatus = new EDataTypeUniqueEList<MessageStatuses>(
					MessageStatuses.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS);
		}
		return messageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer[] getMobileOriginated() {
		if (mobileOriginated == null || mobileOriginated.isEmpty())
			return MOBILE_ORIGINATED_EEMPTY_ARRAY;
		BasicEList<Integer> list = (BasicEList<Integer>) mobileOriginated;
		list.shrink();
		return (Integer[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMobileOriginated(int index) {
		return getMobileOriginatedList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMobileOriginatedLength() {
		return mobileOriginated == null ? 0 : mobileOriginated.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobileOriginated(Integer[] newMobileOriginated) {
		((BasicEList<Integer>) getMobileOriginatedList()).setData(
				newMobileOriginated.length, newMobileOriginated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobileOriginated(int index, Integer element) {
		getMobileOriginatedList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMobileOriginatedList() {
		if (mobileOriginated == null) {
			mobileOriginated = new EDataTypeUniqueEList<Integer>(Integer.class,
					this, TeksPackage.OUTBOUND_TEXT_MESSAGE__MOBILE_ORIGINATED);
		}
		return mobileOriginated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureCauses[] getFailureCause() {
		if (failureCause == null || failureCause.isEmpty())
			return FAILURE_CAUSE_EEMPTY_ARRAY;
		BasicEList<FailureCauses> list = (BasicEList<FailureCauses>) failureCause;
		list.shrink();
		return (FailureCauses[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureCauses getFailureCause(int index) {
		return getFailureCauseList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailureCauseLength() {
		return failureCause == null ? 0 : failureCause.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureCause(FailureCauses[] newFailureCause) {
		((BasicEList<FailureCauses>) getFailureCauseList()).setData(
				newFailureCause.length, newFailureCause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureCause(int index, FailureCauses element) {
		getFailureCauseList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureCauses> getFailureCauseList() {
		if (failureCause == null) {
			failureCause = new EDataTypeUniqueEList<FailureCauses>(
					FailureCauses.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE);
		}
		return failureCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getEncoding() {
		if (encoding == null || encoding.isEmpty())
			return ENCODING_EEMPTY_ARRAY;
		BasicEList<String> list = (BasicEList<String>) encoding;
		list.shrink();
		return (String[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding(int index) {
		return getEncodingList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEncodingLength() {
		return encoding == null ? 0 : encoding.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String[] newEncoding) {
		((BasicEList<String>) getEncodingList()).setData(newEncoding.length,
				newEncoding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(int index, String element) {
		getEncodingList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEncodingList() {
		if (encoding == null) {
			encoding = new EDataTypeUniqueEList<String>(String.class, this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__ENCODING);
		}
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date[] getDeliveryScheduledTime() {
		if (deliveryScheduledTime == null || deliveryScheduledTime.isEmpty())
			return DELIVERY_SCHEDULED_TIME_EEMPTY_ARRAY;
		BasicEList<Date> list = (BasicEList<Date>) deliveryScheduledTime;
		list.shrink();
		return (Date[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliveryScheduledTime(int index) {
		return getDeliveryScheduledTimeList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeliveryScheduledTimeLength() {
		return deliveryScheduledTime == null ? 0 : deliveryScheduledTime.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryScheduledTime(Date[] newDeliveryScheduledTime) {
		((BasicEList<Date>) getDeliveryScheduledTimeList()).setData(
				newDeliveryScheduledTime.length, newDeliveryScheduledTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDeliveryScheduledTime(int index, Date element) {
		getDeliveryScheduledTimeList().add(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getDeliveryScheduledTimeList() {
		if (deliveryScheduledTime == null) {
			deliveryScheduledTime = new EDataTypeUniqueEList<Date>(Date.class,
					this,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_SCHEDULED_TIME);
		}
		return deliveryScheduledTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTeksRef((Teks) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF:
			return basicSetTeksRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF:
			return eInternalContainer().eInverseRemove(this,
					TeksPackage.TEKS__OUTBOUND_MESSAGE, Teks.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT:
			return getRetryCount();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO:
			return getRefNo();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF:
			if (resolve)
				return getTeksRef();
			return basicGetTeksRef();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT:
			return getRecipientList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM:
			return getFromList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_DELAY_TIME:
			return getDeliveryDelayTimeList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_TIMEFRAME:
			return getValidityTimeframeList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CLIENT_MSG_ID:
			return getClientMsgIdList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_QUEUE_PRIORITY:
			return getDeliveryQueuePriorityList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_ACK:
			return getDeliveryAckList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CALLBACK_CODE:
			return getCallbackCodeList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CONCATENATED:
			return getConcatenatedList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS:
			return getMessageStatusList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MOBILE_ORIGINATED:
			return getMobileOriginatedList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE:
			return getFailureCauseList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__ENCODING:
			return getEncodingList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_SCHEDULED_TIME:
			return getDeliveryScheduledTimeList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT:
			setRetryCount((Integer) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO:
			setRefNo((String) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF:
			setTeksRef((Teks) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT:
			getRecipientList().clear();
			getRecipientList().addAll((Collection<? extends String>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM:
			getFromList().clear();
			getFromList().addAll((Collection<? extends String>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_DELAY_TIME:
			getDeliveryDelayTimeList().clear();
			getDeliveryDelayTimeList().addAll(
					(Collection<? extends Integer>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_TIMEFRAME:
			getValidityTimeframeList().clear();
			getValidityTimeframeList().addAll(
					(Collection<? extends Integer>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CLIENT_MSG_ID:
			getClientMsgIdList().clear();
			getClientMsgIdList()
					.addAll((Collection<? extends String>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_QUEUE_PRIORITY:
			getDeliveryQueuePriorityList().clear();
			getDeliveryQueuePriorityList().addAll(
					(Collection<? extends Integer>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_ACK:
			getDeliveryAckList().clear();
			getDeliveryAckList().addAll(
					(Collection<? extends Boolean>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CALLBACK_CODE:
			getCallbackCodeList().clear();
			getCallbackCodeList().addAll(
					(Collection<? extends Integer>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CONCATENATED:
			getConcatenatedList().clear();
			getConcatenatedList().addAll(
					(Collection<? extends Integer>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS:
			getMessageStatusList().clear();
			getMessageStatusList().addAll(
					(Collection<? extends MessageStatuses>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MOBILE_ORIGINATED:
			getMobileOriginatedList().clear();
			getMobileOriginatedList().addAll(
					(Collection<? extends Integer>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE:
			getFailureCauseList().clear();
			getFailureCauseList().addAll(
					(Collection<? extends FailureCauses>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__ENCODING:
			getEncodingList().clear();
			getEncodingList().addAll((Collection<? extends String>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_SCHEDULED_TIME:
			getDeliveryScheduledTimeList().clear();
			getDeliveryScheduledTimeList().addAll(
					(Collection<? extends Date>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT:
			setRetryCount(RETRY_COUNT_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO:
			setRefNo(REF_NO_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF:
			setTeksRef((Teks) null);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT:
			getRecipientList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM:
			getFromList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_DELAY_TIME:
			getDeliveryDelayTimeList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_TIMEFRAME:
			getValidityTimeframeList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CLIENT_MSG_ID:
			getClientMsgIdList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_QUEUE_PRIORITY:
			getDeliveryQueuePriorityList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_ACK:
			getDeliveryAckList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CALLBACK_CODE:
			getCallbackCodeList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CONCATENATED:
			getConcatenatedList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS:
			getMessageStatusList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MOBILE_ORIGINATED:
			getMobileOriginatedList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE:
			getFailureCauseList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__ENCODING:
			getEncodingList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_SCHEDULED_TIME:
			getDeliveryScheduledTimeList().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT:
			return retryCount != RETRY_COUNT_EDEFAULT;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO:
			return REF_NO_EDEFAULT == null ? refNo != null : !REF_NO_EDEFAULT
					.equals(refNo);
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF:
			return basicGetTeksRef() != null;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT:
			return recipient != null && !recipient.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM:
			return from != null && !from.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_DELAY_TIME:
			return deliveryDelayTime != null && !deliveryDelayTime.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_TIMEFRAME:
			return validityTimeframe != null && !validityTimeframe.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CLIENT_MSG_ID:
			return clientMsgId != null && !clientMsgId.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_QUEUE_PRIORITY:
			return deliveryQueuePriority != null
					&& !deliveryQueuePriority.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_ACK:
			return deliveryAck != null && !deliveryAck.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CALLBACK_CODE:
			return callbackCode != null && !callbackCode.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__CONCATENATED:
			return concatenated != null && !concatenated.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS:
			return messageStatus != null && !messageStatus.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MOBILE_ORIGINATED:
			return mobileOriginated != null && !mobileOriginated.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE:
			return failureCause != null && !failureCause.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__ENCODING:
			return encoding != null && !encoding.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DELIVERY_SCHEDULED_TIME:
			return deliveryScheduledTime != null
					&& !deliveryScheduledTime.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (retryCount: ");
		result.append(retryCount);
		result.append(", refNo: ");
		result.append(refNo);
		result.append(", recipient: ");
		result.append(recipient);
		result.append(", from: ");
		result.append(from);
		result.append(", deliveryDelayTime: ");
		result.append(deliveryDelayTime);
		result.append(", validityTimeframe: ");
		result.append(validityTimeframe);
		result.append(", clientMsgId: ");
		result.append(clientMsgId);
		result.append(", deliveryQueuePriority: ");
		result.append(deliveryQueuePriority);
		result.append(", deliveryAck: ");
		result.append(deliveryAck);
		result.append(", callbackCode: ");
		result.append(callbackCode);
		result.append(", concatenated: ");
		result.append(concatenated);
		result.append(", messageStatus: ");
		result.append(messageStatus);
		result.append(", mobileOriginated: ");
		result.append(mobileOriginated);
		result.append(", failureCause: ");
		result.append(failureCause);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", deliveryScheduledTime: ");
		result.append(deliveryScheduledTime);
		result.append(')');
		return result.toString();
	}

} //OutboundTextMessageImpl
