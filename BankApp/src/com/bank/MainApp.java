package com.bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;


public class MainApp {
	 public static void main(String[] args) {
	   	  ApplicationContext context = new ClassPathXmlApplicationContext("BankBean.xml");
	   	WithdrawalEventPublisher publisher = (WithdrawalEventPublisher) context.getBean("withdrawalEventPublisher");
	   	
	   	SalaryAccount salaryAcc = (SalaryAccount) context.getBean("salaryAccount");
	      double balance1=salaryAcc.withdraw(10000);
	      publisher.publish(balance1);
	      salaryAcc.deposit(20000);
	      
	      SavingsAccount savingsAcc = (SavingsAccount) context.getBean("savingsAccount");
	      savingsAcc.deposit(20000);
	      double balance2=savingsAcc.withdraw(8000);
	   	publisher.publish(balance2);
	      
	    
	      
	      
	   	 
	  
	   
	   	  
	   	  
	      
	}

}
