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
public class SpringbootVaadinCrudUiApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootVaadinCrudUiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootVaadinCrudUiApplication.class, args);
	}
	
	
	// loading some data in H2 database
	@Bean
	public CommandLineRunner loadData(CustomerRepository repository) {
		
		// save a couple of customers
					repository.save(new Customer("Jack", "Bauer"));
					repository.save(new Customer("Chloe", "O'Brian"));
					repository.save(new Customer("Kim", "Bauer"));
					repository.save(new Customer("David", "Palmer"));
					repository.save(new Customer("Michelle", "Dessler"));
					
					// fetch all customers
					log.info("Customers found with findAll():");
					log.info("-------------------------------");
					for (Customer customer : repository.findAll()) {
						log.info(customer.toString());
					}
					log.info("");					
		return null;
		
	}

}
