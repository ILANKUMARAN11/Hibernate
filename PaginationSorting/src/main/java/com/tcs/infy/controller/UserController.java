package com.tcs.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.infy.entity.UserDetails;
import com.tcs.infy.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(path="get_All_Users/{page}/{size}/{sortBfField}")
	public List<UserDetails> saveAllUser(@PathVariable final int page,@PathVariable final int size, @PathVariable final String sortBfField)
	{
		return userService.findAllByName(page, size, sortBfField);
	}

}
