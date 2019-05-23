package com.tcs.infy.service;

import java.util.Date;

import javax.transaction.Transactional;

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
		
		for(int i=0;i<=5;i++)
		{

		User user = new User();
		user.setName("Ilan"+i);
		user.setEmail("ilankumaran"+i+".i@gamil.com");
		user.setDOB(new Date());
		try {
			userRepo.save(user);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		}

		return "Done";
	}

}
