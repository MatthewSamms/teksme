/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
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
