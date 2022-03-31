package com.springboot.workers.springjdbcexample.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.workers.springjdbcexample.model.Worker;
import com.springboot.workers.springjdbcexample.repository.WorkerRepository;

@RestController
@RequestMapping("/worker")
public class WorkerController {
	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping("/showWorker")
	public Worker showWorker() {
		return workerRepository.getWorkerById(1);

	}

	@GetMapping("/all/showWorker")
	public List<Worker> showAllWorker() {
		return workerRepository.getAllWorkers();

	}

	@GetMapping("/create")
	public void createWorker() {
		workerRepository.create(107, "Priya", "Rawat", 203456, new java.sql.Date(new Date().getTime()),
				"HR", "p.rawat@my_org.com");
	
	}

	@GetMapping("/update")
	public void updateWorker() {
		workerRepository.update(107);
		
	}

	@GetMapping("/delete")
	public void deleteWorker() {
		workerRepository.delete(9);
		
	}
}