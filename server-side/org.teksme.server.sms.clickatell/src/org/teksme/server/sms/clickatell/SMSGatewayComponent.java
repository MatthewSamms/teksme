package org.teksme.server.sms.clickatell;

import java.io.IOException;
import java.util.logging.Logger;

import org.smslib.SMSLibException;
import org.teksme.server.provider.sms.service.SMSConnectionServiceFactory;

public class SMSGatewayComponent {

	private static Logger logger = Logger.getLogger(SMSGatewayComponent.class
			.getName());

	private ClickatellSMSGateway clickatellGateway = null;

	private SMSConnectionServiceFactory smsConnServiceFactory = null;

	public void bind(SMSConnectionServiceFactory smsGatewayFactory) {
		this.smsConnServiceFactory = smsGatewayFactory;
	}

	public void unbind(SMSConnectionServiceFactory smsGatewayFactory) {
		this.smsConnServiceFactory = null;
	}

	protected void activate() {
		clickatellGateway = new ClickatellSMSGateway();
		clickatellGateway.setSMSServiceFactory(smsConnServiceFactory);
		clickatellGateway.startGateway();
	}

	protected void deactivate() {
		try {
			logger.info("Removing Clickatell SMS gateway...");
			smsConnServiceFactory.removeSMSGateway(clickatellGateway
					.getHttpGateway());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (SMSLibException e) {
			e.printStackTrace();
		}
	}
}
