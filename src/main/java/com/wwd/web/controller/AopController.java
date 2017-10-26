package com.wwd.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.wwd.web.service.AopService;

/**
 * 
		* ClassName: AopController <br/>
		* Function: AOP逻辑处理. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@Controller
@RequestMapping("/aop")
public class AopController {
	
	private static Logger log = LoggerFactory.getLogger(AopController.class); 
	
	@Autowired
	private AopService aopService;
	
	@RequestMapping("/demo")
	public @ResponseBody String aopDemo() {
		aopService.methodA();
		aopService.methodB();
		return "Aop Test!";
	}
	
	/**
	 * 
			* servlet:(获取子容器 输出子容器的信息). <br/>
			*
			* @author wangwending
			* @param request
			* @return
			* @since JDK 1.7
	 */
	@RequestMapping("/servlet")
	public @ResponseBody String servlet(HttpServletRequest request) {
		WebApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
		String subContextString = context.toString();
		log.info("Spring Sub Context info :{}", subContextString);
		return "Servlet Test!";
	}
	
}
