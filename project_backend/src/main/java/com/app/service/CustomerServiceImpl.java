package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.UserHandlingException;
import com.app.dao.BookingRepository;
import com.app.dao.CustomerRepository;
import com.app.dao.UserRepository;
import com.app.pojos.Bookings;
import com.app.pojos.Customer;
import com.app.pojos.User;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{


	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private BookingRepository bookRepo;
	@Autowired
	private UserRepository userRepo;


	@Override
	public Customer saveCustomerDetails(Customer customer) {
		return customerRepo.save(customer);
	}
	
	@Override
	public Bookings saveBookingDetails(Bookings bookings) {
		return bookRepo.save(bookings);
	}

	@Override
	public String deleterPetDetails(int petId) {
		
		 customerRepo.deleteById(petId);
		 return "Pet deleted Successfully";
	}


	@Override
	public Customer updatePetDetails(Customer detachedCust) {
	
		return customerRepo.save(detachedCust);
	}


	@Override
	public Customer getCustomerById(int id) {	
		return customerRepo.findById(id).orElseThrow(()->new UserHandlingException("invalid User ID"));
	}

	@Override
	public List<Customer> fetchAllCustomer() {
		return customerRepo.findAll();
		
	}

	@Override
	public Customer getCustomerDetails(Integer id) {
		User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		return customerRepo.findByUserId(user);
	}

	@Override
	public Customer getCustomerByUserId(int id) {
		User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		return customerRepo.findByUserId(user);
	}

}
