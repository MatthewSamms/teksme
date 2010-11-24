package org.teksme.model.validation;

import java.util.regex.Pattern;

public class RegexErrorMessagePatterns {

	public static Pattern getMissingRequiredXMLElementPattern() {
		return Pattern.compile(ErrorFormattingRules.REQUIRED_FEATURE,
				Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getRequiredXMLElementOutOfRangePattern() {
		return Pattern.compile(
				ErrorFormattingRules.REQUIRED_OUT_OF_RANGE_FEATURE,
				Pattern.CASE_INSENSITIVE);
	}

}
