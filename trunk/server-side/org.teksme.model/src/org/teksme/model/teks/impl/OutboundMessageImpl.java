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

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outbound Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.OutboundMessageImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundMessageImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundMessageImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundMessageImpl#getCallback <em>Callback</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundMessageImpl#isConcatenated <em>Concatenated</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.OutboundMessageImpl#getTeksRef <em>Teks Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutboundMessageImpl extends MessageImpl implements OutboundMessage {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7204245476420866334L;

	/**
	 * The default value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCHEDULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Date schedule = SCHEDULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final float TIMEOUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected float timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected int delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallback()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallback()
	 * @generated
	 * @ordered
	 */
	protected String callback = CALLBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #isConcatenated() <em>Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConcatenated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONCATENATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConcatenated() <em>Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConcatenated()
	 * @generated
	 * @ordered
	 */
	protected boolean concatenated = CONCATENATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutboundMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.OUTBOUND_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Date newSchedule) {
		Date oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_MESSAGE__SCHEDULE, oldSchedule,
					schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(float newTimeout) {
		float oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_MESSAGE__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(int newDelay) {
		int oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_MESSAGE__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallback() {
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallback(String newCallback) {
		String oldCallback = callback;
		callback = newCallback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_MESSAGE__CALLBACK, oldCallback,
					callback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConcatenated() {
		return concatenated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcatenated(boolean newConcatenated) {
		boolean oldConcatenated = concatenated;
		concatenated = newConcatenated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_MESSAGE__CONCATENATED,
					oldConcatenated, concatenated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teks getTeksRef() {
		if (eContainerFeatureID() != TeksPackage.OUTBOUND_MESSAGE__TEKS_REF)
			return null;
		return (Teks) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teks basicGetTeksRef() {
		if (eContainerFeatureID() != TeksPackage.OUTBOUND_MESSAGE__TEKS_REF)
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
				TeksPackage.OUTBOUND_MESSAGE__TEKS_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeksRef(Teks newTeksRef) {
		if (newTeksRef != eInternalContainer()
				|| (eContainerFeatureID() != TeksPackage.OUTBOUND_MESSAGE__TEKS_REF && newTeksRef != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newTeksRef))
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
					TeksPackage.OUTBOUND_MESSAGE__TEKS_REF, newTeksRef,
					newTeksRef));
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
		case TeksPackage.OUTBOUND_MESSAGE__TEKS_REF:
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
		case TeksPackage.OUTBOUND_MESSAGE__TEKS_REF:
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
		case TeksPackage.OUTBOUND_MESSAGE__TEKS_REF:
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
		case TeksPackage.OUTBOUND_MESSAGE__SCHEDULE:
			return getSchedule();
		case TeksPackage.OUTBOUND_MESSAGE__TIMEOUT:
			return getTimeout();
		case TeksPackage.OUTBOUND_MESSAGE__DELAY:
			return getDelay();
		case TeksPackage.OUTBOUND_MESSAGE__CALLBACK:
			return getCallback();
		case TeksPackage.OUTBOUND_MESSAGE__CONCATENATED:
			return isConcatenated();
		case TeksPackage.OUTBOUND_MESSAGE__TEKS_REF:
			if (resolve)
				return getTeksRef();
			return basicGetTeksRef();
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
		case TeksPackage.OUTBOUND_MESSAGE__SCHEDULE:
			setSchedule((Date) newValue);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__TIMEOUT:
			setTimeout((Float) newValue);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__DELAY:
			setDelay((Integer) newValue);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__CALLBACK:
			setCallback((String) newValue);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__CONCATENATED:
			setConcatenated((Boolean) newValue);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__TEKS_REF:
			setTeksRef((Teks) newValue);
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
		case TeksPackage.OUTBOUND_MESSAGE__SCHEDULE:
			setSchedule(SCHEDULE_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__TIMEOUT:
			setTimeout(TIMEOUT_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__DELAY:
			setDelay(DELAY_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__CALLBACK:
			setCallback(CALLBACK_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__CONCATENATED:
			setConcatenated(CONCATENATED_EDEFAULT);
			return;
		case TeksPackage.OUTBOUND_MESSAGE__TEKS_REF:
			setTeksRef((Teks) null);
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
		case TeksPackage.OUTBOUND_MESSAGE__SCHEDULE:
			return SCHEDULE_EDEFAULT == null ? schedule != null
					: !SCHEDULE_EDEFAULT.equals(schedule);
		case TeksPackage.OUTBOUND_MESSAGE__TIMEOUT:
			return timeout != TIMEOUT_EDEFAULT;
		case TeksPackage.OUTBOUND_MESSAGE__DELAY:
			return delay != DELAY_EDEFAULT;
		case TeksPackage.OUTBOUND_MESSAGE__CALLBACK:
			return CALLBACK_EDEFAULT == null ? callback != null
					: !CALLBACK_EDEFAULT.equals(callback);
		case TeksPackage.OUTBOUND_MESSAGE__CONCATENATED:
			return concatenated != CONCATENATED_EDEFAULT;
		case TeksPackage.OUTBOUND_MESSAGE__TEKS_REF:
			return basicGetTeksRef() != null;
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
		result.append(" (schedule: ");
		result.append(schedule);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", delay: ");
		result.append(delay);
		result.append(", callback: ");
		result.append(callback);
		result.append(", concatenated: ");
		result.append(concatenated);
		result.append(')');
		return result.toString();
	}

} //OutboundMessageImpl
