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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.ReplyMessage;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reply Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ReplyMessageImpl#getConfirmationList <em>Confirmation</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ReplyMessageImpl#isDefaultMessage <em>Default Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ReplyMessageImpl#getCustomMessage <em>Custom Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyMessageImpl extends TeksObjectImpl implements ReplyMessage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getConfirmationList() <em>Confirmation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmationList()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplyMessage> confirmation;

	/**
	 * The empty value for the '{@link #getConfirmation() <em>Confirmation</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmation()
	 * @generated
	 * @ordered
	 */
	protected static final ReplyMessage[] CONFIRMATION_EEMPTY_ARRAY = new ReplyMessage[0];

	/**
	 * The default value of the '{@link #isDefaultMessage() <em>Default Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultMessage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_MESSAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultMessage() <em>Default Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultMessage()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultMessage = DEFAULT_MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomMessage() <em>Custom Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMessage()
	 * @generated
	 * @ordered
	 */
	protected OutboundMessage customMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.REPLY_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyMessage[] getConfirmation() {
		if (confirmation == null || confirmation.isEmpty())
			return CONFIRMATION_EEMPTY_ARRAY;
		BasicEList<ReplyMessage> list = (BasicEList<ReplyMessage>) confirmation;
		list.shrink();
		return (ReplyMessage[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyMessage getConfirmation(int index) {
		return getConfirmationList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConfirmationLength() {
		return confirmation == null ? 0 : confirmation.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmation(ReplyMessage[] newConfirmation) {
		((BasicEList<ReplyMessage>) getConfirmationList()).setData(
				newConfirmation.length, newConfirmation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmation(int index, ReplyMessage element) {
		getConfirmationList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplyMessage> getConfirmationList() {
		if (confirmation == null) {
			confirmation = new EObjectContainmentEList.Resolving<ReplyMessage>(
					ReplyMessage.class, this,
					TeksPackage.REPLY_MESSAGE__CONFIRMATION);
		}
		return confirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultMessage() {
		return defaultMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMessage(boolean newDefaultMessage) {
		boolean oldDefaultMessage = defaultMessage;
		defaultMessage = newDefaultMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.REPLY_MESSAGE__DEFAULT_MESSAGE,
					oldDefaultMessage, defaultMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage getCustomMessage() {
		if (customMessage != null && ((EObject) customMessage).eIsProxy()) {
			InternalEObject oldCustomMessage = (InternalEObject) customMessage;
			customMessage = (OutboundMessage) eResolveProxy(oldCustomMessage);
			if (customMessage != oldCustomMessage) {
				InternalEObject newCustomMessage = (InternalEObject) customMessage;
				NotificationChain msgs = oldCustomMessage.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE,
						null, null);
				if (newCustomMessage.eInternalContainer() == null) {
					msgs = newCustomMessage
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE,
							oldCustomMessage, customMessage));
			}
		}
		return customMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage basicGetCustomMessage() {
		return customMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomMessage(
			OutboundMessage newCustomMessage, NotificationChain msgs) {
		OutboundMessage oldCustomMessage = customMessage;
		customMessage = newCustomMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE,
					oldCustomMessage, newCustomMessage);
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
	public void setCustomMessage(OutboundMessage newCustomMessage) {
		if (newCustomMessage != customMessage) {
			NotificationChain msgs = null;
			if (customMessage != null)
				msgs = ((InternalEObject) customMessage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE,
						null, msgs);
			if (newCustomMessage != null)
				msgs = ((InternalEObject) newCustomMessage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE,
						null, msgs);
			msgs = basicSetCustomMessage(newCustomMessage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE,
					newCustomMessage, newCustomMessage));
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
		case TeksPackage.REPLY_MESSAGE__CONFIRMATION:
			return ((InternalEList<?>) getConfirmationList()).basicRemove(
					otherEnd, msgs);
		case TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE:
			return basicSetCustomMessage(null, msgs);
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
		case TeksPackage.REPLY_MESSAGE__CONFIRMATION:
			return getConfirmationList();
		case TeksPackage.REPLY_MESSAGE__DEFAULT_MESSAGE:
			return isDefaultMessage();
		case TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE:
			if (resolve)
				return getCustomMessage();
			return basicGetCustomMessage();
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
		case TeksPackage.REPLY_MESSAGE__CONFIRMATION:
			getConfirmationList().clear();
			getConfirmationList().addAll(
					(Collection<? extends ReplyMessage>) newValue);
			return;
		case TeksPackage.REPLY_MESSAGE__DEFAULT_MESSAGE:
			setDefaultMessage((Boolean) newValue);
			return;
		case TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE:
			setCustomMessage((OutboundMessage) newValue);
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
		case TeksPackage.REPLY_MESSAGE__CONFIRMATION:
			getConfirmationList().clear();
			return;
		case TeksPackage.REPLY_MESSAGE__DEFAULT_MESSAGE:
			setDefaultMessage(DEFAULT_MESSAGE_EDEFAULT);
			return;
		case TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE:
			setCustomMessage((OutboundMessage) null);
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
		case TeksPackage.REPLY_MESSAGE__CONFIRMATION:
			return confirmation != null && !confirmation.isEmpty();
		case TeksPackage.REPLY_MESSAGE__DEFAULT_MESSAGE:
			return defaultMessage != DEFAULT_MESSAGE_EDEFAULT;
		case TeksPackage.REPLY_MESSAGE__CUSTOM_MESSAGE:
			return customMessage != null;
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
		result.append(" (defaultMessage: ");
		result.append(defaultMessage);
		result.append(')');
		return result.toString();
	}

} //ReplyMessageImpl
