package com.tcs.infy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

}
