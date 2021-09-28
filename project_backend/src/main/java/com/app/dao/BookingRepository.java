package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojos.Bookings;
import com.app.pojos.Customer;
import com.app.pojos.PetHostel;

@Repository
public interface BookingRepository extends JpaRepository<Bookings, Integer>{

	@Query("select b from Bookings b where b.customer=?1")
	public Bookings findBookingByUserId(Customer customer); 	

	@Query("select b from Bookings b where b.hostel=?1")
	List<Bookings> findHostelBookingByUserId(PetHostel hostel);
}
