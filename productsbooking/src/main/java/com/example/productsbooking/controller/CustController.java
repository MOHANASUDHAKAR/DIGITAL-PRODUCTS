package com.example.productsbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productsbooking.entity.Customer;
import com.example.productsbooking.service.CustomerService;

@RestController
@CrossOrigin(origins = "*")

public class CustController {
	@Autowired
	CustomerService customerService;
	@GetMapping("/showcust")
	public List<Customer> showProducts()
	{
		return customerService.getproducts();
	}
	@PostMapping("/postcust")
	public List<Customer> putProducts(@RequestBody List<Customer> products)
	{
		return customerService.saveinfo(products);
	}

}