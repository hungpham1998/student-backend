package com.student.studentbackend.table;

import javax.persistence.*;

@Entity
@Table(name = "Subject")
public class Subject {

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

    @Column(name = "CreaditNumber")
    private String CreaditNumber;

    public String getCode() {
        return Code;
    }

    public String getTitle() {
        return Title;
    }

    public String getNote() {
        return Note;
    }

    public Long getId() {
        return Id;
    }

    public String getCreaditNumber() {
        return CreaditNumber;
    }

    public void setCode(String code) {
        Code = code;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setNote(String note) {
        Note = note;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setCreaditNumber(String creaditNumber) {
        CreaditNumber = creaditNumber;
    }
}

