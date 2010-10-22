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
