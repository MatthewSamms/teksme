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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Report#isHideResults <em>Hide Results</em>}</li>
 *   <li>{@link org.teksme.model.teks.Report#isPercentageOnly <em>Percentage Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject {
	/**
	 * Returns the value of the '<em><b>Hide Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Results</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Results</em>' attribute.
	 * @see #setHideResults(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getReport_HideResults()
	 * @model
	 * @generated
	 */
	boolean isHideResults();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Report#isHideResults <em>Hide Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Results</em>' attribute.
	 * @see #isHideResults()
	 * @generated
	 */
	void setHideResults(boolean value);

	/**
	 * Returns the value of the '<em><b>Percentage Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Only</em>' attribute.
	 * @see #setPercentageOnly(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getReport_PercentageOnly()
	 * @model
	 * @generated
	 */
	boolean isPercentageOnly();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Report#isPercentageOnly <em>Percentage Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Only</em>' attribute.
	 * @see #isPercentageOnly()
	 * @generated
	 */
	void setPercentageOnly(boolean value);

} // Report
