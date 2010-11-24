package org.teksme.model.validation;

public final class ErrorFormattingRules {

	public static final String REQUIRED_FEATURE = "(?i)(\\[.*ERROR\\]).*(?!.?The required feature)(must be set)\\z";

	public static final String REQUIRED_OUT_OF_RANGE_FEATURE = "(?i)((\\[.*ERROR\\]).*(?!.?The feature '([aA-Zz])')(with ([0-9]) values must have at least ([0-9]) values)\\z)";

}// ErrorFormattingRules class
