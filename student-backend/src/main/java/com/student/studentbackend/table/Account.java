package com.student.studentbackend.table;



import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Account")
@Data
public class Account  {

    //private Set<Role> Roles;
    Set<Role> Roles = new HashSet<>();

    public Account(String Account, Set<Role> Roles){
        this.Account = Account;
        this.Roles = Roles;
    }

    public Account(String Account){
        this.Account = Account;
    }

    public  Account(){
        super();
    }


    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "Account")
    private String Account;

    @Column(name = "PassWord")
    private String PassWord;

    @Column(name = "Image")
    private String Image;

    @Column(name = "Mail")
    private String Mail;

    @Column(name = "Address")
    private String Address;

    @Column(name = "DepartmentId")
    private long DepartmentId;

    @Column(name = "PostionId")
    private long PostionId;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "account_role", joinColumns = @JoinColumn(name = "account_id", referencedColumnName = "Id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "Id"))

    public Set<Role> getRoles() {
        return Roles;
    }

    public void setRoles(Set<Role> Roles) {
        this.Roles = Roles;
    }


    @Override
    public String toString() {
        String result = String.format(
                "account[id=%d, account='%s', image='%s', mail='%s', address='%s']%n",
                Id, Account,Image, Mail, Address);
        if (Roles != null) {
            for(Role Role : Roles) {
                result += String.format(
                        "role[id=%d, title='%s']%n",
                        Role.getId(), Role.getTitle());
            }
        }
        System.out.println(result);
        return result;
    }
}
