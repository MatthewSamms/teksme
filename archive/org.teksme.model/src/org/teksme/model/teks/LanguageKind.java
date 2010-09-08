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
 * A representation of the literals of the enumeration '<em><b>Language Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage#getLanguageKind()
 * @model
 * @generated
 */
public enum LanguageKind implements Enumerator {
	/**
	 * The '<em><b>En US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_US_VALUE
	 * @generated
	 * @ordered
	 */
	EN_US(0, "en_US", "English"),

	/**
	 * The '<em><b>Pt BR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT_BR_VALUE
	 * @generated
	 * @ordered
	 */
	PT_BR(1, "pt_BR", "Portuguese");

	/**
	 * The '<em><b>En US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>En US</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EN_US
	 * @model name="en_US" literal="English"
	 * @generated
	 * @ordered
	 */
	public static final int EN_US_VALUE = 0;

	/**
	 * The '<em><b>Pt BR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pt BR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PT_BR
	 * @model name="pt_BR" literal="Portuguese"
	 * @generated
	 * @ordered
	 */
	public static final int PT_BR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Language Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LanguageKind[] VALUES_ARRAY = new LanguageKind[] {
			EN_US, PT_BR, };

	/**
	 * A public read-only list of all the '<em><b>Language Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LanguageKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Language Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageKind get(int value) {
		switch (value) {
		case EN_US_VALUE:
			return EN_US;
		case PT_BR_VALUE:
			return PT_BR;
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
	private LanguageKind(int value, String name, String literal) {
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

} //LanguageKind
