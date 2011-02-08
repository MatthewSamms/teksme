package org.teksme.server.common.validator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ErrorDictionary {

	// -- #HTTP Status code: 422 Unprocessable Entity

	COULD_NOT_PARSE_REQUEST(4221, HttpStatusCode.SC_UNPROCESSABLE_ENTITY.getValue(), Messages.getString("4221"), Messages.getString(
			"ERROR_CODES_URL").concat("4221")),

	INVALID_ASSOCIATED_XML_SCHEMA(4222, HttpStatusCode.SC_UNPROCESSABLE_ENTITY.getValue(), Messages.getString("4222"), Messages.getString(
			"ERROR_CODES_URL").concat("4222")),

	// -- #HTTP Status code: 409 (Conflict) - the XML content was invalid
	// against the specified schema
	MISSING_REQUIRED_XML_ELEMENT(4091, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("4091"), Messages.getString(
			"ERROR_CODES_URL").concat("4091")),

	XML_SYNTACTICALLY_INCORRECT(4092, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("4092"), Messages.getString(
			"ERROR_CODES_URL").concat("4092")),

	INVALID_XML_ELEMENT(4093, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("4093"), Messages.getString("ERROR_CODES_URL")
			.concat("4093")),

	INVALID_ROOT_ELEMENT(4094, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("4094"), Messages.getString("ERROR_CODES_URL")
			.concat("4094")),

	ATTR_MUST_BE_FOLLOWED_BY_EQUALS_SIG(4095, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("4095"), Messages.getString(
			"ERROR_CODES_URL").concat("4095")),

	MISSING_ATTR_QUOTES(4096, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("4096"), Messages.getString("ERROR_CODES_URL")
			.concat("4096")),

	ATTR_VALUE_CANNOT_CONTAIN_OPEN_TAG_SYMBOL(4097, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("4097"), Messages.getString(
			"ERROR_CODES_URL").concat("4097")),

	REQUIRED_XML_ELEMENT_OUT_OF_RANGE(4099, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("4099"), Messages.getString(
			"ERROR_CODES_URL").concat("4099")),

	XML_CLOSING_TAG_IS_MISSING(40910, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("40910"), Messages.getString(
			"ERROR_CODES_URL").concat("40910")),

	MISSING_XML_ELEMENT_MATCHING_END_TAG(40911, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("40911"), Messages.getString(
			"ERROR_CODES_URL").concat("40911")),

	INVALID_XML_BEGINNING_ELEMENT(40912, HttpStatusCode.SC_CONFLICT.getValue(), Messages.getString("40912"), Messages.getString(
			"ERROR_CODES_URL").concat("40912")),

	// -- #HTTP Status code: 415 Unsupported Media Type
	INVALID_CONTENT_TYPE(4151, HttpStatusCode.SC_UNSUPPORTED_MEDIA_TYPE.getValue(), Messages.getString("4151"), Messages.getString(
			"ERROR_CODES_URL").concat("4151")),

	// -- #HTTP Status code: 500 Internal Server Error
	INTERNAL_SERVICE_ERROR(5001, HttpStatusCode.SC_UNSUPPORTED_MEDIA_TYPE.getValue(), Messages.getString("5001"), Messages.getString(
			"ERROR_CODES_URL").concat("5001")),

	// -- #HTTP Status code: 400 Bad Request

	EMPTY_REQUEST_BODY(4001, HttpStatusCode.SC_BAD_REQUEST.getValue(), Messages.getString("4001"), Messages.getString("ERROR_CODES_URL")
			.concat("4001")),

	CONTENT_LENGTH_NOT_SPECIFIED(4002, HttpStatusCode.SC_BAD_REQUEST.getValue(), Messages.getString("4002"), Messages.getString(
			"ERROR_CODES_URL").concat("4002")),

	PREMATURE_EOF(4003, HttpStatusCode.SC_BAD_REQUEST.getValue(), Messages.getString("4003"), Messages.getString("ERROR_CODES_URL").concat(
			"4003")),

	WRONG_BOF_XML_DECLARATION(4004, HttpStatusCode.SC_BAD_REQUEST.getValue(), Messages.getString("4004"), Messages.getString(
			"ERROR_CODES_URL").concat("4004"));

	private static final int XML_SYNTACTICALLY_INCORRECT_VALUE = 4008;

	private static final int REQUIRED_XML_ELEMENT_OUT_OF_RANGE_VALUE = 4009;

	private final int status;

	private final String message;

	private final int code;

	private final String moreInfo;

	private ErrorDictionary(int code, int status, String message, String moreInfo) {
		this.code = code;
		this.status = status;
		this.message = message;
		this.moreInfo = moreInfo;
	}

	@Override
	public String toString() {
		return "[ code: " + code + " | status: " + status + " | message: " + message + " | moreInfo: " + moreInfo + " ]";
	}

	protected int getStatus() {
		return status;
	}

	protected String getMessage() {
		return message;
	}

	protected int getCode() {
		return code;
	}

	protected String getMoreInfo() {
		return moreInfo;
	}

	/**
	 * Returns the '<em><b>ErrorDictionary</b></em>' literal with the specified
	 * integer value.
	 */
	public static ErrorDictionary get(int code) {
		switch (code) {
		case XML_SYNTACTICALLY_INCORRECT_VALUE:
			return XML_SYNTACTICALLY_INCORRECT;
		case REQUIRED_XML_ELEMENT_OUT_OF_RANGE_VALUE:
			return REQUIRED_XML_ELEMENT_OUT_OF_RANGE;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ErrorDictionary</b></em>' literal with the specified
	 * literal value.
	 */
	public static ErrorDictionary get(String message) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorDictionary result = VALUES_ARRAY[i];
			if (result.toString().equals(message)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * An array of all the '<em><b>ErrorDictionary</b></em>' enumerators.
	 */
	private static final ErrorDictionary[] VALUES_ARRAY = new ErrorDictionary[] { COULD_NOT_PARSE_REQUEST, MISSING_REQUIRED_XML_ELEMENT,
			XML_SYNTACTICALLY_INCORRECT, REQUIRED_XML_ELEMENT_OUT_OF_RANGE, };

	/**
	 * A public read-only list of all the '<em><b>ErrorDictionary</b></em>'
	 * enumerators.
	 */
	public static final List<ErrorDictionary> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

}
