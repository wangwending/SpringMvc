package com.wwd.web.service.impl;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

import com.wwd.web.service.AopService;

/**
 * 
		* ClassName: AopServiceImpl <br/>
		* Function: AOP服务实现. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@Service("aopService")
public class AopServiceImpl implements AopService {

	@Override
	public void methodA() {
		System.out.println("AopService methodA");
	}

	@Override
	public void methodB() {
		System.out.println("AopService methodB");
		// 这里使用代理模式的原因是为了使methodA()方法再次进入AOP切口中
		((AopService) AopContext.currentProxy()).methodA();
		System.out.println("methodB called methodA end ");
	}

}
