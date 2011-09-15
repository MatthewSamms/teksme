package org.teksme.server.common.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// Pattern patt =
		// Pattern.compile("(?i)\\[(.*ERROR)\\].*(?!.?The required feature).+'(.*?)'.(must be set)\\z");
		// // could be stored in a
		Pattern patt = Pattern.compile(".*'(.*?)'"); // could be stored in a
		// String theString =
		// "[ERROR] The required feature 'from' of 'org.teksme.model.teks.impl.OutboundMessageImpl@2a0ab444{/Users/fabianocruz/Documents/27-TeksMe/Source/TeksMe/org.teksme.model.test/resources/data/teks_outmsg.xml#fbb6cb52-e6b3-49ae-994e-6f96fa7872d7}' must be set";
		String theString = "feature 'from' of 'to' ";

		// static final field.
		// Matcher matcher = patt.matcher(theString);
		// boolean matches = matcher.matches();
		// String updateString = matcher.group(1);

		// System.out.println(matches);
		System.out.println(theString.split("'")[1]);

		// for (int i = 0; i < matcher.groupCount() + 1; i++) {
		// System.out.println(i + " " + matcher.group(i));
		// }

		Matcher m = null;
		String errorMessage = "invalid message";

		// errorMessage =
		// "The element type \"outboundMessage\" must be terminated by the matching end-tag \"</outboundMessage>\"";
		m = RegexErrorMessagePatterns.getMissingXMLElementMatchingEndTagPattern().matcher(errorMessage);
		if (m.find()) {
			// List<DataElement> list = new ArrayList<DataElement>();
			System.out.println(m.group(1));
			System.out.println(m.group(3));
			System.out.println(ErrorDictionary.MISSING_XML_ELEMENT_MATCHING_END_TAG.getMessage());
		}

		// errorMessage =
		// "[ERROR] The required feature 'from' of 'org.teksme.model.teks.impl.OutboundMessageImpl@69ed56e2{*.xml#//@outboundMessage[id=null]}' must be set";
		m = RegexErrorMessagePatterns.getMissingRequiredXMLElementPattern().matcher(errorMessage);
		if (m.find()) {
			System.out.println(m.group(2).split("'")[1]);
			System.out.println(ErrorDictionary.MISSING_REQUIRED_XML_ELEMENT);
		}

		// errorMessage = "Feature 'fabiano' not found. ";
		// errorMessage =
		// "Package with uri 'null' not found. (file:///Applications/eclipse-modeling-helios-SR1-incubation-macosx-cocoa-NEW/Eclipse.app/Contents/MacOS/*.xml, 1, 48)";
		m = RegexErrorMessagePatterns.getInvalidXMLElementPattern().matcher(errorMessage);
		if (m.find()) {
			System.out.println(m.group(2));
			System.out.println(ErrorDictionary.INVALID_XML_ELEMENT);
		}

		// errorMessage =
		// "The markup in the document following the root element must be well-formed.";
		m = RegexErrorMessagePatterns.getInvalidXMLRootElementPattern().matcher(errorMessage);
		if (m.find()) {
			String element = m.group(1);
			System.out.println(element);
			System.out.println(ErrorDictionary.INVALID_ROOT_ELEMENT);
		}

		// errorMessage =
		// "Attribute name \"lakjsklda\" associated with an element type \"teks:Teks\" must be followed by the ' = ' character.";
		m = RegexErrorMessagePatterns.getMissingEqualSignForAttrPattern().matcher(errorMessage);
		if (m.find()) {
			String element = m.group(3);
			System.out.println(element);
			System.out.println(ErrorDictionary.ATTR_MUST_BE_FOLLOWED_BY_EQUALS_SIG);
		}

		// errorMessage =
		// "Open quote is expected for attribute \"{1}\" associated with an  element type  \"ajsjhdjkhakd\".";
		m = RegexErrorMessagePatterns.getMissingQuotesForAttrPattern().matcher(errorMessage);
		if (m.find()) {
			// String element = m.group(2);
			String element = "'" + m.group(2).split("\"")[3] + "'";
			System.out.println(element);
			System.out.println(ErrorDictionary.MISSING_ATTR_QUOTES);
		}

		// errorMessage =
		// "The value of attribute \"kasjhdkaj\" associated with an element type \"null\" must not contain the '<' character.";
		m = RegexErrorMessagePatterns.getInvalidXMLOpenTagForAttrPattern().matcher(errorMessage);
		if (m.find()) {
			System.out.println(ErrorDictionary.ATTR_VALUE_CANNOT_CONTAIN_OPEN_TAG_SYMBOL);
			System.out.println("'" + m.group(2) + " | " + m.group(3) + "'");
		}

		// errorMessage =
		// "Package with uri 'null' not found. (file:///Applications/eclipse-modeling-helios-SR1-incubation-macosx-cocoa-NEW/Eclipse.app/Contents/MacOS/*.xml, 1, 48)";
		m = RegexErrorMessagePatterns.getInvalidXMLSchemaPattern().matcher(errorMessage);
		if (m.find()) {
			System.out.println(ErrorDictionary.INVALID_ASSOCIATED_XML_SCHEMA);
		}

		// errorMessage = "The XML declaration must end with \"?>\"";
		// errorMessage =
		// "The encoding declaration is required in the text declaration.";
		// errorMessage = "Invalid encoding name \"\"";
		//errorMessage = "The ' = ' character must follow \"____\" in the XML declaration.";
		//errorMessage = "A pseudo attribute name is expected.";
		// errorMessage =
		// "Package with uri 'null' not found. (file:///Applications/eclipse-modeling-helios-SR1-incubation-macosx-cocoa-NEW/Eclipse.app/Contents/MacOS/*.xml, 1, 48)";
		m = RegexErrorMessagePatterns.getInvalidBOFXMLDeclarationPattern().matcher(errorMessage);
		if (m.find()) {
			System.out.println(ErrorDictionary.WRONG_BOF_XML_DECLARATION);
		}

		errorMessage = "Element type \"shout\" must be followed by either attribute specifications, \">\" or \"/>\".";
		m = RegexErrorMessagePatterns.getInvalidXMLElementTagDeclarationPattern().matcher(errorMessage);
		if (m.find()) {
			System.out.println(m.group(1));
			System.out.println(ErrorDictionary.INVALID_XML_ELEMENT_TAG_DECLARATION);
		}

	}
}
