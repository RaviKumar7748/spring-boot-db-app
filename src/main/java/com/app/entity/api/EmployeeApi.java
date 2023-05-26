package com.app.entity.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.entity.service.EmployeService;

@RestController
@RequestMapping("/app/v1/")
public class EmployeeApi {
	@Autowired
	private EmployeService service;

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> findAllEmployee() {
		List<Employee> fetchAllEmployee = service.fetchAllEmployee();
		return new ResponseEntity<>(fetchAllEmployee, HttpStatus.OK);
	}

	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee e) {
		service.addEmployee(e);
		return new ResponseEntity<>("Employee Created", HttpStatus.CREATED);

	}

}
