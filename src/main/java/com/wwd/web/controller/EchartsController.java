package com.wwd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
		* ClassName: EchartsController <br/>
		* Function: echarts报表逻辑处理. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@Controller
@RequestMapping("echarts")
public class EchartsController {
	
	@RequestMapping("map")
	public String map() {
		
		return "map";
	}
	
	@RequestMapping("pay")
	public String pay() {
		
		return "pay";
	}
}
