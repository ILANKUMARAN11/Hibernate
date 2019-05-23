package com.tcs.infy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

	User selectIlanOnly(@Param("name") String myName);

	List<User> selectAll();
	
	User fetchByEmail();
	
	User fecthRanjani(@Param("wifeName") String myWifeName);
	
}
