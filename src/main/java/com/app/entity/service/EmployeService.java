package com.app.entity.service;

import java.util.List;

import com.app.entity.Employee;

public interface EmployeService {
	
	public Employee addEmployee(Employee e);
	public List<Employee> fetchAllEmployee();

}
