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
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Answer#getText <em>Text</em>}</li>
 *   <li>{@link org.teksme.model.teks.Answer#isId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.Answer#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.teksme.model.teks.Answer#isSelected <em>Selected</em>}</li>
 *   <li>{@link org.teksme.model.teks.Answer#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.teksme.model.teks.Answer#getQuestionRef <em>Question Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getAnswer()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface Answer extends TeksObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.teksme.model.teks.TeksPackage#getAnswer_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Answer#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getAnswer_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	boolean isId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Answer#isId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isId()
	 * @generated
	 */
	void setId(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.teksme.model.teks.TeksPackage#getAnswer_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Answer#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getAnswer_Selected()
	 * @model default="false"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Answer#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference.
	 * @see #setKeyword(Keyword)
	 * @see org.teksme.model.teks.TeksPackage#getAnswer_Keyword()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Keyword getKeyword();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Answer#getKeyword <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' containment reference.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(Keyword value);

	/**
	 * Returns the value of the '<em><b>Question Ref</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.MultipleChoice#getAnswerList <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Ref</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Ref</em>' container reference.
	 * @see #setQuestionRef(MultipleChoice)
	 * @see org.teksme.model.teks.TeksPackage#getAnswer_QuestionRef()
	 * @see org.teksme.model.teks.MultipleChoice#getAnswerList
	 * @model opposite="answer" transient="false"
	 * @generated
	 */
	MultipleChoice getQuestionRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Answer#getQuestionRef <em>Question Ref</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Ref</em>' container reference.
	 * @see #getQuestionRef()
	 * @generated
	 */
	void setQuestionRef(MultipleChoice value);

} // Answer
