package com.tcs.infy.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.User;
import com.tcs.infy.repository.UserRepo;

@Service
public class UserSaveService {

	@Autowired
	UserRepo userRepo;

	@Transactional
	public void saveUser() {

		String name[]= {"RANJANI","BBB","CCC","DDD","EEE","FFF","GGG","HHH","ILANKUMARAN","JJJ"};
		try {
			// Inserting the record
			for (int i = 0; i < 10; i++) {
				User user = new User();
				user.setId(i+1);
				user.setName(name[i]);
				user.setEmail(name[i]+"@gamil.com");
				user.setDOB(new Date());

				userRepo.save(user);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
