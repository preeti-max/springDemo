package com.springboot.workers.springjdbcexample.controller;



import com.springboot.workers.springjdbcexample.util.DateTimeUtilities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	@GetMapping("/")
	public String welcomeMsg() {
		
		return "Hello visitor!\n Visiting time: "+DateTimeUtilities.getCurrentTimestamp();
	}

}