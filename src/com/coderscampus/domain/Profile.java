package com.coderscampus.domain;

import java.time.LocalDate;

public class Profile {
	private Integer id;
	private String profilename;
	private LocalDate createdDate;
	
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProfileName() {
		return profilename;
	}
	public void setProfileName(String name) {
		this.profilename = name;
	}
}
