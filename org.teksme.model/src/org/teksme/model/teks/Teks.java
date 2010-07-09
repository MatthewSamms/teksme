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
 *   <li>{@link org.teksme.model.teks.Teks#getUserProfile <em>User Profile</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getPoll <em>Poll</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getSurvey <em>Survey</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getResponses <em>Responses</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getOutboundMessageList <em>Outbound Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.Teks#getInboundMessageList <em>Inbound Message</em>}</li>
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
	 * Returns the value of the '<em><b>User Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Profile</em>' containment reference.
	 * @see #setUserProfile(UserProfile)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_UserProfile()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UserProfile getUserProfile();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getUserProfile <em>User Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Profile</em>' containment reference.
	 * @see #getUserProfile()
	 * @generated
	 */
	void setUserProfile(UserProfile value);

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
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference.
	 * @see #setResponses(Response)
	 * @see org.teksme.model.teks.TeksPackage#getTeks_Responses()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Response getResponses();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Teks#getResponses <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responses</em>' containment reference.
	 * @see #getResponses()
	 * @generated
	 */
	void setResponses(Response value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutboundTextMessage[] getOutboundMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutboundTextMessage getOutboundMessage(int index);

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
	void setOutboundMessage(OutboundTextMessage[] newOutboundMessage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setOutboundMessage(int index, OutboundTextMessage element);

	/**
	 * Returns the value of the '<em><b>Outbound Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.OutboundTextMessage}.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.OutboundTextMessage#getTeksRef <em>Teks Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Message</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getTeks_OutboundMessage()
	 * @see org.teksme.model.teks.OutboundTextMessage#getTeksRef
	 * @model opposite="teksRef" containment="true" resolveProxies="true" keys="id"
	 * @generated
	 */
	EList<OutboundTextMessage> getOutboundMessageList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InboundTextMessage[] getInboundMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InboundTextMessage getInboundMessage(int index);

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
	void setInboundMessage(InboundTextMessage[] newInboundMessage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setInboundMessage(int index, InboundTextMessage element);

	/**
	 * Returns the value of the '<em><b>Inbound Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.InboundTextMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Message</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getTeks_InboundMessage()
	 * @model containment="true" resolveProxies="true" keys="id"
	 * @generated
	 */
	EList<InboundTextMessage> getInboundMessageList();

} // Teks
