/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Configuration#getResponseRestrictions <em>Response Restrictions</em>}</li>
 *   <li>{@link org.teksme.model.teks.Configuration#getInquiryRef <em>Inquiry Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.Configuration#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.Configuration#getScheduleStartDate <em>Schedule Start Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.Configuration#getCommunicationChannelList <em>Communication Channel</em>}</li>
 *   <li>{@link org.teksme.model.teks.Configuration#isSuspendOnFailure <em>Suspend On Failure</em>}</li>
 *   <li>{@link org.teksme.model.teks.Configuration#getLanguageList <em>Language</em>}</li>
 *   <li>{@link org.teksme.model.teks.Configuration#isBatchResponseDelivery <em>Batch Response Delivery</em>}</li>
 *   <li>{@link org.teksme.model.teks.Configuration#isSynchronousConfirmation <em>Synchronous Confirmation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
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
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_ResponseRestrictions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ResponseRestriction getResponseRestrictions();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Configuration#getResponseRestrictions <em>Response Restrictions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Restrictions</em>' containment reference.
	 * @see #getResponseRestrictions()
	 * @generated
	 */
	void setResponseRestrictions(ResponseRestriction value);

	/**
	 * Returns the value of the '<em><b>Inquiry Ref</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.Inquiry#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inquiry Ref</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inquiry Ref</em>' container reference.
	 * @see #setInquiryRef(Inquiry)
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_InquiryRef()
	 * @see org.teksme.model.teks.Inquiry#getSettings
	 * @model opposite="settings" transient="false"
	 * @generated
	 */
	Inquiry getInquiryRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Configuration#getInquiryRef <em>Inquiry Ref</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inquiry Ref</em>' container reference.
	 * @see #getInquiryRef()
	 * @generated
	 */
	void setInquiryRef(Inquiry value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_ExpirationDate()
	 * @model
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Configuration#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

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
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_ScheduleStartDate()
	 * @model
	 * @generated
	 */
	Date getScheduleStartDate();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Configuration#getScheduleStartDate <em>Schedule Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Start Date</em>' attribute.
	 * @see #getScheduleStartDate()
	 * @generated
	 */
	void setScheduleStartDate(Date value);

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
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_CommunicationChannel()
	 * @model
	 * @generated
	 */
	EList<ChannelKind> getCommunicationChannelList();

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
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_SuspendOnFailure()
	 * @model
	 * @generated
	 */
	boolean isSuspendOnFailure();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Configuration#isSuspendOnFailure <em>Suspend On Failure</em>}' attribute.
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
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_Language()
	 * @model
	 * @generated
	 */
	EList<LanguageKind> getLanguageList();

	/**
	 * Returns the value of the '<em><b>Batch Response Delivery</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Response Delivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch Response Delivery</em>' attribute.
	 * @see #setBatchResponseDelivery(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_BatchResponseDelivery()
	 * @model default="false"
	 * @generated
	 */
	boolean isBatchResponseDelivery();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Configuration#isBatchResponseDelivery <em>Batch Response Delivery</em>}' attribute.
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
	 * @see org.teksme.model.teks.TeksPackage#getConfiguration_SynchronousConfirmation()
	 * @model default="true"
	 * @generated
	 */
	boolean isSynchronousConfirmation();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Configuration#isSynchronousConfirmation <em>Synchronous Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous Confirmation</em>' attribute.
	 * @see #isSynchronousConfirmation()
	 * @generated
	 */
	void setSynchronousConfirmation(boolean value);

} // Configuration
