package com.torryharris.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.torryharris.demo.model.Employee;

// JPA, ORM, Spring DATA 

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
