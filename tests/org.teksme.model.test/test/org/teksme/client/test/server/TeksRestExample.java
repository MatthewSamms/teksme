package org.teksme.client.test.server;

import java.util.HashMap;
import java.util.Map;

import org.teksme.model.teks.Response;

public class TeksRestExample {

	public static void main(String[] args) {

		String accountSid = "FM56f3d45cb6f14af22fee33245bf53b8e";
		String authSecretKey = "teksme";
		String profileId = "wawared";

		/* Instantiate a new TeksMe Rest Client */
		TeksRestClient client = new TeksRestClient(accountSid, authSecretKey,
				profileId, null);

		sendMessageExample(client, "+12028129412", "+12028129412", "SMS",
				"Hello from TeksMe Cloud!");

	}

	private static void sendMessageExample(TeksRestClient client, String from,
			String to, String channel, String textMessage) {

		// build map of post parameters
		Map<String, String> params = new HashMap<String, String>();
		params.put("from", from);
		params.put("to", to);
		params.put("channel", channel);
		params.put("shout", textMessage);

		Response response;

		try {
//			response = client.request("/p/" + client.getProfileId()
//					+ "/sendMessage", "POST", params);

			response = client.request("/sendmsg", "GET", params);

			if (!response.getError().eContents().isEmpty()) {
				org.teksme.model.teks.Error error = response.getError();
				System.out.println("Error sending outbound message: "
						+ error.getStatus() + "\n" + error.getMessage());
			} else {
				System.out.println(response.getMessage());

			}
		} catch (TeksRestException e) {
			e.printStackTrace();
		}

	}
}
