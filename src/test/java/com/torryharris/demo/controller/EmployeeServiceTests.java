package com.torryharris.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.torryharris.demo.model.Employee;
import com.torryharris.demo.service.EmployeeService;

public class EmployeeServiceTests {


	// 2 = 1+1 positive test case
	// 2 != 1+2 negative test case

	@MockBean
	private EmployeeService employeeServiceMock;

	private List<Employee> empListMock = new ArrayList<>();

	public void mockData() {
		empListMock.add(new Employee("Soham", 10.5));
		empListMock.add(new Employee("Rohan", 12.5));
		empListMock.add(new Employee("Shivam", 15.5));
	}

	// positive test case
	@Test
	public void testGetAllEmps() {
		when(employeeServiceMock.getAllEmployees()).thenReturn(empListMock);

//		assertEquals(expected, actual);

	}


	
}
