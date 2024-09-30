package com.tcs.infy.service;

import jakarta.transaction.Transactional;

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
		user.setId(11);
		user.setName("Ilan");
		user.setEmail("ilankumaran.i@gamil.com");
		
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehcilename("Car");
		
		user.setVehicle(vehicle1);
		
		try {
			vehicleRepo.save(vehicle1);
			userRepo.save(user);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return "Done";
	}

}