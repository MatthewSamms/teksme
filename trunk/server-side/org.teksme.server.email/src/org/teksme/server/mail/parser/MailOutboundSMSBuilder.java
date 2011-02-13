package org.teksme.server.mail.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.model.teks.Shout;
import org.teksme.model.teks.TeksFactory;

public class MailOutboundSMSBuilder extends TeksBuilder {

	private static Log logger = LogFactory.getLog(MailOutboundSMSBuilder.class);

	protected File mailContent;

	protected OutboundMessage outMsg = null;

	public MailOutboundSMSBuilder(File mailContent) {
		super();
		this.mailContent = mailContent;
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		outMsg = factory.createOutboundMessage();
		outMsg.setId(UUID.randomUUID().toString());
	}

	@Override
	public void buildModelDoc() throws IOException {

		logger.info("Loading email to SMS content...");

		String line = null;
		Matcher m = null;
		String username = null;
		String password = null;
		String appId = null;

		BufferedReader emailContentBuff = null;
		try {
			emailContentBuff = new BufferedReader(new FileReader(mailContent));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (null != emailContentBuff) {
			while ((line = emailContentBuff.readLine()) != null) {
				m = RegexSMSPatterns.getUsernamePattern().matcher(line);
				if (m.find()) {
					username = line.replace(FormattingRules.USER_NAME, "");
				}
				m = RegexSMSPatterns.getPasswordPattern().matcher(line);
				if (m.find()) {
					password = line.replace(FormattingRules.PASSWORD, "");
				}
				m = RegexSMSPatterns.getAppIdPattern().matcher(line);
				if (m.find()) {
					appId = line.replace(FormattingRules.SMS_APP_ID, "");
				}
			}
			// TODO auth user
			logger.info("[ username: " + username + " | password: " + password
					+ " | appId: " + appId + " ]");

			// teksModel.setAppId(appId);
			emailContentBuff.close();
		}

	}

	@Override
	public void buildModelHeader() throws IOException {

		String line = null;
		Matcher m = null;

		String smsGateway = null;
		String from = null;

		BufferedReader emailContentBuff = null;
		try {
			emailContentBuff = new BufferedReader(new FileReader(mailContent));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (null != emailContentBuff) {
			while ((line = emailContentBuff.readLine()) != null) {
				m = RegexSMSPatterns.getFromPattern().matcher(line);
				if (m.find()) {
					from = line.replace(FormattingRules.SMS_FROM, "").trim();
				}
				m = RegexSMSPatterns.getSMSGatewayPattern().matcher(line);
				if (m.find()) {
					smsGateway = line.replace(FormattingRules.SMS_GATEWAY, "")
							.trim();
				}
			}
			emailContentBuff.close();
		}

		outMsg.setDate(new Date());

		// outMsg.setCommunicationChannel(0, ChannelKind.SMS);

		if (null != smsGateway) {
			logger.info("SMSGatewayKind ::"
					+ SMSGatewayKind.getByName(smsGateway) + " | smsGateway: "
					+ smsGateway);
			outMsg.setRouting(SMSGatewayKind.BULKSMS);
		}

		outMsg.setAttempts(2);

		// The source/sender address that the message will appear to come from
		// also known as ÒSender IDÓ
		outMsg.setFrom(from);

		logger.info("[ from: " + outMsg.getFrom() + " | smsGateway: "
				+ outMsg.getRouting() + " ]");

		// outMsg.setTeksRef(teksModel);

		teksModel.setOutboundMessage(0, outMsg);

	}

	@Override
	public void buildModelBody() throws IOException {
		String line = null;
		Matcher m = null;

		String recipient = null;
		String textMessage = null;

		BufferedReader emailContentBuff = null;
		try {
			emailContentBuff = new BufferedReader(new FileReader(mailContent));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (null != emailContentBuff) {
			while ((line = emailContentBuff.readLine()) != null) {
				m = RegexSMSPatterns.getRecipientPattern().matcher(line);
				if (m.find()) {
					recipient = line.replace(FormattingRules.SMS_RECIPIENT, "")
							.trim();
				}
				m = RegexSMSPatterns.getMessageBodyPattern().matcher(line);
				if (m.find()) {
					textMessage = line.replace(
							FormattingRules.SMS_TEXT_MESSAGE, "").trim();
				}
			}
			emailContentBuff.close();
		}

		// The number of the handset to which the message must be delivered
		outMsg.setTo(recipient);

		// Delays delivery of SMS to mobile device in minutes
		outMsg.setDelay(10);

		// The validity period in minutes
		outMsg.setTimeout(11);

		// Client message ID defined by user for message tracking.
		outMsg.setId(UUID.randomUUID().toString());

		// Messages in the highest priority queue will be delivered first
		// (range: 1-3).
		// outMsg.setDeliveryQueuePriority(0, 1);

		// callback which is posted to a user URL using the GET or POST
		// method. This is done every time a message status is updated
		outMsg.setCallback("");

		// send messages longer than a standard message
		outMsg.setConcatenated(false);

		// Specify when a message gets delivered.
		outMsg.setSchedule(new Date());

		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;

		Shout shout = factory.createShout();
		shout.setThis(textMessage);

		outMsg.setShout(shout);

		// outMsg.setTeksRef(teksModel);

		teksModel.setOutboundMessage(0, outMsg);

	}

}
