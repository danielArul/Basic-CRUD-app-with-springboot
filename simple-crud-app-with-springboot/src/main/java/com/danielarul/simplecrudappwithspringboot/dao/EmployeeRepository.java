package com.danielarul.simplecrudappwithspringboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielarul.simplecrudappwithspringboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
		//that's it no need to write any code
		
		//add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);
}
