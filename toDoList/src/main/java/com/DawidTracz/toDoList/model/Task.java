package com.DawidTracz.toDoList.model;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue

    @Column(updatable = false,unique = true, name = "id", nullable = false, length=6)
    private int id;

    @Column(name = "flag name", nullable = false, length=35)
    private String flagName;

    @Column(name = "flagId", unique = true, nullable = false, length=6)
    private int flagId;
}
