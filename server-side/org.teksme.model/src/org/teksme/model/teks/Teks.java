/**
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version 
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
 * A representation of the model object '<em><b>Teks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Teks#getOutboundMessageList <em>Outbound Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getResponse <em>Response</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getAccount <em>Account</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getSurvey <em>Survey</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getInboundMessageList <em>Inbound Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getPoll <em>Poll</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getTeks()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface Teks extends TeksObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutboundMessage[] getOutboundMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutboundMessage getOutboundMessage(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getOutboundMessageLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setOutboundMessage(OutboundMessage[] newOutboundMessage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setOutboundMessage(int index, OutboundMessage element);

	/**
	 * Returns the value of the '<em><b>Outbound Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.OutboundMessage}.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.OutboundMessage#getTeksRef <em>Teks Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Message</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getTeks_OutboundMessage()
	 * @see org.teksme.model.teks.OutboundMessage#getTeksRef
	 * @model opposite="teksRef" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OutboundMessage> getOutboundMessageList();

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Response)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_Response()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Response getResponse();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Response value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(User)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_Account()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	User getAccount();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getAccount <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' containment reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(User value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Profile)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_Profile()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Survey</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey</em>' containment reference.
	 * @see #setSurvey(Survey)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_Survey()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Survey getSurvey();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getSurvey <em>Survey</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey</em>' containment reference.
	 * @see #getSurvey()
	 * @generated
	 */
	void setSurvey(Survey value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InboundMessage[] getInboundMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InboundMessage getInboundMessage(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getInboundMessageLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setInboundMessage(InboundMessage[] newInboundMessage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setInboundMessage(int index, InboundMessage element);

	/**
	 * Returns the value of the '<em><b>Inbound Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.InboundMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Message</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getTeks_InboundMessage()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<InboundMessage> getInboundMessageList();

	/**
	 * Returns the value of the '<em><b>Poll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poll</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poll</em>' containment reference.
	 * @see #setPoll(Poll)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_Poll()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Poll getPoll();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getPoll <em>Poll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poll</em>' containment reference.
	 * @see #getPoll()
	 * @generated
	 */
	void setPoll(Poll value);

} // Teks
