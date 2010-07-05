package org.teksme.server.web.server;

import org.teksme.server.web.client.SendMessageService;
import org.teksme.server.web.shared.FieldVerifier;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class SendMessageServiceImpl extends RemoteServiceServlet implements
		SendMessageService {

	public String sendMessageToServer(String message) throws IllegalArgumentException {
		// Verify that the input is valid.
		if (!FieldVerifier.isValidName(message)) {
			throw new IllegalArgumentException(
					"Name must be at least 4 characters long");
		}

		doGet("http://localhost:8080/org.teksme.server.web.api/sendmsg?user=fabianocruz&password=PASSWORD&api_id=3243632&to=12028129412&text=Hello%20there%202!");

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");
		return "Hello, " + message + "!<br><br>Teks is running " + serverInfo
				+ ".<br><br>It looks like you are using:<br>" + userAgent;
	}

	private static void doGet(String url) {

		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET,
				URL.encode(url));

		try {
			Request request = builder.sendRequest(null, new RequestCallback() {
				public void onError(Request request, Throwable exception) {
					// Couldn't connect to server (could be timeout, SOP
					// violation, etc.)
				}

				public void onResponseReceived(Request request,
						Response response) {
					if (200 == response.getStatusCode()) {
						// Process the response in response.getText()
					} else {
						// Handle the error. Can get the status text from
						// response.getStatusText()
					}
				}
			});
		} catch (RequestException e) {
			// Couldn't connect to server
		}
	}
}
