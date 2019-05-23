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
		user.setUserId(1);
		user.setName("Ilan");
		user.setEmail("ilankumaran.i@gamil.com");
		
		Address address1=new Address();
		address1.setDoorNo("112/P6");
		address1.setStreet("Durgai Nagar 4th Street");
		address1.setCity("Vridhachalam");
		address1.setState("Tami Nadu");
		address1.setPincode("606 001");
		
		Address address2=new Address();
		address2.setDoorNo("TCS");
		address2.setStreet("Kumaran Nagar");
		address2.setCity("Chennai");
		address2.setState("Tami Nadu");
		address2.setPincode("600 119");
		
		user.getListOfaddress().add(address1);
		user.getListOfaddress().add(address2);
		

		try {
			userRepo.save(user);
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Done";
	}

}
