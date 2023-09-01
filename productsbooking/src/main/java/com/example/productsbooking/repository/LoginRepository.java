package com.example.productsbooking.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productsbooking.entity.UserLogin;


public interface LoginRepository extends JpaRepository<UserLogin,Integer>{
	

}
