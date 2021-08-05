package com.employee.management.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.management.entity.Employee;

@Repository
public interface EmployeeDaoRepository extends JpaRepository<Employee, Integer> {

}