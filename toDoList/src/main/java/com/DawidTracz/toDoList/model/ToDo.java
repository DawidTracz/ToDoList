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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
