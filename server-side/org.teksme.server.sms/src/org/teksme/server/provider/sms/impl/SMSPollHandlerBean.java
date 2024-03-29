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
package org.teksme.server.provider.sms.impl;

import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import org.teksme.model.teks.Poll;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.common.utils.TeksModelHelper;
import org.teksme.server.provider.sms.service.SMSPollHandler;

/**
 * Session Bean implementation class CreatePollBean
 */

// @Local({ SMSPollHandlerBeanLocal.class })
// @Remote({ SMSPollHandler.class })
// @Stateless(name = "CreatePoll", mappedName = SMSPollHandler.JNDI_NAME)
public class SMSPollHandlerBean implements SMSPollHandler {

	Logger logger = Logger.getLogger(SMSPollHandlerBean.class.getName());

	private static final String MODEL_FILE = "/Users/fabianocruz/teks.xml";

	// private static final String MODEL_FOLDER = "/Users/fabianocruz/";

	/**
	 * Default constructor.
	 */
	public SMSPollHandlerBean() {
		// TODO Auto-generated constructor stub
	}

	// @PostConstruct
	public static void setResourceSet() {
		TeksPackageImpl.init();
	}

	public void createPollModelFromXml(String xmlInput) throws IOException {

		Teks teksObj = TeksModelHelper.INSTANCE.createTeksModelFromXml(xmlInput);

		Poll poll = teksObj.getPoll();
		poll.setId(UUID.randomUUID().toString());

		//TeksModelHelper.INSTANCE.serializeTeksModelXMLData(teksObj, MODEL_FILE);

		persistPoll(teksObj);

		logger.info(teksObj.getPoll().getAuthor());

	}

	public void persistPoll(Teks teksInquiry) {

		//TeksModelHelper.INSTANCE.persistPoll(teksInquiry);

	}
}
