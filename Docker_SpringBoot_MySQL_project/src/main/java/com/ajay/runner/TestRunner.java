package com.ajay.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajay.entity.Employee;
import com.ajay.repo.EmpRepo;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private EmpRepo empRepo;
	
	@Override
	public void run(String... args) throws Exception {
		empRepo.saveAll(List.of(new Employee("Ajay", 5000), new Employee("Vijay",60000), new Employee("Tala",70000)));
		
		List<Employee> referenceById = empRepo.findAll();
		referenceById.forEach(emp -> System.out.println(" Hello "+emp.getName()+" "+emp.getSal()));
	}
	
	
	
}
