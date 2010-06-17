/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Teks#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getCampaign <em>Campaign</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getSList <em>S</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getInMsgList <em>In Msg</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getAccountID <em>Account ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getTeks()
 * @model
 * @generated
 */
public interface Teks extends EObject {
	/**
	 * Returns the value of the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Id</em>' attribute.
	 * @see #setAppId(String)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_AppId()
	 * @model
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>Campaign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaign</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaign</em>' containment reference.
	 * @see #setCampaign(Campaign)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_Campaign()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Campaign getCampaign();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getCampaign <em>Campaign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Campaign</em>' containment reference.
	 * @see #getCampaign()
	 * @generated
	 */
	void setCampaign(Campaign value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutboundMessage[] getS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutboundMessage getS(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getSLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setS(OutboundMessage[] newS);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setS(int index, OutboundMessage element);

	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.OutboundMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getTeks_S()
	 * @model containment="true" resolveProxies="true" keys="id"
	 * @generated
	 */
	EList<OutboundMessage> getSList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InboundMessage[] getInMsg();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InboundMessage getInMsg(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getInMsgLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setInMsg(InboundMessage[] newInMsg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setInMsg(int index, InboundMessage element);

	/**
	 * Returns the value of the '<em><b>In Msg</b></em>' reference list.
	 * The list contents are of type {@link org.teksme.model.teks.InboundMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Msg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Msg</em>' reference list.
	 * @see org.teksme.model.teks.TeksPackage#getTeks_InMsg()
	 * @model keys="id"
	 * @generated
	 */
	EList<InboundMessage> getInMsgList();

	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(String)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_AccountID()
	 * @model
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

} // Teks
