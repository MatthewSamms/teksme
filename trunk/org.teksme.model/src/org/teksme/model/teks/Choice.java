/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Choice#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.teksme.model.teks.Choice#getNote <em>Note</em>}</li>
 *   <li>{@link org.teksme.model.teks.Choice#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.teksme.model.teks.Choice#getInquiryRef <em>Inquiry Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getChoice()
 * @model abstract="true"
 * @generated
 */
public interface Choice extends TeksElement {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see org.teksme.model.teks.TeksPackage#getChoice_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Choice#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see org.teksme.model.teks.TeksPackage#getChoice_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Choice#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getChoice_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Choice#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Inquiry Ref</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.teksme.model.teks.Inquiry#getChoiceList <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inquiry Ref</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inquiry Ref</em>' container reference.
	 * @see #setInquiryRef(Inquiry)
	 * @see org.teksme.model.teks.TeksPackage#getChoice_InquiryRef()
	 * @see org.teksme.model.teks.Inquiry#getChoiceList
	 * @model opposite="choice" transient="false"
	 * @generated
	 */
	Inquiry getInquiryRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Choice#getInquiryRef <em>Inquiry Ref</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inquiry Ref</em>' container reference.
	 * @see #getInquiryRef()
	 * @generated
	 */
	void setInquiryRef(Inquiry value);

} // Choice
