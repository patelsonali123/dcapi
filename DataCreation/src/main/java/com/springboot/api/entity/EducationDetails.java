package com.springboot.api.entity;

import javax.persistence.Entity;

@Entity
public class EducationDetails {

	private int caseNo;
	private String degree;
	private int gradYear;
	private String uniName;
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}

	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getGradYear() {
		return gradYear;
	}
	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	}
