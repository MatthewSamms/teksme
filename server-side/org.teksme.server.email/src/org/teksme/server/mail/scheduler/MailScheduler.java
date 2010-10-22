package org.teksme.server.mail.scheduler;

import org.quartz.SchedulerException;

public class MailScheduler {

	public void run() throws SchedulerException, InterruptedException {
		run(null);
	}

	public void run(String[] args) throws SchedulerException,
			InterruptedException {

		MailRetrieverTriggerRunner triggerRunner = new MailRetrieverTriggerRunner();
		triggerRunner.task();

	}
}
