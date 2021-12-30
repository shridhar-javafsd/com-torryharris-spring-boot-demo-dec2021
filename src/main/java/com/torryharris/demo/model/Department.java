package com.torryharris.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int department_id;
	private String department_name;
	private String city;

	public Department() {
		super();
	}

	public Department(String department_name, String city) {
		super();
		this.department_name = department_name;
		this.city = city;
	}

	public Department(int department_id, String department_name, String city) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.city = city;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name + ", city=" + city
				+ "]";
	}

}
