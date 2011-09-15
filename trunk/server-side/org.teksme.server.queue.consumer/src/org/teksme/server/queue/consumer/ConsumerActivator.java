/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.queue.consumer;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.teksme.server.common.messaging.AMQPQueueType;


/**
 * 
 * @since 0.5
 * 
 */
public class ConsumerActivator implements BundleActivator {

	private ChannelInboundTracker inboundTracker;

	private ChannelOutboundTracker outboundTracker;

	private static Logger logger = Logger.getLogger(ConsumerActivator.class.getName());

	public void start(BundleContext context) throws Exception {

		logger.info("Starting message consumer bundle...");
		
		inboundTracker = new ChannelInboundTracker(context, AMQPQueueType.INBOUND_QUEUE.getQueue());
		
		outboundTracker = new ChannelOutboundTracker(context, AMQPQueueType.OUTBOUND_QUEUE.getQueue());
		
		inboundTracker.open();
		
		outboundTracker.open();
	}

	public void stop(BundleContext context) throws Exception {
		
		inboundTracker.close();
		
		outboundTracker.close();
	}

}
