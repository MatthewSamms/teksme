package org.teksme.server.impl;

import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.teksme.model.teks.Poll;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.SMSPollHandler;
import org.teksme.server.SMSPollHandlerBeanLocal;

/**
 * Session Bean implementation class CreatePollBean
 */

@Local({ SMSPollHandlerBeanLocal.class })
@Remote({ SMSPollHandler.class })
@Stateless(name = "CreatePoll", mappedName = SMSPollHandler.JNDI_NAME)
public class SMSPollHandlerBean implements SMSPollHandler,
		SMSPollHandlerBeanLocal {

	Logger logger = Logger.getLogger(SMSPollHandlerBean.class.getName());

	private static final String MODEL_FILE = "/Users/fabianocruz/teks.xml";

	// private static final String MODEL_FOLDER = "/Users/fabianocruz/";

	/**
	 * Default constructor.
	 */
	public SMSPollHandlerBean() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public static void setResourceSet() {
		TeksPackageImpl.init();
	}

	@Override
	public Teks createPollModelFromXml(String xmlInput) throws IOException {

		Teks teksObj = TeksModelHelper.INSTANCE
				.createTeksModelFromXml(xmlInput);

		Poll poll = teksObj.getPoll();
		poll.setId(UUID.randomUUID().toString());

		logger.info(teksObj.getPoll().getAuthor());

		TeksModelHelper.INSTANCE.serializeTeksModelXMLData(teksObj, MODEL_FILE);

		return teksObj;

	}

	@Override
	public void persistPoll(Teks teksInquiry) {

		TeksModelHelper.INSTANCE.persistPoll(teksInquiry);

	}
}
