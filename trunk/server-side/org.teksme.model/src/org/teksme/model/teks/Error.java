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

import org.teksme.model.TeksObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Error#getStatus <em>Status</em>}</li>
 *   <li>{@link org.teksme.model.teks.Error#getMessage <em>Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.Error#getCode <em>Code</em>}</li>
 *   <li>{@link org.teksme.model.teks.Error#getMoreInfo <em>More Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getError()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface Error extends TeksObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(int)
	 * @see org.teksme.model.teks.TeksPackage#getError_Status()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	int getStatus();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Error#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(int value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.teksme.model.teks.TeksPackage#getError_Message()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Error#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see org.teksme.model.teks.TeksPackage#getError_Code()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='code'"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Error#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>More Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>More Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>More Info</em>' attribute.
	 * @see #setMoreInfo(String)
	 * @see org.teksme.model.teks.TeksPackage#getError_MoreInfo()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='moreInfo'"
	 * @generated
	 */
	String getMoreInfo();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Error#getMoreInfo <em>More Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>More Info</em>' attribute.
	 * @see #getMoreInfo()
	 * @generated
	 */
	void setMoreInfo(String value);

} // Error
