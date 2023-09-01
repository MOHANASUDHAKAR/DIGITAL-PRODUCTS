package com.example.productsbooking.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.productsbooking.entity.Products;


public interface ProductRepository  extends JpaRepository<Products, Integer>{
	@Query(value="select p from Products_Table p",nativeQuery = true)
	public List<Products> show();

}
