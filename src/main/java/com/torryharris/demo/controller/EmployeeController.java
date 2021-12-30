package com.torryharris.demo.controller;

import com.torryharris.demo.model.Employee;
import com.torryharris.demo.service.EmployeeService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/emp")
	public Employee emp() {
		LOG.info("emp");
		int eid = 101;
		return employeeService.getEmployeeById(eid);
	}

	@GetMapping("/emplist")
	public List<Employee> empList() {
		LOG.info("empList");
		return employeeService.getAllEmployees();
	}

	@PostMapping("/addemp")
	public Employee addEmp(@RequestBody Employee emp) {
		LOG.info("addEmp");
		return employeeService.addEmployee(emp);
	}

	@PutMapping("/updateemp")
	public Employee updateEmp(@RequestBody Employee emp) {
		LOG.info("updateEmp");
		return employeeService.updateEmployee(emp);
	}

	@DeleteMapping("/deleteemp/{eid}")
	public Employee deleteEmp(@PathVariable(name = "eid") int eid) {
		LOG.info("deleteEmp " + eid);
		return employeeService.deleteEmployee(eid);
	}
}
