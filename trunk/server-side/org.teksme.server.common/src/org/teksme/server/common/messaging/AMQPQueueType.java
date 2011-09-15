/**
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.common.messaging;

import org.teksme.server.common.TeksResourceBundle;

/**
 * 
 * @since 0.5
 *
 */
public enum AMQPQueueType {

	INBOUND_QUEUE(TeksResourceBundle.getString("mq.queue.inbound"), TeksResourceBundle.getString("mq.queue.exchange.inbound"),TeksResourceBundle.getString("mq.queue.sms.inbound.routing.key")),
	
	OUTBOUND_QUEUE(TeksResourceBundle.getString("mq.queue.outbound"), TeksResourceBundle.getString("mq.queue.exchange.outbound"),TeksResourceBundle.getString("mq.queue.sms.outbound.routing.key"));
	
	private final String queue;
	private final String exchange;
	private final String smsRoutingKey;
	
	private AMQPQueueType(String queue, String exchange, String smsRoutingKey) {
		this.queue = queue;
		this.exchange = exchange;
		this.smsRoutingKey = smsRoutingKey;
	}

	public String getQueue() {
		return queue;
	}

	public String getExchange() {
		return exchange;
	}

	public String getSmsRoutingKey() {
		return smsRoutingKey;
	}
	
	
	
}
