package com.springboot.workers.springjdbcexample.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import com.springboot.workers.springjdbcexample.model.Worker;




public interface WorkerDAO {
	
	/**
	 * Create a worker record
	 * 
	 * @param name String
	 * @param age Integer
	 */
public void create(int worker_id, String first_name, String last_name, int salary, Date joining_date, String department,
        String email);
	
	/**
	 * Fetches a worker record corresponding to the worker id
	 * 
	 * @param id Integer
	 * @return Student
	 */

	public Worker getWorkerById(Integer id);
	
	/**
	 * Lists down all worker records
	 * 
	 * @return List<Student>
	 */
	public List<Worker> getAllWorkers();
	
	/**
	 * Updates a worker's age based on their id
	 * 
	 * @param id Integer
	 * @param age Integer
	 */
	public void update(int worker_id);
	
	/**
	 * Deletes a worker record based on their id
	 * 
	 * @param id Integer
	 */
	public void delete(int id);
	
   
   
   
    
    }
