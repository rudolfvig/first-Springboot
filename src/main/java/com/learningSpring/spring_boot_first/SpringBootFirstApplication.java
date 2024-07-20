package com.learningSpring.spring_boot_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstApplication.class, args);
		System.out.println("This is my first running Spring Boot Application");
		SpringBootVersionLogger springBootVersionLogger = new SpringBootVersionLogger();
		springBootVersionLogger.logVersion();
	}

}
