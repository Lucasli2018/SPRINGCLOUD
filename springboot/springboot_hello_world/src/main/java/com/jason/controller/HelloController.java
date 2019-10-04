package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	//@Value("${msg}")
	private String msg;

	@RequestMapping("/hello")
	public String hello(Model model){
		String msg=this.msg;
		msg="hello springboot";
		System.out.println(msg);
		model.addAttribute("msg", msg);
		return "hello";
	}
}
