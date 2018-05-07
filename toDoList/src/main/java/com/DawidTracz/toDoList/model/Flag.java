package com.DawidTracz.toDoList.model;

import javax.persistence.*;

@Entity
@Table(name = "flags")
public class Flag {

    @Id
    @GeneratedValue

    @Column(updatable = false,unique = true, name = "id", nullable = false, length=6)
    private int id;

    @Column(name = "flag name", nullable = false, length=35)
    private String flagName;

}
