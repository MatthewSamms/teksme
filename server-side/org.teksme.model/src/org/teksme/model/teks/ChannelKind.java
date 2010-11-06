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
 * A representation of the literals of the enumeration '<em><b>Channel Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage#getChannelKind()
 * @model
 * @generated
 */
public enum ChannelKind implements Enumerator {
	/**
	 * The '<em><b>SMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_VALUE
	 * @generated
	 * @ordered
	 */
	SMS(0, "SMS", "SMS"),

	/**
	 * The '<em><b>EMAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(1, "EMAIL", "Email"),

	/**
	 * The '<em><b>WEB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_VALUE
	 * @generated
	 * @ordered
	 */
	WEB(2, "WEB", "Web"),

	/**
	 * The '<em><b>TWITTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWITTER_VALUE
	 * @generated
	 * @ordered
	 */
	TWITTER(3, "TWITTER", "Twitter"),

	/**
	 * The '<em><b>WEB WIDGET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_WIDGET_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_WIDGET(4, "WEB_WIDGET", "Web Widget"),

	/**
	 * The '<em><b>IVR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVR_VALUE
	 * @generated
	 * @ordered
	 */
	IVR(5, "IVR", "IVR"),

	/**
	 * The '<em><b>MMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MMS_VALUE
	 * @generated
	 * @ordered
	 */
	MMS(6, "MMS", "MMS"),

	/**
	 * The '<em><b>GTALK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTALK_VALUE
	 * @generated
	 * @ordered
	 */
	GTALK(7, "GTALK", "GTalk"),

	/**
	 * The '<em><b>MSN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSN_VALUE
	 * @generated
	 * @ordered
	 */
	MSN(8, "MSN", "MSN");

	/**
	 * The '<em><b>SMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMS_VALUE = 0;

	/**
	 * The '<em><b>EMAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMAIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model literal="Email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 1;

	/**
	 * The '<em><b>WEB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB
	 * @model literal="Web"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_VALUE = 2;

	/**
	 * The '<em><b>TWITTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWITTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWITTER
	 * @model literal="Twitter"
	 * @generated
	 * @ordered
	 */
	public static final int TWITTER_VALUE = 3;

	/**
	 * The '<em><b>WEB WIDGET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEB WIDGET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB_WIDGET
	 * @model literal="Web Widget"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_WIDGET_VALUE = 4;

	/**
	 * The '<em><b>IVR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IVR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVR_VALUE = 5;

	/**
	 * The '<em><b>MMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MMS_VALUE = 6;

	/**
	 * The '<em><b>GTALK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GTALK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GTALK
	 * @model literal="GTalk"
	 * @generated
	 * @ordered
	 */
	public static final int GTALK_VALUE = 7;

	/**
	 * The '<em><b>MSN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MSN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSN_VALUE = 8;

	/**
	 * An array of all the '<em><b>Channel Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChannelKind[] VALUES_ARRAY = new ChannelKind[] { SMS,
			EMAIL, WEB, TWITTER, WEB_WIDGET, IVR, MMS, GTALK, MSN, };

	/**
	 * A public read-only list of all the '<em><b>Channel Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChannelKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChannelKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChannelKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind get(int value) {
		switch (value) {
		case SMS_VALUE:
			return SMS;
		case EMAIL_VALUE:
			return EMAIL;
		case WEB_VALUE:
			return WEB;
		case TWITTER_VALUE:
			return TWITTER;
		case WEB_WIDGET_VALUE:
			return WEB_WIDGET;
		case IVR_VALUE:
			return IVR;
		case MMS_VALUE:
			return MMS;
		case GTALK_VALUE:
			return GTALK;
		case MSN_VALUE:
			return MSN;
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
	private ChannelKind(int value, String name, String literal) {
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

} //ChannelKind
