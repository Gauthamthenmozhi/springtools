package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "Gautham App",
				version = "1.1.5",
				description = "My Sample App",
				contact = @Contact(
						name = "Gautham",
						email = "727721euee022@skcet.ac.in"
						)
				)
		)
public class OnetomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

}
