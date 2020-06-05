package com.student.studentbackend.table;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Role")
@Data
public class Role {
//    private Set<Account> Accounts = new HashSet<>();
//
//    public Role(){
//        super();
//    }
//
//    public Role(String Title){
//        this.Title = Title;
//    }
//
//    public  Role(String Title, Set<Account> Accounts){
//        this.Title  = Title;
//        this.Accounts =Accounts;
//    }

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Note")
    private String Note;

    public void setTitle(String title) {
        Title = title;
    }

    public void setNote(String note) {
        Note = note;
    }

    public void setId(Long id) {
        Id = id;
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

//    @ManyToMany(mappedBy = "Roles")
//    public Set<Account> getAccounts() {
//        return Accounts;
//    }
//
//    public void setAccounts(Set<Account> Accounts) {
//        this.Accounts = Accounts;
//    }
}
