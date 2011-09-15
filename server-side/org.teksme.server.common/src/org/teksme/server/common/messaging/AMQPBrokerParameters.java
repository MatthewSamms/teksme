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
public interface AMQPBrokerParameters {

	public static final String PROP_NAME = TeksResourceBundle.getString("mq.prop.name").trim();

	public static final String PROP_HOST = TeksResourceBundle.getString("mq.prop.host").trim();

	public static final Integer PROP_PORT = Integer.valueOf(TeksResourceBundle.getString("mq.prop.port").trim());

	public static final String PROP_USERNAME = TeksResourceBundle.getString("mq.prop.username").trim();

	public static final String PROP_PASSWORD = TeksResourceBundle.getString("mq.prop.passwd").trim();

	public static final String PROP_VIRTUAL_HOST = TeksResourceBundle.getString("mq.prop.virtual.host").trim();

	public static final String CONNECTION_NAME = TeksResourceBundle.getString("mq.connection.name").trim();

	public static final String CONNECTION_HOST = TeksResourceBundle.getString("mq.connection.host").trim();
	
	public static final String DURABLE = TeksResourceBundle.getString("mq.channel.durable").trim();

	public static final String AUTO_DELETE = TeksResourceBundle.getString("mq.channel.autoDelete").trim();
	
	public static final String EXCLUSIVE = TeksResourceBundle.getString("mq.channel.exclusive").trim();
	
	public static final String TYPE = TeksResourceBundle.getString("mq.channel.type").trim();

}
