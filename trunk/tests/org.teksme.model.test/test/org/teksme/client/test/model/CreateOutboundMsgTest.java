/*
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

package org.teksme.client.test.model;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.Developer;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.TextMessage;
import org.teksme.model.teks.impl.TeksPackageImpl;

public class CreateOutboundMsgTest extends TeksModelTest {

	private static final String APPID = "128552450490126";
	private static final String DEVELOPER_PROFILE_ID = "56f3d45cb6f14af22fee33245bf53b8e";
	private static final String MODEL_FILE = "output/teks_outmsg.xml";
	private static final String FROM = "1202172638716";

	@Test
	public void createOutboundMsg() {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks teksModel = factory.createTeks();
		teksModel.setAppId(APPID);

		Developer developerProfile = factory.createDeveloper();
		developerProfile.setId(DEVELOPER_PROFILE_ID);

		teksModel.setDeveloper(developerProfile);

		OutboundTextMessage outMsg = factory.createOutboundTextMessage();

		outMsg.setTimestamp(new Date());

		outMsg.setCommunicationChannel(new ChannelKind[] { ChannelKind.SMS,
				ChannelKind.TWITTER, ChannelKind.EMAIL });

		outMsg.setSmsGateway(SMSGatewayKind.MOVISTAR_PERU);

		outMsg.setRetryCount(2);

		// The source/sender address that the message will appear to come from
		// also known as “Sender ID”
		outMsg.setFrom(0, FROM);

		// The number of the handset to which the message must be delivered
		outMsg.setRecipient(new String[] { "+12028125643" });

		// Delays delivery of SMS to mobile device in minutes
		outMsg.setDeliveryDelayTime(0, 10);

		// The validity period in minutes
		outMsg.setValidityTimeframe(0, 11);

		// Client message ID defined by user for message tracking.
		outMsg.setClientMsgId(0, UUID.randomUUID().toString());

		// Messages in the highest priority queue will be delivered first
		// (range: 1-3).
		outMsg.setDeliveryQueuePriority(0, 1);

		// callback which is posted to a user URL using the GET or POST
		// method. This is done every time a message status is updated
		outMsg.setDeliveryAck(0, true);

		// Final or intermediary statuses are passed back by the API depending
		// on the callback value set in the original post
		outMsg.setCallbackCode(0, 1);

		//send messages longer than a standard message
		outMsg.setConcatenated(0, 1);
		
		//Specify when a message gets delivered.
		outMsg.setDeliveryScheduledTime(0, new Date());
		
		TextMessage text = factory.createTextMessage();
		text.setText("Hello from TeksMe!");

		outMsg.setMessage(text);
		
		outMsg.setTeksRef(teksModel);
		
		teksModel.setOutboundMessage(0, outMsg);

		Resource resource = resourceSet.createResource(URI
				.createFileURI(MODEL_FILE));
		// add the root object to the resource
		resource.getContents().add(teksModel);
		// serialize resource – you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
