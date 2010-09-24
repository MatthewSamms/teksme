/**
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.common.jms;


/**
 * 
 * @since 0.5
 *
 */
public interface PropertiesMQ {

	//FIXME - implement a correct resource
	public static final String PROP_NAME = "local";
	public static final String PROP_HOST = "localhost";
	public static final Integer PROP_PORT = -1;
	public static final String PROP_USERNAME = "guest";
	public static final String PROP_PASSWORD = "guest";
	public static final String PROP_VIRTUAL_HOST = "/";
	
	public static final String CONNECTION_NAME = "connection.name";
	public static final String CONNECTION_HOST = "connection.host";

	public static final String QUEUE_NAME_INBOUND = "InboundQueue";
	public static final String QUEUE_NAME_OUTBOUND = "OutboundQueue";
	public static final String EXCHANGE_NAME_INBOUND = "InboundEx";
	public static final String EXCHANGE_NAME_OUTBOUND = "OutboundEx";


}
