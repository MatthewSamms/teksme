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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Developer;
import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Poll;
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
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getDeveloper <em>Developer</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getSurvey <em>Survey</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getOutboundMessageList <em>Outbound Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getInboundMessageList <em>Inbound Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeksImpl extends EObjectImpl implements Teks {
	/**
	 * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected String appId = APP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeveloper() <em>Developer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeveloper()
	 * @generated
	 * @ordered
	 */
	protected Developer developer;

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
	 * The cached value of the '{@link #getSurvey() <em>Survey</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurvey()
	 * @generated
	 * @ordered
	 */
	protected Survey survey;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected Response responses;

	/**
	 * The cached value of the '{@link #getOutboundMessageList() <em>Outbound Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundMessageList()
	 * @generated
	 * @ordered
	 */
	protected EList<OutboundTextMessage> outboundMessage;

	/**
	 * The empty value for the '{@link #getOutboundMessage() <em>Outbound Message</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundMessage()
	 * @generated
	 * @ordered
	 */
	protected static final OutboundTextMessage[] OUTBOUND_MESSAGE_EEMPTY_ARRAY = new OutboundTextMessage[0];

	/**
	 * The cached value of the '{@link #getInboundMessageList() <em>Inbound Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundMessageList()
	 * @generated
	 * @ordered
	 */
	protected EList<InboundTextMessage> inboundMessage;

	/**
	 * The empty value for the '{@link #getInboundMessage() <em>Inbound Message</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundMessage()
	 * @generated
	 * @ordered
	 */
	protected static final InboundTextMessage[] INBOUND_MESSAGE_EEMPTY_ARRAY = new InboundTextMessage[0];

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
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppId(String newAppId) {
		String oldAppId = appId;
		appId = newAppId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__APP_ID, oldAppId, appId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer getDeveloper() {
		if (developer != null && developer.eIsProxy()) {
			InternalEObject oldDeveloper = (InternalEObject) developer;
			developer = (Developer) eResolveProxy(oldDeveloper);
			if (developer != oldDeveloper) {
				InternalEObject newDeveloper = (InternalEObject) developer;
				NotificationChain msgs = oldDeveloper.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__DEVELOPER,
						null, null);
				if (newDeveloper.eInternalContainer() == null) {
					msgs = newDeveloper.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.TEKS__DEVELOPER, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.TEKS__DEVELOPER, oldDeveloper,
							developer));
			}
		}
		return developer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer basicGetDeveloper() {
		return developer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeveloper(Developer newDeveloper,
			NotificationChain msgs) {
		Developer oldDeveloper = developer;
		developer = newDeveloper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.TEKS__DEVELOPER,
					oldDeveloper, newDeveloper);
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
	public void setDeveloper(Developer newDeveloper) {
		if (newDeveloper != developer) {
			NotificationChain msgs = null;
			if (developer != null)
				msgs = ((InternalEObject) developer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__DEVELOPER,
						null, msgs);
			if (newDeveloper != null)
				msgs = ((InternalEObject) newDeveloper).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__DEVELOPER,
						null, msgs);
			msgs = basicSetDeveloper(newDeveloper, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__DEVELOPER, newDeveloper, newDeveloper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poll getPoll() {
		if (poll != null && poll.eIsProxy()) {
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
	public Survey getSurvey() {
		if (survey != null && survey.eIsProxy()) {
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
	public Response getResponses() {
		if (responses != null && responses.eIsProxy()) {
			InternalEObject oldResponses = (InternalEObject) responses;
			responses = (Response) eResolveProxy(oldResponses);
			if (responses != oldResponses) {
				InternalEObject newResponses = (InternalEObject) responses;
				NotificationChain msgs = oldResponses.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__RESPONSES,
						null, null);
				if (newResponses.eInternalContainer() == null) {
					msgs = newResponses.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.TEKS__RESPONSES, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.TEKS__RESPONSES, oldResponses,
							responses));
			}
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response basicGetResponses() {
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponses(Response newResponses,
			NotificationChain msgs) {
		Response oldResponses = responses;
		responses = newResponses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.TEKS__RESPONSES,
					oldResponses, newResponses);
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
	public void setResponses(Response newResponses) {
		if (newResponses != responses) {
			NotificationChain msgs = null;
			if (responses != null)
				msgs = ((InternalEObject) responses).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__RESPONSES,
						null, msgs);
			if (newResponses != null)
				msgs = ((InternalEObject) newResponses).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__RESPONSES,
						null, msgs);
			msgs = basicSetResponses(newResponses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__RESPONSES, newResponses, newResponses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundTextMessage[] getOutboundMessage() {
		if (outboundMessage == null || outboundMessage.isEmpty())
			return OUTBOUND_MESSAGE_EEMPTY_ARRAY;
		BasicEList<OutboundTextMessage> list = (BasicEList<OutboundTextMessage>) outboundMessage;
		list.shrink();
		return (OutboundTextMessage[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundTextMessage getOutboundMessage(int index) {
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
	public void setOutboundMessage(OutboundTextMessage[] newOutboundMessage) {
		((BasicEList<OutboundTextMessage>) getOutboundMessageList()).setData(
				newOutboundMessage.length, newOutboundMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public void setOutboundMessage(int index, OutboundTextMessage element) {
		getOutboundMessageList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutboundTextMessage> getOutboundMessageList() {
		if (outboundMessage == null) {
			outboundMessage = new EObjectContainmentWithInverseEList.Resolving<OutboundTextMessage>(
					OutboundTextMessage.class, this,
					TeksPackage.TEKS__OUTBOUND_MESSAGE,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__TEKS_REF);
		}
		return outboundMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundTextMessage[] getInboundMessage() {
		if (inboundMessage == null || inboundMessage.isEmpty())
			return INBOUND_MESSAGE_EEMPTY_ARRAY;
		BasicEList<InboundTextMessage> list = (BasicEList<InboundTextMessage>) inboundMessage;
		list.shrink();
		return (InboundTextMessage[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundTextMessage getInboundMessage(int index) {
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
	public void setInboundMessage(InboundTextMessage[] newInboundMessage) {
		((BasicEList<InboundTextMessage>) getInboundMessageList()).setData(
				newInboundMessage.length, newInboundMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundMessage(int index, InboundTextMessage element) {
		getInboundMessageList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InboundTextMessage> getInboundMessageList() {
		if (inboundMessage == null) {
			inboundMessage = new EObjectContainmentEList.Resolving<InboundTextMessage>(
					InboundTextMessage.class, this,
					TeksPackage.TEKS__INBOUND_MESSAGE);
		}
		return inboundMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAccount() {
		if (account != null && account.eIsProxy()) {
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
		case TeksPackage.TEKS__DEVELOPER:
			return basicSetDeveloper(null, msgs);
		case TeksPackage.TEKS__POLL:
			return basicSetPoll(null, msgs);
		case TeksPackage.TEKS__SURVEY:
			return basicSetSurvey(null, msgs);
		case TeksPackage.TEKS__RESPONSES:
			return basicSetResponses(null, msgs);
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			return ((InternalEList<?>) getOutboundMessageList()).basicRemove(
					otherEnd, msgs);
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			return ((InternalEList<?>) getInboundMessageList()).basicRemove(
					otherEnd, msgs);
		case TeksPackage.TEKS__ACCOUNT:
			return basicSetAccount(null, msgs);
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
		case TeksPackage.TEKS__APP_ID:
			return getAppId();
		case TeksPackage.TEKS__DEVELOPER:
			if (resolve)
				return getDeveloper();
			return basicGetDeveloper();
		case TeksPackage.TEKS__POLL:
			if (resolve)
				return getPoll();
			return basicGetPoll();
		case TeksPackage.TEKS__SURVEY:
			if (resolve)
				return getSurvey();
			return basicGetSurvey();
		case TeksPackage.TEKS__RESPONSES:
			if (resolve)
				return getResponses();
			return basicGetResponses();
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			return getOutboundMessageList();
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			return getInboundMessageList();
		case TeksPackage.TEKS__ACCOUNT:
			if (resolve)
				return getAccount();
			return basicGetAccount();
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
		case TeksPackage.TEKS__APP_ID:
			setAppId((String) newValue);
			return;
		case TeksPackage.TEKS__DEVELOPER:
			setDeveloper((Developer) newValue);
			return;
		case TeksPackage.TEKS__POLL:
			setPoll((Poll) newValue);
			return;
		case TeksPackage.TEKS__SURVEY:
			setSurvey((Survey) newValue);
			return;
		case TeksPackage.TEKS__RESPONSES:
			setResponses((Response) newValue);
			return;
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			getOutboundMessageList().clear();
			getOutboundMessageList().addAll(
					(Collection<? extends OutboundTextMessage>) newValue);
			return;
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			getInboundMessageList().clear();
			getInboundMessageList().addAll(
					(Collection<? extends InboundTextMessage>) newValue);
			return;
		case TeksPackage.TEKS__ACCOUNT:
			setAccount((User) newValue);
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
		case TeksPackage.TEKS__APP_ID:
			setAppId(APP_ID_EDEFAULT);
			return;
		case TeksPackage.TEKS__DEVELOPER:
			setDeveloper((Developer) null);
			return;
		case TeksPackage.TEKS__POLL:
			setPoll((Poll) null);
			return;
		case TeksPackage.TEKS__SURVEY:
			setSurvey((Survey) null);
			return;
		case TeksPackage.TEKS__RESPONSES:
			setResponses((Response) null);
			return;
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			getOutboundMessageList().clear();
			return;
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			getInboundMessageList().clear();
			return;
		case TeksPackage.TEKS__ACCOUNT:
			setAccount((User) null);
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
		case TeksPackage.TEKS__APP_ID:
			return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT
					.equals(appId);
		case TeksPackage.TEKS__DEVELOPER:
			return developer != null;
		case TeksPackage.TEKS__POLL:
			return poll != null;
		case TeksPackage.TEKS__SURVEY:
			return survey != null;
		case TeksPackage.TEKS__RESPONSES:
			return responses != null;
		case TeksPackage.TEKS__OUTBOUND_MESSAGE:
			return outboundMessage != null && !outboundMessage.isEmpty();
		case TeksPackage.TEKS__INBOUND_MESSAGE:
			return inboundMessage != null && !inboundMessage.isEmpty();
		case TeksPackage.TEKS__ACCOUNT:
			return account != null;
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
		result.append(" (appId: ");
		result.append(appId);
		result.append(')');
		return result.toString();
	}

} //TeksImpl
