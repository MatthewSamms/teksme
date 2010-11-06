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
 * A representation of the model object '<em><b>Shout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Shout#getThis <em>This</em>}</li>
 *   <li>{@link org.teksme.model.teks.Shout#getVoice <em>Voice</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getShout()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface Shout extends TeksObject {
	/**
	 * Returns the value of the '<em><b>This</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' attribute.
	 * @see #setThis(String)
	 * @see org.teksme.model.teks.TeksPackage#getShout_This()
	 * @model
	 * @generated
	 */
	String getThis();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Shout#getThis <em>This</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' attribute.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(String value);

	/**
	 * Returns the value of the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voice</em>' attribute.
	 * @see #setVoice(String)
	 * @see org.teksme.model.teks.TeksPackage#getShout_Voice()
	 * @model
	 * @generated
	 */
	String getVoice();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Shout#getVoice <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voice</em>' attribute.
	 * @see #getVoice()
	 * @generated
	 */
	void setVoice(String value);

} // Shout
