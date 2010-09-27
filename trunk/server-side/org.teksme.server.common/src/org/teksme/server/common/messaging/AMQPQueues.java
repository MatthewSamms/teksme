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

package org.teksme.server.common.messaging;

import org.teksme.server.common.TeksResourceBundle;

public final class AMQPQueues {

	// public static final String OUTBOUND_QUEUE = "queue/outboundPrimaryQueue";

	// public static final String INBOUND_QUEUE = "queue/inboundPrimaryQueue";

	// public static final String DLQ = "/queue/DLQ";

	public static final String QUEUE_NAME_INBOUND = TeksResourceBundle.getString("mq.queue.name.inbound");

	public static final String QUEUE_NAME_OUTBOUND = TeksResourceBundle.getString("mq.queue.name.outbound");

	public static final String EXCHANGE_NAME_INBOUND = TeksResourceBundle.getString("mq.queue.name.exchange.name.inbound");

	public static final String EXCHANGE_NAME_OUTBOUND = TeksResourceBundle.getString("mq.queue.name.exchange.name.outbound");

}
