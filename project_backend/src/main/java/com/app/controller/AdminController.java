package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Customer;
import com.app.pojos.PetHostel;
import com.app.pojos.Role;
import com.app.pojos.User;
import com.app.service.IAdminService;

@RestController 
@RequestMapping("/admin")
//@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

	@Autowired
	private IAdminService adminService;
	
	
	public AdminController() {
		System.out.println(getClass().getName());
	}
	
	@GetMapping
	public List<Customer> getAllCustomer() {
		System.out.println("in get all customers");
		return adminService.fetchAllCustomers();
	}
	
	@GetMapping("/pet")
	public List<PetHostel> getAllPetHostelOwner() {
		System.out.println("in get all pet owners");
		return adminService.fetchAllPetHostel();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomerDetails(@PathVariable int id) {
		System.out.println("in del user details " + id);
		return ResponseEntity.ok(adminService.deleteCustomer(id));
	}
		
	@DeleteMapping("/id/{id}")
	public ResponseEntity<String> deletepetHostelDetails(@PathVariable int id) {
		System.out.println("in del user details " + id);
		return ResponseEntity.ok(adminService.deletePetHostel(id));
	}	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateHostelDetails(@RequestBody PetHostel detachedUser, @PathVariable int id) {
		System.out.println("in update " + detachedUser + " " + id);
		// chk if user exists by id
		adminService.fetchPetHostelById(id);
		return ResponseEntity.ok(adminService.updateHostelVerificationStatus(detachedUser));
	}
	
	@GetMapping("/id/{id}")
	public PetHostel fetchCustomerById(@PathVariable int id) {
		System.out.println(id);
		return adminService.fetchPetHostelById(id);
	}
	
	@GetMapping("/{role}")
	public List<User> getAllUsers(@PathVariable String role) {
		System.out.println(role);
		return adminService.fetchUserByRole(Role.valueOf(role));
}
	
	
}
