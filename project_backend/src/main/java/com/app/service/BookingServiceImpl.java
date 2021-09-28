package com.app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.BookingRepository;
import com.app.pojos.Bookings;
import com.app.pojos.Customer;
import com.app.pojos.PetHostel;
@Service
@Transactional

public class BookingServiceImpl implements IBookingService {

	@Autowired
	BookingRepository bookRepo;

	@Override
	public Bookings findBookingByUserId(Customer c) {
		
		return bookRepo.findBookingByUserId(c);
	}

	@Override
	public List<Bookings> findHostelBookingByUserId(PetHostel hostel) {
		
		return bookRepo.findHostelBookingByUserId(hostel);
	} 


}
