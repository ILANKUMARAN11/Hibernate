package com.tcs.infy.service;

import java.util.Date;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.User;
import com.tcs.infy.repository.UserRepo;

@Service
public class ServiceClass {
	@Autowired
	UserRepo userRepo;

	@Transactional
	public String logic() {

		User user = new User();
		user.setId(1);
		user.setName("Ilan");
		user.setEmail("ilankumaran.i@gamil.com");
		user.setDOB(new Date());
		user.setDescription("He is an User of the applicaion");
		try {
			userRepo.save(user);
			
			User user1=userRepo.findById(1).orElse(null);
			
			System.out.println(user1.toString());
			
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Done";
	}

}
