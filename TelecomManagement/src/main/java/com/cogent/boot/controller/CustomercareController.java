package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Customercare;
import com.cogent.boot.repo.CustomercareRepo;


@RestController 
public class CustomercareController {
	// Write the logic to perform various operations using HTTP methods
	
			// HTTP MEthods to create rest API Endpoints
			/*
			 * GET
			 * POST 
			 * PUT
			 * DELETE
			 */
			
			// We are going to use the JPA Repo in order to perform various operations
			
			// DO: Read
			@Autowired 
			CustomercareRepo customRepo;
			@GetMapping("/getcustomercare") //End Point 
			private List<Customercare> getAllCustomercare() {
				return customRepo.findAll(); 
			}
			// Create
			@PostMapping("/addcustomercare")
			Customercare newCustomer(@RequestBody Customercare care) { 
				return customRepo.save(care); // insert SQL
			}
			 
			// Delete
			@DeleteMapping("/deletecustomercare/{id}")  
			public void delete(@PathVariable("id") int id) {
				try {
					customRepo.deleteById(id);
					System.out.println("Deleted!");
				} catch (Exception e) {
					System.out.println("Not deleted.");
					e.printStackTrace();
				}	
			}
			
			// Update  	
}
