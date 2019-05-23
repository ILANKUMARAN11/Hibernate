package com.tcs.infy.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tcs.infy.entity.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle, Integer> 
{
	public Optional<Vehicle> findByVehicleNumber(int id);
}
