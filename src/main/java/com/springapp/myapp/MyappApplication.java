package com.springapp.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		ApplicationContext context; //we are using teh object of 
		// SpringApplication.run(MyappApplication.class, args);
		// and using it because the object which is created will not be created at JVM
		// it will be created at the IoC container

		SpringApplication.run(MyappApplication.class, args); //Loads at IoC container in JVM
	}

}
