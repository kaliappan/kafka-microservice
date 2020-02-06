package com.kali.microservices.kafka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class HelloController {
	
	@RequestMapping("hello")
	public String hello() {
		return "hello producer app";
	}
}
