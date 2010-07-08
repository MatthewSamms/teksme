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
import org.teksme.model.teks.InboundTextMessage;
import org.teksme.server.SMSInboundMessageLocal;

@MessageDriven(name = "SMSInboundQueueHandler", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = Queues.INBOUND_QUEUE),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "AUTO_ACKNOWLEDGE"),
		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "4") }, messageListenerInterface = javax.jms.MessageListener.class)
@TransactionManagement(value = TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
@ResourceAdapter("hornetq-ra.rar")
public class SMSInboundQueueHandlerBean extends
		TeksMessageHandler<InboundTextMessage> {

	Logger logger = Logger
			.getLogger(SMSInboundQueueHandlerBean.class.getName());

	@Resource(mappedName = "java:/TransactionManager")
	private TransactionManager tm;

	@EJB
	private SMSInboundMessageLocal inboundMessage;

	@Override
	public void consume(final InboundTextMessage message) {
		try {

			logger.info("Message received: "
					+ message.getTextMessage().getText());

			Transaction tx = tm.getTransaction();

			if (tx != null) {

				// TODO: implement HTTP callback to client application
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
