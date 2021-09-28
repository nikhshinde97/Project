package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.HostelResponse;
import com.app.pojos.Bookings;
import com.app.pojos.PetHostel;
import com.app.service.IBookingService;
import com.app.service.IHostelService;

@RestController
@RequestMapping("/hostel")
@CrossOrigin(origins = "http://localhost:3000")
public class HostelRestController {

	@Autowired
	private IHostelService hostelService;

	@Autowired
	private IBookingService bookService;
	
	@GetMapping
	public List<PetHostel> getAllHostel() {
		return hostelService.fetchAllHostels();
	}

	// to get pet-hostel details by userId

	@GetMapping("/{userId}")
	public PetHostel getHostelDetails(@PathVariable Integer userId) {
		return hostelService.getHostelDetails(userId);
	}

	@GetMapping("/bookings/{userId}")
	public List<Bookings> findHostelBookingByUserId(@PathVariable int  userId){
	PetHostel hostel=	hostelService.getHostelDetails(userId);	
			return bookService.findHostelBookingByUserId(hostel);		
	}
	
	
}
