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
 * A representation of the literals of the enumeration '<em><b>SMS Gateway Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage#getSMSGatewayKind()
 * @model
 * @generated
 */
public enum SMSGatewayKind implements Enumerator {
	/**
	 * The '<em><b>CLICKATELL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLICKATELL_VALUE
	 * @generated
	 * @ordered
	 */
	CLICKATELL(0, "CLICKATELL", "CLICKATELL"),

	/**
	 * The '<em><b>DIGICEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGICEL_VALUE
	 * @generated
	 * @ordered
	 */
	DIGICEL(1, "DIGICEL", "DIGICEL"),

	/**
	 * The '<em><b>MOVISTAR PERU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVISTAR_PERU_VALUE
	 * @generated
	 * @ordered
	 */
	MOVISTAR_PERU(2, "MOVISTAR_PERU", "MOVISTAR_PERU"),

	/**
	 * The '<em><b>MODEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEM_VALUE
	 * @generated
	 * @ordered
	 */
	MODEM(3, "MODEM", "MODEM"),

	/**
	 * The '<em><b>BULKSMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULKSMS_VALUE
	 * @generated
	 * @ordered
	 */
	BULKSMS(4, "BULKSMS", "BULKSMS");

	/**
	 * The '<em><b>CLICKATELL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLICKATELL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLICKATELL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLICKATELL_VALUE = 0;

	/**
	 * The '<em><b>DIGICEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIGICEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIGICEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIGICEL_VALUE = 1;

	/**
	 * The '<em><b>MOVISTAR PERU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVISTAR PERU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVISTAR_PERU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVISTAR_PERU_VALUE = 2;

	/**
	 * The '<em><b>MODEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODEM_VALUE = 3;

	/**
	 * The '<em><b>BULKSMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BULKSMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BULKSMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BULKSMS_VALUE = 4;

	/**
	 * An array of all the '<em><b>SMS Gateway Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SMSGatewayKind[] VALUES_ARRAY = new SMSGatewayKind[] {
			CLICKATELL, DIGICEL, MOVISTAR_PERU, MODEM, BULKSMS, };

	/**
	 * A public read-only list of all the '<em><b>SMS Gateway Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SMSGatewayKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SMS Gateway Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMSGatewayKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SMSGatewayKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SMS Gateway Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMSGatewayKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SMSGatewayKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SMS Gateway Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SMSGatewayKind get(int value) {
		switch (value) {
		case CLICKATELL_VALUE:
			return CLICKATELL;
		case DIGICEL_VALUE:
			return DIGICEL;
		case MOVISTAR_PERU_VALUE:
			return MOVISTAR_PERU;
		case MODEM_VALUE:
			return MODEM;
		case BULKSMS_VALUE:
			return BULKSMS;
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
	private SMSGatewayKind(int value, String name, String literal) {
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

} //SMSGatewayKind
