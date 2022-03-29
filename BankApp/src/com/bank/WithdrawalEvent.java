package com.bank;


import java.sql.Timestamp;

import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent {
	double balance;
	
	public WithdrawalEvent(Object source, double balance) {
		super(source);
		this.balance = balance;
	}
	

	public String toString() {
		return " Acc Balance =" + this.balance
				+ "\n"+"Timestamp: "+new Timestamp(System.currentTimeMillis());
	}	
	
		
	
}