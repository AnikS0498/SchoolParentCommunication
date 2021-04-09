package com.cg.spc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Parent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private Student student;
	
	@Column(length = 15)
	private String mobileNumber;
	
	@Column(length = 25)
	private String emailId;
	
	public Parent() {
		super();

	}

	public Parent(Student student, String mobileNumber, String emailId) {
		super();
		this.student = student;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", student=" + student + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ "]";
	}
	
	
}