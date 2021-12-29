package com.torryharris.demo.controller;

import com.torryharris.demo.model.Employee;
import com.torryharris.demo.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/emp")
	public Employee emp() {
		System.out.println("emp");
		int eid = 101;
		return employeeService.getEmployeeById(eid);

	}

	@GetMapping("/emplist")
	public List<Employee> empList() {
		System.out.println("empList");
		return employeeService.getAllEmployees();
	}

}
