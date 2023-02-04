package com.springboot.api.entity;

import javax.persistence.Entity;

@Entity
public class PlanSelection {

	private int caseNo;
	private String planname;
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	
}
