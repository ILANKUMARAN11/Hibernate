package com.tcs.infy.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.Vehicle;
import com.tcs.infy.entity.UserInfo;
import com.tcs.infy.repository.UserRepo;
import com.tcs.infy.repository.VehicleRepo;

@Service
public class ServiceClass {
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	VehicleRepo vehicleRepo;

	@Transactional
	public String logic() {

		
		UserInfo user = new UserInfo();
		user.setName("Ilan");
		user.setEmail("ilankumaran.i@gamil.com");
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehcilename("Car");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehcilename("Bike");
		
		user.getListOfVehicles().add(vehicle1);
		user.getListOfVehicles().add(vehicle2);
		
		vehicle1.setUserInfo(user);
		vehicle2.setUserInfo(user);
		
		try {
			
			userRepo.save(user);
			vehicleRepo.save(vehicle1);
			vehicleRepo.save(vehicle2);
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//#############################################################
		//fetching the data
		UserInfo user1 =userRepo.findById(1).orElse(null);
		
		System.out.println("User Object=========>>>>>>>"+user1);
		//System.out.println("User Address=========>>>>>>>"+user1.getListOfVehicles().size());
		

		return "Done";
	}

}
