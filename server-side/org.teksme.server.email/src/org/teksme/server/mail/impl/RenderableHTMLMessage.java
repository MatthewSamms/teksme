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
