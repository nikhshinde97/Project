package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Bookings;
import com.app.pojos.Customer;
import com.app.pojos.PetHostel;
import com.app.service.IBookingService;
import com.app.service.ICustomerService;
import com.app.service.IHostelService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {
     
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
    private IHostelService hostelService;
	
	@Autowired
    private IBookingService bookService;
	
	@PostMapping("/register")
	public ResponseEntity<?> saveCustomerDetails(@RequestBody @Valid Customer customer) {
		return new ResponseEntity<>(customerService.saveCustomerDetails(customer), HttpStatus.CREATED);

	}
	
	@GetMapping("/hostels")
	public List<PetHostel> getVerifiedPetHostel(){
		return hostelService.getVerfiedHostel();
	}
	
	@PostMapping("/booking")
	public ResponseEntity<?> saveCustomerBooking(@RequestBody @Valid Bookings booking) {
		System.out.println("in getAllUsers " + getClass().getName());
		return new ResponseEntity<>(customerService.saveBookingDetails(booking), HttpStatus.CREATED);
	}
	
	  @GetMapping("/{userId}") 
	  public Customer getCustomerDetails(@PathVariable Integer userId){ 
		 
		  return customerService.getCustomerByUserId(userId); 
		  }
	
	  @GetMapping("/booking/{userId}") 
	  public Bookings getBookingsDetails(@PathVariable Integer userId){ 
		 
		  Customer c= customerService.getCustomerByUserId(userId); 
		return bookService.findBookingByUserId(c);  
	  }
	
	
}
