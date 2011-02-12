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

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.Application;
import org.teksme.model.teks.Profile;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getSharedSecret <em>Shared Secret</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getRegistered <em>Registered</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getCallbackURL <em>Callback URL</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getRateLimits <em>Rate Limits</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getProfileRef <em>Profile Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends TeksObjectImpl implements Application {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedSecret() <em>Shared Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARED_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedSecret() <em>Shared Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedSecret()
	 * @generated
	 * @ordered
	 */
	protected String sharedSecret = SHARED_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistered() <em>Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistered()
	 * @generated
	 * @ordered
	 */
	protected static final Date REGISTERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistered() <em>Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistered()
	 * @generated
	 * @ordered
	 */
	protected Date registered = REGISTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallbackURL() <em>Callback URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackURL()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLBACK_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallbackURL() <em>Callback URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbackURL()
	 * @generated
	 * @ordered
	 */
	protected String callbackURL = CALLBACK_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateLimits() <em>Rate Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateLimits()
	 * @generated
	 * @ordered
	 */
	protected static final int RATE_LIMITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRateLimits() <em>Rate Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateLimits()
	 * @generated
	 * @ordered
	 */
	protected int rateLimits = RATE_LIMITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSharedSecret() {
		return sharedSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedSecret(String newSharedSecret) {
		String oldSharedSecret = sharedSecret;
		sharedSecret = newSharedSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__SHARED_SECRET, oldSharedSecret,
					sharedSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRegistered() {
		return registered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistered(Date newRegistered) {
		Date oldRegistered = registered;
		registered = newRegistered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__REGISTERED, oldRegistered,
					registered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallbackURL() {
		return callbackURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallbackURL(String newCallbackURL) {
		String oldCallbackURL = callbackURL;
		callbackURL = newCallbackURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__CALLBACK_URL, oldCallbackURL,
					callbackURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRateLimits() {
		return rateLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateLimits(int newRateLimits) {
		int oldRateLimits = rateLimits;
		rateLimits = newRateLimits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__RATE_LIMITS, oldRateLimits,
					rateLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getProfileRef() {
		if (eContainerFeatureID() != TeksPackage.APPLICATION__PROFILE_REF)
			return null;
		return (Profile) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetProfileRef() {
		if (eContainerFeatureID() != TeksPackage.APPLICATION__PROFILE_REF)
			return null;
		return (Profile) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileRef(Profile newProfileRef,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProfileRef,
				TeksPackage.APPLICATION__PROFILE_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileRef(Profile newProfileRef) {
		if (newProfileRef != eInternalContainer()
				|| (eContainerFeatureID() != TeksPackage.APPLICATION__PROFILE_REF && newProfileRef != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newProfileRef))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProfileRef != null)
				msgs = ((InternalEObject) newProfileRef).eInverseAdd(this,
						TeksPackage.PROFILE__APPLICATION, Profile.class, msgs);
			msgs = basicSetProfileRef(newProfileRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__PROFILE_REF, newProfileRef,
					newProfileRef));
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
		case TeksPackage.APPLICATION__PROFILE_REF:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProfileRef((Profile) otherEnd, msgs);
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
		case TeksPackage.APPLICATION__PROFILE_REF:
			return basicSetProfileRef(null, msgs);
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
		case TeksPackage.APPLICATION__PROFILE_REF:
			return eInternalContainer().eInverseRemove(this,
					TeksPackage.PROFILE__APPLICATION, Profile.class, msgs);
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
		case TeksPackage.APPLICATION__NAME:
			return getName();
		case TeksPackage.APPLICATION__KEY:
			return getKey();
		case TeksPackage.APPLICATION__SHARED_SECRET:
			return getSharedSecret();
		case TeksPackage.APPLICATION__DESCRIPTION:
			return getDescription();
		case TeksPackage.APPLICATION__REGISTERED:
			return getRegistered();
		case TeksPackage.APPLICATION__STATUS:
			return getStatus();
		case TeksPackage.APPLICATION__CALLBACK_URL:
			return getCallbackURL();
		case TeksPackage.APPLICATION__RATE_LIMITS:
			return getRateLimits();
		case TeksPackage.APPLICATION__PROFILE_REF:
			if (resolve)
				return getProfileRef();
			return basicGetProfileRef();
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
		case TeksPackage.APPLICATION__NAME:
			setName((String) newValue);
			return;
		case TeksPackage.APPLICATION__KEY:
			setKey((String) newValue);
			return;
		case TeksPackage.APPLICATION__SHARED_SECRET:
			setSharedSecret((String) newValue);
			return;
		case TeksPackage.APPLICATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TeksPackage.APPLICATION__REGISTERED:
			setRegistered((Date) newValue);
			return;
		case TeksPackage.APPLICATION__STATUS:
			setStatus((String) newValue);
			return;
		case TeksPackage.APPLICATION__CALLBACK_URL:
			setCallbackURL((String) newValue);
			return;
		case TeksPackage.APPLICATION__RATE_LIMITS:
			setRateLimits((Integer) newValue);
			return;
		case TeksPackage.APPLICATION__PROFILE_REF:
			setProfileRef((Profile) newValue);
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
		case TeksPackage.APPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__KEY:
			setKey(KEY_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__SHARED_SECRET:
			setSharedSecret(SHARED_SECRET_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__REGISTERED:
			setRegistered(REGISTERED_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__CALLBACK_URL:
			setCallbackURL(CALLBACK_URL_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__RATE_LIMITS:
			setRateLimits(RATE_LIMITS_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__PROFILE_REF:
			setProfileRef((Profile) null);
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
		case TeksPackage.APPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case TeksPackage.APPLICATION__KEY:
			return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT
					.equals(key);
		case TeksPackage.APPLICATION__SHARED_SECRET:
			return SHARED_SECRET_EDEFAULT == null ? sharedSecret != null
					: !SHARED_SECRET_EDEFAULT.equals(sharedSecret);
		case TeksPackage.APPLICATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case TeksPackage.APPLICATION__REGISTERED:
			return REGISTERED_EDEFAULT == null ? registered != null
					: !REGISTERED_EDEFAULT.equals(registered);
		case TeksPackage.APPLICATION__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT
					.equals(status);
		case TeksPackage.APPLICATION__CALLBACK_URL:
			return CALLBACK_URL_EDEFAULT == null ? callbackURL != null
					: !CALLBACK_URL_EDEFAULT.equals(callbackURL);
		case TeksPackage.APPLICATION__RATE_LIMITS:
			return rateLimits != RATE_LIMITS_EDEFAULT;
		case TeksPackage.APPLICATION__PROFILE_REF:
			return basicGetProfileRef() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", key: ");
		result.append(key);
		result.append(", sharedSecret: ");
		result.append(sharedSecret);
		result.append(", description: ");
		result.append(description);
		result.append(", registered: ");
		result.append(registered);
		result.append(", status: ");
		result.append(status);
		result.append(", callbackURL: ");
		result.append(callbackURL);
		result.append(", rateLimits: ");
		result.append(rateLimits);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
