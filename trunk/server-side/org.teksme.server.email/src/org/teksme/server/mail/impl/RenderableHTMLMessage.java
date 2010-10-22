package org.teksme.server.mail.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;

import org.teksme.server.mail.util.MessagesBundle;


public class RenderableHTMLMessage implements Renderable {

	private final String subject;
	private String bodytext;
	private final Date sentDate;
	private final Address[] from;

	ArrayList<Attachment> attachments;

	/** Creates a new instance of RenderableMessage */
	public RenderableHTMLMessage(Message m) throws MessagingException, IOException {
		subject = m.getSubject().substring(MessagesBundle.getString("SUBJECT_TOKEN").length());
		from = m.getFrom();
		sentDate = m.getSentDate();
		attachments = new ArrayList<Attachment>();
		extractPart(m);
	}

	private void extractPart(final Part part) throws MessagingException, IOException {
		if (part.getContent() instanceof Multipart) {
			Multipart mp = (Multipart) part.getContent();
			for (int i = 0; i < mp.getCount(); i++) {
				extractPart(mp.getBodyPart(i));
			}
			return;
		}

		if (part.getContentType().startsWith("text/html")) {
			if (bodytext == null) {
				bodytext = (String) part.getContent();
			} else {
				bodytext = bodytext + "<HR/>" + (String) part.getContent();
			}
		} else if (!part.getContentType().startsWith("text/plain")) {

			bodytext = (String) part.getContent();
			
			Attachment attachment = new Attachment();
			attachment.setContenttype(part.getContentType());
			attachment.setFilename(part.getFileName());

			InputStream in = part.getInputStream();
			ByteArrayOutputStream bos = new ByteArrayOutputStream();

			byte[] buffer = new byte[8192];
			int count = 0;
			while ((count = in.read(buffer)) >= 0)
				bos.write(buffer, 0, count);
			in.close();
			attachment.setContent(bos.toByteArray());
			attachments.add(attachment);

		}
	}

	public String getSubject() {
		return subject;
	}

	public String getBodytext() {
		return bodytext;
	}

	public int getAttachmentCount() {
		if (attachments == null)
			return 0;
		return attachments.size();
	}

	public Attachment getAttachment(int i) {
		return attachments.get(i);
	}

	public Address[] getFrom() {
		return from;
	}

	public Date getSentDate() {
		return sentDate;
	}

}
