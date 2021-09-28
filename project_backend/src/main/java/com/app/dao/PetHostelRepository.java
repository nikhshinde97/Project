package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.dto.HostelResponse;
import com.app.pojos.PetHostel;
import com.app.pojos.User;

@Repository
public interface PetHostelRepository extends JpaRepository<PetHostel, Integer> {
	
	
	  @Query("select p from PetHostel p where p.user=?1")
	  public PetHostel findByUserId(User user);
	  
	  @Query("select p from PetHostel p where p.isVerified=true")
	  public List<PetHostel> findVerfiedPetHostel();
	 
	  
}
