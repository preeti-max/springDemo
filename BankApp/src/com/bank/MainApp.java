package com.bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;


public class MainApp {
	 public static void main(String[] args) {
	   	  ApplicationContext context = new ClassPathXmlApplicationContext("BankBean.xml");
	   	WithdrawalEventPublisher publisher = (WithdrawalEventPublisher) context.getBean("withdrawalEventPublisher");
	   	
	   	SalaryAccount salaryAcc = (SalaryAccount) context.getBean("salaryAccount");
	      double amount1=salaryAcc.withdraw(30000);
	     
	      publisher.publish(salaryAcc,amount1);
	      
	      
	      SavingsAccount savingsAcc = (SavingsAccount) context.getBean("savingsAccount");
	      
	      double amount2=savingsAcc.withdraw(8000);
	   	publisher.publish(savingsAcc,amount2);
	      
	    
	      
	      
	   	 
	  
	   
	   	  
	   	  
	      
	}

}
