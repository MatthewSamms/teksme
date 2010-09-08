/*
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

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
import org.teksme.server.SMSOutboundMessage;

@MessageDriven(name = "SMSOutboundQueueHandler", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = Queues.OUTBOUND_QUEUE),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "AUTO_ACKNOWLEDGE"),
		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "4") }, messageListenerInterface = javax.jms.MessageListener.class)
@TransactionManagement(value = TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
@ResourceAdapter("hornetq-ra.rar")
public class SMSOutboundQueueHandlerBean extends
		TeksMessageHandler<OutboundTextMessage> {

	Logger logger = Logger.getLogger(SMSOutboundQueueHandlerBean.class
			.getName());

	@Resource(mappedName = "java:/TransactionManager")
	private TransactionManager tm;

	@EJB
	private SMSOutboundMessage outboundMessage;

	@Override
	public void consume(final OutboundTextMessage message) {
		try {

			logger.info("Message received: "
					+ message.getTextMessage().getText());

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
