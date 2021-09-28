package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;
import com.app.pojos.PetHostel;
import com.app.pojos.User;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	  @Query("select c from Customer c where c.user=?1")
	  public Customer findByUserId(User user);

}
