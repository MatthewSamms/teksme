/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.teksme.model.teks.FailureCauses;
import org.teksme.model.teks.MessageStatuses;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outbound Text Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getRecipientList <em>Recipient</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#isStatusReport <em>Status Report</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getRetryCount <em>Retry Count</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getMessageStatus <em>Message Status</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getFailureCause <em>Failure Cause</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getDispatchDate <em>Dispatch Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getRefNo <em>Ref No</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutboundTextMessageImpl extends MessageImpl implements
		OutboundTextMessage {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

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
	 * The default value of the '{@link #isStatusReport() <em>Status Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusReport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_REPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatusReport() <em>Status Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusReport()
	 * @generated
	 * @ordered
	 */
	protected boolean statusReport = STATUS_REPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

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
	 * The default value of the '{@link #getMessageStatus() <em>Message Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MessageStatuses MESSAGE_STATUS_EDEFAULT = MessageStatuses.UNSENT;

	/**
	 * The cached value of the '{@link #getMessageStatus() <em>Message Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageStatus()
	 * @generated
	 * @ordered
	 */
	protected MessageStatuses messageStatus = MESSAGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureCause() <em>Failure Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureCause()
	 * @generated
	 * @ordered
	 */
	protected static final FailureCauses FAILURE_CAUSE_EDEFAULT = FailureCauses.NO_ERROR;

	/**
	 * The cached value of the '{@link #getFailureCause() <em>Failure Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureCause()
	 * @generated
	 * @ordered
	 */
	protected FailureCauses failureCause = FAILURE_CAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int VALIDITY_PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected int validityPeriod = VALIDITY_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDispatchDate() <em>Dispatch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DISPATCH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDispatchDate() <em>Dispatch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchDate()
	 * @generated
	 * @ordered
	 */
	protected Date dispatchDate = DISPATCH_DATE_EDEFAULT;

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
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM, oldFrom, from));
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
	public boolean isStatusReport() {
		return statusReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReport(boolean newStatusReport) {
		boolean oldStatusReport = statusReport;
		statusReport = newStatusReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__STATUS_REPORT,
					oldStatusReport, statusReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__PRIORITY, oldPriority,
					priority));
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
	public MessageStatuses getMessageStatus() {
		return messageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageStatus(MessageStatuses newMessageStatus) {
		MessageStatuses oldMessageStatus = messageStatus;
		messageStatus = newMessageStatus == null ? MESSAGE_STATUS_EDEFAULT
				: newMessageStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS,
					oldMessageStatus, messageStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureCauses getFailureCause() {
		return failureCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureCause(FailureCauses newFailureCause) {
		FailureCauses oldFailureCause = failureCause;
		failureCause = newFailureCause == null ? FAILURE_CAUSE_EDEFAULT
				: newFailureCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE,
					oldFailureCause, failureCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityPeriod(int newValidityPeriod) {
		int oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_PERIOD,
					oldValidityPeriod, validityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDispatchDate() {
		return dispatchDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispatchDate(Date newDispatchDate) {
		Date oldDispatchDate = dispatchDate;
		dispatchDate = newDispatchDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__DISPATCH_DATE,
					oldDispatchDate, dispatchDate));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM:
			return getFrom();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT:
			return getRecipientList();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__STATUS_REPORT:
			return isStatusReport();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__PRIORITY:
			return getPriority();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT:
			return getRetryCount();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS:
			return getMessageStatus();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE:
			return getFailureCause();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_PERIOD:
			return getValidityPeriod();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DISPATCH_DATE:
			return getDispatchDate();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO:
			return getRefNo();
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
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM:
			setFrom((String) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT:
			getRecipientList().clear();
			getRecipientList().addAll((Collection<? extends String>) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__STATUS_REPORT:
			setStatusReport((Boolean) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__PRIORITY:
			setPriority((Integer) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT:
			setRetryCount((Integer) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS:
			setMessageStatus((MessageStatuses) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE:
			setFailureCause((FailureCauses) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_PERIOD:
			setValidityPeriod((Integer) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DISPATCH_DATE:
			setDispatchDate((Date) newValue);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO:
			setRefNo((String) newValue);
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
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT:
			getRecipientList().clear();
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__STATUS_REPORT:
			setStatusReport(STATUS_REPORT_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT:
			setRetryCount(RETRY_COUNT_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS:
			setMessageStatus(MESSAGE_STATUS_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE:
			setFailureCause(FAILURE_CAUSE_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_PERIOD:
			setValidityPeriod(VALIDITY_PERIOD_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DISPATCH_DATE:
			setDispatchDate(DISPATCH_DATE_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO:
			setRefNo(REF_NO_EDEFAULT);
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
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FROM:
			return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT
					.equals(from);
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RECIPIENT:
			return recipient != null && !recipient.isEmpty();
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__STATUS_REPORT:
			return statusReport != STATUS_REPORT_EDEFAULT;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__RETRY_COUNT:
			return retryCount != RETRY_COUNT_EDEFAULT;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS:
			return messageStatus != MESSAGE_STATUS_EDEFAULT;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE:
			return failureCause != FAILURE_CAUSE_EDEFAULT;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__VALIDITY_PERIOD:
			return validityPeriod != VALIDITY_PERIOD_EDEFAULT;
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__DISPATCH_DATE:
			return DISPATCH_DATE_EDEFAULT == null ? dispatchDate != null
					: !DISPATCH_DATE_EDEFAULT.equals(dispatchDate);
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__REF_NO:
			return REF_NO_EDEFAULT == null ? refNo != null : !REF_NO_EDEFAULT
					.equals(refNo);
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
		result.append(" (from: ");
		result.append(from);
		result.append(", recipient: ");
		result.append(recipient);
		result.append(", statusReport: ");
		result.append(statusReport);
		result.append(", priority: ");
		result.append(priority);
		result.append(", retryCount: ");
		result.append(retryCount);
		result.append(", messageStatus: ");
		result.append(messageStatus);
		result.append(", failureCause: ");
		result.append(failureCause);
		result.append(", validityPeriod: ");
		result.append(validityPeriod);
		result.append(", dispatchDate: ");
		result.append(dispatchDate);
		result.append(", refNo: ");
		result.append(refNo);
		result.append(')');
		return result.toString();
	}

} //OutboundTextMessageImpl
