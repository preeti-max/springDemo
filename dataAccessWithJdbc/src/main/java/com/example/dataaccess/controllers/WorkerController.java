package com.example.dataaccess.controllers;


import com.example.dataaccess.model.Worker;
import com.example.dataaccess.repository.WorkerRepository;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/worker")
public class WorkerController {
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping("/showWorker")
	public List<Worker> showWorker() {
		try {
			return List.of(workerRepository.getWorker(5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return List.of();
	}
	
	@GetMapping("/all/showWorkers")
	public List<Worker> showAllWorkers(){
		try {
			return workerRepository.getWorkers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return List.of();
	}
				
	@GetMapping("/create")
	public void createWorker(){
		Worker w=new Worker(90,"kopi","Vishnu",700000,new Date(System.currentTimeMillis()),"HR","s.vishwakarma@my_org.in");
				try {
					workerRepository.add(w);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	@GetMapping("/update")
	public void updateEmail(){
		try {
			workerRepository.update(90);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	@GetMapping("/delete")
	public void deleteWorker(){
		try {
			workerRepository.delete(90);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}


