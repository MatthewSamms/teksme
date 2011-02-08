package org.teksme.server.common.validator;

import java.util.regex.Pattern;

public class RegexErrorMessagePatterns {

	public static Pattern getMissingRequiredXMLElementPattern() {
		return Pattern.compile(ErrorFormattingRules.REQUIRED_FEATURE, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getRequiredXMLElementOutOfRangePattern() {
		return Pattern.compile(ErrorFormattingRules.REQUIRED_OUT_OF_RANGE_FEATURE, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getPrematureEOFPattern() {
		return Pattern.compile(ErrorFormattingRules.PREMATURE_EOF, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getInvalidXMLBeginningElementPattern() {
		return Pattern.compile(ErrorFormattingRules.INVALID_XML_CONTENT_BEGINNING_ELEMENT, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getMissingXMLClosingTagElementPattern() {
		return Pattern.compile(ErrorFormattingRules.MISSING_XML_CLOSING_TAG, Pattern.CASE_INSENSITIVE);
	}

	// public static Pattern getXMLSyntacticallyIncorrectPattern() {
	// return Pattern.compile(ErrorFormattingRules.FEATURE_NOT_FOUND,
	// Pattern.CASE_INSENSITIVE);
	// }

	public static Pattern getInvalidXMLElementPattern() {
		return Pattern.compile(ErrorFormattingRules.INVALID_XML_TAG, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getMissingXMLElementMatchingEndTagPattern() {
		return Pattern.compile(ErrorFormattingRules.MATCHING_END_TAG_NOT_FOUND, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getInvalidXMLRootElementPattern() {
		return Pattern.compile(ErrorFormattingRules.INVALID_ROOT_ELEMENT, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getMissingEqualSignForAttrPattern() {
		return Pattern.compile(ErrorFormattingRules.MISSING_EQUAL_SIGM_FOR_ATTR, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getMissingQuotesForAttrPattern() {
		return Pattern.compile(ErrorFormattingRules.MISSING_QUOTES_FOR_ATTR, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getInvalidXMLOpenTagForAttrPattern() {
		return Pattern.compile(ErrorFormattingRules.ATTR_VALUE_CANNOT_CONTAIN_XML_OPEN_TAG, Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getInvalidXMLSchemaPattern() {
		return Pattern.compile(ErrorFormattingRules.ASSOCIATED_XML_SCHEMA_NOT_FOUND, Pattern.CASE_INSENSITIVE);
	}


	public static Pattern getInvalidBOFXMLDeclarationPattern() {
		return Pattern.compile(ErrorFormattingRules.INVALID_BOF_XML_DECLARATION, Pattern.CASE_INSENSITIVE);
	}

}
