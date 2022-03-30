package main;


import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helpers.WorkerHelper;
import model.Worker;
import services.WorkerJDBCTemplate;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		WorkerJDBCTemplate workerJDBCTemplate = (WorkerJDBCTemplate) context.getBean("workerJDBCTemplate");
		Worker w=new Worker(49,"kriti","Vishwakarma",800000,new Date(System.currentTimeMillis()),"HR","k.vishwakarma@my_org.in");
		
		
		System.out.println("************** Records Creation **************");
		workerJDBCTemplate.create(50,"Ayushi","Vishwakarma",100000,new Date(System.currentTimeMillis()),"HR","a.vishwakarma@my_org.in");
		System.out.println();
		
		System.out.println("************** Displaying Worker Records **************");
		List<Worker> workers = workerJDBCTemplate.getAllWorkers(); 
		WorkerHelper.printAllWorkers(workers);
		System.out.println();
		
		System.out.println("************** Deleting Worker Record **************");
		workerJDBCTemplate.delete(47);
		System.out.println();

		
		System.out.println("************** Getting Worker Record by id **************");
		System.out.println(workerJDBCTemplate.getWorkerById(9));
		System.out.println();
		
		System.out.println("************** Updating Worker Record  **************");
		workerJDBCTemplate.update(w);
		

		
	}
}