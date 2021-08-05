package com.employee.management.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Address {
	
	@Column(name = "adds_id")
	private int addsId;
	
	@Column(name = "adds1")
	private String adds1;
	
	@Column(name = "adds2")
	private String adds2;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pincode")
	private Long pincode;
	
	@Column(name = "land_mark")
	private String landMark;
	
	@Column(name = "emp_id")
	private String empId;
	
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

	public int getAddsId() {
		return addsId;
	}

	public void setAddsId(int addsId) {
		this.addsId = addsId;
	}

	public String getAdds1() {
		return adds1;
	}

	public void setAdds1(String adds1) {
		this.adds1 = adds1;
	}

	public String getAdds2() {
		return adds2;
	}

	public void setAdds2(String adds2) {
		this.adds2 = adds2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
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
	

	
	
	
}
