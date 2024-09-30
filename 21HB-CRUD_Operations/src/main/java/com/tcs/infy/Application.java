package com.tcs.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.infy.service.ServiceClass;

/*
 * This Project is to Understand about the Crud (Create, read, update and delete) operation in HB.
 * CrudRepository Interface internally has the CRUD method available in it, so in this project
 	we are using them.
 */

@SpringBootApplication
public class Application implements CommandLineRunner  {

	@Autowired
	ServiceClass serviceClass;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("........>>>>>>>"+serviceClass.logic());
		
	}
	
	
}
