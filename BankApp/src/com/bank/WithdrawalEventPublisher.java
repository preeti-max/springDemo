package com.bank;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class WithdrawalEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}	
	
	public void publish(BankAccount acc,double amount) {
		
		
		WithdrawalEvent event = new WithdrawalEvent(this,acc,amount);
		this.publisher.publishEvent(event);
	}
}