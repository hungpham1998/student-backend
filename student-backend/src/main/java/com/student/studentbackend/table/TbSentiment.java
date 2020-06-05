package com.student.studentbackend.table;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbSentiment")
@Data
public class TbSentiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String namefile;
    String content;
    String qa;
    long tgian;
    long tongtg;
//    long instime;
//    int trained;
    int sentiment;
}
