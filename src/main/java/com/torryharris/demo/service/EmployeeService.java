package com.torryharris.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torryharris.demo.model.Employee;
import com.torryharris.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees");

		return employeeRepository.findAll(); // SELECT * FROM ...
	}

	public Employee getEmployeeById(int eid) {
		LOG.info("getEmployeeById");
		return employeeRepository.findById(eid).get(); // SELECT * FROM ... WHERE ...
	}

	public List<Employee> getEmployeeByFirstName(String firstName) {
		LOG.info("getEmployeeByFirstName");
		return employeeRepository.findByFirstName(firstName); // SELECT * FROM ... WHERE ...
	}

	public Employee addEmployee(Employee emp) {
		LOG.info("addEmployee");
		return employeeRepository.save(emp); // INSERT INTO ...
	}

	public Employee updateEmployee(Employee emp) {
		LOG.info("updateEmployee");
		return employeeRepository.save(emp); // UPDATE ...
	}

	public Employee deleteEmployee(int eid) {
		LOG.info("deleteEmployee " + eid);
		employeeRepository.deleteById(eid); // DELETE
		return null;
	}
}

//package com.torryharris.demo.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.torryharris.demo.model.Employee;
//
//@Service
//public class EmployeeService {
//
//	public List<Employee> empList = new ArrayList<>();
//
//	{
//		empList.add(new Employee(101, "Sonu", 45000));
//		empList.add(new Employee(102, "Monu", 40000));
//		empList.add(new Employee(103, "Tonu", 50000));
//		empList.add(new Employee(104, "Ponu", 35000));
//		empList.add(new Employee(105, "Gonu", 60000));
//	}
//
//	public List<Employee> getAllEmployees() {
//		System.out.println("getAllEmployees");
//		return empList;
//	}
//
//	public Employee getEmployeeById(int eid) {
//		System.out.println("getEmployeeById");
//		return empList.get(0);
//	}
//
//	public Employee addEmployee(Employee emp) {
//		System.out.println("addEmployee");
//		empList.add(emp);
//		return emp;
//	}
//
//	public Employee updateEmployee(Employee emp) {
//		System.out.println("updateEmployee");
////		empList.add(emp); // dummy code 
//		return emp;
//	}
//
//	public Employee deleteEmployee(int eid) {
//		System.out.println("deleteEmployee " + eid);
////		empList.add(emp); // dummy code 
//		return null;
//	}
//}
