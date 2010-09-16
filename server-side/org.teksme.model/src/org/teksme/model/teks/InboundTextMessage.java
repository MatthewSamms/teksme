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
 * A representation of the model object '<em><b>Inbound Text Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.InboundTextMessage#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.teksme.model.teks.InboundTextMessage#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.teksme.model.teks.InboundTextMessage#getOriginator <em>Originator</em>}</li>
 *   <li>{@link org.teksme.model.teks.InboundTextMessage#getSmscNumber <em>Smsc Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getInboundTextMessage()
 * @model
 * @generated
 */
public interface InboundTextMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Number</em>' attribute.
	 * @see #setPartNumber(String)
	 * @see org.teksme.model.teks.TeksPackage#getInboundTextMessage_PartNumber()
	 * @model
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.InboundTextMessage#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see org.teksme.model.teks.TeksPackage#getInboundTextMessage_MessageType()
	 * @model
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.InboundTextMessage#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

	/**
	 * Returns the value of the '<em><b>Originator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originator</em>' attribute.
	 * @see #setOriginator(String)
	 * @see org.teksme.model.teks.TeksPackage#getInboundTextMessage_Originator()
	 * @model
	 * @generated
	 */
	String getOriginator();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.InboundTextMessage#getOriginator <em>Originator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator</em>' attribute.
	 * @see #getOriginator()
	 * @generated
	 */
	void setOriginator(String value);

	/**
	 * Returns the value of the '<em><b>Smsc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smsc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smsc Number</em>' attribute.
	 * @see #setSmscNumber(String)
	 * @see org.teksme.model.teks.TeksPackage#getInboundTextMessage_SmscNumber()
	 * @model
	 * @generated
	 */
	String getSmscNumber();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.InboundTextMessage#getSmscNumber <em>Smsc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smsc Number</em>' attribute.
	 * @see #getSmscNumber()
	 * @generated
	 */
	void setSmscNumber(String value);

} // InboundTextMessage
