package com.tcs.infy.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.User;
import com.tcs.infy.repository.UserRepo;

@Service
public class ServiceClass {
	@Autowired
	UserRepo userRepo;

	public String logic() {

		/*
			############### C R U D operations ###############
			C = Creating the record (i.e) inserting the row.
			R = Reading the record (i.e) selecting the row.
			U = Updating the record.
			D = Updating the record.
		*/
		
		try {
			
			//Inserting the record
			for(int i=1;i<11;i++)
			{
				User user = new User();
				user.setId(i);
				user.setName("Ilan"+i);
				user.setEmail("ilankumaran"+i+".i@gamil.com");
				user.setDOB(new Date());
				
				userRepo.save(user);
			}
			
			//Updating the record
			User user = userRepo.findById(1).orElse(null);
			user.setName("Ganesh");
			user.setEmail("kumaranilan@yahoo.com");
			user.setDOB(new SimpleDateFormat("yyyy-MM-dd").parse("1989-11-11"));
			userRepo.save(user); //Save method also does the funtionality of update.
			
			////Deleting the record
			User userDelete = new User();
			userDelete.setId(9);
			userDelete.setName("Ilan9");
			userDelete.setEmail("ilankumaran9.i@gamil.com");
			userDelete.setDOB(new Date());
			userRepo.delete(userDelete);
			
			////Selecting the record
			User userSelected=userRepo.findById(1).orElse(null);
			System.out.println(userSelected.toString());
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Done";
	}

}
