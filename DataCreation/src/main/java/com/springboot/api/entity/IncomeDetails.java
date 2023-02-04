package com.springboot.api.entity;

import javax.persistence.Entity;

@Entity
public class IncomeDetails {

	private int caseNo;
	private double salary;
	private int rentIncome;
	private double propertyIncome;
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getRentIncome() {
		return rentIncome;
	}
	public void setRentIncome(int rentIncome) {
		this.rentIncome = rentIncome;
	}
	public double getPropertyIncome() {
		return propertyIncome;
	}
	public void setPropertyIncome(double propertyIncome) {
		this.propertyIncome = propertyIncome;
	}
	
}
