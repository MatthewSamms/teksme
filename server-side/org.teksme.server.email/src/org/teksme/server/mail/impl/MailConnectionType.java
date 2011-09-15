/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.mail.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum MailConnectionType {
	POP(0, "pop", "pop"),

	POPS(1, "pops", "pops"),

	IMAP(2, "imap", "imap"),

	IMAPS(3, "imaps", "imaps");

	private static final int POP_VALUE = 0;

	private static final int POPS_VALUE = 1;

	private static final int IMAP_VALUE = 2;

	private static final int IMAPS_VALUE = 3;

	private final int value;

	private final String name;

	private final String literal;

	private MailConnectionType(int value, String name, String literal) {
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
	 * Returns the '<em><b>Mail Connection Type</b></em>' literal with the specified
	 * integer value.
	 */
	public static MailConnectionType get(int value) {
		switch (value) {
		case POP_VALUE:
			return POP;
		case POPS_VALUE:
			return POP;

		case IMAP_VALUE:
			return IMAP;

		case IMAPS_VALUE:
			return IMAP;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mail Connection Type</b></em>' literal with the specified
	 * literal value.
	 */
	public static MailConnectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MailConnectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * An array of all the '<em><b>Mail Connection Type</b></em>' enumerators.
	 */
	private static final MailConnectionType[] VALUES_ARRAY = new MailConnectionType[] { POP, POPS,
			IMAP, IMAPS, };

	/**
	 * A public read-only list of all the '<em><b>Mail Connection Type</b></em>'
	 * enumerators.
	 */
	public static final List<MailConnectionType> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

}
