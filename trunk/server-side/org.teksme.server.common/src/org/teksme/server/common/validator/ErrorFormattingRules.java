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

	public static final String INVALID_BOF_XML_DECLARATION = ".?(The XML declaration must end with \"\\?>\")|(The encoding declaration is required)|(Invalid encoding name)|(in the XML declaration)";

	public static final String INVALID_XML_ELEMENT_TAG_DECLARATION = "(?i)(?!.?Element type \"([^\"]*)\" )(must be followed by either attribute specifications)";

}// ErrorFormattingRules class
