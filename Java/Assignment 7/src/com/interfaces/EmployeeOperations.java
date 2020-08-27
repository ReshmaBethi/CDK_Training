package com.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.pojo.Employee;

public interface EmployeeOperations {
	boolean addEmployee(Employee employee);
	Employee updateEmployee(int id,String name);
	Employee deleteEmployee(int id);
	Employee findEmployeeById(int id);
	List<Employee> findAllEmployees();
	
}
