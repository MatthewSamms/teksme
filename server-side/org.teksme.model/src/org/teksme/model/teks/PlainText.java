/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.PlainText#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.teksme.model.teks.PlainText#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getPlainText()
 * @model abstract="true"
 * @generated
 */
public interface PlainText extends PollQuestion {
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
	 * @see org.teksme.model.teks.TeksPackage#getPlainText_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PlainText#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference.
	 * @see #setKeyword(Keyword)
	 * @see org.teksme.model.teks.TeksPackage#getPlainText_Keyword()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Keyword getKeyword();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.PlainText#getKeyword <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' containment reference.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(Keyword value);

} // PlainText