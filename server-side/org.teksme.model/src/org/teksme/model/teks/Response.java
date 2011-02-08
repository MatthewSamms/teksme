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
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Response#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getResponse()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface Response extends TeksObject {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(org.teksme.model.teks.Error)
	 * @see org.teksme.model.teks.TeksPackage#getResponse_Error()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	org.teksme.model.teks.Error getError();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Response#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(org.teksme.model.teks.Error value);

} // Response
