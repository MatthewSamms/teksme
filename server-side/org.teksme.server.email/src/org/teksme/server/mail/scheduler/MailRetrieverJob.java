package org.teksme.server.mail.scheduler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.mail.impl.Mail2SMSProcessor;
import org.teksme.server.mail.impl.MailConnectionType;
import org.teksme.server.mail.impl.MailRetriever;
import org.teksme.server.mail.impl.Renderable;
import org.teksme.server.mail.parser.FormattingRules;
import org.teksme.server.mail.util.MessagesBundle;
import org.teksme.server.mail.util.Util;
import org.teksme.server.queue.sender.MessageQueueSender;

public class MailRetrieverJob implements Job {

	private static Log logger = LogFactory.getLog(MailRetrieverJob.class);

	private static final String MAIL_PROCESSED_PREFIX = "read_";

	private MessageQueueSender queueSender;

	private IPersistenceManagerFactory persistenceMgrFactory;

	public static Map<String, Object> registry = Collections
			.synchronizedMap(new HashMap<String, Object>());

	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		String jobName = context.getJobDetail().getFullName();
		logger.debug("MailRetrieverJob: " + jobName + " executing at "
				+ new Date());

		try {

			MailRetriever mailRetriever = new MailRetriever(
					MessagesBundle.getString("OVI_USERNAME"), //$NON-NLS-1$
					MessagesBundle.getString("PASSWD"),
					MessagesBundle.getString("OVI_IMAP_SERVER"));

			mailRetriever.connect(MailConnectionType.IMAP);

			mailRetriever.getMailMessages();

			List<Renderable> unreadMsgs = mailRetriever.getUnreadMessages();

			if (unreadMsgs == null)
				logger.debug(MessagesBundle.getString("NO_VALID_MSGS_FOUND"));
			else
				fetchMessage(unreadMsgs);

		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void fetchMessage(List<Renderable> unreadMsgs) throws IOException,
			PersistenceException {

		String mailFolderPath = Util.getMailFolder().getPath();

		Iterator<Renderable> it = unreadMsgs.iterator();
		while (it.hasNext()) {

			Renderable msg = it.next();

			String from = msg.getFrom()[0].toString();

			String msgFilePlaceHolder = null;
			if (from.lastIndexOf("<") == -1) {
				msgFilePlaceHolder = from;
			} else {
				msgFilePlaceHolder = from.substring(0, from.lastIndexOf("<"));
				msgFilePlaceHolder = from.replace(msgFilePlaceHolder, "")
						.replaceAll(">", "").replaceAll("<", "");
			}

			msgFilePlaceHolder += "-";

			Long sentDate = msg.getSentDate().getTime();

			File mailFile = new File(mailFolderPath
					+ File.separator
					+ msgFilePlaceHolder.concat(sentDate.toString()).concat(
							MessagesBundle.getString("MAIL_FILE_EXTENSION")));

			File readMailFile = new File(MAIL_PROCESSED_PREFIX.concat(mailFile
					.getName()));

			if (!readMailFile.exists()) {
				logger.info("Serializing email message...");
				logger.info("Message subject: " + msg.getSubject());
				logger.debug("Message content: " + msg.getBodytext());
				logger.info("From: " + from);

				BufferedWriter out = null;
				mailFile.createNewFile();
				out = new BufferedWriter(new FileWriter(mailFile));
				out.write(FormattingRules.SMS_METHOD_SUBJECT + ": "
						+ msg.getSubject());
				out.write("\n\n");
				out.write(msg.getBodytext());
				out.close();

				logger.info("File created: " + mailFile.getName());

				Mail2SMSProcessor processor = Mail2SMSProcessor.INSTANCE;

				processor.setMessageQueueSender((MessageQueueSender) registry
						.get(MessageQueueSender.class.getSimpleName()));

				processor
						.setPersistenceManagerFactory((IPersistenceManagerFactory) registry
								.get(IPersistenceManagerFactory.class
										.getSimpleName()));

				processor.process();
			}
		}

	}

	public void bind(MessageQueueSender queueSender) {
		this.queueSender = queueSender;
	}

	public void bind(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;
	}

	public void unbind(MessageQueueSender queueSender) {
		this.queueSender = null;
	}

	public void unbind(IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = null;
	}

	protected void activate() {
		registry.put(MessageQueueSender.class.getSimpleName(), queueSender);
		registry.put(IPersistenceManagerFactory.class.getSimpleName(),
				persistenceMgrFactory);
	}

	protected void deactivate() {
		registry.remove(MessageQueueSender.class.getSimpleName());
		registry.remove(IPersistenceManagerFactory.class.getSimpleName());
	}

}
