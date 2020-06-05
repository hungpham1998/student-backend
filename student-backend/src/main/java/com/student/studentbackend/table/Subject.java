package com.student.studentbackend.table;

import javax.persistence.*;

@Entity
@Table(name = "Subject")
public class Subject {

    @Id
    @Column(name = "id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "note")
    private String note;

    @Column(name = "code")
    private String code;

    @Column(name = "creaditNumber")
    private String creaditNumber;

}

