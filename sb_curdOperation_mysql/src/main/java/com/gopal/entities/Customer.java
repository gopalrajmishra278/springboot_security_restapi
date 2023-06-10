package com.gopal.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Customer {

	@Id
	private int id;
	private String name;
	
	
	}

