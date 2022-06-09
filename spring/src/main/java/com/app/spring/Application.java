package com.app.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		/* ApplicationContext ctx = */ 	SpringApplication.run(Application.class, args);
		/* Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println); */
	}

}
