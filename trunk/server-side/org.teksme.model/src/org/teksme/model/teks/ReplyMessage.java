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

import org.teksme.model.TeksObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.ReplyMessage#getConfirmationList <em>Confirmation</em>}</li>
 *   <li>{@link org.teksme.model.teks.ReplyMessage#isDefaultMessage <em>Default Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.ReplyMessage#getCustomMessage <em>Custom Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getReplyMessage()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface ReplyMessage extends TeksObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReplyMessage[] getConfirmation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReplyMessage getConfirmation(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getConfirmationLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setConfirmation(ReplyMessage[] newConfirmation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setConfirmation(int index, ReplyMessage element);

	/**
	 * Returns the value of the '<em><b>Confirmation</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.ReplyMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmation</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getReplyMessage_Confirmation()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ReplyMessage> getConfirmationList();

	/**
	 * Returns the value of the '<em><b>Default Message</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Message</em>' attribute.
	 * @see #setDefaultMessage(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getReplyMessage_DefaultMessage()
	 * @model default="false"
	 * @generated
	 */
	boolean isDefaultMessage();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ReplyMessage#isDefaultMessage <em>Default Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Message</em>' attribute.
	 * @see #isDefaultMessage()
	 * @generated
	 */
	void setDefaultMessage(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Message</em>' containment reference.
	 * @see #setCustomMessage(OutboundMessage)
	 * @see org.teksme.model.teks.TeksPackage#getReplyMessage_CustomMessage()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OutboundMessage getCustomMessage();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ReplyMessage#getCustomMessage <em>Custom Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Message</em>' containment reference.
	 * @see #getCustomMessage()
	 * @generated
	 */
	void setCustomMessage(OutboundMessage value);

} // ReplyMessage
