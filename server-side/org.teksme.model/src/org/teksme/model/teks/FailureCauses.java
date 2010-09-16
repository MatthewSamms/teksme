/**
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version 
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 */
package org.teksme.model.teks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Failure Causes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage#getFailureCauses()
 * @model
 * @generated
 */
public enum FailureCauses implements Enumerator {
	/**
	 * The '<em><b>NO ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ERROR(0, "NO_ERROR", "NO_ERROR"),

	/**
	 * The '<em><b>BAD NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_NUMBER(1, "BAD_NUMBER", "BAD_NUMBER"),

	/**
	 * The '<em><b>BAD FORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_FORMAT(2, "BAD_FORMAT", "BAD_FORMAT"),

	/**
	 * The '<em><b>GATEWAY FAILURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	GATEWAY_FAILURE(3, "GATEWAY_FAILURE", "GATEWAY_FAILURE"),

	/**
	 * The '<em><b>NO CREDIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CREDIT(4, "NO_CREDIT", "NO_CREDIT"),

	/**
	 * The '<em><b>GATEWAY AUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_AUTH_VALUE
	 * @generated
	 * @ordered
	 */
	GATEWAY_AUTH(5, "GATEWAY_AUTH", "GATEWAY_AUTH"),

	/**
	 * The '<em><b>NO ROUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ROUTE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ROUTE(6, "NO_ROUTE", "NO_ROUTE"),

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(6, "UNKNOWN", "UNKNOWN");

	/**
	 * The '<em><b>NO ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_ERROR_VALUE = 0;

	/**
	 * The '<em><b>BAD NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD NUMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_NUMBER_VALUE = 1;

	/**
	 * The '<em><b>BAD FORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD FORMAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_FORMAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_FORMAT_VALUE = 2;

	/**
	 * The '<em><b>GATEWAY FAILURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GATEWAY FAILURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_FAILURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_FAILURE_VALUE = 3;

	/**
	 * The '<em><b>NO CREDIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO CREDIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CREDIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_CREDIT_VALUE = 4;

	/**
	 * The '<em><b>GATEWAY AUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GATEWAY AUTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_AUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_AUTH_VALUE = 5;

	/**
	 * The '<em><b>NO ROUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO ROUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ROUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_ROUTE_VALUE = 6;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Failure Causes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FailureCauses[] VALUES_ARRAY = new FailureCauses[] {
			NO_ERROR, BAD_NUMBER, BAD_FORMAT, GATEWAY_FAILURE, NO_CREDIT,
			GATEWAY_AUTH, NO_ROUTE, UNKNOWN, };

	/**
	 * A public read-only list of all the '<em><b>Failure Causes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FailureCauses> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Failure Causes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailureCauses get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailureCauses result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Causes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailureCauses getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailureCauses result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Causes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailureCauses get(int value) {
		switch (value) {
		case NO_ERROR_VALUE:
			return NO_ERROR;
		case BAD_NUMBER_VALUE:
			return BAD_NUMBER;
		case BAD_FORMAT_VALUE:
			return BAD_FORMAT;
		case GATEWAY_FAILURE_VALUE:
			return GATEWAY_FAILURE;
		case NO_CREDIT_VALUE:
			return NO_CREDIT;
		case GATEWAY_AUTH_VALUE:
			return GATEWAY_AUTH;
		case NO_ROUTE_VALUE:
			return NO_ROUTE;
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
	private FailureCauses(int value, String name, String literal) {
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

} //FailureCauses
