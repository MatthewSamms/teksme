/*
 * MailRetriever.java
 */

package org.teksme.server.mail.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Store;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.teksme.server.mail.parser.FormattingRules;
import org.teksme.server.mail.util.MessagesBundle;

public class MailRetriever {

	private static Log logger = LogFactory.getLog(MailRetriever.class);

	private final String emailuser;
	private final String emailpassword;
	private final String mailServer;
	private Store store;
	private Folder inboxfolder;
	private Renderable latestMessage;
	private List<Renderable> unreadMessages;
	private int totalMessagesCount;
	private int newMessagesCount;
	private int unreadMessageCount;

	public MailRetriever(String emailuser, String emailpassword,
			String mailServer) {
		this.emailuser = emailuser;
		this.emailpassword = emailpassword;
		this.mailServer = mailServer;
	}

	public void connect(MailConnectionType mailConnType) {
		try {
			if (null == store) {
				logger.info("Connecting to email server...");
				store = MailHelper.INSTANCE.connect(mailConnType, emailuser,
						emailpassword, mailServer);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getMailMessages() throws Exception {

		inboxfolder = MailHelper.INSTANCE.openFolder(MessagesBundle
				.getString("INBOX_FOLDER")); //$NON-NLS-1$

		totalMessagesCount = MailHelper.INSTANCE.getMessageCount();
		newMessagesCount = MailHelper.INSTANCE.getNewMessageCount();
		unreadMessageCount = MailHelper.INSTANCE.getUnreadMessageCount();

		if (unreadMessageCount > 0) {
			logger.debug("Total messages = " + totalMessagesCount); //$NON-NLS-1$
			logger.debug("New messages = " + newMessagesCount); //$NON-NLS-1$
			logger.debug("Unread messages = " + unreadMessageCount); //$NON-NLS-1$
			logger.debug("-------------------------------"); //$NON-NLS-1$
		}

		try {
			if (unreadMessageCount > 0) {
				Message[] msgs = inboxfolder.getMessages();
				FetchProfile fp = new FetchProfile();
				fp.add("Subject"); //$NON-NLS-1$
				inboxfolder.fetch(msgs, fp);
				// for (int j = msgs.length - 1; j >= 0; j--) {
				for (int i = totalMessagesCount - 1; i >= totalMessagesCount
						- unreadMessageCount; i--) {
					logger.debug("MSG COUNT: " + i);
					if (msgs[i].getSubject().toLowerCase()
							.startsWith(FormattingRules.SMS_METHOD_SUBJECT)) {
						// setLatestMessage(msgs[i]);
						setUnreadMessage(msgs[i]);
						msgs[i].setFlag(Flags.Flag.SEEN, true);
						msgs[i].setFlag(Flags.Flag.USER, true);
						// msgs[i].setFlag(Flags.Flag.DELETED, true);
						// break;
					}
				}
			}
		} catch (NoSuchProviderException ex) {
			ex.printStackTrace();
		} catch (MessagingException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (inboxfolder != null)
					MailHelper.INSTANCE.closeFolder();
				if (store != null)
					MailHelper.INSTANCE.disconnect();
			} catch (MessagingException ex) {
				ex.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void setUnreadMessage(Message message) throws MessagingException,
			IOException {

		Renderable unreadMessage = getMessageRender(message);
		if (unreadMessages == null)
			unreadMessages = new ArrayList<Renderable>();

		unreadMessages.add(unreadMessage);
	}

	public Renderable getLatestMessage() {
		return latestMessage;
	}

	@SuppressWarnings("unused")
	private void setLatestMessage(Message message) throws MessagingException,
			IOException {
		if (message == null) {
			latestMessage = null;
			return;
		}
		latestMessage = getMessageRender(message);
	}

	private Renderable getMessageRender(Message message)
			throws MessagingException, IOException {
		Renderable renderable = null;
		if (message.getContentType().startsWith("text/plain")) { //$NON-NLS-1$
			logger.info("text/plain");
			renderable = new RenderablePlainText(message);
		} else {
			logger.info("text/html");
			renderable = new RenderableHTMLMessage(message);
		}
		return renderable;
	}

	public List<Renderable> getUnreadMessages() {
		return unreadMessages;
	}

}// MailRetriever class
