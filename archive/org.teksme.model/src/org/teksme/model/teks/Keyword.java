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
 * A representation of the model object '<em><b>Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Keyword#getKey <em>Key</em>}</li>
 *   <li>{@link org.teksme.model.teks.Keyword#isAutoKeyword <em>Auto Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getKeyword()
 * @model
 * @generated
 */
public interface Keyword extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.teksme.model.teks.TeksPackage#getKeyword_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Keyword#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

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
	 * @see org.teksme.model.teks.TeksPackage#getKeyword_AutoKeyword()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoKeyword();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Keyword#isAutoKeyword <em>Auto Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Keyword</em>' attribute.
	 * @see #isAutoKeyword()
	 * @generated
	 */
	void setAutoKeyword(boolean value);

} // Keyword
