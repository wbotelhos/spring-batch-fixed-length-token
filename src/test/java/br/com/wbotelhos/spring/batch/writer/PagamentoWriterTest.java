package br.com.wbotelhos.spring.batch.writer;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.util.StopWatch;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:csvFixedLengthToDBJob.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class PagamentoWriterTest {

	private final static Logger logger = Logger.getLogger(PagamentoWriterTest.class);

	@Autowired private JobLauncher launcher;
	@Autowired private Job job;

	private JobParameters jobParameters = new JobParameters();

	@Test
	public void shouldLaunchJob() throws Exception {
		StopWatch watch = new StopWatch();

		watch.start();
		launcher.run(job, jobParameters);
		watch.stop();

		logger.info("TIME ELAPSED: " + watch.shortSummary());
	}

}