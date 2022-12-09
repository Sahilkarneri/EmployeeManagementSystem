/**
 * 
 */
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

/**
 * @author Sahil
 *
 */
public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	
	void addEmployee(Employee employee);
	
	Optional<Employee> searchEmployee(long id);
	
//	void updateEmployee(Employee employee);
	void deleteEmployeeById(long id);
	
	
	void updateEmployee(Employee employee);
}
