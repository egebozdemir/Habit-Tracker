package com.example.habittracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity //annotation to map the class into the table in the DB
public class Habit {

    //Private Instance Variables
    @Id //setting it as a primary key (auto-generated field)
    @GeneratedValue //auto incremented
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "habit") //to set one-to-many relation with Habit
    private Set<Activity> activities;
    //A habit can have more than one activity


    //Public Getter and Setter Methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
