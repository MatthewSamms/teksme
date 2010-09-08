package org.teksme.server.web.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("sendmsg")
public interface SendMessageService extends RemoteService {
	String sendMessageToServer(String message) throws IllegalArgumentException;
}
