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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.Shout;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ShoutImpl#getThis <em>This</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ShoutImpl#getVoice <em>Voice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShoutImpl extends TeksObjectImpl implements Shout {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5499944939887526610L;

	/**
	 * The default value of the '{@link #getThis() <em>This</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThis()
	 * @generated
	 * @ordered
	 */
	protected static final String THIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThis() <em>This</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThis()
	 * @generated
	 * @ordered
	 */
	protected String this_ = THIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoice() <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoice()
	 * @generated
	 * @ordered
	 */
	protected static final String VOICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoice() <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoice()
	 * @generated
	 * @ordered
	 */
	protected String voice = VOICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.SHOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThis() {
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThis(String newThis) {
		String oldThis = this_;
		this_ = newThis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.SHOUT__THIS, oldThis, this_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoice() {
		return voice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoice(String newVoice) {
		String oldVoice = voice;
		voice = newVoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.SHOUT__VOICE, oldVoice, voice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.SHOUT__THIS:
			return getThis();
		case TeksPackage.SHOUT__VOICE:
			return getVoice();
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
		case TeksPackage.SHOUT__THIS:
			setThis((String) newValue);
			return;
		case TeksPackage.SHOUT__VOICE:
			setVoice((String) newValue);
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
		case TeksPackage.SHOUT__THIS:
			setThis(THIS_EDEFAULT);
			return;
		case TeksPackage.SHOUT__VOICE:
			setVoice(VOICE_EDEFAULT);
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
		case TeksPackage.SHOUT__THIS:
			return THIS_EDEFAULT == null ? this_ != null : !THIS_EDEFAULT
					.equals(this_);
		case TeksPackage.SHOUT__VOICE:
			return VOICE_EDEFAULT == null ? voice != null : !VOICE_EDEFAULT
					.equals(voice);
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
		result.append(" (this: ");
		result.append(this_);
		result.append(", voice: ");
		result.append(voice);
		result.append(')');
		return result.toString();
	}

} //ShoutImpl
