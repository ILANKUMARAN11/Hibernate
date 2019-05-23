package com.tcs.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.LoginData;
import com.tcs.infy.entity.User;
import com.tcs.infy.repository.UserRepo;

@Service
public class ServiceClass {
	@Autowired
	UserRepo userRepo;

	public String logic() {

		
		User user = new User();
		
		LoginData loginData=new LoginData();
		loginData.setLoginId(1373322);
		loginData.setJouernyID(1016779);
		
		user.setLoginData(loginData);
		user.setName("Ilan");
		user.setEmail("ilankumaran.i@gamil.com");
		
		
		
		
		

		try {
			userRepo.save(user);
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Done";
	}

}
