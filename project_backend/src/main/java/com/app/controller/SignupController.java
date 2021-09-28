package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.app.service.IUserService;

@RestController
@RequestMapping("/signup")
@CrossOrigin(origins = "http://localhost:3000")
public class SignupController {
	@Autowired
	private IUserService userService;
	
	public SignupController() {
		System.out.println("in ctor of "+ getClass().getName());
	}
	
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		System.out.println("in save user " + user);
		return new ResponseEntity<>(userService.saveUserDetails(user), HttpStatus.CREATED);
	}
	
}
