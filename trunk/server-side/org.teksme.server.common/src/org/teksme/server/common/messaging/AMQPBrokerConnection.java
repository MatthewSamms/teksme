package org.teksme.server.common.messaging;

import java.io.IOException;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConnectionParameters;

public final class AMQPBrokerConnection {

	protected Connection connect() throws IOException {

		String host = AMQPBrokerParameters.PROP_HOST;
		Integer portObj = AMQPBrokerParameters.PROP_PORT;

		ConnectionParameters params = new ConnectionParameters();
		params.setUsername(AMQPBrokerParameters.PROP_USERNAME);
		params.setPassword(AMQPBrokerParameters.PROP_PASSWORD);
		params.setVirtualHost(AMQPBrokerParameters.PROP_VIRTUAL_HOST);

		ConnectionFactory connFactory = new ConnectionFactory(params);
		Connection conn = connFactory.newConnection(host, portObj == null ? -1 : portObj.intValue());

		return conn;
	}

}// class AMQPBrokerConnection
