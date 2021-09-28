package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.app.service.IUserService;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UsersController {
	
	@Autowired
	private IUserService userService;

	@GetMapping("/all")
	public List<User> getAllUsers() {	
		return userService.getAllusers();
	}
}
