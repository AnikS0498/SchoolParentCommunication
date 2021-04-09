package com.cg.spc.entities;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(length = 25)
	private String name;
	@Column(length = 25)
	private String emailId;
	@Column(length = 15)
	private String mobileNumber;
	private LocalDate dateOfBirth;
	@OneToOne
	private ClassId currentClass;
	@OneToMany
	private List<Subject> subjects;
	@OneToOne
	private Address address;
	@OneToOne
	private ClassDiary classDiary;
//	@OneToOne
//	private Fee fee;
	
	
	public Student() {
		super();
	}

	public Student(String name, String emailId, String mobileNumber, LocalDate dateOfBirth, ClassId currentClass,
			List<Subject> subjects, Address address, ClassDiary classDiary) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.currentClass = currentClass;
		this.subjects = subjects;
		this.address = address;
		this.classDiary = classDiary;
//		this.fee = fee;
	}

//	public Fee getFee() {
//		return fee;
//	}
//
//	public void setFee(Fee fee) {
//		this.fee = fee;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ClassId getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(ClassId currentClass) {
		this.currentClass = currentClass;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ClassDiary getClassDiary() {
		return classDiary;
	}

	public void setClassDiary(ClassDiary classDiary) {
		this.classDiary = classDiary;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ ", dateOfBirth=" + dateOfBirth + ", currentClass=" + currentClass + ", subjects=" + subjects
				+ ", address=" + address + ", classDiary=" + classDiary + "]";
	}

	
}