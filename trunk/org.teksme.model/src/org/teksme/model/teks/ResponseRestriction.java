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
 * A representation of the model object '<em><b>Response Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#isAcceptMultipleChannels <em>Accept Multiple Channels</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#getRestrictionType <em>Restriction Type</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#getOwnedInquiry <em>Owned Inquiry</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#isBlockRepeat <em>Block Repeat</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#isModerateFirst <em>Moderate First</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction()
 * @model
 * @generated
 */
public interface ResponseRestriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Accept Multiple Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Multiple Channels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Multiple Channels</em>' attribute.
	 * @see #setAcceptMultipleChannels(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_AcceptMultipleChannels()
	 * @model
	 * @generated
	 */
	boolean isAcceptMultipleChannels();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#isAcceptMultipleChannels <em>Accept Multiple Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Multiple Channels</em>' attribute.
	 * @see #isAcceptMultipleChannels()
	 * @generated
	 */
	void setAcceptMultipleChannels(boolean value);

	/**
	 * Returns the value of the '<em><b>Restriction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.teksme.model.teks.RestrictionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Type</em>' attribute.
	 * @see org.teksme.model.teks.RestrictionKind
	 * @see #setRestrictionType(RestrictionKind)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_RestrictionType()
	 * @model
	 * @generated
	 */
	RestrictionKind getRestrictionType();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#getRestrictionType <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Type</em>' attribute.
	 * @see org.teksme.model.teks.RestrictionKind
	 * @see #getRestrictionType()
	 * @generated
	 */
	void setRestrictionType(RestrictionKind value);

	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous</em>' attribute.
	 * @see #setAnonymous(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_Anonymous()
	 * @model default="false"
	 * @generated
	 */
	boolean isAnonymous();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#isAnonymous <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous</em>' attribute.
	 * @see #isAnonymous()
	 * @generated
	 */
	void setAnonymous(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Inquiry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Inquiry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Inquiry</em>' reference.
	 * @see #setOwnedInquiry(Inquiry)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_OwnedInquiry()
	 * @model
	 * @generated
	 */
	Inquiry getOwnedInquiry();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#getOwnedInquiry <em>Owned Inquiry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Inquiry</em>' reference.
	 * @see #getOwnedInquiry()
	 * @generated
	 */
	void setOwnedInquiry(Inquiry value);

	/**
	 * Returns the value of the '<em><b>Block Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Repeat</em>' attribute.
	 * @see #setBlockRepeat(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_BlockRepeat()
	 * @model
	 * @generated
	 */
	boolean isBlockRepeat();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#isBlockRepeat <em>Block Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Repeat</em>' attribute.
	 * @see #isBlockRepeat()
	 * @generated
	 */
	void setBlockRepeat(boolean value);

	/**
	 * Returns the value of the '<em><b>Moderate First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moderate First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderate First</em>' attribute.
	 * @see #setModerateFirst(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_ModerateFirst()
	 * @model
	 * @generated
	 */
	boolean isModerateFirst();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#isModerateFirst <em>Moderate First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moderate First</em>' attribute.
	 * @see #isModerateFirst()
	 * @generated
	 */
	void setModerateFirst(boolean value);

} // ResponseRestriction
