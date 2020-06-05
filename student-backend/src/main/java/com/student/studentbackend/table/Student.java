package com.student.studentbackend.table;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "FristName")
    private String FristName;

    @Column(name = "Note")
    private String Note;

    @Column(name = "Image")
    private String Image;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Brithday")
    private Date Brithday;

    @Column(name = "Code")
    private String Code;

    public Long getId() {
        return Id;
    }

    public String getNote() {
        return Note;
    }

    public String getCode() {
        return Code;
    }

    public String getImage() {
        return Image;
    }

    public String getAddress() {
        return Address;
    }

    public Date getBrithday() {
        return Brithday;
    }

    public String getFristName() {
        return FristName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNote(String note) {
        Note = note;
    }

    public void setCode(String code) {
        Code = code;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setBrithday(Date brithday) {
        Brithday = brithday;
    }

    public void setFristName(String fristName) {
        FristName = fristName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

}
