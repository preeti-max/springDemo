package com.example.dataaccess.controllers;
import java.sql.Timestamp;

import com.example.dataaccess.util.Utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	@GetMapping("/")
	public String welcomeMsg() {
		
		return "Hello visitor!\n Visiting time: "+Utils.getCurrentTimestamp();
	}

}