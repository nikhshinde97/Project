package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserRepository;
import com.app.dto.LoginResponse;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> fetchAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User saveUserDetails(User transientUser) {
		System.out.println("hellos service");
		return userRepo.save(transientUser);
		
	}

	@Override
	public LoginResponse getUserByEmailAndPassword(String fn, String ln) {
		User user = userRepo.findByEmailAndPassword(fn, ln).orElseThrow(()->new RuntimeException("User Not found"));
		return new LoginResponse(user.getId(), user.getFirstName(), user.getEmail(), user.getRole());
	}

	@Override
	public List<User> getAllusers() {
		return userRepo.findAll();
	}

}
