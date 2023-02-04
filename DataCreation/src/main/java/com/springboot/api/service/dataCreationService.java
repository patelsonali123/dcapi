package com.springboot.api.service;


import com.springboot.api.entity.PlanSelection;

public interface dataCreationService {

	public  PlanSelection findbycaseNo(int id);
	
	public  String saveIncomeDetails();
	
	public String saveEducationDetails();
	
	public String saveKidsDetails();
	
	
	
	
}
