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

import org.teksme.model.teks.Message;
import org.teksme.server.jms.queues.TeksMessageHandler;

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
public class MailQueueHandlerBean extends TeksMessageHandler {

//	@Resource(mappedName = "java:/TransactionManager")
//	private TransactionManager tm;

	//object for while
	public void consume(Object message) {
//		try {
//			// Step 9. We know the client is sending a text message so we cast
//			TextMessage textMessage = (TextMessage) message;
//
//			// Step 10. get the text from the message.
//			String text = textMessage.getText();
//
//			System.out.println("message " + text + " received");
//
//			// Step 11. Lets take a look at the transaction and see whats
//			// happening.
//			Transaction tx = tm.getTransaction();
//
//			if (tx != null) {
//				System.out.println("we're in the middle of a transaction: "
//						+ tx);
//			} else {
//				System.out
//						.println("something is wrong, I was expecting a transaction");
//			}
//		} catch (JMSException e) {
//			e.printStackTrace();
//		} catch (SystemException e) {
//			e.printStackTrace();
//		}
	}

}
