package com.tcs.infy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.Address;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer>{

}
