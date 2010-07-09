/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secure Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.SecureText#getHashAlgorithm <em>Hash Algorithm</em>}</li>
 *   <li>{@link org.teksme.model.teks.SecureText#getHashEncoding <em>Hash Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getSecureText()
 * @model
 * @generated
 */
public interface SecureText extends PlainText {
	/**
	 * Returns the value of the '<em><b>Hash Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #setHashAlgorithm(String)
	 * @see org.teksme.model.teks.TeksPackage#getSecureText_HashAlgorithm()
	 * @model
	 * @generated
	 */
	String getHashAlgorithm();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.SecureText#getHashAlgorithm <em>Hash Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Algorithm</em>' attribute.
	 * @see #getHashAlgorithm()
	 * @generated
	 */
	void setHashAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Hash Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Encoding</em>' attribute.
	 * @see #setHashEncoding(String)
	 * @see org.teksme.model.teks.TeksPackage#getSecureText_HashEncoding()
	 * @model
	 * @generated
	 */
	String getHashEncoding();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.SecureText#getHashEncoding <em>Hash Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Encoding</em>' attribute.
	 * @see #getHashEncoding()
	 * @generated
	 */
	void setHashEncoding(String value);

} // SecureText
