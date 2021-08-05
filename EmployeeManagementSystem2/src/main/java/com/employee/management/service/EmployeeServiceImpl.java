package com.employee.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.entity.Employee;
import com.employee.management.jpa.repository.EmployeeDaoRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDaoRepository dao;

	@Override
	public List<Employee> getEmployees() {
		return dao.findAll();
	}
	@Override
	public Optional<Employee> getEmployeeById(int empid) {
		return dao.findById(empid);
	}
	@Override
	public Employee addNewEmployee(Employee emp) {
		return dao.save(emp);
	}
	@Override
	public Employee updateEmployee(Employee emp) {
		return dao.save(emp);
	}
	@Override
	public void deleteEmployeeById(int empid) {
		dao.deleteById(empid);
	}
	@Override
	public void deleteAllEmployees() {
		dao.deleteAll();
	}
	@Override
	public List<Employee> addNewEmployees(List<Employee> emp) {
		return dao.saveAll(emp);
	}
}