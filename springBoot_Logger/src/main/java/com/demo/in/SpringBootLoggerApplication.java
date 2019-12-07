package com.demo.in;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class SpringBootLoggerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootLoggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggerApplication.class, args);

		LOGGER.debug("Logger Debug");
		LOGGER.error("Logger Error");
		LOGGER.info("LOGGER INFO");
		LOGGER.warn("Logger warn");

	}
	
	
	
	

	@RequestMapping("/")
	public String loggerDemo() {
		return "Hello server !";
	}

}
