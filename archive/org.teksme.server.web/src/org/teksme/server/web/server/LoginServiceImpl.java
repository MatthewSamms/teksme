package org.teksme.server.web.server;

import org.teksme.server.web.client.LoginService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	@Override
	public String login(String username, String password)
			throws IllegalArgumentException {

		System.out.println("LoginServiceImpl.login()");

		return null;
	}

}
