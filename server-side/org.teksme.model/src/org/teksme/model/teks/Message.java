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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Message#getId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getDate <em>Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getFrom <em>From</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getToList <em>To</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getShout <em>Shout</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#isStopOnError <em>Stop On Error</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link org.teksme.model.teks.Message#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getMessage()
 * @model abstract="true"
 * @extends TeksObject
 * @generated
 */
public interface Message extends TeksObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Id()
	 * @model id="true" extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Date()
	 * @model extendedMetaData="kind='element' name='date'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Routing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.teksme.model.teks.SMSGatewayKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' attribute.
	 * @see org.teksme.model.teks.SMSGatewayKind
	 * @see #setRouting(SMSGatewayKind)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Routing()
	 * @model extendedMetaData="kind='element' name='routing'"
	 * @generated
	 */
	SMSGatewayKind getRouting();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getRouting
	 * <em>Routing</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Routing</em>' attribute.
	 * @see org.teksme.model.teks.SMSGatewayKind
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(SMSGatewayKind value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_From()
	 * @model required="true" extendedMetaData="kind='element' name='from'"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference.
	 * @see #setChannels(Channel)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Channels()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Channel getChannels();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getChannels <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Channels</em>' containment reference.
	 * @see #getChannels()
	 * @generated
	 */
	void setChannels(Channel value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_To()
	 * @model required="true" extendedMetaData="kind='element' name='to'"
	 * @generated
	 */
	String[] getTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String getTo(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getToLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTo(String[] newTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTo(int index, String element);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute list.
	 * @see org.teksme.model.teks.TeksPackage#getMessage_To()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='to'"
	 * @generated
	 */
	EList<String> getToList();

	/**
	 * Returns the value of the '<em><b>Shout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shout</em>' containment reference.
	 * @see #setShout(Shout)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Shout()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Shout getShout();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getShout <em>Shout</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Shout</em>' containment reference.
	 * @see #getShout()
	 * @generated
	 */
	void setShout(Shout value);

	/**
	 * Returns the value of the '<em><b>Stop On Error</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop On Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stop On Error</em>' attribute.
	 * @see #setStopOnError(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_StopOnError()
	 * @model extendedMetaData="kind='element' name='stopOnError'"
	 * @generated
	 */
	boolean isStopOnError();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#isStopOnError <em>Stop On Error</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Stop On Error</em>' attribute.
	 * @see #isStopOnError()
	 * @generated
	 */
	void setStopOnError(boolean value);

	/**
	 * Returns the value of the '<em><b>Attempts</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attempts</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attempts</em>' attribute.
	 * @see #setAttempts(int)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Attempts()
	 * @model extendedMetaData="kind='element' name='attempts'"
	 * @generated
	 */
	int getAttempts();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getAttempts
	 * <em>Attempts</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Attempts</em>' attribute.
	 * @see #getAttempts()
	 * @generated
	 */
	void setAttempts(int value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.teksme.model.teks.TeksPackage#getMessage_Encoding()
	 * @model extendedMetaData="kind='element' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Message#getEncoding
	 * <em>Encoding</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

} // Message
