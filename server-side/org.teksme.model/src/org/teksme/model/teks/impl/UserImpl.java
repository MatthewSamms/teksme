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

import org.teksme.model.teks.Profile;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getMobileNumber <em>Mobile Number</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getYearOfBirth <em>Year Of Birth</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getWebsiteURL <em>Website URL</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getBlogURL <em>Blog URL</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.UserImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends TeksObjectImpl implements User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getMobileNumber() <em>Mobile Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobileNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMobileNumber() <em>Mobile Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobileNumber()
	 * @generated
	 * @ordered
	 */
	protected String mobileNumber = MOBILE_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected String company = COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteURL() <em>Website URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteURL()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteURL() <em>Website URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteURL()
	 * @generated
	 * @ordered
	 */
	protected String websiteURL = WEBSITE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlogURL() <em>Blog URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlogURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOG_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlogURL() <em>Blog URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlogURL()
	 * @generated
	 * @ordered
	 */
	protected String blogURL = BLOG_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Profile profile;

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
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobileNumber(String newMobileNumber) {
		String oldMobileNumber = mobileNumber;
		mobileNumber = newMobileNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__MOBILE_NUMBER, oldMobileNumber,
					mobileNumber));
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
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(String newCompany) {
		String oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsiteURL() {
		return websiteURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsiteURL(String newWebsiteURL) {
		String oldWebsiteURL = websiteURL;
		websiteURL = newWebsiteURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__WEBSITE_URL, oldWebsiteURL, websiteURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlogURL() {
		return blogURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlogURL(String newBlogURL) {
		String oldBlogURL = blogURL;
		blogURL = newBlogURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__BLOG_URL, oldBlogURL, blogURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getProfile() {
		if (profile != null && ((EObject) profile).eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject) profile;
			profile = (Profile) eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				InternalEObject newProfile = (InternalEObject) profile;
				NotificationChain msgs = oldProfile.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.USER__PROFILE,
						null, null);
				if (newProfile.eInternalContainer() == null) {
					msgs = newProfile.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.USER__PROFILE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.USER__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Profile newProfile,
			NotificationChain msgs) {
		Profile oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.USER__PROFILE, oldProfile,
					newProfile);
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
	public void setProfile(Profile newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject) profile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.USER__PROFILE,
						null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject) newProfile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.USER__PROFILE,
						null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.USER__PROFILE, newProfile, newProfile));
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
		case TeksPackage.USER__PROFILE:
			return basicSetProfile(null, msgs);
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
		case TeksPackage.USER__FIRST_NAME:
			return getFirstName();
		case TeksPackage.USER__LAST_NAME:
			return getLastName();
		case TeksPackage.USER__MOBILE_NUMBER:
			return getMobileNumber();
		case TeksPackage.USER__EMAIL:
			return getEmail();
		case TeksPackage.USER__PASSWORD:
			return getPassword();
		case TeksPackage.USER__COUNTRY:
			return getCountry();
		case TeksPackage.USER__YEAR_OF_BIRTH:
			return getYearOfBirth();
		case TeksPackage.USER__COMPANY:
			return getCompany();
		case TeksPackage.USER__WEBSITE_URL:
			return getWebsiteURL();
		case TeksPackage.USER__BLOG_URL:
			return getBlogURL();
		case TeksPackage.USER__PROFILE:
			if (resolve)
				return getProfile();
			return basicGetProfile();
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
		case TeksPackage.USER__FIRST_NAME:
			setFirstName((String) newValue);
			return;
		case TeksPackage.USER__LAST_NAME:
			setLastName((String) newValue);
			return;
		case TeksPackage.USER__MOBILE_NUMBER:
			setMobileNumber((String) newValue);
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
		case TeksPackage.USER__COMPANY:
			setCompany((String) newValue);
			return;
		case TeksPackage.USER__WEBSITE_URL:
			setWebsiteURL((String) newValue);
			return;
		case TeksPackage.USER__BLOG_URL:
			setBlogURL((String) newValue);
			return;
		case TeksPackage.USER__PROFILE:
			setProfile((Profile) newValue);
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
		case TeksPackage.USER__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
			return;
		case TeksPackage.USER__LAST_NAME:
			setLastName(LAST_NAME_EDEFAULT);
			return;
		case TeksPackage.USER__MOBILE_NUMBER:
			setMobileNumber(MOBILE_NUMBER_EDEFAULT);
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
		case TeksPackage.USER__COMPANY:
			setCompany(COMPANY_EDEFAULT);
			return;
		case TeksPackage.USER__WEBSITE_URL:
			setWebsiteURL(WEBSITE_URL_EDEFAULT);
			return;
		case TeksPackage.USER__BLOG_URL:
			setBlogURL(BLOG_URL_EDEFAULT);
			return;
		case TeksPackage.USER__PROFILE:
			setProfile((Profile) null);
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
		case TeksPackage.USER__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null
					: !FIRST_NAME_EDEFAULT.equals(firstName);
		case TeksPackage.USER__LAST_NAME:
			return LAST_NAME_EDEFAULT == null ? lastName != null
					: !LAST_NAME_EDEFAULT.equals(lastName);
		case TeksPackage.USER__MOBILE_NUMBER:
			return MOBILE_NUMBER_EDEFAULT == null ? mobileNumber != null
					: !MOBILE_NUMBER_EDEFAULT.equals(mobileNumber);
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
		case TeksPackage.USER__COMPANY:
			return COMPANY_EDEFAULT == null ? company != null
					: !COMPANY_EDEFAULT.equals(company);
		case TeksPackage.USER__WEBSITE_URL:
			return WEBSITE_URL_EDEFAULT == null ? websiteURL != null
					: !WEBSITE_URL_EDEFAULT.equals(websiteURL);
		case TeksPackage.USER__BLOG_URL:
			return BLOG_URL_EDEFAULT == null ? blogURL != null
					: !BLOG_URL_EDEFAULT.equals(blogURL);
		case TeksPackage.USER__PROFILE:
			return profile != null;
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", mobileNumber: ");
		result.append(mobileNumber);
		result.append(", email: ");
		result.append(email);
		result.append(", password: ");
		result.append(password);
		result.append(", country: ");
		result.append(country);
		result.append(", yearOfBirth: ");
		result.append(yearOfBirth);
		result.append(", company: ");
		result.append(company);
		result.append(", websiteURL: ");
		result.append(websiteURL);
		result.append(", blogURL: ");
		result.append(blogURL);
		result.append(')');
		return result.toString();
	}

} //UserImpl
