package com.tcs.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.tcs.infy.entity.User;
import com.tcs.infy.repository.UserRepo;
import com.tcs.infy.repository.UserPaginationSortingRepo;
import com.tcs.infy.repository.UserParameterBinding;;

@Service
public class ServiceClassForDemo {
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserPaginationSortingRepo UserPaginationSortingRepo;
	
	@Autowired
	UserParameterBinding userParameterBinding;

	public String logic() {

		
		
		try {
			
			
			
			
			List<User> userSelected=(List<User>) userRepo.findAll();
			System.out.println(userSelected.toString());
			
			List<User> userGreaterThan=(List<User>) userRepo.findByIdGreaterThan(5);
			System.out.println(userGreaterThan.toString());
			
			List<String> userNames=(List<String>) userRepo.getNameOnly();
			System.out.println(userNames.toString());
			
			
			List<User> userPagination=(List<User>) UserPaginationSortingRepo.findAll(PageRequest.of(1, 3, Direction.ASC, "name"));
			System.out.println(userPagination.size());
			//userPagination=(List<User>) UserPaginationSortingRepo.findAll(PageRequest.of(0, 3));
			
			//userPagination=(List<User>) UserPaginationSortingRepo.findAll(PageRequest.of(0, 3, Direction.ASC ));
			
			User user1=userParameterBinding.findIdNameEmail(1,"AAA","AAA@gamil.com");
			System.out.println("===>>"+user1.toString());
			
			
			User user2=userParameterBinding.findIdNameEmailByParam(9,"ILANKUMARAN","ILANKUMARAN@gamil.com");
			System.out.println("===>>"+user2.toString());
			
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Done";
	}

}
