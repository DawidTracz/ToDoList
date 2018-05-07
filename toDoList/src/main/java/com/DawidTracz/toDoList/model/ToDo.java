package com.DawidTracz.toDoList.model;

import javax.persistence.*;

@Entity
@Table(name = "toDoList")
public class ToDo {

    @Id
    @GeneratedValue
    @Column(updatable = false,unique = true, name = "id", nullable = false, length=6)
    private int id;

    @Column(name = "task name", nullable = false, length=35)
    private String taskName;

    @Column(name = "taskId", unique = true, nullable = false, length=6)
    private int taskId;


}
