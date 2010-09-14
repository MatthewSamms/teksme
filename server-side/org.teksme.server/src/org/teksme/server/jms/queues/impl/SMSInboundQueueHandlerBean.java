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

package org.teksme.server.jms.queues.impl;

import java.util.logging.Logger;

import org.teksme.server.jms.queues.TeksMessageHandler;
import org.teksme.server.sms.service.SMSInboundMessage;

//@MessageDriven(name = "SMSInboundQueueHandler", activationConfig = {
//		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
//		@ActivationConfigProperty(propertyName = "destination", propertyValue = Queues.INBOUND_QUEUE),
//		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "AUTO_ACKNOWLEDGE"),
//		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "4") }, messageListenerInterface = javax.jms.MessageListener.class)
//@TransactionManagement(value = TransactionManagementType.CONTAINER)
//@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
//@ResourceAdapter("hornetq-ra.rar")
//public class SMSInboundQueueHandlerBean extends TeksMessageHandler<InboundTextMessage> {
public class SMSInboundQueueHandlerBean extends TeksMessageHandler {

	Logger logger = Logger.getLogger(SMSInboundQueueHandlerBean.class.getName());

//	@Resource(mappedName = "java:/TransactionManager")
//	private TransactionManager tm;

	//@EJB
	private SMSInboundMessage inboundMessage;

	
	//public void consume(final InboundTextMessage message) {
	public void consume(Object message) {
//		try {
//
//			logger.info("Message received: " + message.getTextMessage().getText());
//
//			Transaction tx = tm.getTransaction();
//
//			if (tx != null) {
//
//				// TODO: implement HTTP callback to client application
//			} else {
//				logger.log(Level.SEVERE, "something is wrong, I was expecting a transaction");
//			}
//		} catch (SystemException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
