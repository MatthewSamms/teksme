package org.teksme.server.web.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>SendMessageService</code>.
 */
public interface SendMessageServiceAsync {
	void sendMessageToServer(String message, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
