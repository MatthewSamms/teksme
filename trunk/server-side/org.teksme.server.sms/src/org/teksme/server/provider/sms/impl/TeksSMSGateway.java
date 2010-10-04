/*
 * Copyright 2010 TksMe, Inc.
 * TksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.provider.sms.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

import org.smslib.AGateway;
import org.smslib.GatewayException;
import org.smslib.InboundMessage;
import org.smslib.InboundMessage.MessageClasses;
import org.smslib.Message.MessageTypes;
import org.smslib.OutboundMessage;
import org.smslib.OutboundMessage.MessageStatuses;
import org.smslib.SMSLibException;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.smslib.notify.InboundMessageNotification;
import org.teksme.server.provider.sms.service.SMSGatewayFactory;

public class TeksSMSGateway {

	private Thread incomingMessagesThread = null;

	private SMSGatewayFactory smsGtwFactory = null;// SMSGatewayFactory.INSTANCE;

	private int refCounter = 0;

	private int counter = 0;

	private Service srv = null;

	/**
	 * After how much sent messages next one should fail setting to 2 makes two
	 * messages sent, and then one failed.
	 */
	private int failCycle;

	/**
	 * Duration between incoming messages in milliseconds
	 */
	private int receiveCycle;

	private TeksSMSGateway() throws IOException, InterruptedException, SMSLibException {
		// srv = smsGtwFactory.startSMSGateway();
		setFailCycle(30);
		this.receiveCycle = 10000;
	}

	public void readMessage() throws TimeoutException, GatewayException, IOException, InterruptedException {

		this.incomingMessagesThread = new Thread(new Runnable() {
			// Run thread to fake incoming messages
			public void run() {
				while (!TeksSMSGateway.this.incomingMessagesThread.isInterrupted()) {
					synchronized (TeksSMSGateway.this.incomingMessagesThread) {
						try {
							TeksSMSGateway.this.incomingMessagesThread.wait(TeksSMSGateway.this.receiveCycle);
						} catch (InterruptedException e) {
							// NOOP
							break;
						}
					}
					if (!TeksSMSGateway.this.incomingMessagesThread.isInterrupted()) {
						getService().getLogger().logInfo("Detecting incoming message", null, getDefaultGateway().getGatewayId());
						getService()
								.getNotifyQueueManager()
								.getNotifyQueue()
								.add(new InboundMessageNotification(getDefaultGateway().getMyself(), MessageTypes.INBOUND,
										generateIncomingMessage()));
					}
				}
			}
		}, "IncomingMessagesThread");
		this.incomingMessagesThread.start();
	}

	public boolean deleteMessage(InboundMessage msg) throws TimeoutException, GatewayException, IOException, InterruptedException {
		// NOOP
		return true;
	}

	public void stopGateway() throws IOException, InterruptedException, SMSLibException {
		getDefaultGateway().stopGateway();
		if (this.incomingMessagesThread != null) {
			synchronized (this.incomingMessagesThread) {
				this.incomingMessagesThread.interrupt();
			}
		}
		// smsGtwFactory.stopSMSGateway();
	}

	public InboundMessage readMessage(String memLoc, int memIndex) throws TimeoutException, GatewayException, IOException,
			InterruptedException {
		// Return a new generated message
		this.counter++;
		if ((this.failCycle > 0) && (this.counter >= this.failCycle)) {
			this.counter = 0;
			throw new GatewayException("*** READ ERROR ***");
		}
		return generateIncomingMessage();
	}

	public void readMessages(Collection<InboundMessage> msgList, MessageClasses msgClass) throws TimeoutException, GatewayException,
			IOException, InterruptedException {
		// Return a new generated message
		msgList.add(generateIncomingMessage());
	}

	public boolean sendMessage(OutboundMessage msg) throws TimeoutException, GatewayException, IOException, InterruptedException {
		// if (getGatewayId().equalsIgnoreCase("Test3")) throw new
		// IOException("Dummy Exception!!!");
		// simulate delay
		getService().getLogger().logInfo("Sending to: " + msg.getRecipient() + " via: " + msg.getGatewayId(), null,
				getDefaultGateway().getGatewayId());
		this.counter++;
		if ((this.failCycle > 0) && (this.counter >= this.failCycle)) {
			this.counter = 0;
			if (getDefaultGateway().getGatewayId().equalsIgnoreCase("Test3"))
				;//
			else {
				throw new IOException("Dummy Exception!!!");
				// msg.setFailureCause(FailureCauses.GATEWAY_FAILURE);
				// return false;
			}
		}
		msg.setDispatchDate(new Date());
		msg.setMessageStatus(MessageStatuses.SENT);
		msg.setRefNo(Integer.toString(++this.refCounter));
		msg.setGatewayId(getDefaultGateway().getGatewayId());
		getService().getLogger().logInfo("Sent to: " + msg.getRecipient() + " via: " + msg.getGatewayId(), null,
				getDefaultGateway().getGatewayId());
		getDefaultGateway().incOutboundMessageCount();
		return true;
	}

	InboundMessage generateIncomingMessage() {
		getDefaultGateway().incInboundMessageCount();
		InboundMessage msg = new InboundMessage(new java.util.Date(), "+1234567890", "Hello World! #"
				+ getDefaultGateway().getInboundMessageCount(), 0, null);
		msg.setGatewayId(getDefaultGateway().getGatewayId());
		return msg;
	}

	protected int getFailCycle() {
		return this.failCycle;
	}

	/**
	 * Set fail cycle value. This is count of successfully sent messages that is
	 * followed by one failed message.
	 * 
	 * @param myFailCycle
	 *            Set to zero to disable failures.
	 */
	protected void setFailCycle(int myFailCycle) {
		this.failCycle = myFailCycle;
	}

	protected int getQueueSchedulingInterval() {
		return 200;
	}

	protected Service getService() {
		return this.srv;
	}

	protected AGateway getDefaultGateway() {
		return this.srv.getGateway(smsGtwFactory.getSMSGatewayId());
	}

	protected int getReceiveCycle() {
		return receiveCycle;
	}

	protected void setReceiveCycle(int receiveCycle) {
		this.receiveCycle = receiveCycle;
	}

}
