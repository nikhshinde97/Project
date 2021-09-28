package com.app.dao;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Address;
import com.app.pojos.Role;
import com.app.pojos.User;

@SpringBootTest
class UserDaoTests {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private AddressRepo addressRepo;
	@Autowired
	private PetHostelRepository hostelRepo;
	

	@Test void testAddUser() {
	  
	  Address a1 =new Address("Wakad", "Pune", "MH", "India"); 
	 User user = new User("Darshna", "qqq",a1, "9561219952",
	  "xxxxxx@gmail.com","sriya",Role.PETHOSTEL);
	 // user.setAddress(a1);
	  userRepo.save(user);
	  
	  Address a2 =new Address("Wakad", "Pune", "MH", "India"); 
		 User user1 = new User("Sarthak", "Patil",a2, "9561219952",
		  "yyyyyy@gmail.com","siya",Role.PETHOSTEL);
		 // user.setAddress(a1);
		  userRepo.save(user1);
		  
		  Address a3 =new Address("Wakad", "Pune", "MH", "India"); 
			 User user2 = new User("Nikhil", "Mishra",a3, "9561219952",
			  "zzzzzz@gmail.com","priya",Role.PETHOSTEL);
			 // user.setAddress(a1);
			  userRepo.save(user2);
	  }

	/*
	 * @Test void linkUserAddress() { Address a1 = new Address("Wakad", "Pune",
	 * "MH", "India"); User user = userRepo.findById(13).get();
	 * System.out.println(user); user.setAddress(a1); userRepo.save(user); }
	 */

}
