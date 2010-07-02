/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Campaign#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.teksme.model.teks.Campaign#getResponses <em>Responses</em>}</li>
 *   <li>{@link org.teksme.model.teks.Campaign#getConfirmations <em>Confirmations</em>}</li>
 *   <li>{@link org.teksme.model.teks.Campaign#getId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.Campaign#getAdvertiseIt <em>Advertise It</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getCampaign()
 * @model
 * @generated
 */
public interface Campaign extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(Inquiry)
	 * @see org.teksme.model.teks.TeksPackage#getCampaign_Instance()
	 * @model containment="true" resolveProxies="true" keys="title"
	 * @generated
	 */
	Inquiry getInstance();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Campaign#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Inquiry value);

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
	 * @see org.teksme.model.teks.TeksPackage#getCampaign_Responses()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Response getResponses();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Campaign#getResponses <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responses</em>' containment reference.
	 * @see #getResponses()
	 * @generated
	 */
	void setResponses(Response value);

	/**
	 * Returns the value of the '<em><b>Confirmations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmations</em>' containment reference.
	 * @see #setConfirmations(Confirmation)
	 * @see org.teksme.model.teks.TeksPackage#getCampaign_Confirmations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Confirmation getConfirmations();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Campaign#getConfirmations <em>Confirmations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmations</em>' containment reference.
	 * @see #getConfirmations()
	 * @generated
	 */
	void setConfirmations(Confirmation value);

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
	 * @see org.teksme.model.teks.TeksPackage#getCampaign_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Campaign#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.teksme.model.teks.TeksPackage#getCampaign_AdvertiseIt()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OutboundTextMessage getAdvertiseIt();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Campaign#getAdvertiseIt <em>Advertise It</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advertise It</em>' containment reference.
	 * @see #getAdvertiseIt()
	 * @generated
	 */
	void setAdvertiseIt(OutboundTextMessage value);

} // Campaign
