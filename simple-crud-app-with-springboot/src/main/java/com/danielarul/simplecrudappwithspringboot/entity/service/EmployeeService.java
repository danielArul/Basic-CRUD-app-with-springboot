package com.danielarul.simplecrudappwithspringboot.entity.service;

import java.util.List;

import com.danielarul.simplecrudappwithspringboot.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);
	
	public List<Employee> searchBy(String theName);
}