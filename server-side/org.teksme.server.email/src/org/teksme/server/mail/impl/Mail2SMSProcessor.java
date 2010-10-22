package org.teksme.server.mail.impl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Teks;
import org.teksme.server.common.persistence.IPersistenceManager;
import org.teksme.server.common.persistence.IPersistenceManagerFactory;
import org.teksme.server.common.persistence.PersistenceException;
import org.teksme.server.mail.parser.MailOutboundSMSBuilder;
import org.teksme.server.mail.parser.TeksModelBuilderDirector;
import org.teksme.server.mail.util.Util;
import org.teksme.server.queue.sender.MessageQueueSender;

public class Mail2SMSProcessor {

	private static Log logger = LogFactory.getLog(Mail2SMSProcessor.class);

	public static Mail2SMSProcessor INSTANCE = Mail2SMSProcessor.init();

	private MessageQueueSender queueSender;

	private IPersistenceManagerFactory persistenceMgrFactory;

	private static Mail2SMSProcessor init() {
		if (INSTANCE == null) {
			return new Mail2SMSProcessor();
		}
		return INSTANCE;
	}

	public void process() throws PersistenceException {

		File mailFolder = Util.getMailFolder();

		File[] listOfFiles = mailFolder.listFiles();

		if (null != listOfFiles && listOfFiles.length > 0)
			process(listOfFiles);
	}

	private Mail2SMSProcessor() {

	}

	public void setMessageQueueSender(MessageQueueSender queueSender) {
		this.queueSender = queueSender;
	}

	public void setPersistenceManagerFactory(
			IPersistenceManagerFactory persistenceMgrFactory) {
		this.persistenceMgrFactory = persistenceMgrFactory;
	}

	private static final String MAIL_PROCESSED_PREFIX = "read_";

	private void process(File[] listOfFiles) throws PersistenceException {

		for (int i = 0; i < listOfFiles.length; i++) {
			String fileName = listOfFiles[i].getName();
			if (listOfFiles[i].isFile()) {

				if (!fileName.startsWith(MAIL_PROCESSED_PREFIX)) {

					logger.info("OK, just got a new message via SMTP!");

					logger.info("Reading File: " + fileName);

					TeksModelBuilderDirector modelDirector = new TeksModelBuilderDirector();

					MailOutboundSMSBuilder mailBuilder = new MailOutboundSMSBuilder(
							listOfFiles[i]);

					modelDirector.setOutboundSMSBuilder(mailBuilder);
					try {
						modelDirector.constructTeksModel();
					} catch (IOException e) {
						e.printStackTrace();
					}

					Teks teksModel = modelDirector.getTeksModel();

					OutboundTextMessage outMsg = teksModel
							.getOutboundMessage(0);

					logger.info(outMsg.getMessage().getText());
					logger.info("Pls send this message to "
							+ outMsg.getSmsGateway().getName() + " gateway.");

					queueSender.publishMessage(outMsg);

					IPersistenceManager persistenceMgr = persistenceMgrFactory
							.getPersistenceManager();
					persistenceMgr.makePersistent(teksModel);

					File mailFolder = Util.getMailFolder();

					File newFileName = new File(mailFolder.getPath()
							+ File.separator
							+ MAIL_PROCESSED_PREFIX.concat(fileName));

					listOfFiles[i].renameTo(newFileName);
				}

			} else if (listOfFiles[i].isDirectory()) {
				logger.info("Directory " + listOfFiles[i].getName());
			}
		}

	}

}
