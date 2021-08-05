package com.employee.management.service;

import java.util.List;
import java.util.Optional;

import com.employee.management.entity.Employee;


public interface EmployeeService {

	public List<Employee> getEmployees();
	public Optional<Employee> getEmployeeById(int empid);
	public Employee addNewEmployee(Employee emp);
	public List<Employee> addNewEmployees(List<Employee> emp);
	public Employee updateEmployee(Employee emp);
	public void deleteEmployeeById(int empid);
	public void deleteAllEmployees();

}