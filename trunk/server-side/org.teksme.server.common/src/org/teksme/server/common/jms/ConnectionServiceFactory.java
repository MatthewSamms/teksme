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
package org.teksme.server.common.jms;

import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedServiceFactory;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConnectionParameters;

/**
 * 
 * @since 0.5
 *
 */
public class ConnectionServiceFactory implements ManagedServiceFactory {

	private final Map<String, PairMap<Connection, ServiceRegistration>> map = new HashMap<String, PairMap<Connection, ServiceRegistration>>();
	private final BundleContext context;

	public void updated(String pid, Dictionary props) throws ConfigurationException {

		String host = PropertiesMQ.PROP_HOST;
		String name= PropertiesMQ.PROP_NAME;
		Integer portObj = PropertiesMQ.PROP_PORT;

		ConnectionParameters params = new ConnectionParameters();
		params.setUsername(PropertiesMQ.PROP_USERNAME);
		params.setPassword(PropertiesMQ.PROP_PASSWORD);
		params.setVirtualHost(PropertiesMQ.PROP_VIRTUAL_HOST);

		PairMap<Connection, ServiceRegistration> connPair = null;
		try {
			ConnectionFactory connFactory = new ConnectionFactory(params);
			Connection conn = connFactory.newConnection(host, portObj == null ? -1 : portObj.intValue());

			Properties svcProps = new Properties();
			svcProps.put(PropertiesMQ.CONNECTION_NAME, name);
			svcProps.put(PropertiesMQ.CONNECTION_HOST, host);
			ServiceRegistration reg = context.registerService(Connection.class.getName(), conn, svcProps);

			connPair = new PairMap<Connection, ServiceRegistration>(conn, reg);
		} catch (IOException e) {
			throw new ConfigurationException(null, "Error connecting to broker", e);
		}

		PairMap<Connection, ServiceRegistration> old = null;
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

	public ConnectionServiceFactory(BundleContext context) {
		this.context = context;
	}

	public void deleted(String pid) {
		PairMap<Connection, ServiceRegistration> pair = null;
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
		return "Channel Factory";
	}

}
