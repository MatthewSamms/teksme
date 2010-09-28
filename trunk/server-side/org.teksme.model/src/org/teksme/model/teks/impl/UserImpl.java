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

import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getYearOfBirth <em>Year Of Birth</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getGender <em>Gender</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends TeksObjectImpl implements User {
	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearOfBirth() <em>Year Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_OF_BIRTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearOfBirth() <em>Year Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfBirth()
	 * @generated
	 * @ordered
	 */
	protected int yearOfBirth = YEAR_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearOfBirth(int newYearOfBirth) {
		int oldYearOfBirth = yearOfBirth;
		yearOfBirth = newYearOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__YEAR_OF_BIRTH, oldYearOfBirth,
					yearOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.USER__USER_NAME:
			return getUserName();
		case TeksPackage.USER__FIRST_NAME:
			return getFirstName();
		case TeksPackage.USER__LAST_NAME:
			return getLastName();
		case TeksPackage.USER__EMAIL:
			return getEmail();
		case TeksPackage.USER__PASSWORD:
			return getPassword();
		case TeksPackage.USER__COUNTRY:
			return getCountry();
		case TeksPackage.USER__YEAR_OF_BIRTH:
			return getYearOfBirth();
		case TeksPackage.USER__GENDER:
			return getGender();
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
		case TeksPackage.USER__USER_NAME:
			setUserName((String) newValue);
			return;
		case TeksPackage.USER__FIRST_NAME:
			setFirstName((String) newValue);
			return;
		case TeksPackage.USER__LAST_NAME:
			setLastName((String) newValue);
			return;
		case TeksPackage.USER__EMAIL:
			setEmail((String) newValue);
			return;
		case TeksPackage.USER__PASSWORD:
			setPassword((String) newValue);
			return;
		case TeksPackage.USER__COUNTRY:
			setCountry((String) newValue);
			return;
		case TeksPackage.USER__YEAR_OF_BIRTH:
			setYearOfBirth((Integer) newValue);
			return;
		case TeksPackage.USER__GENDER:
			setGender((String) newValue);
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
		case TeksPackage.USER__USER_NAME:
			setUserName(USER_NAME_EDEFAULT);
			return;
		case TeksPackage.USER__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
			return;
		case TeksPackage.USER__LAST_NAME:
			setLastName(LAST_NAME_EDEFAULT);
			return;
		case TeksPackage.USER__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case TeksPackage.USER__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case TeksPackage.USER__COUNTRY:
			setCountry(COUNTRY_EDEFAULT);
			return;
		case TeksPackage.USER__YEAR_OF_BIRTH:
			setYearOfBirth(YEAR_OF_BIRTH_EDEFAULT);
			return;
		case TeksPackage.USER__GENDER:
			setGender(GENDER_EDEFAULT);
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
		case TeksPackage.USER__USER_NAME:
			return USER_NAME_EDEFAULT == null ? userName != null
					: !USER_NAME_EDEFAULT.equals(userName);
		case TeksPackage.USER__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null
					: !FIRST_NAME_EDEFAULT.equals(firstName);
		case TeksPackage.USER__LAST_NAME:
			return LAST_NAME_EDEFAULT == null ? lastName != null
					: !LAST_NAME_EDEFAULT.equals(lastName);
		case TeksPackage.USER__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT
					.equals(email);
		case TeksPackage.USER__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null
					: !PASSWORD_EDEFAULT.equals(password);
		case TeksPackage.USER__COUNTRY:
			return COUNTRY_EDEFAULT == null ? country != null
					: !COUNTRY_EDEFAULT.equals(country);
		case TeksPackage.USER__YEAR_OF_BIRTH:
			return yearOfBirth != YEAR_OF_BIRTH_EDEFAULT;
		case TeksPackage.USER__GENDER:
			return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT
					.equals(gender);
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
		result.append(" (userName: ");
		result.append(userName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", email: ");
		result.append(email);
		result.append(", password: ");
		result.append(password);
		result.append(", country: ");
		result.append(country);
		result.append(", yearOfBirth: ");
		result.append(yearOfBirth);
		result.append(", gender: ");
		result.append(gender);
		result.append(')');
		return result.toString();
	}

} //UserImpl
