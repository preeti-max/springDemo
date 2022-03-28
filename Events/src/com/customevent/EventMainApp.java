package com.customevent;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EventMainApp {
	public static void main(String args[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("EventBean.xml");
			
	}

}