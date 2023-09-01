package com.example.productsbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productsbooking.entity.Customer;
import com.example.productsbooking.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public List<Customer> getproducts() {
		return  customerRepository .findAll();
	}

	public List<Customer> saveinfo(List<Customer> product) {
		return  customerRepository.saveAll(product);
	}

	
}