package com.tcs.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.infy.service.ServiceClassForDemo;
import com.tcs.infy.service.UserSaveService;

@SpringBootApplication
public class Application implements CommandLineRunner  {

	
	@Autowired
	UserSaveService userSaveService;
	
	@Autowired
	ServiceClassForDemo serviceClassForDemo;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		userSaveService.saveUser();
		System.out.println("........>>>>>>>"+serviceClassForDemo.logic());
		
	}
	
	
}
