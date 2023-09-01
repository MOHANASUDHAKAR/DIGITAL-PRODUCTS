package com.example.productsbooking.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productsbooking.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
