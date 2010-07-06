package org.teksme.server.jms.queues;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import org.jboss.ejb3.annotation.ResourceAdapter;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.server.SMSOutboundMessageLocal;

@MessageDriven(name = "SMSQueueHandler", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/testQueue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "AUTO_ACKNOWLEDGE"),
		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "4") }, messageListenerInterface = javax.jms.MessageListener.class)
@TransactionManagement(value = TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
@ResourceAdapter("hornetq-ra.rar")
public class SMSQueueHandlerBean extends
		TeksMessageHandler<OutboundTextMessage> {

	Logger logger = Logger.getLogger(SMSQueueHandlerBean.class.getName());

	@Resource(mappedName = "java:/TransactionManager")
	private TransactionManager tm;

	@EJB
	private SMSOutboundMessageLocal outboundMessage;

	@Override
	public void consume(final OutboundTextMessage message) {
		try {

			logger.info("Message received: " + message.getTextMessage());

			Transaction tx = tm.getTransaction();

			if (tx != null) {

				outboundMessage.sendMessage(message);

			} else {
				logger.log(Level.SEVERE,
						"something is wrong, I was expecting a transaction");
			}
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
