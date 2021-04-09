package com.cg.spc.entities;

 

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

 


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

 


@Entity
public class ClassDiary {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToMany
    private List<DiaryNotes> diaryNotes; 
    private LocalDate localDate;
    private Map<LocalDate,List<DiaryNotes>> notes = null;
    
    public ClassDiary() {
        super();
        this.notes.put(localDate, diaryNotes);
        
    }
    

    /*public ClassDiary(Map<LocalDate, List<DiaryNotes>> notes) {
        super();
        this.notes = notes;
    }*/

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public List<DiaryNotes> getDiaryNotes() {
        return diaryNotes;
    }

    public void setDiaryNotes(List<DiaryNotes> diaryNotes) {
        this.diaryNotes = diaryNotes;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Map<LocalDate, List<DiaryNotes>> getNotes() {
        return notes;
    }

    public void setNotes(Map<LocalDate, List<DiaryNotes>> notes) {
        this.notes = notes;
    }
    
    @Override
    public String toString() {
        return "ClassDiary [id=" + id + ", notes=" + notes + "]";
    }
 
}