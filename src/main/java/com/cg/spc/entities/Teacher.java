package com.cg.spc.entities;

import java.util.List;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 20)
	private String name;
	@OneToOne
	private Subject subject;
	@ManyToMany(mappedBy = "subjectTeachers")
	private List<ClassId> classId;
	private Map<Subject,List<ClassId>> subjectClasses = null; 
	
	public Teacher() {
		super();
		
	}

	public Teacher( String name) {
		super();
		this.name = name;
		this.subjectClasses.put(subject, classId);
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<ClassId> getClassId() {
		return classId;
	}

	public void setClassId(List<ClassId> classId) {
		this.classId = classId;
	}

	public int getId() {
		return id;
	}

	public void setId(int teacherId) {
		this.id = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Subject, List<ClassId>> getSubjectClasses() {
		return subjectClasses;
	}

	public void setSubjectClasses(Map<Subject, List<ClassId>> subjectClasses) {
		this.subjectClasses = subjectClasses;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subjectClasses=" + subjectClasses + "]";
	}	
	
}