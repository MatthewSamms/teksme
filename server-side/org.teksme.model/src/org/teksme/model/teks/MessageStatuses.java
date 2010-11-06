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
 * A representation of the literals of the enumeration '<em><b>Message Statuses</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage#getMessageStatuses()
 * @model
 * @generated
 */
public enum MessageStatuses implements Enumerator {
	/**
	 * The '<em><b>MSG UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_UNKNOWN(1, "MSG_UNKNOWN", "MSG_UNKNOWN"),

	/**
	 * The '<em><b>MSG QUEUED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_QUEUED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_QUEUED(2, "MSG_QUEUED", "MSG_QUEUED"),

	/**
	 * The '<em><b>DELIVERED GATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERED_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVERED_GATEWAY(3, "DELIVERED_GATEWAY", "DELIVERED_GATEWAY"),

	/**
	 * The '<em><b>RECEIVED BY RECIPIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVED_BY_RECIPIENT_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVED_BY_RECIPIENT(4, "RECEIVED_BY_RECIPIENT", "RECEIVED_BY_RECIPIENT"),

	/**
	 * The '<em><b>ERROR WITH MSG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_WITH_MSG_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_WITH_MSG(5, "ERROR_WITH_MSG", "ERROR_WITH_MSG"),

	/**
	 * The '<em><b>USER CANCELLED MSG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_CANCELLED_MSG_VALUE
	 * @generated
	 * @ordered
	 */
	USER_CANCELLED_MSG(6, "USER_CANCELLED_MSG", "USER_CANCELLED_MSG"),

	/**
	 * The '<em><b>ERROR DELIVERING MSG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_DELIVERING_MSG_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_DELIVERING_MSG(7, "ERROR_DELIVERING_MSG", "ERROR_DELIVERING_MSG"),

	/**
	 * The '<em><b>SENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENT_VALUE
	 * @generated
	 * @ordered
	 */
	SENT(8, "SENT", "SENT"),

	/**
	 * The '<em><b>ROUTING ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUTING_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ROUTING_ERROR(9, "ROUTING_ERROR", "ROUTING_ERROR"),

	/**
	 * The '<em><b>MSG EXPIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_EXPIRED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_EXPIRED(10, "MSG_EXPIRED", "MSG_EXPIRED"),

	/**
	 * The '<em><b>MSG QUEUED FOR LATER DELIVERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_QUEUED_FOR_LATER_DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_QUEUED_FOR_LATER_DELIVERY(11, "MSG_QUEUED_FOR_LATER_DELIVERY",
			"MSG_QUEUED_FOR_LATER_DELIVERY"),

	/**
	 * The '<em><b>UNSENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSENT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSENT(12, "UNSENT", "UNSENT"),

	/**
	 * The '<em><b>FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(13, "FAILED", "FAILED");

	/**
	 * The '<em><b>MSG UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MSG UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSG_UNKNOWN_VALUE = 1;

	/**
	 * The '<em><b>MSG QUEUED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MSG QUEUED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_QUEUED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSG_QUEUED_VALUE = 2;

	/**
	 * The '<em><b>DELIVERED GATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELIVERED GATEWAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELIVERED_GATEWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELIVERED_GATEWAY_VALUE = 3;

	/**
	 * The '<em><b>RECEIVED BY RECIPIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECEIVED BY RECIPIENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIVED_BY_RECIPIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVED_BY_RECIPIENT_VALUE = 4;

	/**
	 * The '<em><b>ERROR WITH MSG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR WITH MSG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_WITH_MSG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_WITH_MSG_VALUE = 5;

	/**
	 * The '<em><b>USER CANCELLED MSG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER CANCELLED MSG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_CANCELLED_MSG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_CANCELLED_MSG_VALUE = 6;

	/**
	 * The '<em><b>ERROR DELIVERING MSG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR DELIVERING MSG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_DELIVERING_MSG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_DELIVERING_MSG_VALUE = 7;

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
	public static final int SENT_VALUE = 8;

	/**
	 * The '<em><b>ROUTING ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROUTING ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUTING_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROUTING_ERROR_VALUE = 9;

	/**
	 * The '<em><b>MSG EXPIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MSG EXPIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_EXPIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSG_EXPIRED_VALUE = 10;

	/**
	 * The '<em><b>MSG QUEUED FOR LATER DELIVERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MSG QUEUED FOR LATER DELIVERY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_QUEUED_FOR_LATER_DELIVERY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSG_QUEUED_FOR_LATER_DELIVERY_VALUE = 11;

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
	public static final int UNSENT_VALUE = 12;

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
	public static final int FAILED_VALUE = 13;

	/**
	 * An array of all the '<em><b>Message Statuses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageStatuses[] VALUES_ARRAY = new MessageStatuses[] {
			MSG_UNKNOWN, MSG_QUEUED, DELIVERED_GATEWAY, RECEIVED_BY_RECIPIENT,
			ERROR_WITH_MSG, USER_CANCELLED_MSG, ERROR_DELIVERING_MSG, SENT,
			ROUTING_ERROR, MSG_EXPIRED, MSG_QUEUED_FOR_LATER_DELIVERY, UNSENT,
			FAILED, };

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
		case MSG_UNKNOWN_VALUE:
			return MSG_UNKNOWN;
		case MSG_QUEUED_VALUE:
			return MSG_QUEUED;
		case DELIVERED_GATEWAY_VALUE:
			return DELIVERED_GATEWAY;
		case RECEIVED_BY_RECIPIENT_VALUE:
			return RECEIVED_BY_RECIPIENT;
		case ERROR_WITH_MSG_VALUE:
			return ERROR_WITH_MSG;
		case USER_CANCELLED_MSG_VALUE:
			return USER_CANCELLED_MSG;
		case ERROR_DELIVERING_MSG_VALUE:
			return ERROR_DELIVERING_MSG;
		case SENT_VALUE:
			return SENT;
		case ROUTING_ERROR_VALUE:
			return ROUTING_ERROR;
		case MSG_EXPIRED_VALUE:
			return MSG_EXPIRED;
		case MSG_QUEUED_FOR_LATER_DELIVERY_VALUE:
			return MSG_QUEUED_FOR_LATER_DELIVERY;
		case UNSENT_VALUE:
			return UNSENT;
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
