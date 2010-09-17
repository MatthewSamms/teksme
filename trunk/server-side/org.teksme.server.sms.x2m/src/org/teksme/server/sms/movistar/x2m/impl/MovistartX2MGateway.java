package org.teksme.server.sms.movistar.x2m.impl;

import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcLiteHttpTransportFactory;

public class MovistartX2MGateway {

	public void sendMessage(String message) {
		String XmlRpcMethod = "Tiaxa.SendMsg";
		String URL = "http://wawanet:wawa123@200.37.161.80/x2m/rpc2";
		String code = "";
		String text = "";
		try {
			// XmlRpc.setDebug(true);
			XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
			config.setServerURL(new URL(URL));

			XmlRpcClient client = new XmlRpcClient();
			client.setTransportFactory(new XmlRpcLiteHttpTransportFactory(
					client));
			client.setConfig(config);

			Vector<Hashtable<String, String>> data = new Vector<Hashtable<String, String>>();
			Hashtable<String, String> ht1 = new Hashtable<String, String>();
			ht1.put("celular", "+12028129412");
			ht1.put("texto", "Hello from TeksMe!");
			ht1.put("fecha", "");
			data.add(ht1);

//			Hashtable<String, String> ht2 = new Hashtable<String, String>();
//			ht2.put("celular", "91234568");
//			ht2.put("texto", "Hola Mundo 2");
//			ht2.put("fecha", "");
//			data.add(ht2);
//
//			Hashtable<String, String> ht3 = new Hashtable<String, String>();
//			ht3.put("celular", "91234569");
//			ht3.put("texto", "Hola Mundo 3");
//			ht3.put("fecha", "2005-07-07 00:00:00");
//			data.add(ht3);

			Vector vec = new Vector();
			vec.add(data);
			Vector res = (Vector) client.execute(XmlRpcMethod, vec);
			if (res == null) {
				code = "101";
				text = "DispatchMT::doDispatch : XmlRpc dispatch. Null response.";
			}

			System.out.println("Response : " + res + "\n");

		} catch (Exception e) {
			code = "104";
			text = "DispatchMT::doDispatch : XmlRpc dispatch. Exception: "
					+ e.getMessage();
			System.out.println("Exception: " + e.getMessage());
		}
	}
}