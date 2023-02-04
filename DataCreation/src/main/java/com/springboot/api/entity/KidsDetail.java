package com.springboot.api.entity;

import javax.persistence.Entity;

@Entity
public class KidsDetail {

	private int caseNo;
	private String kidName;
	private int kidAge;
	private int kidSsn;
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public String getKidName() {
		return kidName;
	}
	public void setKidName(String kidName) {
		this.kidName = kidName;
	}
	public int getKidAge() {
		return kidAge;
	}
	public void setKidAge(int kidAge) {
		this.kidAge = kidAge;
	}
	public int getKidSsn() {
		return kidSsn;
	}
	public void setKidSsn(int kidSsn) {
		this.kidSsn = kidSsn;
	}
	
	
}
