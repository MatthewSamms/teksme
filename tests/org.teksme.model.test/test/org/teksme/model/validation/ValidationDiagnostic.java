package org.teksme.model.validation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ValidationDiagnostic {

	OK(0x0, "OK", "OK"),

	ERROR(0x1, "ERROR", "ERROR"),

	INFO(0x2, "imap", "imap");

	private static final int OK_VALUE = 0x0;

	private static final int ERROR_VALUE = 0x1;

	private static final int INFO_VALUE = 0x2;

	private final int value;

	private final String name;

	private final String literal;

	private ValidationDiagnostic(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public String getLiteral() {
		return literal;
	}

	@Override
	public String toString() {
		return literal;
	}

	/**
	 * Returns the '<em><b>ValidationDiagnostic</b></em>' literal with the
	 * specified integer value.
	 */
	public static ValidationDiagnostic get(int value) {
		switch (value) {
		case OK_VALUE:
			return OK;
		case ERROR_VALUE:
			return ERROR;
		case INFO_VALUE:
			return INFO;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ValidationDiagnostic</b></em>' literal with the
	 * specified literal value.
	 */
	public static ValidationDiagnostic get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidationDiagnostic result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * An array of all the '<em><b>ValidationDiagnostic</b></em>' enumerators.
	 */
	private static final ValidationDiagnostic[] VALUES_ARRAY = new ValidationDiagnostic[] {
			OK, INFO, ERROR, };

	/**
	 * A public read-only list of all the '<em><b>ValidationDiagnostic</b></em>'
	 * enumerators.
	 */
	public static final List<ValidationDiagnostic> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

}
