package com.wwd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("simple")
public class SimpleDemo {
	
	@RequestMapping("hello")
	public String hello() {
		return "data/hello";
	}
}
