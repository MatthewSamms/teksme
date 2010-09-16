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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.Message;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.TextMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getCommunicationChannelList <em>Communication Channel</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getSmsGateway <em>Sms Gateway</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MessageImpl extends EObjectImpl implements Message {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

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
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected TextMessage message;

	/**
	 * The default value of the '{@link #getSmsGateway() <em>Sms Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsGateway()
	 * @generated
	 * @ordered
	 */
	protected static final SMSGatewayKind SMS_GATEWAY_EDEFAULT = SMSGatewayKind.CLICKATELL;

	/**
	 * The cached value of the '{@link #getSmsGateway() <em>Sms Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsGateway()
	 * @generated
	 * @ordered
	 */
	protected SMSGatewayKind smsGateway = SMS_GATEWAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__TIMESTAMP, oldTimestamp, timestamp));
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
					TeksPackage.MESSAGE__COMMUNICATION_CHANNEL);
		}
		return communicationChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextMessage getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject) message;
			message = (TextMessage) eResolveProxy(oldMessage);
			if (message != oldMessage) {
				InternalEObject newMessage = (InternalEObject) message;
				NotificationChain msgs = oldMessage.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__MESSAGE,
						null, null);
				if (newMessage.eInternalContainer() == null) {
					msgs = newMessage.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.MESSAGE__MESSAGE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.MESSAGE__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextMessage basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(TextMessage newMessage,
			NotificationChain msgs) {
		TextMessage oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.MESSAGE__MESSAGE, oldMessage,
					newMessage);
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
	public void setMessage(TextMessage newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject) message).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__MESSAGE,
						null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject) newMessage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__MESSAGE,
						null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMSGatewayKind getSmsGateway() {
		return smsGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmsGateway(SMSGatewayKind newSmsGateway) {
		SMSGatewayKind oldSmsGateway = smsGateway;
		smsGateway = newSmsGateway == null ? SMS_GATEWAY_EDEFAULT
				: newSmsGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__SMS_GATEWAY, oldSmsGateway, smsGateway));
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
		case TeksPackage.MESSAGE__MESSAGE:
			return basicSetMessage(null, msgs);
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
		case TeksPackage.MESSAGE__ID:
			return getId();
		case TeksPackage.MESSAGE__TIMESTAMP:
			return getTimestamp();
		case TeksPackage.MESSAGE__COMMUNICATION_CHANNEL:
			return getCommunicationChannelList();
		case TeksPackage.MESSAGE__MESSAGE:
			if (resolve)
				return getMessage();
			return basicGetMessage();
		case TeksPackage.MESSAGE__SMS_GATEWAY:
			return getSmsGateway();
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
		case TeksPackage.MESSAGE__ID:
			setId((String) newValue);
			return;
		case TeksPackage.MESSAGE__TIMESTAMP:
			setTimestamp((Date) newValue);
			return;
		case TeksPackage.MESSAGE__COMMUNICATION_CHANNEL:
			getCommunicationChannelList().clear();
			getCommunicationChannelList().addAll(
					(Collection<? extends ChannelKind>) newValue);
			return;
		case TeksPackage.MESSAGE__MESSAGE:
			setMessage((TextMessage) newValue);
			return;
		case TeksPackage.MESSAGE__SMS_GATEWAY:
			setSmsGateway((SMSGatewayKind) newValue);
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
		case TeksPackage.MESSAGE__ID:
			setId(ID_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__COMMUNICATION_CHANNEL:
			getCommunicationChannelList().clear();
			return;
		case TeksPackage.MESSAGE__MESSAGE:
			setMessage((TextMessage) null);
			return;
		case TeksPackage.MESSAGE__SMS_GATEWAY:
			setSmsGateway(SMS_GATEWAY_EDEFAULT);
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
		case TeksPackage.MESSAGE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TeksPackage.MESSAGE__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null
					: !TIMESTAMP_EDEFAULT.equals(timestamp);
		case TeksPackage.MESSAGE__COMMUNICATION_CHANNEL:
			return communicationChannel != null
					&& !communicationChannel.isEmpty();
		case TeksPackage.MESSAGE__MESSAGE:
			return message != null;
		case TeksPackage.MESSAGE__SMS_GATEWAY:
			return smsGateway != SMS_GATEWAY_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", communicationChannel: ");
		result.append(communicationChannel);
		result.append(", smsGateway: ");
		result.append(smsGateway);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
