/**
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
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

	public static Pattern getInvalidXMLElementTagDeclarationPattern() {
		return Pattern.compile(ErrorFormattingRules.INVALID_XML_ELEMENT_TAG_DECLARATION, Pattern.CASE_INSENSITIVE);
	}

}
