package com.spring.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.entities.Customer;
import com.spring.main.entities.Nominee;
import com.spring.main.repositories.CustomerRepository;
import com.spring.main.repositories.NomineeRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	NomineeRepository nomineeRepository;

	public List<Customer> getCustomers(){
		return (List<Customer>) customerRepository.findAll();
	}
	
	public List<Customer> createCustomers(List<Customer> customers) {
		
		
		return customerRepository.saveAll(customers);
	}
	
}
