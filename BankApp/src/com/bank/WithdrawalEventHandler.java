package com.bank;

import org.springframework.context.ApplicationListener;

public class WithdrawalEventHandler implements ApplicationListener<WithdrawalEvent> {
	
	public void onApplicationEvent(WithdrawalEvent event) {
		
		System.out.println("Withdrawal Event Raised:: " + event.toString());
	}
}