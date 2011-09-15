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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public static Map<String, Object> cache = Collections
			.synchronizedMap(new HashMap<String, Object>());

	public MailRetriever(String emailuser, String emailpassword,
			String mailServer) {
		this.emailuser = emailuser;
		this.emailpassword = emailpassword;
		this.mailServer = mailServer;
	}

	public void connect(MailConnectionType mailConnType) {
		try {
			if (null == store && cache.get(Store.class.getSimpleName()) == null) {
				logger.info("Connecting to email server...");
				store = MailHelper.INSTANCE.connect(mailConnType, emailuser,
						emailpassword, mailServer);
				cache.put(Store.class.getSimpleName(), store);
				logger.info("Successfully connected and authenticated to email server.");
			} else {
				store = (Store) cache.get(Store.class.getSimpleName());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getMailMessages() throws Exception {

		inboxfolder = openFolder(MessagesBundle.getString("INBOX_FOLDER")); //$NON-NLS-1$

		totalMessagesCount = getMessageCount();
		newMessagesCount = getNewMessageCount();
		unreadMessageCount = getUnreadMessageCount();

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
					closeFolder();
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

	public Folder openFolder(String folderName) throws Exception {
		// Open the Folder
		Folder folder = getStore().getDefaultFolder();
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

	private Store getStore() {
		return (Store) cache.get(Store.class.getSimpleName());
	}

	public List<Renderable> getUnreadMessages() {
		return unreadMessages;
	}

	public void closeFolder() throws Exception {
		if (inboxfolder.isOpen())
			inboxfolder.close(false);
	}

	public int getMessageCount() throws Exception {
		return inboxfolder.getMessageCount();
	}

	public int getNewMessageCount() throws Exception {
		return inboxfolder.getNewMessageCount();
	}

	public void disconnect() throws Exception {
		getStore().close();
	}

	public int getUnreadMessageCount() throws MessagingException {
		return inboxfolder.getUnreadMessageCount();
	}

}// MailRetriever class
