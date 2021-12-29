package com.torryharris.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.torryharris.demo.model.Employee;

public class EmployeeService {

	public List<Employee> empList = new ArrayList<>();

	{
		empList.add(new Employee(101, "Sonu", 45000));
		empList.add(new Employee(102, "Monu", 40000));
		empList.add(new Employee(103, "Tonu", 50000));
		empList.add(new Employee(104, "Ponu", 35000));
		empList.add(new Employee(105, "Gonu", 60000));
	}

	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees");
		return empList;
	}

	public Employee getEmployeeById(int eid) {
		System.out.println("getEmployeeById");
		return empList.get(0);
	}
}
