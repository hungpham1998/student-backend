package com.student.studentbackend.table;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Position")
@Data
public class Position {

    @Id
    @Column(name = "id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "note")
    private String note;

}
