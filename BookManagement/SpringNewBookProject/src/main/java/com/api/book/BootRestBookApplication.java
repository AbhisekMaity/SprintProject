 package com.api.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   
// it indicates that it is a Spring Boot application and enables
//auto-configuration and component scanning. 
public class BootRestBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestBookApplication.class, args);
		
		//The main method calls SpringApplication.run() to start the application.
	}

}
