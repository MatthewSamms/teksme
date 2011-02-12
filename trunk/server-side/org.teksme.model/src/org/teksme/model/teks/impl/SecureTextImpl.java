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

import org.teksme.model.teks.SecureText;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secure Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.SecureTextImpl#getHashAlgorithm <em>Hash Algorithm</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.SecureTextImpl#getHashEncoding <em>Hash Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecureTextImpl extends PlainTextImpl implements SecureText {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getHashAlgorithm() <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashAlgorithm() <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String hashAlgorithm = HASH_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHashEncoding() <em>Hash Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashEncoding() <em>Hash Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashEncoding()
	 * @generated
	 * @ordered
	 */
	protected String hashEncoding = HASH_ENCODING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecureTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.SECURE_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashAlgorithm() {
		return hashAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashAlgorithm(String newHashAlgorithm) {
		String oldHashAlgorithm = hashAlgorithm;
		hashAlgorithm = newHashAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.SECURE_TEXT__HASH_ALGORITHM, oldHashAlgorithm,
					hashAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashEncoding() {
		return hashEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashEncoding(String newHashEncoding) {
		String oldHashEncoding = hashEncoding;
		hashEncoding = newHashEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.SECURE_TEXT__HASH_ENCODING, oldHashEncoding,
					hashEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.SECURE_TEXT__HASH_ALGORITHM:
			return getHashAlgorithm();
		case TeksPackage.SECURE_TEXT__HASH_ENCODING:
			return getHashEncoding();
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
		case TeksPackage.SECURE_TEXT__HASH_ALGORITHM:
			setHashAlgorithm((String) newValue);
			return;
		case TeksPackage.SECURE_TEXT__HASH_ENCODING:
			setHashEncoding((String) newValue);
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
		case TeksPackage.SECURE_TEXT__HASH_ALGORITHM:
			setHashAlgorithm(HASH_ALGORITHM_EDEFAULT);
			return;
		case TeksPackage.SECURE_TEXT__HASH_ENCODING:
			setHashEncoding(HASH_ENCODING_EDEFAULT);
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
		case TeksPackage.SECURE_TEXT__HASH_ALGORITHM:
			return HASH_ALGORITHM_EDEFAULT == null ? hashAlgorithm != null
					: !HASH_ALGORITHM_EDEFAULT.equals(hashAlgorithm);
		case TeksPackage.SECURE_TEXT__HASH_ENCODING:
			return HASH_ENCODING_EDEFAULT == null ? hashEncoding != null
					: !HASH_ENCODING_EDEFAULT.equals(hashEncoding);
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
		result.append(" (hashAlgorithm: ");
		result.append(hashAlgorithm);
		result.append(", hashEncoding: ");
		result.append(hashEncoding);
		result.append(')');
		return result.toString();
	}

} //SecureTextImpl
