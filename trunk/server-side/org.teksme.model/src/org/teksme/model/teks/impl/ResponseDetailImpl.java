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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.AnswerRef;
import org.teksme.model.teks.InboundMessage;
import org.teksme.model.teks.ResponseDetail;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ResponseDetailImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ResponseDetailImpl#getRawMessage <em>Raw Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ResponseDetailImpl#getSetValueList <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseDetailImpl extends TeksObjectImpl implements
		ResponseDetail {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5802667543498922150L;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRawMessage() <em>Raw Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawMessage()
	 * @generated
	 * @ordered
	 */
	protected InboundMessage rawMessage;

	/**
	 * The cached value of the '{@link #getSetValueList() <em>Set Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetValueList()
	 * @generated
	 * @ordered
	 */
	protected EList<AnswerRef> setValue;

	/**
	 * The empty value for the '{@link #getSetValue() <em>Set Value</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetValue()
	 * @generated
	 * @ordered
	 */
	protected static final AnswerRef[] SET_VALUE_EEMPTY_ARRAY = new AnswerRef[0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.RESPONSE_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE_DETAIL__DATE_TIME, oldDateTime,
					dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundMessage getRawMessage() {
		if (rawMessage != null && ((EObject) rawMessage).eIsProxy()) {
			InternalEObject oldRawMessage = (InternalEObject) rawMessage;
			rawMessage = (InboundMessage) eResolveProxy(oldRawMessage);
			if (rawMessage != oldRawMessage) {
				InternalEObject newRawMessage = (InternalEObject) rawMessage;
				NotificationChain msgs = oldRawMessage.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE,
						null, null);
				if (newRawMessage.eInternalContainer() == null) {
					msgs = newRawMessage.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE,
							oldRawMessage, rawMessage));
			}
		}
		return rawMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundMessage basicGetRawMessage() {
		return rawMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRawMessage(InboundMessage newRawMessage,
			NotificationChain msgs) {
		InboundMessage oldRawMessage = rawMessage;
		rawMessage = newRawMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE,
					oldRawMessage, newRawMessage);
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
	public void setRawMessage(InboundMessage newRawMessage) {
		if (newRawMessage != rawMessage) {
			NotificationChain msgs = null;
			if (rawMessage != null)
				msgs = ((InternalEObject) rawMessage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE,
						null, msgs);
			if (newRawMessage != null)
				msgs = ((InternalEObject) newRawMessage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE,
						null, msgs);
			msgs = basicSetRawMessage(newRawMessage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE, newRawMessage,
					newRawMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerRef[] getSetValue() {
		if (setValue == null || setValue.isEmpty())
			return SET_VALUE_EEMPTY_ARRAY;
		BasicEList<AnswerRef> list = (BasicEList<AnswerRef>) setValue;
		list.shrink();
		return (AnswerRef[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerRef getSetValue(int index) {
		return getSetValueList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSetValueLength() {
		return setValue == null ? 0 : setValue.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetValue(AnswerRef[] newSetValue) {
		((BasicEList<AnswerRef>) getSetValueList()).setData(newSetValue.length,
				newSetValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetValue(int index, AnswerRef element) {
		getSetValueList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnswerRef> getSetValueList() {
		if (setValue == null) {
			setValue = new EObjectContainmentEList.Resolving<AnswerRef>(
					AnswerRef.class, this,
					TeksPackage.RESPONSE_DETAIL__SET_VALUE);
		}
		return setValue;
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
		case TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE:
			return basicSetRawMessage(null, msgs);
		case TeksPackage.RESPONSE_DETAIL__SET_VALUE:
			return ((InternalEList<?>) getSetValueList()).basicRemove(otherEnd,
					msgs);
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
		case TeksPackage.RESPONSE_DETAIL__DATE_TIME:
			return getDateTime();
		case TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE:
			if (resolve)
				return getRawMessage();
			return basicGetRawMessage();
		case TeksPackage.RESPONSE_DETAIL__SET_VALUE:
			return getSetValueList();
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
		case TeksPackage.RESPONSE_DETAIL__DATE_TIME:
			setDateTime((Date) newValue);
			return;
		case TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE:
			setRawMessage((InboundMessage) newValue);
			return;
		case TeksPackage.RESPONSE_DETAIL__SET_VALUE:
			getSetValueList().clear();
			getSetValueList()
					.addAll((Collection<? extends AnswerRef>) newValue);
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
		case TeksPackage.RESPONSE_DETAIL__DATE_TIME:
			setDateTime(DATE_TIME_EDEFAULT);
			return;
		case TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE:
			setRawMessage((InboundMessage) null);
			return;
		case TeksPackage.RESPONSE_DETAIL__SET_VALUE:
			getSetValueList().clear();
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
		case TeksPackage.RESPONSE_DETAIL__DATE_TIME:
			return DATE_TIME_EDEFAULT == null ? dateTime != null
					: !DATE_TIME_EDEFAULT.equals(dateTime);
		case TeksPackage.RESPONSE_DETAIL__RAW_MESSAGE:
			return rawMessage != null;
		case TeksPackage.RESPONSE_DETAIL__SET_VALUE:
			return setValue != null && !setValue.isEmpty();
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
		result.append(" (dateTime: ");
		result.append(dateTime);
		result.append(')');
		return result.toString();
	}

} //ResponseDetailImpl
