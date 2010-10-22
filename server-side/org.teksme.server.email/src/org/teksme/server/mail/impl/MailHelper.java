package org.teksme.server.mail.impl;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.FetchProfile;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.ContentType;
import javax.mail.internet.ParseException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.teksme.server.mail.util.MessagesBundle;

public class MailHelper {

	private static Log logger = LogFactory.getLog(MailHelper.class);

	private Session session = null;
	private static Store store = null;
	private Folder folder;
	
	public static MailHelper INSTANCE = new MailHelper();
	
	private MailHelper(){
		
	}
	
	public Store connect(MailConnectionType mailConnType, String username, String password,
			String mailServer) throws Exception {

		switch (mailConnType) {
		case POP:
			break;
		case IMAP:
			store = setupIMAPConnection(username, password, mailServer);
			return store;
		default:
			break;
		}
		return null;
	}

	private Store setupIMAPConnection(String username, String password, String mailServer)
			throws MessagingException, NoSuchProviderException {
		String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory"; //$NON-NLS-1$

		Properties imapProps = new Properties();

		imapProps.setProperty("mail.imap.socketFactory.class", SSL_FACTORY);
		imapProps.setProperty("mail.imap.socketFactory.fallback", "false");
		imapProps.setProperty("mail.imap.port", MessagesBundle.getString("IMAP_PORT"));
		imapProps
				.setProperty("mail.imap.socketFactory.port", MessagesBundle.getString("IMAP_PORT"));
		// imapProps.setProperty("mail.imap.partialfetch", "false");
		imapProps.setProperty("mail.imap.rsetbeforequit", "true");

		session = Session.getInstance(imapProps, null);
		store = session.getStore("imap");
		store.connect(mailServer, username, password);

		return store;
	}

	public Folder openFolder(String folderName) throws Exception {
		// Open the Folder
		folder = store.getDefaultFolder();
		folder = folder.getFolder(folderName);
		if (folder == null) {
			throw new Exception(MessagesBundle.getString("INVALID_FOLDER_MSG")); //$NON-NLS-1$
		}

		// try to open read/write and if that fails try read-only
		try {
			folder.open(Folder.READ_WRITE);
		} catch (MessagingException ex) {
			ex.printStackTrace();
			// folder.open(Folder.READ_ONLY);
		}
		return folder;
	}

	public void printMessage(int messageNo) throws Exception {
		logger.debug(MessagesBundle.getString("GETTING_MSG") + messageNo); //$NON-NLS-1$

		Message m = null;

		try {
			m = folder.getMessage(messageNo);
			dumpPart(m);
		} catch (IndexOutOfBoundsException iex) {
			System.out.println(MessagesBundle.getString("MSG_OUT_OF_RANGE")); //$NON-NLS-1$
		}
	}

	public void printAllMessageEnvelopes() throws Exception {

		// Attributes & Flags for all messages ..
		Message[] msgs = folder.getMessages();

		// Use a suitable FetchProfile
		FetchProfile fp = new FetchProfile();
		fp.add(FetchProfile.Item.ENVELOPE);
		folder.fetch(msgs, fp);

		for (int i = 0; i < msgs.length; i++) {
			System.out.println("--------------------------"); //$NON-NLS-1$
			System.out.println("MESSAGE #" + (i + 1) + ":");
			dumpEnvelope(msgs[i]);

		}

	}

	public void printAllMessages() throws Exception {

		// Attributes & Flags for all messages ..
		Message[] msgs = folder.getMessages();

		// Use a suitable FetchProfile
		FetchProfile fp = new FetchProfile();
		fp.add(FetchProfile.Item.ENVELOPE);
		folder.fetch(msgs, fp);

		for (int i = 0; i < msgs.length; i++) {
			System.out.println("--------------------------"); //$NON-NLS-1$
			System.out.println("MESSAGE #" + (i + 1) + ":"); //$NON-NLS-1$ //$NON-NLS-2$
			dumpPart(msgs[i]);
		}

	}

	public static void dumpPart(Part p) throws Exception {
		if (p instanceof Message)
			dumpEnvelope((Message) p);

		String ct = p.getContentType();
		try {
			pr("CONTENT-TYPE: " + (new ContentType(ct)).toString()); //$NON-NLS-1$
		} catch (ParseException pex) {
			pr("BAD CONTENT-TYPE: " + ct); //$NON-NLS-1$
		}

		/*
		 * Using isMimeType to determine the content type avoids fetching the actual
		 * content data until we need it.
		 */
		if (p.isMimeType("text/plain")) { //$NON-NLS-1$
			pr("This is plain text"); //$NON-NLS-1$
			pr("---------------------------"); //$NON-NLS-1$
			System.out.println((String) p.getContent());
		} else {

			// just a separator
			pr("---------------------------"); //$NON-NLS-1$

		}
	}

	public static void dumpEnvelope(Message m) throws Exception {
		pr(" "); //$NON-NLS-1$
		Address[] a;
		// FROM
		if ((a = m.getFrom()) != null) {
			for (int j = 0; j < a.length; j++)
				pr("FROM: " + a[j].toString()); //$NON-NLS-1$
		}

		// TO
		if ((a = m.getRecipients(Message.RecipientType.TO)) != null) {
			for (int j = 0; j < a.length; j++) {
				pr("TO: " + a[j].toString()); //$NON-NLS-1$
			}
		}

		// SUBJECT
		pr("SUBJECT: " + m.getSubject()); //$NON-NLS-1$

		// DATE
		Date d = m.getSentDate();
		pr("SendDate: " + (d != null ? d.toString() : "UNKNOWN")); //$NON-NLS-1$ //$NON-NLS-2$

	}

	static String indentStr = "                                               "; //$NON-NLS-1$
	static int level = 0;

	/**
	 * Print a, possibly indented, string.
	 */
	public static void pr(String s) {

		System.out.print(indentStr.substring(0, level * 2));
		System.out.println(s);
	}

	public void closeFolder() throws Exception {
		if (folder.isOpen())
			folder.close(false);
	}

	public int getMessageCount() throws Exception {
		return folder.getMessageCount();
	}

	public int getNewMessageCount() throws Exception {
		return folder.getNewMessageCount();
	}

	public void disconnect() throws Exception {
		store.close();
	}

	public int getUnreadMessageCount() throws MessagingException {
		return folder.getUnreadMessageCount();
	}

}
