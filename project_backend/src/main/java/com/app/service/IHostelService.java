package com.app.service;

import java.util.List;

import com.app.dto.HostelResponse;
import com.app.pojos.PetHostel;

public interface IHostelService {
    
	//to fetch a list of all hostels
	List<PetHostel> fetchAllHostels();
	
	
	  //to fetch hostel details by user id public HostelResponse
	 PetHostel getHostelDetails(Integer id);
	 
	 //to get a list of verified hostels
	 List<PetHostel> getVerfiedHostel();
	 

}
