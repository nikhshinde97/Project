package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.UserHandlingException;
import com.app.dao.CustomerRepository;
import com.app.dao.PetHostelRepository;
import com.app.dao.UserRepository;
import com.app.pojos.Customer;
import com.app.pojos.PetHostel;
import com.app.pojos.Role;
import com.app.pojos.User;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	private PetHostelRepository petRepo;
	
	@Override
	public List<User> fetchUserByRole(Role role) {
		//customer.setRole(Role.CUSTOMER);
		 return userRepo.findByRole(role);
	}
	
	@Override
	public List<Customer> fetchAllCustomers() {
		
		return custRepo.findAll();

}

	@Override
	public List<PetHostel> fetchAllPetHostel() {
		
		return petRepo.findAll();
	}

	@Override
	public String deleteCustomer(int id) {
		
		custRepo.deleteById(id);
		return "Customer details deleted";
	}

	@Override
	public String deletePetHostel(int id) {
		
		petRepo.deleteById(id);
		return "Pet Hostel details deleted";
	}

	@Override
	public PetHostel updateHostelVerificationStatus(PetHostel detachedUser) {
		
		return petRepo.save(detachedUser);
	}

	@Override
	public PetHostel fetchPetHostelById(int id) {
		
		return petRepo.findById(id).orElseThrow(() -> new UserHandlingException("Invalid User ID"));
	}
	
	
	

//	@Override
//	public User fetchCustomerById(int id) {
//
//		return userRepo.fetchById(id);
//	}

	
	
}
