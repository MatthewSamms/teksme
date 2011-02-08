package org.teksme.server.common.validator;

public final class ErrorFormattingRules {

	public static final String REQUIRED_FEATURE = "(?i)(\\[.*ERROR\\]).*?('.*')";

	public static final String REQUIRED_OUT_OF_RANGE_FEATURE = "(?i)((\\[.*ERROR\\]).*(?!.?The feature '([aA-Zz])')(with ([0-9]) values must have at least ([0-9]) values)\\z)";

	public static final String PREMATURE_EOF = "Premature end of file";

	public static final String INVALID_XML_CONTENT_BEGINNING_ELEMENT = "Content is not allowed in prolog";

	public static final String MISSING_XML_CLOSING_TAG = "XML document structures must start and end within the same entity";

	public static final String MATCHING_END_TAG_NOT_FOUND = "(?i)(?!.?The element type \"([^\"]*)\" )(must be terminated by the matching end-tag).*(\\<.*?\\>)";

	public static final String INVALID_XML_TAG = ".?(Feature ).*?('.*') not found";

	public static final String INVALID_ROOT_ELEMENT = "(?i).*( the root element must be well-formed)";

	public static final String MISSING_EQUAL_SIGM_FOR_ATTR = ".?(Attribute name \"([^\"]*)\" associated with an element type \"([^\"]*)\" )";

	public static final String MISSING_QUOTES_FOR_ATTR = "(?i)(Open quote is expected for attribute).*?(\".*\")";

	public static final String ATTR_VALUE_CANNOT_CONTAIN_XML_OPEN_TAG = ".?(The value of attribute \"([^\"]*)\" associated with an element type \"([^\"]*)\" )";

	public static final String ASSOCIATED_XML_SCHEMA_NOT_FOUND = ".?(Package with uri ).*?('.*') not found";

	public static final String INVALID_BOF_XML_DECLARATION = "[The XML declaration must end with \"\\?>\"]|[The encoding declaration is required .?*]|[Invalid encoding name]|[in the XML declaration]";

}// ErrorFormattingRules class
