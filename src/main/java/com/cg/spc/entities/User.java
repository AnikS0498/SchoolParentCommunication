package com.cg.spc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 15)
	private String password;
	@Column(length = 15)
	private String role;
	
	public User() {
		super();
	}

	public User(String password, String role) {
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int userId) {
		this.id = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", role=" + role + "]";
	}

	
	
}