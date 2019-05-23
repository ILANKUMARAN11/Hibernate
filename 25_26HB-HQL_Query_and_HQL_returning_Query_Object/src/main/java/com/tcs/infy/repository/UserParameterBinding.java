package com.tcs.infy.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.User;

@Repository
public interface UserParameterBinding extends CrudRepository<User, Integer>{
	
	@Query(value="select s from User s where s.id=?1 and s.name=?2 and s.email=?3")
	User findIdNameEmail(int id,String name,String email);
	
	
	//@Query(value="select * from User_Info where id=?1 and name=?2 and email=?3",nativeQuery=true)
	@Query(value="select s from User s where s.id=:id and s.name=:name and s.email=:email")
	User findIdNameEmailByParam(@Param("id")int ID,@Param("name")String NAME,@Param("email")String EMAIL);
}
