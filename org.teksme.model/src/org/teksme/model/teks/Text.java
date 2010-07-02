/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Text#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.teksme.model.teks.Text#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.teksme.model.teks.Text#isAutoKeyword <em>Auto Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getText()
 * @model abstract="true"
 * @generated
 */
public interface Text extends Choice {
	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference.
	 * @see #setAnswer(Answer)
	 * @see org.teksme.model.teks.TeksPackage#getText_Answer()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Answer getAnswer();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Text#getAnswer <em>Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' containment reference.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(Answer value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see org.teksme.model.teks.TeksPackage#getText_Keyword()
	 * @model
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Text#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Auto Keyword</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Keyword</em>' attribute.
	 * @see #setAutoKeyword(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getText_AutoKeyword()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoKeyword();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Text#isAutoKeyword <em>Auto Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Keyword</em>' attribute.
	 * @see #isAutoKeyword()
	 * @generated
	 */
	void setAutoKeyword(boolean value);

} // Text
