/**
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

import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedServiceFactory;

import com.rabbitmq.client.Connection;

/**
 * 
 * @since 0.5
 * 
 */
public class AMQPConnectionServiceFactory implements ManagedServiceFactory {

	private final Map<String, AMQPServiceRegistry<Connection, ServiceRegistration>> map = new HashMap<String, AMQPServiceRegistry<Connection, ServiceRegistration>>();

	AMQPServiceRegistry<Connection, ServiceRegistration> connPair = null;
	ServiceRegistration reg = null;

	private final BundleContext context;

	private static Logger logger = Logger.getLogger(AMQPConnectionServiceFactory.class.getName());

	public void updated(String pid, @SuppressWarnings("rawtypes") Dictionary props) throws ConfigurationException {

		logger.info("AMQPConnectionServiceFactory.updated()");

		try {

			Hashtable<String, String> serviceProperties = new Hashtable<String, String>();

			serviceProperties.put(AMQPBrokerParameters.CONNECTION_NAME, AMQPBrokerParameters.PROP_NAME);
			serviceProperties.put(AMQPBrokerParameters.CONNECTION_HOST, AMQPBrokerParameters.PROP_HOST);

			Connection conn = init();

			reg = context.registerService(Connection.class.getName(), conn, serviceProperties);

			connPair = new AMQPServiceRegistry<Connection, ServiceRegistration>(conn, reg);

		} catch (IOException e) {
			throw new ConfigurationException(null, "Error connecting to broker", e);
		}

		AMQPServiceRegistry<Connection, ServiceRegistration> old = null;
		synchronized (map) {
			old = map.put(pid, connPair);
		}

		if (old != null) {
			old.getSender().unregister();
			try {
				old.getFst().close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public AMQPConnectionServiceFactory(BundleContext context) throws AMQPBrokerException {

		this.context = context;

		Connection conn = null;
		try {
			conn = init();

			Hashtable<String, String> serviceProperties = new Hashtable<String, String>();
			serviceProperties.put(AMQPBrokerParameters.CONNECTION_NAME, AMQPBrokerParameters.PROP_NAME);
			serviceProperties.put(AMQPBrokerParameters.CONNECTION_HOST, AMQPBrokerParameters.PROP_HOST);

			reg = context.registerService(Connection.class.getName(), conn, serviceProperties);

			connPair = new AMQPServiceRegistry<Connection, ServiceRegistration>(conn, reg);

		} catch (IOException e) {
			throw new AMQPBrokerException("Internal RabbitMQ messaging broker error: " + e.getMessage());
		}
	}

	public void deleted(String pid) {
		AMQPServiceRegistry<Connection, ServiceRegistration> pair = null;
		synchronized (map) {
			pair = map.remove(pid);
		}
		if (pair != null) {
			pair.getSender().unregister();
			try {
				pair.getFst().close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public String getName() {
		return "AMQP Connection Factory";
	}

	private Connection init() throws IOException {

		logger.info("AMQPConnectionServiceFactory.init()");

		String host = AMQPBrokerParameters.PROP_HOST;
		String name = AMQPBrokerParameters.PROP_NAME;

		Properties svcProps = new Properties();
		svcProps.put(AMQPBrokerParameters.CONNECTION_NAME, name);
		svcProps.put(AMQPBrokerParameters.CONNECTION_HOST, host);

		AMQPBrokerManager msgBroker = new AMQPBrokerManager();

		Connection conn = msgBroker.connect();

		// FIXME
		msgBroker.declareQueueing(conn, AMQPQueueType.OUTBOUND_QUEUE);

		return conn;
	}

}
