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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public int getFlagId() {
        return flagId;
    }

    public void setFlagId(int flagId) {
        this.flagId = flagId;
    }
}
