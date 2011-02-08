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

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.Response;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ResponseImpl#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseImpl extends TeksObjectImpl implements Response {
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected org.teksme.model.teks.Error error;

	/**
	 * 
	 */
	private static final long serialVersionUID = 3563704321960682129L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.teksme.model.teks.Error getError() {
		if (error != null && ((EObject) error).eIsProxy()) {
			InternalEObject oldError = (InternalEObject) error;
			error = (org.teksme.model.teks.Error) eResolveProxy(oldError);
			if (error != oldError) {
				InternalEObject newError = (InternalEObject) error;
				NotificationChain msgs = oldError.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.RESPONSE__ERROR,
						null, null);
				if (newError.eInternalContainer() == null) {
					msgs = newError.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.RESPONSE__ERROR, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.RESPONSE__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.teksme.model.teks.Error basicGetError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(
			org.teksme.model.teks.Error newError, NotificationChain msgs) {
		org.teksme.model.teks.Error oldError = error;
		error = newError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.RESPONSE__ERROR, oldError,
					newError);
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
	public void setError(org.teksme.model.teks.Error newError) {
		if (newError != error) {
			NotificationChain msgs = null;
			if (error != null)
				msgs = ((InternalEObject) error).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.RESPONSE__ERROR,
						null, msgs);
			if (newError != null)
				msgs = ((InternalEObject) newError).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.RESPONSE__ERROR,
						null, msgs);
			msgs = basicSetError(newError, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE__ERROR, newError, newError));
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
		case TeksPackage.RESPONSE__ERROR:
			return basicSetError(null, msgs);
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
		case TeksPackage.RESPONSE__ERROR:
			if (resolve)
				return getError();
			return basicGetError();
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
		case TeksPackage.RESPONSE__ERROR:
			setError((org.teksme.model.teks.Error) newValue);
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
		case TeksPackage.RESPONSE__ERROR:
			setError((org.teksme.model.teks.Error) null);
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
		case TeksPackage.RESPONSE__ERROR:
			return error != null;
		}
		return super.eIsSet(featureID);
	}

} //ResponseImpl
