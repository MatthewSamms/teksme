package org.teksme.server.mail.parser;

public final class FormattingRules {

	public static final String SMS_METHOD_SUBJECT = "sms";

	public static final String USER_NAME_REGEX = "\\[username\\]";

	public static final String PASSWORD_REGEX = "\\[password\\]";

	public static final String SMS_APP_ID_REGEX = "\\[appId\\]";

	public static final String SMS_FROM_REGEX = "\\[from\\]";

	public static final String SMS_RECIPIENT_REGEX = "\\[recipient\\]";

	public static final String SMS_TEXT_MESSAGE_REGEX = "\\[message\\]";

	public static final String SMS_GATEWAY_REGEX = "\\[smsGateway\\]";

	public static final String SMS_MESSAGE_SEPARATOR_REGEX = "---\\+\\+";

	public static final String DATE_MIN_MAX_REGEX = "([0-9]*/[0-9]*/[0-9]*)?\\.\\.([0-9]*/[0-9]*/[0-9]*)?";

	public static final String DATE_FORMAT = "dd/MM/yyyy";

	public static final String USER_NAME = "[username]";

	public static final String PASSWORD = "[password]";

	public static final String SMS_APP_ID = "[appId]";

	public static final String SMS_FROM = "[from]";

	public static final String SMS_RECIPIENT = "[recipient]";

	public static final String SMS_TEXT_MESSAGE = "[message]";

	public static final String SMS_GATEWAY = "[smsGateway]";

	public static final String SMS_MESSAGE_SEPARATOR = "---++";

}// FormattingRules class
