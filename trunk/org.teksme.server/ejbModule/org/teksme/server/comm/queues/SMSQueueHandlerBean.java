package org.teksme.server.comm.queues;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import org.jboss.ejb3.annotation.ResourceAdapter;

@MessageDriven(name = "SMSQueueHandler", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/testQueue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "AUTO_ACKNOWLEDGE"),
		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "4") }, messageListenerInterface = javax.jms.MessageListener.class)
@TransactionManagement(value = TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
@ResourceAdapter("hornetq-ra.rar")
public class SMSQueueHandlerBean extends TeksMessageHandler<TextMessage> { 
	
	@Resource(mappedName = "java:/TransactionManager")
	private TransactionManager tm;

	@Override
	public void consume(final TextMessage message) {
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
