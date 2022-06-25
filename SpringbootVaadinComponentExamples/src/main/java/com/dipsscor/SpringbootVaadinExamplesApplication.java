package com.dipsscor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dipsscor.*")
public class SpringbootVaadinExamplesApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootVaadinExamplesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootVaadinExamplesApplication.class, args);
	}
	
	


}
