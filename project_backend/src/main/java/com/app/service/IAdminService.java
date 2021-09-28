package com.app.service;

import java.util.List;

import com.app.pojos.Customer;
import com.app.pojos.PetHostel;
import com.app.pojos.Role;
import com.app.pojos.User;

public interface IAdminService {

	List<User> fetchUserByRole(Role role);
	
    List<Customer> fetchAllCustomers();
	
	List<PetHostel> fetchAllPetHostel();
	
	String deleteCustomer(int id);
	
	String deletePetHostel(int id);
	
	PetHostel updateHostelVerificationStatus(PetHostel detachedUser);
	
	PetHostel fetchPetHostelById(int id);
	
//	String deleteUserDetails(int userId);
//	
//	String deleteUserByEmail(String email);
	
}
