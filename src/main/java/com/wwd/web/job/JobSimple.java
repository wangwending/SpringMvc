package com.wwd.web.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
		* ClassName: JobSimple <br/>
		* Function: spring基于注解的简单的java定时任务. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@Component("jobSimple")
public class JobSimple {
	
	
	// 每3秒中跑一次
	@Scheduled(cron = "0/3 * * * * ?")
	public void jobDemo() {
		System.out.println("简单的定时任务!!!");
	}
}
