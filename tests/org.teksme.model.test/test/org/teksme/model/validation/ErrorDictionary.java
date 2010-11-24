package org.teksme.model.validation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ErrorDictionary {

	MISSING_REQUIRED_XML_ELEMENT(4005, StatusCode.BAD_REQUEST, Messages
			.getString("4005"), StatusCode.ERROR_CODES_URL.concat("4005")),

	UNSUPPORTED_HEADER(4006, StatusCode.BAD_REQUEST,
			Messages.getString("4006"), StatusCode.ERROR_CODES_URL
					.concat("4006")),

	UNSUPPORTED_XML_ELEMENT(4007, StatusCode.BAD_REQUEST, Messages
			.getString("4007"), StatusCode.ERROR_CODES_URL.concat("4007")),

	INVALID_XML_DOCUMENT(4008, StatusCode.BAD_REQUEST, Messages
			.getString("4008"), StatusCode.ERROR_CODES_URL.concat("4008")),

	REQUIRED_XML_ELEMENT_OUT_OF_RANGE(4009, StatusCode.BAD_REQUEST, Messages
			.getString("4009"), StatusCode.ERROR_CODES_URL.concat("4009"));

	private static final int MISSING_REQUIRED_XML_ELEMENT_VALUE = 4005;

	private static final int UNSUPPORTED_HEADER_VALUE = 4006;

	private static final int UNSUPPORTED_XML_ELEMENT_VALUE = 4007;

	private static final int INVALID_XML_DOCUMENT_VALUE = 4008;

	private static final int REQUIRED_XML_ELEMENT_OUT_OF_RANGE_VALUE = 4009;

	private final int status;

	private final String message;

	private final int code;

	private final String moreInfo;

	private ErrorDictionary(int code, int status, String message,
			String moreInfo) {
		this.code = code;
		this.status = status;
		this.message = message;
		this.moreInfo = moreInfo;
	}

	@Override
	public String toString() {
		return "[ code: " + code + " | status: " + status + " | message: "
				+ message + " | moreInfo: " + moreInfo + " ]";
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
		case MISSING_REQUIRED_XML_ELEMENT_VALUE:
			return MISSING_REQUIRED_XML_ELEMENT;
		case UNSUPPORTED_HEADER_VALUE:
			return UNSUPPORTED_HEADER;
		case UNSUPPORTED_XML_ELEMENT_VALUE:
			return UNSUPPORTED_XML_ELEMENT;
		case INVALID_XML_DOCUMENT_VALUE:
			return INVALID_XML_DOCUMENT;
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
	private static final ErrorDictionary[] VALUES_ARRAY = new ErrorDictionary[] {
			MISSING_REQUIRED_XML_ELEMENT, UNSUPPORTED_HEADER,
			UNSUPPORTED_XML_ELEMENT, INVALID_XML_DOCUMENT,
			REQUIRED_XML_ELEMENT_OUT_OF_RANGE, };

	/**
	 * A public read-only list of all the '<em><b>ErrorDictionary</b></em>'
	 * enumerators.
	 */
	public static final List<ErrorDictionary> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

}
