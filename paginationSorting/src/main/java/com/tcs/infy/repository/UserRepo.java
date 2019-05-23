package com.tcs.infy.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tcs.infy.entity.UserDetails;

@Transactional
@Repository
public interface UserRepo extends PagingAndSortingRepository<UserDetails, Integer>{
	
	
	
	Page<UserDetails> findAll(Pageable pageable);
	
	List<UserDetails> findAllByNameContaining(String name, Pageable pageable);
	
	
	
	List<UserDetails> getById(@Param("uID") Integer userId);
	

}
