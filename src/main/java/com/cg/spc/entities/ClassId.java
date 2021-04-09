package com.cg.spc.entities;

import java.util.List;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class ClassId {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column
    private int grade;
    @Column
    private char division;
    @OneToOne
    private Teacher classTeacher;
    @ManyToMany 
    private List<Teacher> subjectTeachers; 
    
    
    public ClassId() {
        super();
    }

    public ClassId(String id, int grade, char division, Teacher classTeacher, List<Teacher> subjectTeachers) {
        super();
        this.id = id;
        this.grade = grade;
        this.division = division;
        this.classTeacher = classTeacher;
        this.subjectTeachers = subjectTeachers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public List<Teacher> getSubjectTeachers() {
        return subjectTeachers;
    }

    public void setSubjectTeachers(List<Teacher> subjectTeachers) {
        this.subjectTeachers = subjectTeachers;
    }

    @Override
    public String toString() {
        return "ClassId [id=" + id + ", grade=" + grade + ", division=" + division + ", classTeacher=" + classTeacher
                + ", subjectTeachers=" + subjectTeachers + "]";
    }
    
    
}