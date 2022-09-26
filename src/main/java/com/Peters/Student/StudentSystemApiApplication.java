package com.Peters.Student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSystemApiApplication {
	@Value("${application.name}")
	String name;

	private static final Logger logger = LoggerFactory.getLogger(StudentSystemApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApiApplication.class, args);

		logger.info("logger is here");
		logger.warn("logger is warning");
	}

}
