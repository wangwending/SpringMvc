package com.wwd.web;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wwd.web.service.AopService;


public class Log2Demo {
	static Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	public static void main(String[] args) {
//		log.info("info");
//		log.warn("warn");
//		log.error("error");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		AopService aopServiceImpl = (AopService) context.getBean("aopService");
		aopServiceImpl.methodB();
	}
}
