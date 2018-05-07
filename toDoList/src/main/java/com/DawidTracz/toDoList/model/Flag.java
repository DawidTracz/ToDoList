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
}
