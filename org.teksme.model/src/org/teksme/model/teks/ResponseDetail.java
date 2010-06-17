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
 * @generated
 */
public interface ResponseDetail extends EObject {
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
	 * @see #setRawMessage(InboundMessage)
	 * @see org.teksme.model.teks.TeksPackage#getResponseDetail_RawMessage()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	InboundMessage getRawMessage();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseDetail#getRawMessage <em>Raw Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Message</em>' containment reference.
	 * @see #getRawMessage()
	 * @generated
	 */
	void setRawMessage(InboundMessage value);

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
