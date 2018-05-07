package com.DawidTracz.toDoList.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue

    @Column(updatable = false,unique = true, name = "id", nullable = false, length=6)
    private int id;

    @Column(name = "email address", nullable = false, length=35)
    private String emailAddress;

    @Column(name = "password", nullable = false, length=35)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
