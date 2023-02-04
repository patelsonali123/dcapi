package com.springboot.api.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class CreateCase {

	private int appId;

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}
}
