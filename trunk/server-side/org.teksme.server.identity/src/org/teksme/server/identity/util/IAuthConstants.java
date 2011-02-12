package org.teksme.server.identity.util;

public interface IAuthConstants {

	public String TIMESTAMP_REFUSED = "Timestamp refused: ";//$NON-NLS-1$

	public String URL_PATH_ACCESS_TOKEN = "/OAuthGetAccessToken";//$NON-NLS-1$

	public String URL_PATH_REQUEST_TOKEN = "/OAuthGetRequestToken";//$NON-NLS-1$

	public String URL_AUTHENTICATION = "/OAuthAuthentication";//$NON-NLS-1$;

	public String URL_PATH_SECRET_TOKEN = "/OAuthGetSecretToken";//$NON-NLS-1$

	public String OAUTH_USER = "user";//$NON-NLS-1$
	public String OAUTH_PASSWORD = "password";//$NON-NLS-1$

	public static final String VERSION_1_0 = "1.0";//$NON-NLS-1$

	/** The encoding used to represent characters as bytes. */
	public static final String ENCODING = "UTF-8";//$NON-NLS-1$

	/** The MIME type for a sequence of OAuth parameters. */
	public static final String FORM_ENCODED = "application/x-www-form-urlencoded";//$NON-NLS-1$

	public static final String OAUTH_CONSUMER_KEY = "oauth_consumer_key";//$NON-NLS-1$
	public static final String OAUTH_TOKEN = "oauth_token";//$NON-NLS-1$
	public static final String OAUTH_TOKEN_SECRET = "oauth_token_secret";//$NON-NLS-1$
	public static final String OAUTH_SIGNATURE_METHOD = "oauth_signature_method";//$NON-NLS-1$
	public static final String OAUTH_SIGNATURE = "oauth_signature";//$NON-NLS-1$
	public static final String OAUTH_TIMESTAMP = "oauth_timestamp";//$NON-NLS-1$
	public static final String OAUTH_NONCE = "oauth_nonce";//$NON-NLS-1$
	public static final String OAUTH_VERSION = "oauth_version";//$NON-NLS-1$
	public static final String OAUTH_CALLBACK = "oauth_callback";//$NON-NLS-1$
	public static final String OAUTH_ACCESSOR_SECRET = "oauth_accessor_secret";//$NON-NLS-1$

	public static final String HMAC_SHA1 = "HMAC-SHA1";//$NON-NLS-1$
	public static final String RSA_SHA1 = "RSA-SHA1";//$NON-NLS-1$

}
