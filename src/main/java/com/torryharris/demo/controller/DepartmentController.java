package com.torryharris.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.torryharris.demo.model.Department;
import com.torryharris.demo.model.Employee;
import com.torryharris.demo.service.DepartmentService;

// Please implement TMF standards in this class. 

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/department")
public class DepartmentController implements IDepartmentController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	DepartmentService departmentService;

	// http://localhost:8082/dep/countOfMembers
	@GetMapping("/countOfMembers")
	public int countOfMembers() {
		return 0;
	}

	@RequestMapping(value = "dept/{DepartmentId}", method = RequestMethod.GET, produces = "application/json"
	/* , consumes = "application/json" */)
	public ResponseEntity<Employee> getEmpById(@PathVariable(name = "eid") int eid) {
		LOG.info("getEmpById " + eid);
//		return new ResponseEntity<Employee>(departmentService.getDepartmentById(eid), HttpStatus.OK);
		return null;
	}

	@GetMapping("/dept")
	public ResponseEntity<List<Department>> getAllDeps() {
		return new ResponseEntity<List<Department>>(departmentService.getAllDepartments(), HttpStatus.OK);
	}

}
