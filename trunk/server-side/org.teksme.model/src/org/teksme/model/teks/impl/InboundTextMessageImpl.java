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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.TextMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbound Text Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.InboundTextMessageImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InboundTextMessageImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InboundTextMessageImpl#getOriginator <em>Originator</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InboundTextMessageImpl#getSmscNumber <em>Smsc Number</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InboundTextMessageImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InboundTextMessageImpl extends MessageImpl implements
		InboundTextMessage {
	/**
	 * The default value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected String partNumber = PART_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected String messageType = MESSAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginator() <em>Originator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginator()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginator() <em>Originator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginator()
	 * @generated
	 * @ordered
	 */
	protected String originator = ORIGINATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmscNumber() <em>Smsc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmscNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SMSC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmscNumber() <em>Smsc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmscNumber()
	 * @generated
	 * @ordered
	 */
	protected String smscNumber = SMSC_NUMBER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InboundTextMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.INBOUND_TEXT_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNumber(String newPartNumber) {
		String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INBOUND_TEXT_MESSAGE__PART_NUMBER,
					oldPartNumber, partNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(String newMessageType) {
		String oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE_TYPE,
					oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginator() {
		return originator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginator(String newOriginator) {
		String oldOriginator = originator;
		originator = newOriginator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INBOUND_TEXT_MESSAGE__ORIGINATOR,
					oldOriginator, originator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSmscNumber() {
		return smscNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmscNumber(String newSmscNumber) {
		String oldSmscNumber = smscNumber;
		smscNumber = newSmscNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INBOUND_TEXT_MESSAGE__SMSC_NUMBER,
					oldSmscNumber, smscNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextMessage getMessage() {
		if (message != null && ((EObject) message).eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject) message;
			message = (TextMessage) eResolveProxy(oldMessage);
			if (message != oldMessage) {
				InternalEObject newMessage = (InternalEObject) message;
				NotificationChain msgs = oldMessage.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE,
						null, null);
				if (newMessage.eInternalContainer() == null) {
					msgs = newMessage.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE,
							oldMessage, message));
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
					Notification.SET,
					TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE, oldMessage,
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
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE,
						null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject) newMessage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE,
						null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE, newMessage,
					newMessage));
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
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE:
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
		case TeksPackage.INBOUND_TEXT_MESSAGE__PART_NUMBER:
			return getPartNumber();
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE_TYPE:
			return getMessageType();
		case TeksPackage.INBOUND_TEXT_MESSAGE__ORIGINATOR:
			return getOriginator();
		case TeksPackage.INBOUND_TEXT_MESSAGE__SMSC_NUMBER:
			return getSmscNumber();
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE:
			if (resolve)
				return getMessage();
			return basicGetMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.INBOUND_TEXT_MESSAGE__PART_NUMBER:
			setPartNumber((String) newValue);
			return;
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE_TYPE:
			setMessageType((String) newValue);
			return;
		case TeksPackage.INBOUND_TEXT_MESSAGE__ORIGINATOR:
			setOriginator((String) newValue);
			return;
		case TeksPackage.INBOUND_TEXT_MESSAGE__SMSC_NUMBER:
			setSmscNumber((String) newValue);
			return;
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE:
			setMessage((TextMessage) newValue);
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
		case TeksPackage.INBOUND_TEXT_MESSAGE__PART_NUMBER:
			setPartNumber(PART_NUMBER_EDEFAULT);
			return;
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE_TYPE:
			setMessageType(MESSAGE_TYPE_EDEFAULT);
			return;
		case TeksPackage.INBOUND_TEXT_MESSAGE__ORIGINATOR:
			setOriginator(ORIGINATOR_EDEFAULT);
			return;
		case TeksPackage.INBOUND_TEXT_MESSAGE__SMSC_NUMBER:
			setSmscNumber(SMSC_NUMBER_EDEFAULT);
			return;
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE:
			setMessage((TextMessage) null);
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
		case TeksPackage.INBOUND_TEXT_MESSAGE__PART_NUMBER:
			return PART_NUMBER_EDEFAULT == null ? partNumber != null
					: !PART_NUMBER_EDEFAULT.equals(partNumber);
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE_TYPE:
			return MESSAGE_TYPE_EDEFAULT == null ? messageType != null
					: !MESSAGE_TYPE_EDEFAULT.equals(messageType);
		case TeksPackage.INBOUND_TEXT_MESSAGE__ORIGINATOR:
			return ORIGINATOR_EDEFAULT == null ? originator != null
					: !ORIGINATOR_EDEFAULT.equals(originator);
		case TeksPackage.INBOUND_TEXT_MESSAGE__SMSC_NUMBER:
			return SMSC_NUMBER_EDEFAULT == null ? smscNumber != null
					: !SMSC_NUMBER_EDEFAULT.equals(smscNumber);
		case TeksPackage.INBOUND_TEXT_MESSAGE__MESSAGE:
			return message != null;
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
		result.append(" (partNumber: ");
		result.append(partNumber);
		result.append(", messageType: ");
		result.append(messageType);
		result.append(", originator: ");
		result.append(originator);
		result.append(", smscNumber: ");
		result.append(smscNumber);
		result.append(')');
		return result.toString();
	}

} //InboundTextMessageImpl
