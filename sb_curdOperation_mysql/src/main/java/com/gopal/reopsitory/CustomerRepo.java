package com.gopal.reopsitory;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Serializable>{
	
}
