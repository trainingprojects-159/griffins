package com.mphasis.griffin.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignIn {
	@Id
	private int userId;
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
