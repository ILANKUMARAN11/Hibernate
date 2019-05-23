package com.tcs.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.Address;
import com.tcs.infy.entity.User;
import com.tcs.infy.repository.UserRepo;

@Service
public class ServiceClass {
	@Autowired
	UserRepo userRepo;

	public String logic() {

		
		User user = new User();
		user.setId(1);
		user.setName("Ilan");
		user.setEmail("ilankumaran.i@gamil.com");
		
		Address address=new Address();
		address.setDoorNo("112/P6");
		address.setStreet("Durgai Nagar 4th Street");
		address.setCity("Vridhachalam");
		address.setState("Tami Nadu");
		address.setPincode("606 001");
		
		user.setAddress(address);
		

		try {
			userRepo.save(user);
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Done";
	}

}
