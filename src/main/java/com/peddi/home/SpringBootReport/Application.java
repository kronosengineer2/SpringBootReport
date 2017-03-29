package com.peddi.home.SpringBootReport;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * 
 */
@SpringBootApplication
public class Application {
	private static final Logger logger = Logger.getLogger(Application.class
			.getName());

	/* Returns JSON objects that are readable by the razor flow */
	public static void main(String[] args) {
		if (logger.isDebugEnabled()) {
			logger.debug("Entering Application.Main");
		}
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("Exiting Application.Main");
			}
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			if (logger.isDebugEnabled()) {
				logger.debug("Error in Application.Main");
			}
		}
	}
}
