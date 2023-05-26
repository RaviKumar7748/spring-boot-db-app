package com.app.entity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Employee;
import com.app.entity.repository.EmployeeRepository;
import com.app.entity.service.EmployeService;
@Service
public class EmployeServiceImpl implements EmployeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee addEmployee(Employee e) {
		return repository.save(e);
	}

	@Override
	public List<Employee> fetchAllEmployee() {

		return repository.findAll();
	}

}
