package com.cg.spc.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private Student student;
	
	@Column
	private LocalDate dateOfClass;
	@Column(length=5)
	private boolean present;
	
	public Attendance() {
		super();
	}

	public Attendance(Student student, LocalDate dateOfClass, boolean present) {
		super();
		this.student = student;
		this.dateOfClass = dateOfClass;
		this.present = present;
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

	public LocalDate getDateOfClass() {
		return dateOfClass;
	}

	public void setDateOfClass(LocalDate dateOfClass) {
		this.dateOfClass = dateOfClass;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", student=" + student + ", dateOfClass=" + dateOfClass + ", present=" + present
				+ "]";
	}
	
	
	
	
}
