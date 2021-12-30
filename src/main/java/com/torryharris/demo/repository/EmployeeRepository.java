package com.torryharris.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.torryharris.demo.model.Employee;

// JPA, ORM, Spring DATA 

// SQL - join, sub query, PK, FK, constraints, sequence  
// sequence 

//reference https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference 

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// more code later

//	syntax: public abstract List<Object> findByFieldName(Type FieldName);

	public abstract List<Employee> findByFirstName(String firstName);

	// use this method in service and controller
//	public abstract List<Employee> findBySalary(double salary);

	// JPQL
	@Query("select e from Employee e where e.salary = ?1")
	public abstract List<Employee> findBySalary(double salary);

	// SQL
//	@Query(value = "select * from employee where salary = ?1")
//	public abstract List<Employee> findBySalary(double salary);

	// JPQL
//	@Query("select e from Employee e where e.salary between ?1 and ?2")
//	public abstract List<Employee> findBySalaryBetween(double minSalary, double maxSalary);

	public abstract List<Employee> findBySalaryGreaterThan(double salary);

	public abstract List<Employee> findBySalaryGreaterThanEqual(double salary);

}
