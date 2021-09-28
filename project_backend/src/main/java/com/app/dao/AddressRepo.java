package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
