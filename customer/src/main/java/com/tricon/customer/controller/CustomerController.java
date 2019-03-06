package com.tricon.customer.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.customer.pojo.Customer;
import com.tricon.customer.service.CustomerService;

@RestController
@RequestMapping("/tricon/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/")
	public ResponseEntity<List<Customer>> getAll() {
		List<Customer> list = customerService.getAll();
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
	} 
	@GetMapping("/{id}")
	public Optional<Customer> getById(@PathVariable("id") String id) {
		return customerService.getByid(id);
	}
	
	@PostMapping("/")
	public Customer save(@Valid @RequestBody Customer Customer) {
		return customerService.save(Customer);
	}
	@PutMapping("/")
	public ResponseEntity<Customer> updateCustomer(@Valid @RequestBody Customer Customer) {
		customerService.update(Customer);
		return new ResponseEntity<Customer>(Customer, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public  void delete(@PathVariable("id") String id) {
		customerService.deleteById(id);
	}
}
