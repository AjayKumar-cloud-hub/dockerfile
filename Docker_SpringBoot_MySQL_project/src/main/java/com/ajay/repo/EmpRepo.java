package com.ajay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{
	
}
