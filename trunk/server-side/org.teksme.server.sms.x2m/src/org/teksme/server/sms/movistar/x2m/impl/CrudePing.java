package org.teksme.server.sms.movistar.x2m.impl;

import java.net.URL;
import java.util.Vector;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcLiteHttpTransportFactory;

public class CrudePing {

	private static final String URL = "http://test.xmlrpc.wordtracker.com/";

	public void testXMLRPC() throws Exception {

		// XmlRpc.setDebug(true);
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		config.setServerURL(new URL(URL));

		XmlRpcClient client = new XmlRpcClient();
		client.setTransportFactory(new XmlRpcLiteHttpTransportFactory(client));
		client.setConfig(config);

		Vector params = new Vector();
		params.addElement("guest");

		Object result = client.execute("ping", params);

		if (result != null)
			System.out.println("Successfully pinged guest account.");
	}
}
