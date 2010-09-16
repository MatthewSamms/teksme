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
 * A representation of the model object '<em><b>Poll Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.PollSettings#getCloseDate <em>Close Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#getScheduleStartDate <em>Schedule Start Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#isSuspendOnFailure <em>Suspend On Failure</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#getLanguageList <em>Language</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#isBatchResponseDelivery <em>Batch Response Delivery</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#isSynchronousConfirmation <em>Synchronous Confirmation</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#getReplyMessage <em>Reply Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#getAdvertiseIt <em>Advertise It</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#getFolderID <em>Folder ID</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#isSharing <em>Sharing</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#getResponseRestrictions <em>Response Restrictions</em>}</li>
 *   <li>{@link org.teksme.model.teks.PollSettings#getShortNumber <em>Short Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getPollSettings()
 * @model
 * @generated
 */
public interface PollSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Date</em>' attribute.
	 * @see #setCloseDate(Date)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_CloseDate()
	 * @model
	 * @generated
	 */
	Date getCloseDate();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#getCloseDate <em>Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Date</em>' attribute.
	 * @see #getCloseDate()
	 * @generated
	 */
	void setCloseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Schedule Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Start Date</em>' attribute.
	 * @see #setScheduleStartDate(Date)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_ScheduleStartDate()
	 * @model
	 * @generated
	 */
	Date getScheduleStartDate();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#getScheduleStartDate <em>Schedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Start Date</em>' attribute.
	 * @see #getScheduleStartDate()
	 * @generated
	 */
	void setScheduleStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Suspend On Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspend On Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspend On Failure</em>' attribute.
	 * @see #setSuspendOnFailure(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_SuspendOnFailure()
	 * @model
	 * @generated
	 */
	boolean isSuspendOnFailure();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#isSuspendOnFailure <em>Suspend On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspend On Failure</em>' attribute.
	 * @see #isSuspendOnFailure()
	 * @generated
	 */
	void setSuspendOnFailure(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanguageKind[] getLanguage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanguageKind getLanguage(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getLanguageLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setLanguage(LanguageKind[] newLanguage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setLanguage(int index, LanguageKind element);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link org.teksme.model.teks.LanguageKind}.
	 * The literals are from the enumeration {@link org.teksme.model.teks.LanguageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see org.teksme.model.teks.LanguageKind
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_Language()
	 * @model
	 * @generated
	 */
	EList<LanguageKind> getLanguageList();

	/**
	 * Returns the value of the '<em><b>Batch Response Delivery</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Response Delivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch Response Delivery</em>' attribute.
	 * @see #setBatchResponseDelivery(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_BatchResponseDelivery()
	 * @model default="true"
	 * @generated
	 */
	boolean isBatchResponseDelivery();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#isBatchResponseDelivery <em>Batch Response Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Response Delivery</em>' attribute.
	 * @see #isBatchResponseDelivery()
	 * @generated
	 */
	void setBatchResponseDelivery(boolean value);

	/**
	 * Returns the value of the '<em><b>Synchronous Confirmation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Confirmation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Confirmation</em>' attribute.
	 * @see #setSynchronousConfirmation(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_SynchronousConfirmation()
	 * @model default="true"
	 * @generated
	 */
	boolean isSynchronousConfirmation();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#isSynchronousConfirmation <em>Synchronous Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous Confirmation</em>' attribute.
	 * @see #isSynchronousConfirmation()
	 * @generated
	 */
	void setSynchronousConfirmation(boolean value);

	/**
	 * Returns the value of the '<em><b>Reply Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Message</em>' containment reference.
	 * @see #setReplyMessage(ReplyMessage)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_ReplyMessage()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ReplyMessage getReplyMessage();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#getReplyMessage <em>Reply Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply Message</em>' containment reference.
	 * @see #getReplyMessage()
	 * @generated
	 */
	void setReplyMessage(ReplyMessage value);

	/**
	 * Returns the value of the '<em><b>Advertise It</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advertise It</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertise It</em>' containment reference.
	 * @see #setAdvertiseIt(OutboundTextMessage)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_AdvertiseIt()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OutboundTextMessage getAdvertiseIt();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#getAdvertiseIt <em>Advertise It</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advertise It</em>' containment reference.
	 * @see #getAdvertiseIt()
	 * @generated
	 */
	void setAdvertiseIt(OutboundTextMessage value);

	/**
	 * Returns the value of the '<em><b>Folder ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder ID</em>' attribute.
	 * @see #setFolderID(String)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_FolderID()
	 * @model
	 * @generated
	 */
	String getFolderID();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#getFolderID <em>Folder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder ID</em>' attribute.
	 * @see #getFolderID()
	 * @generated
	 */
	void setFolderID(String value);

	/**
	 * Returns the value of the '<em><b>Sharing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sharing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharing</em>' attribute.
	 * @see #setSharing(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_Sharing()
	 * @model
	 * @generated
	 */
	boolean isSharing();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#isSharing <em>Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharing</em>' attribute.
	 * @see #isSharing()
	 * @generated
	 */
	void setSharing(boolean value);

	/**
	 * Returns the value of the '<em><b>Response Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Restrictions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Restrictions</em>' containment reference.
	 * @see #setResponseRestrictions(ResponseRestriction)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_ResponseRestrictions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ResponseRestriction getResponseRestrictions();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#getResponseRestrictions <em>Response Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Restrictions</em>' containment reference.
	 * @see #getResponseRestrictions()
	 * @generated
	 */
	void setResponseRestrictions(ResponseRestriction value);

	/**
	 * Returns the value of the '<em><b>Short Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Number</em>' attribute.
	 * @see #setShortNumber(int)
	 * @see org.teksme.model.teks.TeksPackage#getPollSettings_ShortNumber()
	 * @model
	 * @generated
	 */
	int getShortNumber();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PollSettings#getShortNumber <em>Short Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Number</em>' attribute.
	 * @see #getShortNumber()
	 * @generated
	 */
	void setShortNumber(int value);

} // PollSettings
