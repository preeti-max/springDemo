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
	
	public void publish(double amount) {
		
		
		WithdrawalEvent event = new WithdrawalEvent(this,amount);
		this.publisher.publishEvent(event);
	}
}