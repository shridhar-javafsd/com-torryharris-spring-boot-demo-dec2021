package com.torryharris.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.torryharris.demo.model.Department;
import com.torryharris.demo.model.Employee;

public interface IDepartmentController {

	public abstract int countOfMembers();

	public abstract ResponseEntity<Employee> getEmpById(int eid);

	public abstract ResponseEntity<List<Department>> getAllDeps();

}
