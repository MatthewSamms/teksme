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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.LanguageKind;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.PollSettings;
import org.teksme.model.teks.ReplyMessage;
import org.teksme.model.teks.ResponseRestriction;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#getCloseDate <em>Close Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#getScheduleStartDate <em>Schedule Start Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#isSuspendOnFailure <em>Suspend On Failure</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#getLanguageList <em>Language</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#isBatchResponseDelivery <em>Batch Response Delivery</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#isSynchronousConfirmation <em>Synchronous Confirmation</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#getReplyMessage <em>Reply Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#getAdvertiseIt <em>Advertise It</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#getFolderID <em>Folder ID</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#isSharing <em>Sharing</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#getResponseRestrictions <em>Response Restrictions</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollSettingsImpl#getShortNumber <em>Short Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollSettingsImpl extends TeksObjectImpl implements PollSettings {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCloseDate() <em>Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloseDate() <em>Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseDate()
	 * @generated
	 * @ordered
	 */
	protected Date closeDate = CLOSE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleStartDate() <em>Schedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCHEDULE_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleStartDate() <em>Schedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date scheduleStartDate = SCHEDULE_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSuspendOnFailure() <em>Suspend On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspendOnFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUSPEND_ON_FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuspendOnFailure() <em>Suspend On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspendOnFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean suspendOnFailure = SUSPEND_ON_FAILURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguageList() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageList()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageKind> language;

	/**
	 * The empty value for the '{@link #getLanguage() <em>Language</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageKind[] LANGUAGE_EEMPTY_ARRAY = new LanguageKind[0];

	/**
	 * The default value of the '{@link #isBatchResponseDelivery() <em>Batch Response Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBatchResponseDelivery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BATCH_RESPONSE_DELIVERY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBatchResponseDelivery() <em>Batch Response Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBatchResponseDelivery()
	 * @generated
	 * @ordered
	 */
	protected boolean batchResponseDelivery = BATCH_RESPONSE_DELIVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronousConfirmation() <em>Synchronous Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronousConfirmation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONOUS_CONFIRMATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSynchronousConfirmation() <em>Synchronous Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronousConfirmation()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronousConfirmation = SYNCHRONOUS_CONFIRMATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplyMessage() <em>Reply Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyMessage()
	 * @generated
	 * @ordered
	 */
	protected ReplyMessage replyMessage;

	/**
	 * The cached value of the '{@link #getAdvertiseIt() <em>Advertise It</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvertiseIt()
	 * @generated
	 * @ordered
	 */
	protected OutboundMessage advertiseIt;

	/**
	 * The default value of the '{@link #getFolderID() <em>Folder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderID()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFolderID() <em>Folder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderID()
	 * @generated
	 * @ordered
	 */
	protected String folderID = FOLDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSharing() <em>Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHARING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSharing() <em>Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharing()
	 * @generated
	 * @ordered
	 */
	protected boolean sharing = SHARING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponseRestrictions() <em>Response Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseRestrictions()
	 * @generated
	 * @ordered
	 */
	protected ResponseRestriction responseRestrictions;

	/**
	 * The default value of the '{@link #getShortNumber() <em>Short Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SHORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShortNumber() <em>Short Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortNumber()
	 * @generated
	 * @ordered
	 */
	protected int shortNumber = SHORT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.POLL_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCloseDate() {
		return closeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseDate(Date newCloseDate) {
		Date oldCloseDate = closeDate;
		closeDate = newCloseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__CLOSE_DATE, oldCloseDate,
					closeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getScheduleStartDate() {
		return scheduleStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleStartDate(Date newScheduleStartDate) {
		Date oldScheduleStartDate = scheduleStartDate;
		scheduleStartDate = newScheduleStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__SCHEDULE_START_DATE,
					oldScheduleStartDate, scheduleStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuspendOnFailure() {
		return suspendOnFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspendOnFailure(boolean newSuspendOnFailure) {
		boolean oldSuspendOnFailure = suspendOnFailure;
		suspendOnFailure = newSuspendOnFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__SUSPEND_ON_FAILURE,
					oldSuspendOnFailure, suspendOnFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageKind[] getLanguage() {
		if (language == null || language.isEmpty())
			return LANGUAGE_EEMPTY_ARRAY;
		BasicEList<LanguageKind> list = (BasicEList<LanguageKind>) language;
		list.shrink();
		return (LanguageKind[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageKind getLanguage(int index) {
		return getLanguageList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLanguageLength() {
		return language == null ? 0 : language.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(LanguageKind[] newLanguage) {
		((BasicEList<LanguageKind>) getLanguageList()).setData(
				newLanguage.length, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(int index, LanguageKind element) {
		getLanguageList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageKind> getLanguageList() {
		if (language == null) {
			language = new EDataTypeUniqueEList<LanguageKind>(
					LanguageKind.class, this,
					TeksPackage.POLL_SETTINGS__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBatchResponseDelivery() {
		return batchResponseDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchResponseDelivery(boolean newBatchResponseDelivery) {
		boolean oldBatchResponseDelivery = batchResponseDelivery;
		batchResponseDelivery = newBatchResponseDelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__BATCH_RESPONSE_DELIVERY,
					oldBatchResponseDelivery, batchResponseDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronousConfirmation() {
		return synchronousConfirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronousConfirmation(boolean newSynchronousConfirmation) {
		boolean oldSynchronousConfirmation = synchronousConfirmation;
		synchronousConfirmation = newSynchronousConfirmation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__SYNCHRONOUS_CONFIRMATION,
					oldSynchronousConfirmation, synchronousConfirmation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyMessage getReplyMessage() {
		if (replyMessage != null && ((EObject) replyMessage).eIsProxy()) {
			InternalEObject oldReplyMessage = (InternalEObject) replyMessage;
			replyMessage = (ReplyMessage) eResolveProxy(oldReplyMessage);
			if (replyMessage != oldReplyMessage) {
				InternalEObject newReplyMessage = (InternalEObject) replyMessage;
				NotificationChain msgs = oldReplyMessage.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_SETTINGS__REPLY_MESSAGE,
						null, null);
				if (newReplyMessage.eInternalContainer() == null) {
					msgs = newReplyMessage.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.POLL_SETTINGS__REPLY_MESSAGE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.POLL_SETTINGS__REPLY_MESSAGE,
							oldReplyMessage, replyMessage));
			}
		}
		return replyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyMessage basicGetReplyMessage() {
		return replyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyMessage(ReplyMessage newReplyMessage,
			NotificationChain msgs) {
		ReplyMessage oldReplyMessage = replyMessage;
		replyMessage = newReplyMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.POLL_SETTINGS__REPLY_MESSAGE,
					oldReplyMessage, newReplyMessage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyMessage(ReplyMessage newReplyMessage) {
		if (newReplyMessage != replyMessage) {
			NotificationChain msgs = null;
			if (replyMessage != null)
				msgs = ((InternalEObject) replyMessage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_SETTINGS__REPLY_MESSAGE,
						null, msgs);
			if (newReplyMessage != null)
				msgs = ((InternalEObject) newReplyMessage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_SETTINGS__REPLY_MESSAGE,
						null, msgs);
			msgs = basicSetReplyMessage(newReplyMessage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__REPLY_MESSAGE, newReplyMessage,
					newReplyMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage getAdvertiseIt() {
		if (advertiseIt != null && ((EObject) advertiseIt).eIsProxy()) {
			InternalEObject oldAdvertiseIt = (InternalEObject) advertiseIt;
			advertiseIt = (OutboundMessage) eResolveProxy(oldAdvertiseIt);
			if (advertiseIt != oldAdvertiseIt) {
				InternalEObject newAdvertiseIt = (InternalEObject) advertiseIt;
				NotificationChain msgs = oldAdvertiseIt.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_SETTINGS__ADVERTISE_IT,
						null, null);
				if (newAdvertiseIt.eInternalContainer() == null) {
					msgs = newAdvertiseIt.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.POLL_SETTINGS__ADVERTISE_IT,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.POLL_SETTINGS__ADVERTISE_IT,
							oldAdvertiseIt, advertiseIt));
			}
		}
		return advertiseIt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage basicGetAdvertiseIt() {
		return advertiseIt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdvertiseIt(
			OutboundMessage newAdvertiseIt, NotificationChain msgs) {
		OutboundMessage oldAdvertiseIt = advertiseIt;
		advertiseIt = newAdvertiseIt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.POLL_SETTINGS__ADVERTISE_IT,
					oldAdvertiseIt, newAdvertiseIt);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvertiseIt(OutboundMessage newAdvertiseIt) {
		if (newAdvertiseIt != advertiseIt) {
			NotificationChain msgs = null;
			if (advertiseIt != null)
				msgs = ((InternalEObject) advertiseIt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_SETTINGS__ADVERTISE_IT,
						null, msgs);
			if (newAdvertiseIt != null)
				msgs = ((InternalEObject) newAdvertiseIt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_SETTINGS__ADVERTISE_IT,
						null, msgs);
			msgs = basicSetAdvertiseIt(newAdvertiseIt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__ADVERTISE_IT, newAdvertiseIt,
					newAdvertiseIt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFolderID() {
		return folderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolderID(String newFolderID) {
		String oldFolderID = folderID;
		folderID = newFolderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__FOLDER_ID, oldFolderID, folderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSharing() {
		return sharing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharing(boolean newSharing) {
		boolean oldSharing = sharing;
		sharing = newSharing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__SHARING, oldSharing, sharing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseRestriction getResponseRestrictions() {
		if (responseRestrictions != null
				&& ((EObject) responseRestrictions).eIsProxy()) {
			InternalEObject oldResponseRestrictions = (InternalEObject) responseRestrictions;
			responseRestrictions = (ResponseRestriction) eResolveProxy(oldResponseRestrictions);
			if (responseRestrictions != oldResponseRestrictions) {
				InternalEObject newResponseRestrictions = (InternalEObject) responseRestrictions;
				NotificationChain msgs = oldResponseRestrictions
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS,
								null, null);
				if (newResponseRestrictions.eInternalContainer() == null) {
					msgs = newResponseRestrictions
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS,
							oldResponseRestrictions, responseRestrictions));
			}
		}
		return responseRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseRestriction basicGetResponseRestrictions() {
		return responseRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseRestrictions(
			ResponseRestriction newResponseRestrictions, NotificationChain msgs) {
		ResponseRestriction oldResponseRestrictions = responseRestrictions;
		responseRestrictions = newResponseRestrictions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS,
					oldResponseRestrictions, newResponseRestrictions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseRestrictions(
			ResponseRestriction newResponseRestrictions) {
		if (newResponseRestrictions != responseRestrictions) {
			NotificationChain msgs = null;
			if (responseRestrictions != null)
				msgs = ((InternalEObject) responseRestrictions)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS,
								null, msgs);
			if (newResponseRestrictions != null)
				msgs = ((InternalEObject) newResponseRestrictions)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS,
								null, msgs);
			msgs = basicSetResponseRestrictions(newResponseRestrictions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS,
					newResponseRestrictions, newResponseRestrictions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShortNumber() {
		return shortNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortNumber(int newShortNumber) {
		int oldShortNumber = shortNumber;
		shortNumber = newShortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_SETTINGS__SHORT_NUMBER, oldShortNumber,
					shortNumber));
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
		case TeksPackage.POLL_SETTINGS__REPLY_MESSAGE:
			return basicSetReplyMessage(null, msgs);
		case TeksPackage.POLL_SETTINGS__ADVERTISE_IT:
			return basicSetAdvertiseIt(null, msgs);
		case TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS:
			return basicSetResponseRestrictions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.POLL_SETTINGS__CLOSE_DATE:
			return getCloseDate();
		case TeksPackage.POLL_SETTINGS__SCHEDULE_START_DATE:
			return getScheduleStartDate();
		case TeksPackage.POLL_SETTINGS__SUSPEND_ON_FAILURE:
			return isSuspendOnFailure();
		case TeksPackage.POLL_SETTINGS__LANGUAGE:
			return getLanguageList();
		case TeksPackage.POLL_SETTINGS__BATCH_RESPONSE_DELIVERY:
			return isBatchResponseDelivery();
		case TeksPackage.POLL_SETTINGS__SYNCHRONOUS_CONFIRMATION:
			return isSynchronousConfirmation();
		case TeksPackage.POLL_SETTINGS__REPLY_MESSAGE:
			if (resolve)
				return getReplyMessage();
			return basicGetReplyMessage();
		case TeksPackage.POLL_SETTINGS__ADVERTISE_IT:
			if (resolve)
				return getAdvertiseIt();
			return basicGetAdvertiseIt();
		case TeksPackage.POLL_SETTINGS__FOLDER_ID:
			return getFolderID();
		case TeksPackage.POLL_SETTINGS__SHARING:
			return isSharing();
		case TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS:
			if (resolve)
				return getResponseRestrictions();
			return basicGetResponseRestrictions();
		case TeksPackage.POLL_SETTINGS__SHORT_NUMBER:
			return getShortNumber();
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
		case TeksPackage.POLL_SETTINGS__CLOSE_DATE:
			setCloseDate((Date) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__SCHEDULE_START_DATE:
			setScheduleStartDate((Date) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__SUSPEND_ON_FAILURE:
			setSuspendOnFailure((Boolean) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__LANGUAGE:
			getLanguageList().clear();
			getLanguageList().addAll(
					(Collection<? extends LanguageKind>) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__BATCH_RESPONSE_DELIVERY:
			setBatchResponseDelivery((Boolean) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__SYNCHRONOUS_CONFIRMATION:
			setSynchronousConfirmation((Boolean) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__REPLY_MESSAGE:
			setReplyMessage((ReplyMessage) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__ADVERTISE_IT:
			setAdvertiseIt((OutboundMessage) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__FOLDER_ID:
			setFolderID((String) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__SHARING:
			setSharing((Boolean) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS:
			setResponseRestrictions((ResponseRestriction) newValue);
			return;
		case TeksPackage.POLL_SETTINGS__SHORT_NUMBER:
			setShortNumber((Integer) newValue);
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
		case TeksPackage.POLL_SETTINGS__CLOSE_DATE:
			setCloseDate(CLOSE_DATE_EDEFAULT);
			return;
		case TeksPackage.POLL_SETTINGS__SCHEDULE_START_DATE:
			setScheduleStartDate(SCHEDULE_START_DATE_EDEFAULT);
			return;
		case TeksPackage.POLL_SETTINGS__SUSPEND_ON_FAILURE:
			setSuspendOnFailure(SUSPEND_ON_FAILURE_EDEFAULT);
			return;
		case TeksPackage.POLL_SETTINGS__LANGUAGE:
			getLanguageList().clear();
			return;
		case TeksPackage.POLL_SETTINGS__BATCH_RESPONSE_DELIVERY:
			setBatchResponseDelivery(BATCH_RESPONSE_DELIVERY_EDEFAULT);
			return;
		case TeksPackage.POLL_SETTINGS__SYNCHRONOUS_CONFIRMATION:
			setSynchronousConfirmation(SYNCHRONOUS_CONFIRMATION_EDEFAULT);
			return;
		case TeksPackage.POLL_SETTINGS__REPLY_MESSAGE:
			setReplyMessage((ReplyMessage) null);
			return;
		case TeksPackage.POLL_SETTINGS__ADVERTISE_IT:
			setAdvertiseIt((OutboundMessage) null);
			return;
		case TeksPackage.POLL_SETTINGS__FOLDER_ID:
			setFolderID(FOLDER_ID_EDEFAULT);
			return;
		case TeksPackage.POLL_SETTINGS__SHARING:
			setSharing(SHARING_EDEFAULT);
			return;
		case TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS:
			setResponseRestrictions((ResponseRestriction) null);
			return;
		case TeksPackage.POLL_SETTINGS__SHORT_NUMBER:
			setShortNumber(SHORT_NUMBER_EDEFAULT);
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
		case TeksPackage.POLL_SETTINGS__CLOSE_DATE:
			return CLOSE_DATE_EDEFAULT == null ? closeDate != null
					: !CLOSE_DATE_EDEFAULT.equals(closeDate);
		case TeksPackage.POLL_SETTINGS__SCHEDULE_START_DATE:
			return SCHEDULE_START_DATE_EDEFAULT == null ? scheduleStartDate != null
					: !SCHEDULE_START_DATE_EDEFAULT.equals(scheduleStartDate);
		case TeksPackage.POLL_SETTINGS__SUSPEND_ON_FAILURE:
			return suspendOnFailure != SUSPEND_ON_FAILURE_EDEFAULT;
		case TeksPackage.POLL_SETTINGS__LANGUAGE:
			return language != null && !language.isEmpty();
		case TeksPackage.POLL_SETTINGS__BATCH_RESPONSE_DELIVERY:
			return batchResponseDelivery != BATCH_RESPONSE_DELIVERY_EDEFAULT;
		case TeksPackage.POLL_SETTINGS__SYNCHRONOUS_CONFIRMATION:
			return synchronousConfirmation != SYNCHRONOUS_CONFIRMATION_EDEFAULT;
		case TeksPackage.POLL_SETTINGS__REPLY_MESSAGE:
			return replyMessage != null;
		case TeksPackage.POLL_SETTINGS__ADVERTISE_IT:
			return advertiseIt != null;
		case TeksPackage.POLL_SETTINGS__FOLDER_ID:
			return FOLDER_ID_EDEFAULT == null ? folderID != null
					: !FOLDER_ID_EDEFAULT.equals(folderID);
		case TeksPackage.POLL_SETTINGS__SHARING:
			return sharing != SHARING_EDEFAULT;
		case TeksPackage.POLL_SETTINGS__RESPONSE_RESTRICTIONS:
			return responseRestrictions != null;
		case TeksPackage.POLL_SETTINGS__SHORT_NUMBER:
			return shortNumber != SHORT_NUMBER_EDEFAULT;
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
		result.append(" (closeDate: ");
		result.append(closeDate);
		result.append(", scheduleStartDate: ");
		result.append(scheduleStartDate);
		result.append(", suspendOnFailure: ");
		result.append(suspendOnFailure);
		result.append(", language: ");
		result.append(language);
		result.append(", batchResponseDelivery: ");
		result.append(batchResponseDelivery);
		result.append(", synchronousConfirmation: ");
		result.append(synchronousConfirmation);
		result.append(", folderID: ");
		result.append(folderID);
		result.append(", sharing: ");
		result.append(sharing);
		result.append(", shortNumber: ");
		result.append(shortNumber);
		result.append(')');
		return result.toString();
	}

} //PollSettingsImpl
