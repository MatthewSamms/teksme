/**
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version 
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.InboundMessage;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Poll;
import org.teksme.model.teks.Profile;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.Survey;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getOutboundMessageList <em>Outbound Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getSurvey <em>Survey</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getInboundMessageList <em>Inbound Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getPoll <em>Poll</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeksImpl extends TeksObjectImpl implements Teks {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getOutboundMessageList() <em>Outbound Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundMessageList()
	 * @generated
	 * @ordered
	 */
	protected EList<OutboundMessage> outboundMessage;

	/**
	 * The empty value for the '{@link #getOutboundMessage() <em>Outbound Message</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundMessage()
	 * @generated
	 * @ordered
	 */
	protected static final OutboundMessage[] OUTBOUND_MESSAGE_EEMPTY_ARRAY = new OutboundMessage[0];

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Response response;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected User account;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Profile profile;

	/**
	 * The cached value of the '{@link #getSurvey() <em>Survey</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurvey()
	 * @generated
	 * @ordered
	 */
	protected Survey survey;

	/**
	 * The cached value of the '{@link #getInboundMessageList() <em>Inbound Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundMessageList()
	 * @generated
	 * @ordered
	 */
	protected EList<InboundMessage> inboundMessage;

	/**
	 * The empty value for the '{@link #getInboundMessage() <em>Inbound Message</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundMessage()
	 * @generated
	 * @ordered
	 */
	protected static final InboundMessage[] INBOUND_MESSAGE_EEMPTY_ARRAY = new InboundMessage[0];

	/**
	 * The cached value of the '{@link #getPoll() <em>Poll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoll()
	 * @generated
	 * @ordered
	 */
	protected Poll poll;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.TEKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage[] getOutboundMessage() {
		if (outboundMessage == null || outboundMessage.isEmpty())
			return OUTBOUND_MESSAGE_EEMPTY_ARRAY;
		BasicEList<OutboundMessage> list = (BasicEList<OutboundMessage>) outboundMessage;
		list.shrink();
		return (OutboundMessage[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage getOutboundMessage(int index) {
		return getOutboundMessageList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutboundMessageLength() {
		return outboundMessage == null ? 0 : outboundMessage.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutboundMessage(OutboundMessage[] newOutboundMessage) {
		((BasicEList<OutboundMessage>) getOutboundMessageList()).setData(
				newOutboundMessage.length, newOutboundMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutboundMessage(int index, OutboundMessage element) {
		getOutboundMessageList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutboundMessage> getOutboundMessageList() {
		if (outboundMessage == null) {
			outboundMessage = new EObjectContainmentWithInverseEList.Resolving<OutboundMessage>(
					OutboundMessage.class, this,
					TeksPackage.TEKS__OUTBOUND_MESSAGE,
					TeksPackage.OUTBOUND_MESSAGE__TEKS_REF);
		}
		return outboundMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response getResponse() {
		if (response != null && ((EObject) response).eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject) response;
			response = (Response) eResolveProxy(oldResponse);
			if (response != oldResponse) {
				InternalEObject newResponse = (InternalEObject) response;
				NotificationChain msgs = oldResponse.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__RESPONSE,
						null, null);
				if (newResponse.eInternalContainer() == null) {
					msgs = newResponse.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.TEKS__RESPONSE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.TEKS__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(Response newResponse,
			NotificationChain msgs) {
		Response oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.TEKS__RESPONSE, oldResponse,
					newResponse);
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
	public void setResponse(Response newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject) response).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__RESPONSE,
						null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject) newResponse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__RESPONSE,
						null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAccount() {
		if (account != null && ((EObject) account).eIsProxy()) {
			InternalEObject oldAccount = (InternalEObject) account;
			account = (User) eResolveProxy(oldAccount);
			if (account != oldAccount) {
				InternalEObject newAccount = (InternalEObject) account;
				NotificationChain msgs = oldAccount.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__ACCOUNT,
						null, null);
				if (newAccount.eInternalContainer() == null) {
					msgs = newAccount.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.TEKS__ACCOUNT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.TEKS__ACCOUNT, oldAccount, account));
			}
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(User newAccount,
			NotificationChain msgs) {
		User oldAccount = account;
		account = newAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.TEKS__ACCOUNT, oldAccount,
					newAccount);
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
	public void setAccount(User newAccount) {
		if (newAccount != account) {
			NotificationChain msgs = null;
			if (account != null)
				msgs = ((InternalEObject) account).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__ACCOUNT,
						null, msgs);
			if (newAccount != null)
				msgs = ((InternalEObject) newAccount).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__ACCOUNT,
						null, msgs);
			msgs = basicSetAccount(newAccount, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__ACCOUNT, newAccount, newAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getProfile() {
		if (profile != null && ((EObject) profile).eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject) profile;
			profile = (Profile) eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				InternalEObject newProfile = (InternalEObject) profile;
				NotificationChain msgs = oldProfile.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__PROFILE,
						null, null);
				if (newProfile.eInternalContainer() == null) {
					msgs = newProfile.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.TEKS__PROFILE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.TEKS__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Profile newProfile,
			NotificationChain msgs) {
		Profile oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.TEKS__PROFILE, oldProfile,
					newProfile);
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
	public void setProfile(Profile newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject) profile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__PROFILE,
						null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject) newProfile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__PROFILE,
						null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey getSurvey() {
		if (survey != null && ((EObject) survey).eIsProxy()) {
			InternalEObject oldSurvey = (InternalEObject) survey;
			survey = (Survey) eResolveProxy(oldSurvey);
			if (survey != oldSurvey) {
				InternalEObject newSurvey = (InternalEObject) survey;
				NotificationChain msgs = oldSurvey.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__SURVEY,
						null, null);
				if (newSurvey.eInternalContainer() == null) {
					msgs = newSurvey.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.TEKS__SURVEY, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.TEKS__SURVEY, oldSurvey, survey));
			}
		}
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey basicGetSurvey() {
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurvey(Survey newSurvey,
			NotificationChain msgs) {
		Survey oldSurvey = survey;
		survey = newSurvey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.TEKS__SURVEY, oldSurvey,
					newSurvey);
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
	public void setSurvey(Survey newSurvey) {
		if (newSurvey != survey) {
			NotificationChain msgs = null;
			if (survey != null)
				msgs = ((InternalEObject) survey).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__SURVEY,
						null, msgs);
			if (newSurvey != null)
				msgs = ((InternalEObject) newSurvey).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__SURVEY,
						null, msgs);
			msgs = basicSetSurvey(newSurvey, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__SURVEY, newSurvey, newSurvey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundMessage[] getInboundMessage() {
		if (inboundMessage == null || inboundMessage.isEmpty())
			return INBOUND_MESSAGE_EEMPTY_ARRAY;
		BasicEList<InboundMessage> list = (BasicEList<InboundMessage>) inboundMessage;
		list.shrink();
		return (InboundMessage[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundMessage getInboundMessage(int index) {
		return getInboundMessageList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInboundMessageLength() {
		return inboundMessage == null ? 0 : inboundMessage.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundMessage(InboundMessage[] newInboundMessage) {
		((BasicEList<InboundMessage>) getInboundMessageList()).setData(
				newInboundMessage.length, newInboundMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundMessage(int index, InboundMessage element) {
		getInboundMessageList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InboundMessage> getInboundMessageList() {
		if (inboundMessage == null) {
			inboundMessage = new EObjectContainmentEList.Resolving<InboundMessage>(
					InboundMessage.class, this,
					TeksPackage.TEKS__INBOUND_MESSAGE);
		}
		return inboundMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poll getPoll() {
		if (poll != null && ((EObject) poll).eIsProxy()) {
			InternalEObject oldPoll = (InternalEObject) poll;
			poll = (Poll) eResolveProxy(oldPoll);
			if (poll != oldPoll) {
				InternalEObject newPoll = (InternalEObject) poll;
				NotificationChain msgs = oldPoll.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__POLL, null,
						null);
				if (newPoll.eInternalContainer() == null) {
					msgs = newPoll.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.TEKS__POLL, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.TEKS__POLL, oldPoll, poll));
			}
		}
		return poll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poll basicGetPoll() {
		return poll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoll(Poll newPoll, NotificationChain msgs) {
		Poll oldPoll = poll;
		poll = newPoll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.TEKS__POLL, oldPoll, newPoll);
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
	public void setPoll(Poll newPoll) {
		if (newPoll != poll) {
			NotificationChain msgs = null;
			if (poll != null)
				msgs = ((InternalEObject) poll).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__POLL, null,
						msgs);
			if (newPoll != null)
				msgs = ((InternalEObject) newPoll).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__POLL, null,
						msgs);
			msgs = basicSetPoll(newPoll, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__POLL, newPoll, newPoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutboundMessageList())
					.basicAdd(otherEnd, msgs);
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
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			return ((InternalEList<?>) getOutboundMessageList()).basicRemove(
					otherEnd, msgs);
		case TeksPackage.TEKS__RESPONSE:
			return basicSetResponse(null, msgs);
		case TeksPackage.TEKS__ACCOUNT:
			return basicSetAccount(null, msgs);
		case TeksPackage.TEKS__PROFILE:
			return basicSetProfile(null, msgs);
		case TeksPackage.TEKS__SURVEY:
			return basicSetSurvey(null, msgs);
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			return ((InternalEList<?>) getInboundMessageList()).basicRemove(
					otherEnd, msgs);
		case TeksPackage.TEKS__POLL:
			return basicSetPoll(null, msgs);
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
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			return getOutboundMessageList();
		case TeksPackage.TEKS__RESPONSE:
			if (resolve)
				return getResponse();
			return basicGetResponse();
		case TeksPackage.TEKS__ACCOUNT:
			if (resolve)
				return getAccount();
			return basicGetAccount();
		case TeksPackage.TEKS__PROFILE:
			if (resolve)
				return getProfile();
			return basicGetProfile();
		case TeksPackage.TEKS__SURVEY:
			if (resolve)
				return getSurvey();
			return basicGetSurvey();
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			return getInboundMessageList();
		case TeksPackage.TEKS__POLL:
			if (resolve)
				return getPoll();
			return basicGetPoll();
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
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			getOutboundMessageList().clear();
			getOutboundMessageList().addAll(
					(Collection<? extends OutboundMessage>) newValue);
			return;
		case TeksPackage.TEKS__RESPONSE:
			setResponse((Response) newValue);
			return;
		case TeksPackage.TEKS__ACCOUNT:
			setAccount((User) newValue);
			return;
		case TeksPackage.TEKS__PROFILE:
			setProfile((Profile) newValue);
			return;
		case TeksPackage.TEKS__SURVEY:
			setSurvey((Survey) newValue);
			return;
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			getInboundMessageList().clear();
			getInboundMessageList().addAll(
					(Collection<? extends InboundMessage>) newValue);
			return;
		case TeksPackage.TEKS__POLL:
			setPoll((Poll) newValue);
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
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			getOutboundMessageList().clear();
			return;
		case TeksPackage.TEKS__RESPONSE:
			setResponse((Response) null);
			return;
		case TeksPackage.TEKS__ACCOUNT:
			setAccount((User) null);
			return;
		case TeksPackage.TEKS__PROFILE:
			setProfile((Profile) null);
			return;
		case TeksPackage.TEKS__SURVEY:
			setSurvey((Survey) null);
			return;
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			getInboundMessageList().clear();
			return;
		case TeksPackage.TEKS__POLL:
			setPoll((Poll) null);
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
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			return outboundMessage != null && !outboundMessage.isEmpty();
		case TeksPackage.TEKS__RESPONSE:
			return response != null;
		case TeksPackage.TEKS__ACCOUNT:
			return account != null;
		case TeksPackage.TEKS__PROFILE:
			return profile != null;
		case TeksPackage.TEKS__SURVEY:
			return survey != null;
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			return inboundMessage != null && !inboundMessage.isEmpty();
		case TeksPackage.TEKS__POLL:
			return poll != null;
		}
		return super.eIsSet(featureID);
	}

} //TeksImpl
