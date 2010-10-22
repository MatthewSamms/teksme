package org.teksme.server.mail.scheduler;

import java.util.Date;

import org.quartz.CronExpression;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.teksme.server.mail.util.MessagesBundle;

public class MailRetrieverTriggerRunner {

	public void task() throws SchedulerException {
		// Initiate a Schedule Factory
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		// Retrieve a scheduler from schedule factory
		Scheduler scheduler = schedulerFactory.getScheduler();

		// current time
		long ctime = System.currentTimeMillis();

		// Initiate JobDetail with job name, job group, and executable job class
		JobDetail jobDetail = new JobDetail("jobMailRetriever", "mailSmsJobGroup1",
				MailRetrieverJob.class);
		// Initiate CronTrigger with its name and group name
		CronTrigger cronTrigger = new CronTrigger("cronTrigger1", "mailSmsJobGroup1");
		cronTrigger.setStartTime(new Date(ctime));
		try {
			// an expression to create a trigger that simply fires every 1 minutes
			CronExpression cexp = new CronExpression(MessagesBundle
					.getString("CRON_EXP_MAIL_RETRIEVER_JOB"));
			// Assign the CronExpression to CronTrigger
			cronTrigger.setCronExpression(cexp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// schedule a job with JobDetail and Trigger
		scheduler.scheduleJob(jobDetail, cronTrigger);

		// start the scheduler
		scheduler.start();
	}

}
