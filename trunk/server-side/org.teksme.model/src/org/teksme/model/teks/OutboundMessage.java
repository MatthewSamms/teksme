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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outbound Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.OutboundMessage#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundMessage#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundMessage#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundMessage#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundMessage#getCallback <em>Callback</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundMessage#isConcatenated <em>Concatenated</em>}</li>
 *   <li>{@link org.teksme.model.teks.OutboundMessage#getTeksRef <em>Teks Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getOutboundMessage()
 * @model
 * @generated
 */
public interface OutboundMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' attribute.
	 * @see #setSchedule(Date)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundMessage_Schedule()
	 * @model extendedMetaData="kind='element' name='schedule'"
	 * @generated
	 */
	Date getSchedule();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundMessage#getSchedule <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' attribute.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Date value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(float)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundMessage_Timeout()
	 * @model extendedMetaData="kind='element' name='timeout'"
	 * @generated
	 */
	float getTimeout();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundMessage#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(float value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(int)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundMessage_Delay()
	 * @model extendedMetaData="kind='element' name='delay'"
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundMessage#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

	/**
	 * Returns the value of the '<em><b>Routing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.teksme.model.teks.SMSGatewayKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' attribute.
	 * @see org.teksme.model.teks.SMSGatewayKind
	 * @see #setRouting(SMSGatewayKind)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundMessage_Routing()
	 * @model extendedMetaData="kind='element' name='routing'"
	 * @generated
	 */
	SMSGatewayKind getRouting();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundMessage#getRouting <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' attribute.
	 * @see org.teksme.model.teks.SMSGatewayKind
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(SMSGatewayKind value);

	/**
	 * Returns the value of the '<em><b>Callback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback</em>' attribute.
	 * @see #setCallback(String)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundMessage_Callback()
	 * @model extendedMetaData="kind='element' name='callback'"
	 * @generated
	 */
	String getCallback();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundMessage#getCallback <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback</em>' attribute.
	 * @see #getCallback()
	 * @generated
	 */
	void setCallback(String value);

	/**
	 * Returns the value of the '<em><b>Concatenated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concatenated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concatenated</em>' attribute.
	 * @see #setConcatenated(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundMessage_Concatenated()
	 * @model extendedMetaData="kind='element' name='concatenated'"
	 * @generated
	 */
	boolean isConcatenated();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundMessage#isConcatenated <em>Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concatenated</em>' attribute.
	 * @see #isConcatenated()
	 * @generated
	 */
	void setConcatenated(boolean value);

	/**
	 * Returns the value of the '<em><b>Teks Ref</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.Teks#getOutboundMessageList <em>Outbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teks Ref</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teks Ref</em>' container reference.
	 * @see #setTeksRef(Teks)
	 * @see org.teksme.model.teks.TeksPackage#getOutboundMessage_TeksRef()
	 * @see org.teksme.model.teks.Teks#getOutboundMessageList
	 * @model opposite="outboundMessage" transient="false"
	 * @generated
	 */
	Teks getTeksRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.OutboundMessage#getTeksRef <em>Teks Ref</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teks Ref</em>' container reference.
	 * @see #getTeksRef()
	 * @generated
	 */
	void setTeksRef(Teks value);

} // OutboundMessage
