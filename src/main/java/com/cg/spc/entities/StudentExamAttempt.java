package com.cg.spc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentExamAttempt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToOne
	private Student student;
	@OneToOne
	private Exam exam;
	@Column(length = 5)
	private boolean attempted;
	private int marksObtained;
	
	public StudentExamAttempt() {
		super();
	}

	public StudentExamAttempt(Student student, Exam exam, boolean attempted, int marksObtained) {
		super();
		this.student = student;
		this.exam = exam;
		this.attempted = attempted;
		this.marksObtained = marksObtained;
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

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public boolean isAttempted() {
		return attempted;
	}

	public void setAttempted(boolean attempted) {
		this.attempted = attempted;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "StudentExamAttempt [id=" + id + ", student=" + student + ", exam=" + exam + ", attempted=" + attempted
				+ ", marksObtained=" + marksObtained + "]";
	}
	
	
}