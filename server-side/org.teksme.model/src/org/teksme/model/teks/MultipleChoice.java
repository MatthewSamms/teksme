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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.MultipleChoice#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.teksme.model.teks.MultipleChoice#getAnswerList <em>Answer</em>}</li>
 *   <li>{@link org.teksme.model.teks.MultipleChoice#getAddOther <em>Add Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getMultipleChoice()
 * @model
 * @generated
 */
public interface MultipleChoice extends PollQuestion {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see org.teksme.model.teks.TeksPackage#getMultipleChoice_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.MultipleChoice#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Answer[] getAnswer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Answer getAnswer(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getAnswerLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAnswer(Answer[] newAnswer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAnswer(int index, Answer element);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.Answer}.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.Answer#getQuestionRef <em>Question Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getMultipleChoice_Answer()
	 * @see org.teksme.model.teks.Answer#getQuestionRef
	 * @model opposite="questionRef" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Answer> getAnswerList();

	/**
	 * Returns the value of the '<em><b>Add Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Other</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Other</em>' containment reference.
	 * @see #setAddOther(FreeText)
	 * @see org.teksme.model.teks.TeksPackage#getMultipleChoice_AddOther()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	FreeText getAddOther();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.MultipleChoice#getAddOther <em>Add Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Other</em>' containment reference.
	 * @see #getAddOther()
	 * @generated
	 */
	void setAddOther(FreeText value);

} // MultipleChoice
