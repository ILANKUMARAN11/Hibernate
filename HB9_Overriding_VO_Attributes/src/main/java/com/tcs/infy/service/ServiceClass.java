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
		
		Address homeAddress=new Address();
		homeAddress.setDoorNo("112/P6");
		homeAddress.setStreet("Durgai Nagar 4th Street");
		homeAddress.setCity("Vridhachalam");
		homeAddress.setState("Tami Nadu");
		homeAddress.setPincode("606 001");
		
		user.setHomeAddress(homeAddress);
		
		Address officeAddress=new Address();
		officeAddress.setDoorNo("TCS");
		officeAddress.setStreet("Kumaran Nagar");
		officeAddress.setCity("Chennai");
		officeAddress.setState("Tami Nadu");
		officeAddress.setPincode("600 119");
		
		user.setOfficeAddress(officeAddress);
		

		try {
			userRepo.save(user);
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Done";
	}

}
