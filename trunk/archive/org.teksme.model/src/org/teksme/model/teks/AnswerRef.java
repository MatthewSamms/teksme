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
 * A representation of the model object '<em><b>Answer Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.AnswerRef#getChoiceRef <em>Choice Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.AnswerRef#getAnswerRef <em>Answer Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.AnswerRef#getValue <em>Value</em>}</li>
 *   <li>{@link org.teksme.model.teks.AnswerRef#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getAnswerRef()
 * @model
 * @generated
 */
public interface AnswerRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Choice Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice Ref</em>' reference.
	 * @see #setChoiceRef(PollQuestion)
	 * @see org.teksme.model.teks.TeksPackage#getAnswerRef_ChoiceRef()
	 * @model
	 * @generated
	 */
	PollQuestion getChoiceRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.AnswerRef#getChoiceRef <em>Choice Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice Ref</em>' reference.
	 * @see #getChoiceRef()
	 * @generated
	 */
	void setChoiceRef(PollQuestion value);

	/**
	 * Returns the value of the '<em><b>Answer Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Ref</em>' reference.
	 * @see #setAnswerRef(Answer)
	 * @see org.teksme.model.teks.TeksPackage#getAnswerRef_AnswerRef()
	 * @model
	 * @generated
	 */
	Answer getAnswerRef();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.AnswerRef#getAnswerRef <em>Answer Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Ref</em>' reference.
	 * @see #getAnswerRef()
	 * @generated
	 */
	void setAnswerRef(Answer value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.teksme.model.teks.TeksPackage#getAnswerRef_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.AnswerRef#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see org.teksme.model.teks.TeksPackage#getAnswerRef_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.AnswerRef#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // AnswerRef
