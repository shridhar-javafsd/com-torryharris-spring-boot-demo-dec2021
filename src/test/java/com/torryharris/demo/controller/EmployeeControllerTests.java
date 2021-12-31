package com.torryharris.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

//Java - JUnit 
//JavaScript - jasmine 

@SpringBootTest
public class EmployeeControllerTests {

	// 2 = 1+1 positive test case
	// 2 != 1+2 negative test case

	@Autowired
	private EmployeeController employeeController;

	// positive test case
	@Test
	public void testGetEmpById() {
		HttpStatus expected = HttpStatus.OK;
		HttpStatus actual = employeeController.getEmpById(1).getStatusCode(); // 200
		assertEquals(expected, actual);
	}

	// negative test case
	@Test
	public void testGetEmpById2() {
		HttpStatus unexpected = HttpStatus.NOT_FOUND;
		HttpStatus actual = employeeController.getEmpById(1).getStatusCode(); // 200
		assertNotEquals(unexpected, actual);
	}
}
