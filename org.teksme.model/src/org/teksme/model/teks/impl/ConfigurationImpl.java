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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.Configuration;
import org.teksme.model.teks.Inquiry;
import org.teksme.model.teks.LanguageKind;
import org.teksme.model.teks.ResponseRestriction;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#getResponseRestrictions <em>Response Restrictions</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#getInquiryRef <em>Inquiry Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#getScheduleStartDate <em>Schedule Start Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#getCommunicationChannelList <em>Communication Channel</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#isSuspendOnFailure <em>Suspend On Failure</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#getLanguageList <em>Language</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#isBatchResponseDelivery <em>Batch Response Delivery</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfigurationImpl#isSynchronousConfirmation <em>Synchronous Confirmation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
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
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate = EXPIRATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getCommunicationChannelList() <em>Communication Channel</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationChannelList()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelKind> communicationChannel;

	/**
	 * The empty value for the '{@link #getCommunicationChannel() <em>Communication Channel</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationChannel()
	 * @generated
	 * @ordered
	 */
	protected static final ChannelKind[] COMMUNICATION_CHANNEL_EEMPTY_ARRAY = new ChannelKind[0];

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
	protected static final boolean BATCH_RESPONSE_DELIVERY_EDEFAULT = false;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseRestriction getResponseRestrictions() {
		if (responseRestrictions != null && responseRestrictions.eIsProxy()) {
			InternalEObject oldResponseRestrictions = (InternalEObject) responseRestrictions;
			responseRestrictions = (ResponseRestriction) eResolveProxy(oldResponseRestrictions);
			if (responseRestrictions != oldResponseRestrictions) {
				InternalEObject newResponseRestrictions = (InternalEObject) responseRestrictions;
				NotificationChain msgs = oldResponseRestrictions
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS,
								null, null);
				if (newResponseRestrictions.eInternalContainer() == null) {
					msgs = newResponseRestrictions
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS,
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
					TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS,
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
										- TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS,
								null, msgs);
			if (newResponseRestrictions != null)
				msgs = ((InternalEObject) newResponseRestrictions)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS,
								null, msgs);
			msgs = basicSetResponseRestrictions(newResponseRestrictions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS,
					newResponseRestrictions, newResponseRestrictions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inquiry getInquiryRef() {
		if (eContainerFeatureID() != TeksPackage.CONFIGURATION__INQUIRY_REF)
			return null;
		return (Inquiry) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inquiry basicGetInquiryRef() {
		if (eContainerFeatureID() != TeksPackage.CONFIGURATION__INQUIRY_REF)
			return null;
		return (Inquiry) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInquiryRef(Inquiry newInquiryRef,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInquiryRef,
				TeksPackage.CONFIGURATION__INQUIRY_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInquiryRef(Inquiry newInquiryRef) {
		if (newInquiryRef != eInternalContainer()
				|| (eContainerFeatureID() != TeksPackage.CONFIGURATION__INQUIRY_REF && newInquiryRef != null)) {
			if (EcoreUtil.isAncestor(this, newInquiryRef))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInquiryRef != null)
				msgs = ((InternalEObject) newInquiryRef).eInverseAdd(this,
						TeksPackage.INQUIRY__SETTINGS, Inquiry.class, msgs);
			msgs = basicSetInquiryRef(newInquiryRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CONFIGURATION__INQUIRY_REF, newInquiryRef,
					newInquiryRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CONFIGURATION__EXPIRATION_DATE,
					oldExpirationDate, expirationDate));
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
					TeksPackage.CONFIGURATION__SCHEDULE_START_DATE,
					oldScheduleStartDate, scheduleStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind[] getCommunicationChannel() {
		if (communicationChannel == null || communicationChannel.isEmpty())
			return COMMUNICATION_CHANNEL_EEMPTY_ARRAY;
		BasicEList<ChannelKind> list = (BasicEList<ChannelKind>) communicationChannel;
		list.shrink();
		return (ChannelKind[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind getCommunicationChannel(int index) {
		return getCommunicationChannelList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommunicationChannelLength() {
		return communicationChannel == null ? 0 : communicationChannel.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationChannel(ChannelKind[] newCommunicationChannel) {
		((BasicEList<ChannelKind>) getCommunicationChannelList()).setData(
				newCommunicationChannel.length, newCommunicationChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationChannel(int index, ChannelKind element) {
		getCommunicationChannelList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelKind> getCommunicationChannelList() {
		if (communicationChannel == null) {
			communicationChannel = new EDataTypeUniqueEList<ChannelKind>(
					ChannelKind.class, this,
					TeksPackage.CONFIGURATION__COMMUNICATION_CHANNEL);
		}
		return communicationChannel;
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
					TeksPackage.CONFIGURATION__SUSPEND_ON_FAILURE,
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
					TeksPackage.CONFIGURATION__LANGUAGE);
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
					TeksPackage.CONFIGURATION__BATCH_RESPONSE_DELIVERY,
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
					TeksPackage.CONFIGURATION__SYNCHRONOUS_CONFIRMATION,
					oldSynchronousConfirmation, synchronousConfirmation));
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
		case TeksPackage.CONFIGURATION__INQUIRY_REF:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInquiryRef((Inquiry) otherEnd, msgs);
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
		case TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS:
			return basicSetResponseRestrictions(null, msgs);
		case TeksPackage.CONFIGURATION__INQUIRY_REF:
			return basicSetInquiryRef(null, msgs);
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
		case TeksPackage.CONFIGURATION__INQUIRY_REF:
			return eInternalContainer().eInverseRemove(this,
					TeksPackage.INQUIRY__SETTINGS, Inquiry.class, msgs);
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
		case TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS:
			if (resolve)
				return getResponseRestrictions();
			return basicGetResponseRestrictions();
		case TeksPackage.CONFIGURATION__INQUIRY_REF:
			if (resolve)
				return getInquiryRef();
			return basicGetInquiryRef();
		case TeksPackage.CONFIGURATION__EXPIRATION_DATE:
			return getExpirationDate();
		case TeksPackage.CONFIGURATION__SCHEDULE_START_DATE:
			return getScheduleStartDate();
		case TeksPackage.CONFIGURATION__COMMUNICATION_CHANNEL:
			return getCommunicationChannelList();
		case TeksPackage.CONFIGURATION__SUSPEND_ON_FAILURE:
			return isSuspendOnFailure();
		case TeksPackage.CONFIGURATION__LANGUAGE:
			return getLanguageList();
		case TeksPackage.CONFIGURATION__BATCH_RESPONSE_DELIVERY:
			return isBatchResponseDelivery();
		case TeksPackage.CONFIGURATION__SYNCHRONOUS_CONFIRMATION:
			return isSynchronousConfirmation();
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
		case TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS:
			setResponseRestrictions((ResponseRestriction) newValue);
			return;
		case TeksPackage.CONFIGURATION__INQUIRY_REF:
			setInquiryRef((Inquiry) newValue);
			return;
		case TeksPackage.CONFIGURATION__EXPIRATION_DATE:
			setExpirationDate((Date) newValue);
			return;
		case TeksPackage.CONFIGURATION__SCHEDULE_START_DATE:
			setScheduleStartDate((Date) newValue);
			return;
		case TeksPackage.CONFIGURATION__COMMUNICATION_CHANNEL:
			getCommunicationChannelList().clear();
			getCommunicationChannelList().addAll(
					(Collection<? extends ChannelKind>) newValue);
			return;
		case TeksPackage.CONFIGURATION__SUSPEND_ON_FAILURE:
			setSuspendOnFailure((Boolean) newValue);
			return;
		case TeksPackage.CONFIGURATION__LANGUAGE:
			getLanguageList().clear();
			getLanguageList().addAll(
					(Collection<? extends LanguageKind>) newValue);
			return;
		case TeksPackage.CONFIGURATION__BATCH_RESPONSE_DELIVERY:
			setBatchResponseDelivery((Boolean) newValue);
			return;
		case TeksPackage.CONFIGURATION__SYNCHRONOUS_CONFIRMATION:
			setSynchronousConfirmation((Boolean) newValue);
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
		case TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS:
			setResponseRestrictions((ResponseRestriction) null);
			return;
		case TeksPackage.CONFIGURATION__INQUIRY_REF:
			setInquiryRef((Inquiry) null);
			return;
		case TeksPackage.CONFIGURATION__EXPIRATION_DATE:
			setExpirationDate(EXPIRATION_DATE_EDEFAULT);
			return;
		case TeksPackage.CONFIGURATION__SCHEDULE_START_DATE:
			setScheduleStartDate(SCHEDULE_START_DATE_EDEFAULT);
			return;
		case TeksPackage.CONFIGURATION__COMMUNICATION_CHANNEL:
			getCommunicationChannelList().clear();
			return;
		case TeksPackage.CONFIGURATION__SUSPEND_ON_FAILURE:
			setSuspendOnFailure(SUSPEND_ON_FAILURE_EDEFAULT);
			return;
		case TeksPackage.CONFIGURATION__LANGUAGE:
			getLanguageList().clear();
			return;
		case TeksPackage.CONFIGURATION__BATCH_RESPONSE_DELIVERY:
			setBatchResponseDelivery(BATCH_RESPONSE_DELIVERY_EDEFAULT);
			return;
		case TeksPackage.CONFIGURATION__SYNCHRONOUS_CONFIRMATION:
			setSynchronousConfirmation(SYNCHRONOUS_CONFIRMATION_EDEFAULT);
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
		case TeksPackage.CONFIGURATION__RESPONSE_RESTRICTIONS:
			return responseRestrictions != null;
		case TeksPackage.CONFIGURATION__INQUIRY_REF:
			return basicGetInquiryRef() != null;
		case TeksPackage.CONFIGURATION__EXPIRATION_DATE:
			return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null
					: !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
		case TeksPackage.CONFIGURATION__SCHEDULE_START_DATE:
			return SCHEDULE_START_DATE_EDEFAULT == null ? scheduleStartDate != null
					: !SCHEDULE_START_DATE_EDEFAULT.equals(scheduleStartDate);
		case TeksPackage.CONFIGURATION__COMMUNICATION_CHANNEL:
			return communicationChannel != null
					&& !communicationChannel.isEmpty();
		case TeksPackage.CONFIGURATION__SUSPEND_ON_FAILURE:
			return suspendOnFailure != SUSPEND_ON_FAILURE_EDEFAULT;
		case TeksPackage.CONFIGURATION__LANGUAGE:
			return language != null && !language.isEmpty();
		case TeksPackage.CONFIGURATION__BATCH_RESPONSE_DELIVERY:
			return batchResponseDelivery != BATCH_RESPONSE_DELIVERY_EDEFAULT;
		case TeksPackage.CONFIGURATION__SYNCHRONOUS_CONFIRMATION:
			return synchronousConfirmation != SYNCHRONOUS_CONFIRMATION_EDEFAULT;
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
		result.append(" (expirationDate: ");
		result.append(expirationDate);
		result.append(", scheduleStartDate: ");
		result.append(scheduleStartDate);
		result.append(", communicationChannel: ");
		result.append(communicationChannel);
		result.append(", suspendOnFailure: ");
		result.append(suspendOnFailure);
		result.append(", language: ");
		result.append(language);
		result.append(", batchResponseDelivery: ");
		result.append(batchResponseDelivery);
		result.append(", synchronousConfirmation: ");
		result.append(synchronousConfirmation);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
