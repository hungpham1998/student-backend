package com.student.studentbackend.table;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "fristName")
    private String fristName;

    @Column(name = "note")
    private String note;

    @Column(name = "image")
    private String image;

    @Column(name = "address")
    private String address;

    @Column(name = "brithday")
    private Date brithday;

    @Column(name = "code")
    private String code;

}
