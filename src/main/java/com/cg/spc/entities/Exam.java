package com.cg.spc.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany
	private List<ClassId> classId;
	
	private LocalDateTime dateTimeOfExam;
	
	@OneToOne
	private Subject subject;
	
	@Enumerated(EnumType.STRING)
	private ExamType examtype;
	
	@Column
	private int maxMarks;
	
	public Exam() {
		super();
		
	}

	public Exam(List<ClassId> classId, LocalDateTime dateTimeOfExam, Subject subject, ExamType examtype, int maxMarks) {
		super();
		this.classId = classId;
		this.dateTimeOfExam = dateTimeOfExam;
		this.subject = subject;
		this.examtype = examtype;
		this.maxMarks = maxMarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ClassId> getClassId() {
		return classId;
	}

	public void setClassId(List<ClassId> classId) {
		this.classId = classId;
	}

	public LocalDateTime getDateTimeOfExam() {
		return dateTimeOfExam;
	}

	public void setDateTimeOfExam(LocalDateTime dateTimeOfExam) {
		this.dateTimeOfExam = dateTimeOfExam;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public ExamType getExamtype() {
		return examtype;
	}

	public void setExamtype(ExamType examtype) {
		this.examtype = examtype;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", classId=" + classId + ", dateTimeOfExam=" + dateTimeOfExam + ", subject=" + subject
				+ ", examtype=" + examtype + ", maxMarks=" + maxMarks + "]";
	}
	
}