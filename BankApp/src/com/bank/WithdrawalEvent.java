package com.bank;


import java.sql.Timestamp;

import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent {
	BankAccount acc;
	double amount;
	
	public WithdrawalEvent(Object source, BankAccount acc,double amount) {
		super(source);
		this.acc = acc;
		this.amount=amount;
	}
	

	public String toString() {
		return "Amount withdrawn: "+this.amount+" Acc Balance =" + acc.getAccBalance()
				+ " Timestamp: "+new Timestamp(System.currentTimeMillis());
	}	
	
		
	
}