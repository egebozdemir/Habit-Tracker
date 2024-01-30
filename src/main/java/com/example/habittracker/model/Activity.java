package com.example.habittracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
public class Activity {

    //Private Instance Variables
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne //vice-versa relation mapping set on Habit
    private Habit habit;
    //More than one activity can belong to a single habit
    //Since many-to-one relation is defined,
    //ORM adds a foreign key as 'habbit_id' in Activity table in DB

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;


    //Public Getter and Setter Methods
    public void setHabit(Habit habit) {
        this.habit = habit;
    }
}
