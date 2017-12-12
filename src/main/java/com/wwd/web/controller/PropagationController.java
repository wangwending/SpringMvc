package com.wwd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
		* ClassName: PropagationController <br/>
		* Function: 事务的传播处理. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@RequestMapping("propagation")
@Controller
public class PropagationController {
	@RequestMapping(value = "required")
	public @ResponseBody String propagationRequired() {
		
		return "事务的默认传播行为Required";
	}
}
