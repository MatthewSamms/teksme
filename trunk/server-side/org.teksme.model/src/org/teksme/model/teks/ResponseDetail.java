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

import org.eclipse.emf.common.util.EList;

import org.teksme.model.TeksObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.ResponseDetail#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseDetail#getRawMessage <em>Raw Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseDetail#getSetValueList <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getResponseDetail()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface ResponseDetail extends TeksObject {
	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see org.teksme.model.teks.TeksPackage#getResponseDetail_DateTime()
	 * @model
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseDetail#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Raw Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Message</em>' containment reference.
	 * @see #setRawMessage(InboundTextMessage)
	 * @see org.teksme.model.teks.TeksPackage#getResponseDetail_RawMessage()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	InboundTextMessage getRawMessage();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseDetail#getRawMessage <em>Raw Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Message</em>' containment reference.
	 * @see #getRawMessage()
	 * @generated
	 */
	void setRawMessage(InboundTextMessage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnswerRef[] getSetValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnswerRef getSetValue(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getSetValueLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setSetValue(AnswerRef[] newSetValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setSetValue(int index, AnswerRef element);

	/**
	 * Returns the value of the '<em><b>Set Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.AnswerRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Value</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getResponseDetail_SetValue()
	 * @model containment="true" resolveProxies="true" keys="id"
	 * @generated
	 */
	EList<AnswerRef> getSetValueList();

} // ResponseDetail
