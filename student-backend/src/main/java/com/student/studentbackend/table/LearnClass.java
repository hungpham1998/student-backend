package com.student.studentbackend.table;

import javax.persistence.*;

@Entity
@Table(name = "LearnClass")
public class LearnClass {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Note")
    private String Note;

    @Column(name = "SpecailizeId")
    private long SpecailizeId;


    public Long getId() {
        return Id;
    }

    public long getSpecailizeId() {
        return SpecailizeId;
    }

    public String getNote() {
        return Note;
    }

    public String getTitle() {
        return Title;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNote(String note) {
        Note = note;
    }

    public void setSpecailizeId(long specailize_Id) {
        SpecailizeId = specailize_Id;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
