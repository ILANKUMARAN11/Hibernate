package com.tcs.infy.service;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.UserInfo;
import com.tcs.infy.entity.Vehicle;
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

		UserInfo user1 = new UserInfo();
		user1.setName("Ilan");
		user1.setEmail("ilankumaran.i@gamil.com");
		
		UserInfo user2 = new UserInfo();
		user2.setName("Ganesh");
		user2.setEmail("kumaranilan@yahoo.com");
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehicleNumber(1189);
		vehicle1.setVehcileType("SUV");
		vehicle1.setVehcileBrand("HUMMER");
		vehicle1.getUserInfo().add(user1);
		vehicle1.getUserInfo().add(user2);
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicleNumber(6092);
		vehicle2.setVehcileType("SEDAN");
		vehicle2.setVehcileBrand("BMW");
		vehicle2.getUserInfo().add(user1);
		vehicle2.getUserInfo().add(user2);
		
		user1.getListOfVehicles().add(vehicle1);
		user1.getListOfVehicles().add(vehicle2);
		
		user2.getListOfVehicles().add(vehicle1);
		user2.getListOfVehicles().add(vehicle2);
		
		
		
		
		try {
			
			
			userRepo.save(user1);
			userRepo.save(user2);
			
			vehicleRepo.save(vehicle1);
			vehicleRepo.save(vehicle2);
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		

		return "Done";
	}

}
