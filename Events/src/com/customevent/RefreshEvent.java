
package com.customevent;

import java.sql.Timestamp;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RefreshEvent implements ApplicationListener<ContextRefreshedEvent>{
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
        Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);

		System.out.println("Context refreshed at :"+timestamp);
	}

}