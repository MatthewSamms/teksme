// SMSLib for Java v3
// A Java API library for sending and receiving SMS via a GSM modem
// or other supported gateways.
// Web Site: http://www.smslib.org
//
// Copyright (C) 2002-2010, Thanasis Delenikas, Athens/GREECE.
// SMSLib is distributed under the terms of the Apache License version 2.0
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.teksme.server.sms.bulksms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import org.smslib.AGateway;
import org.smslib.GatewayException;
import org.smslib.OutboundMessage;
import org.smslib.OutboundMessage.FailureCauses;
import org.smslib.OutboundMessage.MessageStatuses;
import org.smslib.StatusReportMessage.DeliveryStatuses;
import org.smslib.TimeoutException;
import org.teksme.server.provider.sms.service.HTTPGateway;

/**
 * Gateway for BulkSMS bulk operator (http://www.bulksms.com) Outbound only -
 * implements HTTP interface.
 */
public class BulkSmsHTTPGateway extends HTTPGateway {
	public static enum Regions {
		INTERNATIONAL, UNITEDKINGDOM, SOUTHAFRICA, SPAIN, USA, GERMANY
	}

	String providerUrl = "http://bulksms.vsms.net:5567";

	String username, password;

	Object SYNC_Commander;

	public BulkSmsHTTPGateway(String id, String myUsername, String myPassword) {
		super(id);
		setRegion(Regions.INTERNATIONAL);
		this.username = myUsername;
		this.password = myPassword;
		this.SYNC_Commander = new Object();
		setAttributes(AGateway.GatewayAttributes.SEND
				| AGateway.GatewayAttributes.CUSTOMFROM
				| AGateway.GatewayAttributes.BIGMESSAGES
				| AGateway.GatewayAttributes.FLASHSMS);
	}

	public BulkSmsHTTPGateway(String id, String myUsername, String myPassword,
			Regions region) {
		this(id, myUsername, myPassword);
		setRegion(region);
	}

	@Override
	public void startGateway() throws TimeoutException, GatewayException,
			IOException, InterruptedException {
		getService().getLogger().logInfo("Starting gateway.", null,
				getGatewayId());
		super.startGateway();
	}

	@Override
	public void stopGateway() throws TimeoutException, GatewayException,
			IOException, InterruptedException {
		getService().getLogger().logInfo("Stopping gateway.", null,
				getGatewayId());
		super.stopGateway();
	}

	@Override
	public float queryBalance() throws TimeoutException, GatewayException,
			IOException, InterruptedException {
		URL url;
		List<HttpHeader> request = new ArrayList<HttpHeader>();
		List<String> response;
		String reqLine;
		request.add(new HttpHeader("username", this.username, false));
		request.add(new HttpHeader("password", this.password, false));
		reqLine = ExpandHttpHeaders(request);
		url = new URL(this.providerUrl + "/eapi/user/get_credits/1/1.1" + "?"
				+ reqLine);
		synchronized (this.SYNC_Commander) {
			response = HttpGet(url);
		}
		if (response.get(0).charAt(0) == '0')
			return Float.parseFloat(response.get(0).substring(
					response.get(0).indexOf('|') + 1));
		return -1;
	}

	@Override
	public DeliveryStatuses queryMessage(String refNo) throws TimeoutException,
			GatewayException, IOException, InterruptedException {
		URL url;
		List<HttpHeader> request = new ArrayList<HttpHeader>();
		List<String> response;
		String reqLine;
		request.add(new HttpHeader("username", this.username, false));
		request.add(new HttpHeader("password", this.password, false));
		request.add(new HttpHeader("batch_id", refNo, false));
		reqLine = ExpandHttpHeaders(request);
		url = new URL(this.providerUrl
				+ "/eapi/status_reports/get_report/2/2.0" + "?" + reqLine);
		synchronized (this.SYNC_Commander) {
			response = HttpGet(url);
		}
		if (response.get(0).indexOf("0|Results to follow") == 0) {
			StringTokenizer tokens = new StringTokenizer(response.get(2), ":");
			tokens.nextToken();
			setDeliveryErrorCode(Integer.parseInt(tokens.nextToken()));
			switch (getDeliveryErrorCode()) {
			case 11:
				return DeliveryStatuses.DELIVERED;
			case 0:
			case 10:
			case 12:
			case 63:
			case 64:
				return DeliveryStatuses.KEEPTRYING;
			default:
				return DeliveryStatuses.ABORTED;
			}
		}
		return DeliveryStatuses.UNKNOWN;
	}

	@Override
	public boolean sendMessage(OutboundMessage msg) throws TimeoutException,
			GatewayException, IOException, InterruptedException {
		URL url = null;
		List<HttpHeader> request = new ArrayList<HttpHeader>();
		List<String> response = new ArrayList<String>();
		String reqLine;
		boolean ok = false;
		
		System.out.println("Shout --> "+msg.getText());

		request.add(new HttpHeader("username", this.username, false));
		request.add(new HttpHeader("password", this.password, false));
		request.add(new HttpHeader("message", msg.getText(), false));
		request.add(new HttpHeader("msisdn", msg.getRecipient().substring(1),
				false));
		request.add(new HttpHeader("allow_concat_text_sms", "1", false));
		if (msg.getStatusReport())
			request.add(new HttpHeader("want_report", "1", false));
		if (msg.getFlashSms())
			request.add(new HttpHeader("msg_class", "0", false));
		if (msg.getFrom() != null && msg.getFrom().length() != 0)
			request.add(new HttpHeader("source_id", msg.getFrom(), false));
		else if (getFrom() != null && getFrom().length() != 0)
			request.add(new HttpHeader("source_id", getFrom(), false));
		reqLine = ExpandHttpHeaders(request);

		//System.out.println("Request line: " + reqLine);

		final String strURL = this.providerUrl
				+ "/eapi/submission/send_sms/2/2.0";

		url = new URL(strURL);
		synchronized (this.SYNC_Commander) {
			//System.out.println("URL: " + strURL);
			// response = HttpGet(url);

			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			OutputStreamWriter wr = new OutputStreamWriter(
					conn.getOutputStream());
			wr.write(reqLine);
			wr.flush();

			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				// Print the response output...
				//System.out.println(line);
				response.add(line);
			}
			wr.close();
			rd.close();
		}

		// System.out.println("Response: " + response);

		if (response.get(0).charAt(0) == '0') {
			StringTokenizer tokens = new StringTokenizer(response.get(0), "|");
			tokens.nextToken();
			tokens.nextToken();
			msg.setRefNo(tokens.nextToken());
			msg.setDispatchDate(new Date());
			msg.setGatewayId(getGatewayId());
			msg.setMessageStatus(MessageStatuses.SENT);
			incOutboundMessageCount();
			ok = true;
		} else {
			StringTokenizer tokens = new StringTokenizer(response.get(0), "|");
			switch (Integer.parseInt(tokens.nextToken())) {
			case 22:
				msg.setFailureCause(FailureCauses.GATEWAY_FAILURE);
				break;
			case 23:
				msg.setFailureCause(FailureCauses.GATEWAY_AUTH);
				break;
			case 24:
				msg.setFailureCause(FailureCauses.BAD_FORMAT);
				break;
			case 25:
			case 26:
			case 27:
			case 28:
				msg.setFailureCause(FailureCauses.NO_CREDIT);
				break;
			case 40:
				msg.setFailureCause(FailureCauses.GATEWAY_FAILURE);
				break;
			}
			msg.setRefNo(null);
			msg.setDispatchDate(null);
			msg.setMessageStatus(MessageStatuses.FAILED);
			ok = false;
		}
		return ok;
	}

	void setRegion(Regions r) {
		switch (r) {
		case INTERNATIONAL:
			this.providerUrl = "http://bulksms.vsms.net:5567";
			break;
		case UNITEDKINGDOM:
			this.providerUrl = "http://www.bulksms.co.uk:5567";
			break;
		case SOUTHAFRICA:
			this.providerUrl = "http://bulksms.2way.co.za:5567";
			break;
		case SPAIN:
			this.providerUrl = "http://bulksms.com.es:5567";
			break;
		case USA:
			this.providerUrl = "http://usa.bulksms.com:5567";
			break;
		case GERMANY:
			this.providerUrl = "http://bulksms.de:5567";
			break;
		}
	}
}
