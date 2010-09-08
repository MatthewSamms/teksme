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
 * A representation of the literals of the enumeration '<em><b>Stop Command Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage#getStopCommandKind()
 * @model
 * @generated
 */
public enum StopCommandKind implements Enumerator {
	/**
	 * The '<em><b>STOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_VALUE
	 * @generated
	 * @ordered
	 */
	STOP(0, "STOP", "STOP"),

	/**
	 * The '<em><b>END</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_VALUE
	 * @generated
	 * @ordered
	 */
	END(1, "END", "END"),

	/**
	 * The '<em><b>CANCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL(2, "CANCEL", "CANCEL"),

	/**
	 * The '<em><b>UNSUBSCRIBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUBSCRIBE(3, "UNSUBSCRIBE", "UNSUBSCRIBE"),

	/**
	 * The '<em><b>QUIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUIT_VALUE
	 * @generated
	 * @ordered
	 */
	QUIT(4, "QUIT", "QUIT"),

	/**
	 * The '<em><b>STOP STOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_STOP(5, "STOP_STOP", "STOP STOP"),

	/**
	 * The '<em><b>STOP ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_ALL(6, "STOP_ALL", "STOP ALL");

	/**
	 * The '<em><b>STOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STOP_VALUE = 0;

	/**
	 * The '<em><b>END</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>END</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_VALUE = 1;

	/**
	 * The '<em><b>CANCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_VALUE = 2;

	/**
	 * The '<em><b>UNSUBSCRIBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSUBSCRIBE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUBSCRIBE_VALUE = 3;

	/**
	 * The '<em><b>QUIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUIT_VALUE = 4;

	/**
	 * The '<em><b>STOP STOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOP STOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP_STOP
	 * @model literal="STOP STOP"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_STOP_VALUE = 5;

	/**
	 * The '<em><b>STOP ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOP ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP_ALL
	 * @model literal="STOP ALL"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_ALL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Stop Command Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StopCommandKind[] VALUES_ARRAY = new StopCommandKind[] {
			STOP, END, CANCEL, UNSUBSCRIBE, QUIT, STOP_STOP, STOP_ALL, };

	/**
	 * A public read-only list of all the '<em><b>Stop Command Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StopCommandKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stop Command Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopCommandKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StopCommandKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stop Command Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopCommandKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StopCommandKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stop Command Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopCommandKind get(int value) {
		switch (value) {
		case STOP_VALUE:
			return STOP;
		case END_VALUE:
			return END;
		case CANCEL_VALUE:
			return CANCEL;
		case UNSUBSCRIBE_VALUE:
			return UNSUBSCRIBE;
		case QUIT_VALUE:
			return QUIT;
		case STOP_STOP_VALUE:
			return STOP_STOP;
		case STOP_ALL_VALUE:
			return STOP_ALL;
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
	private StopCommandKind(int value, String name, String literal) {
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

} //StopCommandKind
