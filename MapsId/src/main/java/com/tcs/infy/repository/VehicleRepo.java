package com.tcs.infy.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.Vehicle;

@Transactional
@Repository
public interface VehicleRepo extends CrudRepository<Vehicle, Integer> 
{
	public Optional<Vehicle> findByVehicleid(int id);
}
