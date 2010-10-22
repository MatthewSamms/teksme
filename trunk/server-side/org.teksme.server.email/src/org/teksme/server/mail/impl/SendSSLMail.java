package org.teksme.server.mail.impl;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendSSLMail implements Runnable {

	public BodyPart getFileBodyPart(File filename, String contentType)
			throws javax.mail.MessagingException {
		BodyPart bp = new MimeBodyPart();
		bp.setDataHandler(new DataHandler(new FileDataSource(filename)));
		return bp;
	}

	private final String TO;
	private final String subject;
	private final File xmlFile;

	public SendSSLMail(String TO, String subject, String content, File xmlFile) {
		this.TO = TO;
		this.subject = subject;
		this.xmlFile = xmlFile;
	}

	public void send() throws Exception {

		Properties props = new Properties();

		ResourceBundle rb = ResourceBundle.getBundle("mail");
		for (Enumeration<String> keys = rb.getKeys(); keys.hasMoreElements();) {
			String key = keys.nextElement();
			if (key.startsWith("mail.")) {
				String value = rb.getString(key);
				props.put(key, value);
			}
		}

		final String SMTP_HOST_NAME = rb.getString("SMTP_HOST_NAME");
		final int SMTP_HOST_PORT = new Integer(rb.getString("SMTP_HOST_PORT"));
		final String SMTP_AUTH_USER = rb.getString("SMTP_AUTH_USER");
		final String SMTP_AUTH_PWD = rb.getString("SMTP_AUTH_PWD");

		Session mailSession = Session.getDefaultInstance(props);
		mailSession.setDebug(true);
		Transport transport = mailSession.getTransport();

		// Create an "Alternative" Multipart message
		Multipart mp = new MimeMultipart("alternative");

		BodyPart bp1 = getFileBodyPart(new File("data/survey-uploaded-msg.txt"), "text/plain");
		mp.addBodyPart(bp1);

		MimeMessage message = new MimeMessage(mailSession);

		// Set the content for the message and transmit
		message.setContent(mp);

		message.addRecipient(Message.RecipientType.TO, new InternetAddress(TO));
		message.setSubject(subject);

		transport.connect(SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER, SMTP_AUTH_PWD);

		transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
		transport.close();
	}

	public void run() {
		try {
			this.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
