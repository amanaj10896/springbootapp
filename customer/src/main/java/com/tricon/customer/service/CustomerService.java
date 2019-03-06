package com.tricon.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.customer.dao.CustomerRepository;
import com.tricon.customer.pojo.Customer;

@Service
public class CustomerService {
	
	 @Autowired
	 CustomerRepository customerRepository;
	 
	

	public  List<Customer> getAll() {
		
		return (List<Customer>) customerRepository.findAll();
	}

	public Customer save(Customer customer) {
		return customerRepository.save(customer);
		
	}

	public  Customer update(Customer customer) {
		return customerRepository.save(customer);
		
	}

	public void deleteById(String id) {
		customerRepository.deleteById(id);
		
	}

	public Optional<Customer> getByid(String id) {
		return customerRepository.findById(id);
	}

	
}
