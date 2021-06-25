package com.tcs.infy.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.Address;
import com.tcs.infy.entity.UserInfo;
import com.tcs.infy.repository.AddressRepo;
import com.tcs.infy.repository.UserRepo;

@Service
public class ServiceClass {
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	AddressRepo addressRepo;

	@Transactional
	public String logic() {

		//################ ONE TO MANY
		UserInfo user1 = new UserInfo();
		user1.setName("Ilan");
		user1.setEmail("ilankumaran.i@gamil.com");
		
		Address address1=new Address();
		address1.setDoorNo(112);
		address1.setCity("Vridhachalam");
		address1.setState("Tami Nadu");
		address1.setPincode("606 001");
		address1.setUserRef(user1);//Adding user1 to address
		
		Address address2=new Address();
		address2.setDoorNo(421);
		address2.setCity("Chennai");
		address2.setState("Tami Nadu");
		address2.setPincode("600 119");
		address2.setUserRef(user1);//Adding user1 to address
		
		user1.getListOfAddress().add(address1);
		user1.getListOfAddress().add(address2);
		
		
		
		
		
		
		
		try {
			
			
			userRepo.save(user1);
			addressRepo.save(address1);
			addressRepo.save(address2);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		

		return "Done";
	}

}
