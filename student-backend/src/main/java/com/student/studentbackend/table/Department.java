package com.student.studentbackend.table;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Department")
@Data
public class Department {
    @Id
    @Column(name = "id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "note")
    private String note;

    @Column(name = "parmentId")
    private long  parmentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
