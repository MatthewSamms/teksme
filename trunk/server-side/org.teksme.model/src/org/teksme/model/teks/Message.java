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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Message#getId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getCommunicationChannelList <em>Communication Channel</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getMessage <em>Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getSmsGateway <em>Sms Gateway</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getMessage()
 * @model abstract="true"
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChannelKind[] getCommunicationChannel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChannelKind getCommunicationChannel(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getCommunicationChannelLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCommunicationChannel(ChannelKind[] newCommunicationChannel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCommunicationChannel(int index, ChannelKind element);

	/**
	 * Returns the value of the '<em><b>Communication Channel</b></em>' attribute list.
	 * The list contents are of type {@link org.teksme.model.teks.ChannelKind}.
	 * The literals are from the enumeration {@link org.teksme.model.teks.ChannelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Channel</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Channel</em>' attribute list.
	 * @see org.teksme.model.teks.ChannelKind
	 * @see org.teksme.model.teks.TeksPackage#getMessage_CommunicationChannel()
	 * @model
	 * @generated
	 */
	EList<ChannelKind> getCommunicationChannelList();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(TextMessage)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Message()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	TextMessage getMessage();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(TextMessage value);

	/**
	 * Returns the value of the '<em><b>Sms Gateway</b></em>' attribute.
	 * The literals are from the enumeration {@link org.teksme.model.teks.SMSGatewayKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sms Gateway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sms Gateway</em>' attribute.
	 * @see org.teksme.model.teks.SMSGatewayKind
	 * @see #setSmsGateway(SMSGatewayKind)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_SmsGateway()
	 * @model
	 * @generated
	 */
	SMSGatewayKind getSmsGateway();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getSmsGateway <em>Sms Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sms Gateway</em>' attribute.
	 * @see org.teksme.model.teks.SMSGatewayKind
	 * @see #getSmsGateway()
	 * @generated
	 */
	void setSmsGateway(SMSGatewayKind value);

} // Message
