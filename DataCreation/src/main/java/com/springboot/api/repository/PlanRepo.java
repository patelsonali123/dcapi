package com.springboot.api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.api.entity.PlanSelection;

public interface PlanRepo extends JpaRepository<PlanSelection, Serializable>{

}
