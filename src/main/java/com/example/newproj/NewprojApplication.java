package com.example.newproj;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.util.logging.Logger;

@SpringBootApplication
public class NewprojApplication {
	static final Logger log = Logger.getLogger(String.valueOf(NewprojApplication.class));

	public static void main(String[] args) {
		SpringApplication.run(NewprojApplication.class, args);
		log.info("Before Starting application");



	}


}
