package com.springboot.springDemo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@GetMapping("/task")
	public String taskDemo() {
		return "Task demonstration";
	}
	@GetMapping("/task/showMyInfo")
	public String showInfo() {
		return "Name: Preeti, City: Raipur, State: Chhattisgarh, Dream job: SDE ";
	}
	@GetMapping("/task/showMyHobbies")
	public List<String> hobbies() {
		return List.of("Dancing","Anime","Novels");
	}

	
	

}
