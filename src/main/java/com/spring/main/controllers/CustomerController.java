package com.spring.main.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.main.entities.Customer;
import com.spring.main.services.CustomerService;

@RequestMapping("/customer")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("/")
	public ResponseEntity<List<Customer>> getCustomers(){
		
		return ResponseEntity.of(Optional.of(customerService.getCustomers()));
	}
	
	@PostMapping("/create")
	public ResponseEntity<List<Customer>> createCustomers(@RequestBody List<Customer> customers){
	     for(Customer cust:customers) {
	    	 System.out.println(cust);
	    	 
	     }
		  List<Customer> updatedCustomers=customerService.createCustomers(customers);
		
		return ResponseEntity.of(Optional.of(updatedCustomers));
	}
	
	
}
