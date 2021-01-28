package com.platlap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.platlap")
public class PlatlapAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatlapAssignmentApplication.class, args);
	}

}
