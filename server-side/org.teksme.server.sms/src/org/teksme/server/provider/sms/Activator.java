package org.teksme.server.provider.sms;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static Logger logger = Logger.getLogger(Activator.class.getName());

	public void start(BundleContext context) throws Exception {
		logger.info("Starting TeksMe SMS gateway...");
		// TODO Auto-generated method stub

	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
