package com.dunno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.dunno.services", "com.dunno.controllers"})
public class DummyprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyprojectApplication.class, args);
	}
}
