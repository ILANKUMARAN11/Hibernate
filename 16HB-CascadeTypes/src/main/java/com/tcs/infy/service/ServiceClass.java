package com.tcs.infy.service;

import javax.transaction.Transactional;

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

		/*
		 * 
		 * Here user is mapped to many vehicle,so we have mapped Vehicle objects to user collection object.
		 * So HB expects the Vehicle objects also be saved, since vehicle is an entity 
		  	it expects the developer to save the vehicle explicitly by developer.
		 * If u want to delete the user and U have to delete the vehicle associated with the user 
		 	and it's not just for saving(insert, creation) also delete, update.
		 * So U have to pass add the vehicle in collection object in user, then U have to save
		   .
		 * So U have to manually save huge number if Vehicle objects that the PAIN for developer.
		 * So V can ignore this when PAIN of developers, 
		 	WE CAN SAY HIBERNATE Hey WHEN I save the USER also save the VEHICLE by yourself using CaseCadetype.
		 	
		 @OneToMany(cascade=CascadeType.ALL) meaning includes (PERSIST, MERGE, REMOVE, REFRESH, DETACH)
		 @OneToMany(cascade=CascadeType.PERSIST) meaning only SAVE. Hey HB when I save USER also save Vehicle not any other operation.
		 @OneToMany(cascade=CascadeType.REMOVE) meaning only DELETE. Hey HB when I Delete USER also Delete Vehicle not any other operation.
	
		*/
		
		UserInfo user = new UserInfo();
		user.setName("Ilan");
		user.setEmail("ilankumaran.i@gamil.com");
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehcilename("Car");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehcilename("Bike");
		
		user.getListOfVehicles().add(vehicle1);
		user.getListOfVehicles().add(vehicle2);
		
		try {
			userRepo.save(user);
		} catch (Exception e) {
			System.out.println(e); }
		
		//#############################################################
		//fetching the data
		UserInfo user1 =userRepo.findById(1).orElse(null);
		
		System.out.println("User Object=========>>>>>>>"+user1);
		System.out.println("User Address=========>>>>>>>"+user1.getListOfVehicles().size());
		

		return "Done";
	}

}
