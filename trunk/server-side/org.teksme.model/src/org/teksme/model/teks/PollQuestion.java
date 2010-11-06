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
 * A representation of the model object '<em><b>Poll Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.PollQuestion#getNote <em>Note</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollQuestion#isRequired <em>Required</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollQuestion#getPollRef <em>Poll Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getPollQuestion()
 * @model abstract="true"
 * @extends TeksObject
 * @generated
 */
public interface PollQuestion extends TeksObject {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see org.teksme.model.teks.TeksPackage#getPollQuestion_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollQuestion#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getPollQuestion_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollQuestion#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Poll Ref</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.Poll#getQuestionList <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poll Ref</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poll Ref</em>' container reference.
	 * @see #setPollRef(Poll)
	 * @see org.teksme.model.teks.TeksPackage#getPollQuestion_PollRef()
	 * @see org.teksme.model.teks.Poll#getQuestionList
	 * @model opposite="question" transient="false"
	 * @generated
	 */
	Poll getPollRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollQuestion#getPollRef <em>Poll Ref</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poll Ref</em>' container reference.
	 * @see #getPollRef()
	 * @generated
	 */
	void setPollRef(Poll value);

} // PollQuestion
