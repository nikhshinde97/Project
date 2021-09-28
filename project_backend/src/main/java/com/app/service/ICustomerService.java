package com.app.service;

import java.util.List;

import com.app.pojos.Bookings;
import com.app.pojos.Customer;
import com.app.pojos.PetHostel;
import com.app.pojos.User;

public interface ICustomerService {
	//to save customer/pet details
	public Customer saveCustomerDetails(Customer customer);
    //to save booking details
	public Bookings saveBookingDetails(Bookings bookings) ;
	//to delete pet details
	public String deleterPetDetails(int petId);
	
	//update pet details
	public Customer updatePetDetails(Customer cust);
	//get all customers
	public List <Customer> fetchAllCustomer();
	//
	public Customer getCustomerById(int id);  

	public Customer getCustomerByUserId(int id);  

	public Customer getCustomerDetails(Integer id);
		
}
