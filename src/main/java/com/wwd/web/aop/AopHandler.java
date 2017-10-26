package com.wwd.web.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
		* ClassName: AopHandler <br/>
		* Function: AOP处理. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@Aspect
@Component
public class AopHandler {
	public static Logger log = Logger.getLogger(AopHandler.class);
	
	@Pointcut("execution(* com.wwd.web.*.impl.AopServiceImpl.*(..))")
	public void aopMethod() {}
	
	@Before("aopMethod()")
	public void before() {
		System.out.println("AOP before advice!");
	}
}
