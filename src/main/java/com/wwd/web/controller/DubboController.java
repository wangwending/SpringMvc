package com.wwd.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wwd.dubbo.service.StudentService;

/**
 * 
		* ClassName: DubboController <br/>
		* Function: Dubbo校验. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@Controller
@RequestMapping("dubbo")
public class DubboController {
	private static Logger log = LoggerFactory.getLogger(DubboController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("out")
	@ResponseBody
	public String dubboOut() {
		studentService.outTest();
		log.info("dubbo test ok !!!");
		return "dubbo out!!!";
	}
	
}
