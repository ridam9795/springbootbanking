package com.spring.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.entities.Customer;
import com.spring.main.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getCustomers(){
		return (List<Customer>) customerRepository.findAll();
	}
	
	public List<Customer> createCustomers(List<Customer> customers) {
		Iterable<Customer> saveAll = customerRepository.saveAll(customers);
		
		return (List<Customer>)saveAll;
	}
	
}
