/**
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.common.validator;

public enum HttpStatusCode {

	// --- 2xx Success ---
	/** <tt>200 OK</tt> (HTTP/1.0 - RFC 1945) */
	// HTTP 1.0 Server status codes -- see RFC 1945

	SC_OK(200, "OK"),

	/** <tt>201 Created</tt> (HTTP/1.0 - RFC 1945) */
	SC_CREATED(201, "Created"),

	/** <tt>202 Accepted</tt> (HTTP/1.0 - RFC 1945) */
	SC_ACCEPTED(202, "Accepted"),

	/** <tt>204 No Content</tt> (HTTP/1.0 - RFC 1945) */
	SC_NO_CONTENT(204, "No Content"),

	/** <tt>301 Moved Permanently</tt> (HTTP/1.0 - RFC 1945) */
	SC_MOVED_PERMANENTLY(301, "Moved Permanently"),

	/**
	 * <tt>302 Moved Temporarily</tt> (Sometimes <tt>Found</tt>) (HTTP/1.0 - RFC
	 * 1945)
	 */
	SC_MOVED_TEMPORARILY(302, "Moved Temporarily"),

	/** <tt>304 Not Modified</tt> (HTTP/1.0 - RFC 1945) */
	SC_NOT_MODIFIED(304, "Not Modified"),

	/** <tt>400 Bad Request</tt> (HTTP/1.1 - RFC 2616) */
	SC_BAD_REQUEST(400, "Bad Request"),

	/** <tt>401 Unauthorized</tt> (HTTP/1.0 - RFC 1945) */
	SC_UNAUTHORIZED(401, "Unauthorized"),

	/** <tt>403 Forbidden</tt> (HTTP/1.0 - RFC 1945) */
	SC_FORBIDDEN(403, "Forbidden"),

	/** <tt>404 Not Found</tt> (HTTP/1.0 - RFC 1945) */
	SC_NOT_FOUND(404, "Not Found"),

	/** <tt>500 Server Error</tt> (HTTP/1.0 - RFC 1945) */
	SC_INTERNAL_SERVER_ERROR(500, "Internal Server Error"),

	/** <tt>501 Not Implemented</tt> (HTTP/1.0 - RFC 1945) */
	SC_NOT_IMPLEMENTED(501, "Not Implemented"),

	/** <tt>502 Bad Gateway</tt> (HTTP/1.0 - RFC 1945) */
	SC_BAD_GATEWAY(502, "Bad Gateway"),

	/** <tt>503 Service Unavailable</tt> (HTTP/1.0 - RFC 1945) */
	SC_SERVICE_UNAVAILABLE(503, "Service Unavailable"),

	// HTTP 1.1 Server status codes -- see RFC 2048

	/** <tt>100 Continue</tt> (HTTP/1.1 - RFC 2616) */
	SC_CONTINUE(100, "Continue"),

	/** <tt>307 Temporary Redirect</tt> (HTTP/1.1 - RFC 2616) */
	SC_TEMPORARY_REDIRECT(307, "Temporary Redirect"),

	/** <tt>405 Method Not Allowed</tt> (HTTP/1.1 - RFC 2616) */
	SC_METHOD_NOT_ALLOWED(405, "Method Not Allowed"),

	/** <tt>409 Conflict</tt> (HTTP/1.1 - RFC 2616) */
	SC_CONFLICT(409, "Conflict"),

	/** <tt>412 Precondition Failed</tt> (HTTP/1.1 - RFC 2616) */
	SC_PRECONDITION_FAILED(412, "Precondition Failed"),

	/** <tt>413 Request Entity Too Large</tt> (HTTP/1.1 - RFC 2616) */
	SC_REQUEST_TOO_LONG(413, "Request Too Long"),

	/** <tt>414 Request-URI Too Long</tt> (HTTP/1.1 - RFC 2616) */
	SC_REQUEST_URI_TOO_LONG(414, "Request-URI Too Long"),

	/** <tt>415 Unsupported Media Type</tt> (HTTP/1.1 - RFC 2616) */
	SC_UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),

	/** <tt>300 Mutliple Choices</tt> (HTTP/1.1 - RFC 2616) */
	SC_MULTIPLE_CHOICES(300, "Multiple Choices"),

	/** <tt>303 See Other</tt> (HTTP/1.1 - RFC 2616) */
	SC_SEE_OTHER(303, "See Other"),

	/** <tt>305 Use Proxy</tt> (HTTP/1.1 - RFC 2616) */
	SC_USE_PROXY(305, "Use Proxy"),

	// --- 4xx Client Error ---
	/** <tt>402 Payment Required</tt> (HTTP/1.1 - RFC 2616) */
	SC_PAYMENT_REQUIRED(402, "Payment Required"),

	/** <tt>406 Not Acceptable</tt> (HTTP/1.1 - RFC 2616) */
	SC_NOT_ACCEPTABLE(406, "Not Acceptable"),

	/** <tt>407 Proxy Authentication Required</tt> (HTTP/1.1 - RFC 2616) */
	SC_PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required"),

	/** <tt>408 Request Timeout</tt> (HTTP/1.1 - RFC 2616) */
	SC_REQUEST_TIMEOUT(408, "Request Timeout"),

	/** <tt>101 Switching Protocols</tt> (HTTP/1.1 - RFC 2616) */
	SC_SWITCHING_PROTOCOLS(101, "Switching Protocols"),

	/** <tt>203 Non Authoritative Information</tt> (HTTP/1.1 - RFC 2616) */
	SC_NON_AUTHORITATIVE_INFORMATION(203, "Non Authoritative Information"),

	/** <tt>205 Reset Content</tt> (HTTP/1.1 - RFC 2616) */
	SC_RESET_CONTENT(205, "Reset Content"),

	/** <tt>206 Partial Content</tt> (HTTP/1.1 - RFC 2616) */
	SC_PARTIAL_CONTENT(206, "Partial Content"),

	/** <tt>504 Gateway Timeout</tt> (HTTP/1.1 - RFC 2616) */
	SC_GATEWAY_TIMEOUT(504, "Gateway Timeout"),

	/** <tt>505 HTTP Version Not Supported</tt> (HTTP/1.1 - RFC 2616) */
	SC_HTTP_VERSION_NOT_SUPPORTED(505, "Http Version Not Supported"),

	/** <tt>410 Gone</tt> (HTTP/1.1 - RFC 2616) */
	SC_GONE(410, "Gone"),

	/** <tt>411 Length Required</tt> (HTTP/1.1 - RFC 2616) */
	SC_LENGTH_REQUIRED(411, "Length Required"),

	/** <tt>416 Requested Range Not Satisfiable</tt> (HTTP/1.1 - RFC 2616) */
	SC_REQUESTED_RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),

	/** <tt>417 Expectation Failed</tt> (HTTP/1.1 - RFC 2616) */
	SC_EXPECTATION_FAILED(417, "Expectation Failed"),

	/** <tt>422 Unprocessable Entity</tt> (HTTP/1.1 - RFC 2616) */
	SC_UNPROCESSABLE_ENTITY(422, "Unprocessable Entity");

	private final int value;

	private final String name;

	private HttpStatusCode(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

}
