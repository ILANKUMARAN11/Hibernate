package com.tcs.infy.service;

import java.util.List;

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
	public Vehicle logic() {

		
		UserInfo user = new UserInfo();
		user.setId(11);
		user.setName("Ilan");
		user.setEmail("ilankumaran.i@gamil.com");
		
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehcilename("Car");
		//vehicle1.setUser(user);
		//user.setVehicle(vehicle1);
		
		try {
			UserInfo savedUser=userRepo.save(user);
			
			UserInfo testUser=userRepo.findById(savedUser.getId()).orElse(null);
			
			System.out.println(testUser.toString());
			vehicle1.setUser(testUser);
			Vehicle vh=vehicleRepo.save(vehicle1);	
			
			savedUser.setVehicle(vh);
			
			
			
			} catch (Exception e) {
			System.out.println(e);
		}
		
		
		

			return vehicle1;
		}
	
	
	

}
