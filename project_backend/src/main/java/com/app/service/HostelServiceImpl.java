package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PetHostelRepository;
import com.app.dao.UserRepository;
import com.app.dto.HostelResponse;
import com.app.pojos.PetHostel;
import com.app.pojos.User;

@Service
@Transactional
public class HostelServiceImpl implements IHostelService {

	@Autowired
	private PetHostelRepository hostelRepo;
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<PetHostel> fetchAllHostels() {
		return hostelRepo.findAll();
	}

	@Override
	public PetHostel getHostelDetails(Integer id) {
		User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		return hostelRepo.findByUserId(user);
	}

	@Override
	public List<PetHostel> getVerfiedHostel() {
		return hostelRepo.findVerfiedPetHostel();
	}

}
