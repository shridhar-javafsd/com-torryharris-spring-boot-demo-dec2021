package com.torryharris.demo.controller;

import com.torryharris.demo.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/emp")
	public Employee emp() {
		Employee emp = new Employee(101, "Sonu", 10.5);
		System.out.println(emp.toString());
		return emp;
	}

	@GetMapping("/emplist")
	public List<Employee> empList() {
		List<Employee> empList = new ArrayList<>();
		System.out.println(empList);
		return empList;
	}

}
