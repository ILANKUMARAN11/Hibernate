package com.tcs.infy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.infy.service.ServiceClass;

@SpringBootApplication
public class ApplicationTest implements CommandLineRunner  {

	@Autowired
	ServiceClass serviceClass;
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationTest.class, args);
		
		List<String> lst=new ArrayList<>();
		lst.add("ILAN");
		
		lst.stream().map(s->new String(s.concat("KUMARAN"))).collect(Collectors.toList());
		
		System.out.println(">>>>>"+lst);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("........>>>>>>>"+serviceClass.logic());
		
	}
	
	
	
	
	
	
}
