package com.springmvclearn.web.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="user")
public class Offer {
	//@Id
	private int id;
	//@Column(name="username")
	private String username;
	//@Column(name="fullname")
	private String fullname;
	//@Column(name="password")
	private String password;
	
	
public Offer() {
	
}
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Offer [id=" + id + ", fullname=" + fullname + ", username=" + username
				+ ", password=" + password + "]";
	}

	
}









