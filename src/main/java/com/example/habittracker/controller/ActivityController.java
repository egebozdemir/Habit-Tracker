package com.example.habittracker.controller;

import com.example.habittracker.model.Activity;
import com.example.habittracker.model.Habit;
import com.example.habittracker.repository.ActivityRepository;
import com.example.habittracker.repository.HabitRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    //Private Instance Variables
    private final ActivityRepository activityRepository;

    private final HabitRepository habitRepository;

    //constructors for finals (should be initialised when created) remain same until JVM is restarted
    public ActivityController(ActivityRepository activityRepository, HabitRepository habitRepository) {
        this.activityRepository = activityRepository;
        this.habitRepository = habitRepository;
    }


    //Action: method (to create Activity request) in the controller
    @PostMapping
    void create(@RequestBody CreateActivityRequest request){
        //used RequestBody annotation to parse and caste the data (JSON) in the request body into a java class
        Habit habit = this.habitRepository.findById(request.habitId()).orElseThrow(EntityNotFoundException::new);
        Activity activity = new Activity();
        activity.setHabit(habit);
        this.activityRepository.save(activity);
    }
}
