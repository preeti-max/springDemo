package mavenapp;

import java.sql.Timestamp;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RefreshEvent implements ApplicationListener<ContextRefreshedEvent>{
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
       
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		System.out.println("Context refreshed at :"+timestamp);
	}

}