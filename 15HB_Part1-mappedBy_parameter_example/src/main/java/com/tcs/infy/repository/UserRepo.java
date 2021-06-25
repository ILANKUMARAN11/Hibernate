package com.tcs.infy.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.UserInfo;

@Repository
public interface UserRepo extends CrudRepository<UserInfo, Integer>{
	
	public Optional<UserInfo> findById(Integer id);

}
