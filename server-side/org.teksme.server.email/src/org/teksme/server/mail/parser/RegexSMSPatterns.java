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
