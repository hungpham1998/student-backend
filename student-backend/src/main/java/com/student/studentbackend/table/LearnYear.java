package com.student.studentbackend.table;

import javax.persistence.*;

@Entity
@Table(name = "LearnYear")
public class LearnYear {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "LearnYear")
    private String LearnYear;

    @Column(name = "Note")
    private String Note;

    public String getNote() {
        return Note;
    }

    public Long getId() {
        return Id;
    }

    public String getLearnYear() {
        return LearnYear;
    }

    public void setNote(String note) {
        Note = note;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setLearnYear(String learnYear) {
        LearnYear = learnYear;
    }
}
