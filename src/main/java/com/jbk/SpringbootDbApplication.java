package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDbApplication {

	public static void main(String[] args) {
	 SpringApplication.run(SpringbootDbApplication.class, args);
		
		System.out.println("Hello");
	}

}
