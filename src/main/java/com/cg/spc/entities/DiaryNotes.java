package com.cg.spc.entities;

import java.util.Map;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DiaryNotes {
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //private ClassDiary classDiary;
    @OneToOne 
    private Subject subject;
    private Map<Subject,String> notes = null;
    
    public DiaryNotes() {
        super();
    }

    public DiaryNotes(String remarks) {
        super();
        this.notes.put(subject, remarks); 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Map<Subject, String> getNotes() {
        return notes;
    }

    public void setNotes(Map<Subject, String> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "DiaryNotes [id=" + id + ", notes=" + notes + "]";
    }
    
}