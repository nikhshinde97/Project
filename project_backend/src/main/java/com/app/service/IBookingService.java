package com.app.service;

import java.util.List;

//import com.app.dto.LoginRequestDTO;
import com.app.pojos.Bookings;
import com.app.pojos.Customer;
import com.app.pojos.PetHostel;
import com.app.pojos.User;

public interface IBookingService {

public Bookings	findBookingByUserId(Customer c);

List<Bookings> findHostelBookingByUserId(PetHostel hostel);
}
