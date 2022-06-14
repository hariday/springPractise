package com.app.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {
	public static Logger log =  LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		try {
			
			SpringApplication.run(Application.class, args);

		} catch (Throwable e) {
			if (e.getClass().getName().contains("SilentExitException")) {
				
				log.debug("Spring is restarting the main thread - See spring-boot-devtools");
			} else {
				log.error("Application crashed!", e);
			}
		}
	}
	
}
