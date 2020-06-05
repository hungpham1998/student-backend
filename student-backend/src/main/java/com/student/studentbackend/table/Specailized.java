package com.student.studentbackend.table;

import javax.persistence.*;

@Entity
@Table(name = "Specailized")
public class Specailized {
    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Note")
    private String Note;

    @Column(name = "Code")
    private String Code;

    public Long getId() {
        return Id;
    }

    public String getNote() {
        return Note;
    }

    public String getTitle() {
        return Title;
    }

    public String getCode() {
        return Code;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNote(String note) {
        Note = note;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCode(String code) {
        Code = code;
    }
}
