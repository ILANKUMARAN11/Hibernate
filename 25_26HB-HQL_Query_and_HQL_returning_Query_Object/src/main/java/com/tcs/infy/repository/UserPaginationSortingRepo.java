package com.tcs.infy.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.User;

@Repository
public interface UserPaginationSortingRepo extends CrudRepository<User, Integer>{
	
	List<User> findAll(Pageable pageable);

}
