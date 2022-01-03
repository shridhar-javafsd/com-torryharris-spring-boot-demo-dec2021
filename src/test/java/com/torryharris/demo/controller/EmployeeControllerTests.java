package com.torryharris.demo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.torryharris.demo.model.Department;
import com.torryharris.demo.model.Employee;
import com.torryharris.demo.service.EmployeeService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeControllerTests.class);

	@Autowired
	MockMvc mockMvc;

	@MockBean
	EmployeeService service;

	public static List<Employee> empList;

	@BeforeAll
	public static void createEmpData() {
		LOG.info("createEmpData");
		empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 25000, new Department(10)));
		empList.add(new Employee(102, "Monu", 35000, new Department(20)));
		empList.add(new Employee(103, "Tonu", 30000, new Department(20)));
	}

	public void testGetAllEmployees() throws Exception {
		LOG.info("testGetAllEmployees");
		when(service.getAllEmployees()).thenReturn(empList);
		mockMvc.perform(get("/emplist")).andExpect(status().isOk());
	}

}

//package com.torryharris.demo.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//
////Java - JUnit, Mockito  
////JavaScript - jasmine 
//
//@SpringBootTest
//public class EmployeeControllerTests {
//	
//	
//
//	
//	
//	// plain JUNIT 
//	
//	
//
//	@Autowired
//	private EmployeeController employeeController;
//
//	// positive test case
//	@Test
//	public void testGetEmpById() {
//		HttpStatus expected = HttpStatus.OK;
//		HttpStatus actual = employeeController.getEmpById(1).getStatusCode(); // 200
//		assertEquals(expected, actual);
//	}
//
//	// negative test case
//	@Test
//	public void testGetEmpById2() {
//		HttpStatus unexpected = HttpStatus.NOT_FOUND;
//		HttpStatus actual = employeeController.getEmpById(1).getStatusCode(); // 200
//		assertNotEquals(unexpected, actual);
//	}
//
//	@Test
//	public void testGetEmpByName() {
//		String expected = "Sonu";
//		String actual = employeeController.getEmpByFirstName("Sonu").get(0).getFirstName();
//		assertEquals(expected, actual);
//	}
//
//}
