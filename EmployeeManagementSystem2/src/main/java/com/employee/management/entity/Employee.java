package com.employee.management.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component

// Spring jpa jars.
@Entity
@Table(name= "emp")

// To increase speed and save sql statement execution time.
@DynamicInsert
@DynamicUpdate
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_dept")
	private String department;
	
	@Column(name = "emp_salry")
	private double salary;
	
	@Column(name = "emp_designation")
	private String designation;
	
	@Column(name = "mgr_id")
	private int mgrId;
	
	@Column(name = "hiredate")
	private String hiredate;
	
	@Column(name = "email_id")
	private String email;
	
	@Column(name = "mob_no")
	private String mobNo;
	
	@Column(name = "emp_status")
	private String status;
	
	@Column(name = "created_date")
	@JsonFormat(pattern = "dd-MM-YYYY")
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column(name = "updated_date")
	@JsonFormat(pattern = "dd-MM-YYYY")
	@UpdateTimestamp
	private LocalDateTime updatedDate; 
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name = "system_ip")
	private String systemIP;
	
	/*
	 * @Column(name = "address") private Address address;
	 */

	public Employee() { }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getMgrId() {
		return mgrId;
	}

	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getSystemIP() {
		return systemIP;
	}

	public void setSystemIP(String systemIP) {
		this.systemIP = systemIP;
	}

	
	/*
	 * public Address getAddress() { return address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 */

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", designation=" + designation + ", mgrId=" + mgrId + ", hiredate=" + hiredate + ", email=" + email
				+ ", mobNo=" + mobNo + ", status=" + status + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", systemIP=" + systemIP
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getDepartment()=" + getDepartment()
				+ ", getSalary()=" + getSalary() + ", getDesignation()=" + getDesignation() + ", getMgrId()="
				+ getMgrId() + ", getEmail()=" + getEmail() + ", getMobNo()=" + getMobNo() + ", getStatus()="
				+ getStatus() + ", getHiredate()=" + getHiredate() + ", getCreatedDate()=" + getCreatedDate()
				+ ", getUpdatedDate()=" + getUpdatedDate() + ", getCreatedBy()=" + getCreatedBy() + ", getUpdatedBy()="
				+ getUpdatedBy() + ", getSystemIP()=" + getSystemIP() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}




	 


	
	
}