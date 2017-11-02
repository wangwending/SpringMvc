package com.wwd.web.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 
		* ClassName: QuartzJobSimple <br/>
		* Function: 继承QuartzJobBean实现定时任务. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
public class QuartzJobSimple extends QuartzJobBean{

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("QuartzJobBean 定时任务的 ！！！");
	}

}
