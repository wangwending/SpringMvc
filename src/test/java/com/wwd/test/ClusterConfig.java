package com.wwd.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.connection.RedisClusterConfiguration;

public class ClusterConfig {

	@Test
	public void clusterConfig() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
		RedisClusterConfiguration config = (RedisClusterConfiguration) applicationContext.getBean("clusterConfig");
		System.out.println(config.getClusterNodes());
	}
}	
