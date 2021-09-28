package com.app.dao;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Address;
import com.app.pojos.PetHostel;
import com.app.pojos.Role;
import com.app.pojos.User;

@SpringBootTest
class PetHostelDaoTests {

	@Autowired
	private PetHostelRepository hostRepo;
	@Autowired
	private UserRepository userRepo;

	@Test
	void testAddHostel() {

		User user = userRepo.findById(5).get();
		System.out.println(user);
		PetHostel host = new PetHostel("Jay3", null, "123452289155", 1500, true, 50, 900, true, null, user);
//		 User user = userRepo.findById(2).get(); // System.out.println(user); //
//		users.setAddress(a1)
		System.out.println(host);
		hostRepo.save(host);
//		
//		User user1 = userRepo.findById(6).get();
//		System.out.println(user);
//		PetHostel host1 = new PetHostel("Jay3", null, "123452289155", 1500, true, 50, 900, true, null, user1);
//		System.out.println(host1);
//		hostRepo.save(host1);
//		
//		User user2 = userRepo.findById(11).get();
//		System.out.println(user2);
//		PetHostel host2 = new PetHostel("Jay3", null, "123452289155", 1500, true, 50, 900, true, null, user2);
//		System.out.println(host2);
//		hostRepo.save(host2);

	}

//	@Test
//	void linkUserAddress() {
//		Address a1 = new Address("Wakad", "Pune", "MH", "India");
//		User user = userRepo.findById(1).get();
//		System.out.println(user);
//		user.setAddress(a1);
//		userRepo.save(user);
//	}

}
