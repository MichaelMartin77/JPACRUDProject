package com.skilldistillery.bootecomstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;

@EntityScan("com.skilldistillery.jpaecommercestore")
@SpringBootApplication
public class BootEcomStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootEcomStoreApplication.class, args);
	}

}
