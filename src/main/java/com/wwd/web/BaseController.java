package com.wwd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("common")
public class BaseController {
	
	@RequestMapping("hello/{ownerId}")
	public String hello(@PathVariable String ownerId) {
		ownerId = "path";
		return "hello";
	}
	
	
//	@RequestMapping("hello")
//	public String hello() {
//		return "hello";
//	}
//	@RequestMapping("/hello") 
//	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {
//		
//		return new ModelAndView("hello");
//	}
	
}
