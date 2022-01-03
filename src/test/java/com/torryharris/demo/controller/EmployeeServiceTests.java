package com.torryharris.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.torryharris.demo.model.Department;
import com.torryharris.demo.model.Employee;
import com.torryharris.demo.repository.EmployeeRepository;
import com.torryharris.demo.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {

	@InjectMocks
	private EmployeeService service;

	@Mock
	private EmployeeRepository repository;

	private static List<Employee> empList;

	@BeforeAll
	public static void createEmpData() {
		empList = new ArrayList<>();
		empList.add(new Employee("Sonu", 25000, new Department(10)));
		empList.add(new Employee("Monu", 35000, new Department(20)));
		empList.add(new Employee("Tonu", 30000, new Department(20)));
	}

	@Test
	public void testGetAllEmployees() {

		when(repository.findAll()).thenReturn(empList);

//		List<Employee> empList2 = service.getAllEmployees();

		assertEquals(3, service.getAllEmployees().size());

	}

}
