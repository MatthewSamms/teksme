package org.teksme.server.web.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {

	String login(String username, String password)
			throws IllegalArgumentException;
}
