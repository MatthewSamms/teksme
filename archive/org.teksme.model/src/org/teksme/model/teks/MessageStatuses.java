/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Statuses</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage#getMessageStatuses()
 * @model
 * @generated
 */
public enum MessageStatuses implements Enumerator {
	/**
	 * The '<em><b>UNSENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSENT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSENT(0, "UNSENT", "UNSENT"),

	/**
	 * The '<em><b>SENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENT_VALUE
	 * @generated
	 * @ordered
	 */
	SENT(1, "SENT", "SENT"),

	/**
	 * The '<em><b>FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(2, "FAILED", "FAILED");

	/**
	 * The '<em><b>UNSENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSENT_VALUE = 0;

	/**
	 * The '<em><b>SENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENT_VALUE = 1;

	/**
	 * The '<em><b>FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAILED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Message Statuses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageStatuses[] VALUES_ARRAY = new MessageStatuses[] {
			UNSENT, SENT, FAILED, };

	/**
	 * A public read-only list of all the '<em><b>Message Statuses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageStatuses> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Statuses</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageStatuses get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageStatuses result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Statuses</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageStatuses getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageStatuses result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Statuses</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageStatuses get(int value) {
		switch (value) {
		case UNSENT_VALUE:
			return UNSENT;
		case SENT_VALUE:
			return SENT;
		case FAILED_VALUE:
			return FAILED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageStatuses(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //MessageStatuses
