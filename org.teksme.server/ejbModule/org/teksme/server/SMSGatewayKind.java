/*
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>SMSGateway Kind</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 */
public enum SMSGatewayKind {

	SERIAL_MODEM(0, "SerialModem", "SerialModem"),

	CLICKATELL_HTTP_GATEWAY(1, "ClickatellHTTPGateway", "ClickatellHTTPGateway"),

	DIGICEL_HTTP_GATEWAY(2, "DigicelHTTPGateway", "DigicelHTTPGateway");

	public static final int SERIAL_MODEM_VALUE = 0;

	public static final int CLICKATELL_HTTP_GATEWAY_VALUE = 1;

	public static final int DIGICEL_HTTP_GATEWAY_VALUE = 2;

	private static final SMSGatewayKind[] VALUES_ARRAY = new SMSGatewayKind[] {
			SERIAL_MODEM, CLICKATELL_HTTP_GATEWAY, DIGICEL_HTTP_GATEWAY, };

	public static final List<SMSGatewayKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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

	public static SMSGatewayKind get(int value) {
		switch (value) {
		case SERIAL_MODEM_VALUE:
			return SERIAL_MODEM;
		case CLICKATELL_HTTP_GATEWAY_VALUE:
			return CLICKATELL_HTTP_GATEWAY;
		case DIGICEL_HTTP_GATEWAY_VALUE:
			return DIGICEL_HTTP_GATEWAY;
		}
		return null;
	}

	private final int value;

	private final String name;

	private final String literal;

	private SMSGatewayKind(int value, String name, String literal) {
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

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Override
	public String toString() {
		return literal;
	}

} // SMSGatewayKind
