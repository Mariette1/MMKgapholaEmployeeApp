package com.ejb.service;

import java.util.List;

import com.jpa.entities.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployees();
}
