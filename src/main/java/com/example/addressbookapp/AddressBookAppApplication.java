package com.example.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * Project : Address Book
 * @author sayali
 *
 */

@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(AddressBookAppApplication.class, args);
		log.info("Address Book App Started in {} Environment",context.getEnvironment().getProperty("environment"));
		log.info("Address Book DB User is {} Environment",context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
