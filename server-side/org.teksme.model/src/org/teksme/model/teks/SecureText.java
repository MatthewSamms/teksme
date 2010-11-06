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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secure Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.SecureText#getHashAlgorithm <em>Hash Algorithm</em>}</li>
 *   <li>{@link org.teksme.model.teks.SecureText#getHashEncoding <em>Hash Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getSecureText()
 * @model
 * @generated
 */
public interface SecureText extends PlainText {
	/**
	 * Returns the value of the '<em><b>Hash Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #setHashAlgorithm(String)
	 * @see org.teksme.model.teks.TeksPackage#getSecureText_HashAlgorithm()
	 * @model
	 * @generated
	 */
	String getHashAlgorithm();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.SecureText#getHashAlgorithm <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #getHashAlgorithm()
	 * @generated
	 */
	void setHashAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Hash Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Encoding</em>' attribute.
	 * @see #setHashEncoding(String)
	 * @see org.teksme.model.teks.TeksPackage#getSecureText_HashEncoding()
	 * @model
	 * @generated
	 */
	String getHashEncoding();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.SecureText#getHashEncoding <em>Hash Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Encoding</em>' attribute.
	 * @see #getHashEncoding()
	 * @generated
	 */
	void setHashEncoding(String value);

} // SecureText
