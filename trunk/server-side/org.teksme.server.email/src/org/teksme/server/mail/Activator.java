package org.teksme.server.mail;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.quartz.SchedulerException;
import org.teksme.server.mail.scheduler.MailScheduler;

public class Activator implements BundleActivator {

	private static Logger logger = Logger.getLogger(Activator.class.getName());

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		logger.info("Starting TeksMe Email bundle...");

		Activator.context = bundleContext;

		MailScheduler surveySch = new MailScheduler();
		try {
			surveySch.run();
		} catch (SchedulerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
