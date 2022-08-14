package com.snort.intelli.controller;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController  {

	@GetMapping("/index")
	public String index() {
		return "Hii there..!!";
	}
	 @GetMapping("/welcome")
	public String welcome() {
		return " welcome in Springboot 2.x";
	}
}
