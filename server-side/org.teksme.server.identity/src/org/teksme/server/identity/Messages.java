package org.teksme.server.identity;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.teksme.server.auth.messages"; //$NON-NLS-1$
	public static String AuthenticationToken_auth;
	public static String AuthenticationToken_authorized;
	public static String AuthenticationToken_basic;
	public static String AuthenticationToken_permission_denied;
	public static String AuthenticationToken_text;
	public static String AuthenticationToken_token;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
