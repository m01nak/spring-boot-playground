package com.moinak.springbootplayground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPlaygroundApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootPlaygroundApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPlaygroundApplication.class, args);
	}

}
