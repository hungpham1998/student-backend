package com.student.studentbackend.table;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Note")
    private String Note;

    @Column(name = "ParmentId")
    private long  ParmentId;

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getNote() {
        return Note;
    }

    public long getParmentId() {
        return ParmentId;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setNote(String note) {
        Note = note;
    }

    public void setParmentId(long parmentId) {
        ParmentId = parmentId;
    }
}
