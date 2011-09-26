package org.teksme.server.common.utils;

import java.util.List;

import org.teksme.server.common.utils.TeksConfig.MessageMiddleware.Queue;

public class Test {

	public static void main(String[] args) {
		XmlConfiguration read = new XmlConfiguration();
		TeksConfig.MessageMiddleware msgMiddleware = read.readMessageMiddlewareConfig("teks-server.xml");
		System.out.println(msgMiddleware);
		List<TeksConfig.MessageMiddleware.Queue> queues = msgMiddleware.getQueues();
		for (Queue queue : queues) {
			System.out.println(queue);
		}
	}
}
