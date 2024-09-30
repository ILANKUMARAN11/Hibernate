package com.tcs.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.infy.service.ServiceClass;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	ServiceClass serviceClass;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("........>>>>>>>" + serviceClass.logic());

	}

}
