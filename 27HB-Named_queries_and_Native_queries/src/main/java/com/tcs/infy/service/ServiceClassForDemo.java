package com.tcs.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.User;
import com.tcs.infy.repository.UserRepo;;

@Service
public class ServiceClassForDemo {
	@Autowired
	UserRepo userRepo;
	
	

	public String logic() {

		
		
		try {
			
			
			
			List<User> userList=(List<User>) userRepo.selectAll();
			userList.forEach(p->{System.out.println(p.toString());});
			
			User userIlan=(User) userRepo.selectIlanOnly("ILANKUMARAN");
			System.out.println(userIlan.toString());
			
			User userByEmail=(User) userRepo.fetchByEmail();
			System.out.println(userByEmail.toString());
			
			User userRanjani=(User) userRepo.fecthRanjani("RANJANI");
			System.out.println(userRanjani.toString());
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Done";
	}

}
