package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Plans;
import com.cogent.boot.repo.PlansRepo;


@RestController 
public class PlansController {
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
		PlansRepo planRepo;
		@GetMapping("/getplan") //End Point 
		private List<Plans> getAllPlan() {
			return planRepo.findAll(); 
		}
		// Create
		@PostMapping("/addplan")
		Plans newPlan(@RequestBody Plans plan) {
			return planRepo.save(plan); // insert SQL
		}
		 
		// Delete
		@DeleteMapping("/deleteplan/{id}")  
		public void delete(@PathVariable("id") int id) {
			try {
				planRepo.deleteById(id);
				System.out.println("Deleted!");
			} catch (Exception e) {
				System.out.println("Not deleted.");
				e.printStackTrace();
			}	
		}
		
		// Update  	 
}
