/**
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version 
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
package org.teksme.model.teks;

import org.teksme.model.TeksObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.User#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getMobileNumber <em>Mobile Number</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getEmail <em>Email</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getPassword <em>Password</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getCountry <em>Country</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getYearOfBirth <em>Year Of Birth</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getCompany <em>Company</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getWebsiteURL <em>Website URL</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getBlogURL <em>Blog URL</em>}</li>
 *   <li>{@link org.teksme.model.teks.User#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getUser()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface User extends TeksObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_FirstName()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='firstName'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_LastName()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='lastName'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Mobile Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile Number</em>' attribute.
	 * @see #setMobileNumber(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_MobileNumber()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='mobileNumber'"
	 * @generated
	 */
	String getMobileNumber();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getMobileNumber <em>Mobile Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile Number</em>' attribute.
	 * @see #getMobileNumber()
	 * @generated
	 */
	void setMobileNumber(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_Email()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='email'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_Password()
	 * @model extendedMetaData="kind='element' name='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_Country()
	 * @model extendedMetaData="kind='element' name='country'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Year Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Of Birth</em>' attribute.
	 * @see #setYearOfBirth(int)
	 * @see org.teksme.model.teks.TeksPackage#getUser_YearOfBirth()
	 * @model extendedMetaData="kind='element' name='yearOfBirth'"
	 * @generated
	 */
	int getYearOfBirth();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getYearOfBirth <em>Year Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Of Birth</em>' attribute.
	 * @see #getYearOfBirth()
	 * @generated
	 */
	void setYearOfBirth(int value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see #setCompany(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_Company()
	 * @model extendedMetaData="kind='element' name='company'"
	 * @generated
	 */
	String getCompany();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(String value);

	/**
	 * Returns the value of the '<em><b>Website URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website URL</em>' attribute.
	 * @see #setWebsiteURL(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_WebsiteURL()
	 * @model extendedMetaData="kind='element' name='websiteURL'"
	 * @generated
	 */
	String getWebsiteURL();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getWebsiteURL <em>Website URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website URL</em>' attribute.
	 * @see #getWebsiteURL()
	 * @generated
	 */
	void setWebsiteURL(String value);

	/**
	 * Returns the value of the '<em><b>Blog URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blog URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blog URL</em>' attribute.
	 * @see #setBlogURL(String)
	 * @see org.teksme.model.teks.TeksPackage#getUser_BlogURL()
	 * @model extendedMetaData="kind='element' name='blogURL'"
	 * @generated
	 */
	String getBlogURL();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getBlogURL <em>Blog URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blog URL</em>' attribute.
	 * @see #getBlogURL()
	 * @generated
	 */
	void setBlogURL(String value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Profile)
	 * @see org.teksme.model.teks.TeksPackage#getUser_Profile()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.User#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Profile value);

} // User
