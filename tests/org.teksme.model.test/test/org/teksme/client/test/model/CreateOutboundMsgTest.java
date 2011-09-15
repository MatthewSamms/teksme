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
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.teksme.model.teks.Channel;
import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.model.teks.Shout;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;

public class CreateOutboundMsgTest extends TeksModelTest {

	private static final String MODEL_FILE = "output/teks_outmsg.xml";

	@Test
	public void createOutboundMsg() {
		TeksPackageImpl.init();
		// Retrieve the default factory singleton
		TeksFactory factory = TeksFactory.eINSTANCE;
		// Create an instance of Teks
		Teks teksModel = factory.createTeks();

		OutboundMessage outMsg = factory.createOutboundMessage();

		outMsg.setId(UUID.randomUUID().toString());

		// The source/sender address that the message will appear to come from
		// also known as “Sender ID”
		outMsg.setFrom("+12023567865");

		// The number of the handset to which the message must be delivered
		outMsg.setTo("+12028129412, +12025501337");

		outMsg.setCallback("http://yourapp.com/callback");

		Channel channel = factory.createChannel();
		channel.setChannel(new String[] { ChannelKind.SMS.getLiteral(),
				ChannelKind.GTALK.getLiteral(),
				ChannelKind.TWITTER.getLiteral() });

		outMsg.setChannels(channel);

		outMsg.setRouting(SMSGatewayKind.BULKSMS);
		
		Shout shout = factory.createShout();
		shout.setThis("Hello from TeksMe Cloud!");

		outMsg.setShout(shout);

		outMsg.setStopOnError(false);

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date tomorrow = calendar.getTime();

		outMsg.setSchedule(tomorrow);

		outMsg.setConcatenated(false);

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
