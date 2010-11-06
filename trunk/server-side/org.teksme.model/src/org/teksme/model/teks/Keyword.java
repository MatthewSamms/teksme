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
 * A representation of the model object '<em><b>Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Keyword#getKey <em>Key</em>}</li>
 *   <li>{@link org.teksme.model.teks.Keyword#isAutoKeyword <em>Auto Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getKeyword()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface Keyword extends TeksObject {
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
	 * @see org.teksme.model.teks.TeksPackage#getKeyword_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Keyword#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Auto Keyword</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Keyword</em>' attribute.
	 * @see #setAutoKeyword(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getKeyword_AutoKeyword()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoKeyword();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Keyword#isAutoKeyword <em>Auto Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Keyword</em>' attribute.
	 * @see #isAutoKeyword()
	 * @generated
	 */
	void setAutoKeyword(boolean value);

} // Keyword
