package com.tcs.infy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

	List<User> findByIdGreaterThan(int userId);
	
	@Query(value="select name from User")
	List<String> getNameOnly();
	
}
