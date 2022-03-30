package com.springboot.springDemo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String welcomeMsg() {
		return "Hello Visitor!";
	}

}
