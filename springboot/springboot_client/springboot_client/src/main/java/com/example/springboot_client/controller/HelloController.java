package com.example.springboot_client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		String msg="hello spring boot admin";
		System.out.println(msg);
		return msg;
	}
}
