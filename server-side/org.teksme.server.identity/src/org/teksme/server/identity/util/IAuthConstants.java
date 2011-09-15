/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
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
