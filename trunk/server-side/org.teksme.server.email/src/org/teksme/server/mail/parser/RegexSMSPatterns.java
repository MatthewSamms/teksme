package org.teksme.server.mail.parser;

import java.util.regex.Pattern;

public class RegexSMSPatterns {

	public static Pattern getUsernamePattern() {
		return Pattern.compile(FormattingRules.USER_NAME_REGEX);
	}

	public static Pattern getPasswordPattern() {
		return Pattern.compile(FormattingRules.PASSWORD_REGEX);
	}

	public static Pattern getAppIdPattern() {
		return Pattern.compile(FormattingRules.SMS_APP_ID_REGEX);
	}

	public static Pattern getFromPattern() {
		return Pattern.compile(FormattingRules.SMS_FROM_REGEX);
	}

	public static Pattern getRecipientPattern() {
		return Pattern.compile(FormattingRules.SMS_RECIPIENT_REGEX);
	}

	public static Pattern getMessageBodyPattern() {
		return Pattern.compile(FormattingRules.SMS_TEXT_MESSAGE_REGEX);
	}

	public static Pattern getSMSGatewayPattern() {
		return Pattern.compile(FormattingRules.SMS_GATEWAY_REGEX);
	}

	public static Pattern getDateMinMaxPattern() {
		return Pattern.compile(FormattingRules.DATE_MIN_MAX_REGEX);
	}

}// RegexPatterns class
