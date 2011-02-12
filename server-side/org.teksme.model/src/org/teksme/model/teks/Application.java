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
package org.teksme.model.teks;

import java.util.Date;

import org.teksme.model.TeksObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getKey <em>Key</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getSharedSecret <em>Shared Secret</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getDescription <em>Description</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getRegistered <em>Registered</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getStatus <em>Status</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getCallbackURL <em>Callback URL</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getRateLimits <em>Rate Limits</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getProfileRef <em>Profile Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getApplication()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface Application extends TeksObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Name()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Key()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Shared Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Secret</em>' attribute.
	 * @see #setSharedSecret(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_SharedSecret()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='sharedSecret'"
	 * @generated
	 */
	String getSharedSecret();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getSharedSecret <em>Shared Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Secret</em>' attribute.
	 * @see #getSharedSecret()
	 * @generated
	 */
	void setSharedSecret(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Description()
	 * @model extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered</em>' attribute.
	 * @see #setRegistered(Date)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Registered()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='registered'"
	 * @generated
	 */
	Date getRegistered();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getRegistered <em>Registered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered</em>' attribute.
	 * @see #getRegistered()
	 * @generated
	 */
	void setRegistered(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Status()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Callback URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback URL</em>' attribute.
	 * @see #setCallbackURL(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_CallbackURL()
	 * @model extendedMetaData="kind='element' name='callbackURL'"
	 * @generated
	 */
	String getCallbackURL();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getCallbackURL <em>Callback URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback URL</em>' attribute.
	 * @see #getCallbackURL()
	 * @generated
	 */
	void setCallbackURL(String value);

	/**
	 * Returns the value of the '<em><b>Rate Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Limits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Limits</em>' attribute.
	 * @see #setRateLimits(int)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_RateLimits()
	 * @model extendedMetaData="kind='element' name='rateLimits'"
	 * @generated
	 */
	int getRateLimits();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getRateLimits <em>Rate Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Limits</em>' attribute.
	 * @see #getRateLimits()
	 * @generated
	 */
	void setRateLimits(int value);

	/**
	 * Returns the value of the '<em><b>Profile Ref</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.Profile#getApplicationList <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Ref</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Ref</em>' container reference.
	 * @see #setProfileRef(Profile)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_ProfileRef()
	 * @see org.teksme.model.teks.Profile#getApplicationList
	 * @model opposite="application" transient="false"
	 * @generated
	 */
	Profile getProfileRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getProfileRef <em>Profile Ref</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Ref</em>' container reference.
	 * @see #getProfileRef()
	 * @generated
	 */
	void setProfileRef(Profile value);

} // Application
