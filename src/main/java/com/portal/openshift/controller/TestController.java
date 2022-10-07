package com.portal.openshift.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${spring.application.name}")
	public String appName;
	
	@GetMapping("/hello")
	public String ping() {
		
		
		return "Hello";
	}
	
	@GetMapping("/getapp-name")
	public String getName() {
		
		
		return "This is App Name :"+appName;
	}
	
}
