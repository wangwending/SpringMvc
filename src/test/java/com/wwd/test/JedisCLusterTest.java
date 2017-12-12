package com.wwd.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.JedisCluster;

/**
 * 
		* ClassName: JedisCLusterTest <br/>
		* Function: redis集群测试. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
public class JedisCLusterTest extends BaseTest{
	private final static Logger log = LoggerFactory.getLogger(JedisCLusterTest.class);
	
	@Autowired
	private JedisCluster jedisCluster;
	
	@Test
	public void jedisTest() {
		String string = jedisCluster.set("b", "b");
		log.info("redis cluster info [{}] value [{}]", string, jedisCluster.get("b"));
	}
	
}
