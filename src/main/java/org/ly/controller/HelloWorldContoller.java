package org.ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldContoller {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

}
