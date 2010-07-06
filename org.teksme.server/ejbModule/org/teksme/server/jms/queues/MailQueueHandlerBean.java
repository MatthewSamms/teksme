package org.teksme.server.jms.queues;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.mail.Message;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

/*
 @MessageDriven(name = "MailQueueHandler", activationConfig = {
 @ActivationConfigProperty(propertyName = "mailServer", propertyValue = "mail.philips.local"),
 // @ActivationConfigProperty(propertyName="port",
 // propertyValue="10143"),
 @ActivationConfigProperty(propertyName = "mailFolder", propertyValue = "INBOX"),
 @ActivationConfigProperty(propertyName = "storeProtocol", propertyValue = "imap"),
 @ActivationConfigProperty(propertyName = "userName", propertyValue = "noway@spam.com"),
 @ActivationConfigProperty(propertyName = "password", propertyValue = "????????"),
 @ActivationConfigProperty(propertyName = "debug", propertyValue = "false"),
 @ActivationConfigProperty(propertyName = "pollingInterval", propertyValue = "30000"),
 @ActivationConfigProperty(propertyName = "maxMessages", propertyValue = "5") })
 @TransactionManagement(value = TransactionManagementType.CONTAINER)
 @TransactionAttribute(value = TransactionAttributeType.REQUIRED)
 @ResourceAdapter("mail-ra.rar")
 */
public class MailQueueHandlerBean extends TeksMessageHandler<Message> {

	@Resource(mappedName = "java:/TransactionManager")
	private TransactionManager tm;

	@Override
	public void consume(final Message message) {
		try {
			// Step 9. We know the client is sending a text message so we cast
			TextMessage textMessage = (TextMessage) message;

			// Step 10. get the text from the message.
			String text = textMessage.getText();

			System.out.println("message " + text + " received");

			// Step 11. Lets take a look at the transaction and see whats
			// happening.
			Transaction tx = tm.getTransaction();

			if (tx != null) {
				System.out.println("we're in the middle of a transaction: "
						+ tx);
			} else {
				System.out
						.println("something is wrong, I was expecting a transaction");
			}
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

}
