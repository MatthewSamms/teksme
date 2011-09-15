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
package org.teksme.server.mail.impl;

import java.io.IOException;
import java.util.Date;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.teksme.server.mail.util.MessagesBundle;

public class RenderablePlainText implements Renderable {

	private static Log logger = LogFactory.getLog(RenderablePlainText.class);

	String bodytext;
	String subject;
	Address[] from;
	Date sentDate;

	/** Creates a new instance of RenderablePlainText */
	public RenderablePlainText(Message message) throws MessagingException, IOException {
		subject = message.getSubject()
				.substring(MessagesBundle.getString("SUBJECT_TOKEN").length());
		bodytext = (String) message.getContent();

		logger.info("[SUBJECT] " + subject);
		logger.info("\n\n");
		logger.info("[BODYTEXT] \n" + bodytext);

		sentDate = message.getSentDate();

		from = message.getFrom();
		
	}

	public Attachment getAttachment(int i) {
		return null;
	}

	public int getAttachmentCount() {
		return 0;
	}

	public String getBodytext() {
		return bodytext;
	}

	public String getSubject() {
		return subject;
	}

	public Address[] getFrom() {
		return from;
	}

	public Date getSentDate() {
		return sentDate;
	}

}
