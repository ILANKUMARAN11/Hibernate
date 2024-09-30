package com.tcs.infy.service;

import java.util.ArrayList;
import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.UserDetails;
import com.tcs.infy.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;

	@Transactional
	public List<UserDetails> insertUser() {
		List<UserDetails> userList = new ArrayList<UserDetails>();
		try {
			for (int i = 0; i < 1000; i++) {
				UserDetails user = new UserDetails();
				user.setId(i);
				user.setName(i+"");
				user.setEmail(i+"@gamil.com");
				userList.add(userRepo.save(user));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return userList;
	}

	@Transactional
	public List<UserDetails> findAllByName(int page, int size, String sortByField) {
		
		insertUser();
		List<UserDetails> userList = null;
		try {

			// Pageable firstPageWithTwoElements = PageRequest.of(0, 2);

			// Pageable secondPageWithFiveElements = PageRequest.of(1, 5);

			Pageable secondPageWithFiveElements = PageRequest.of(page, size, Sort.by(sortByField));

			userList = userRepo.findAllByNameContaining("1", secondPageWithFiveElements);
			
			//Similarly, to just have our query results sorted, we can simply pass an instance of Sort to the method:
			
			Iterable<UserDetails> allProductsSortedByName = userRepo.findAll(Sort.by("name"));
			
			
			
			/*
			 However, what if we want to both sort and page our data?
			 
				We can do that by passing the sorting details into our PageRequest object itself: 
			*/

			Pageable fistPage_TheeRecords_sortedByName = PageRequest.of(0, 3, Sort.by("name"));

			Pageable fistPage_TheeRecords_sortedByEmailDesc = PageRequest.of(0, 3, Sort.by("email").descending());

			Pageable fistPage_FiveRecords_sortedByEmailDesc_AND_NameAsc = PageRequest.of(0, 5,Sort.by("email").descending().and(Sort.by("name")));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println(userList.size()+">>>>>>>>>>>>>>>>"+userList);
		return userList;
	}

}