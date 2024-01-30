package com.example.habittracker.controller;

import com.example.habittracker.model.Habit;
import com.example.habittracker.repository.HabitRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habits") //annotation for rest controller and request mapping to "/habits" endpoint
public class HabitController {

    //Private instance variables
    private final HabitRepository habitRepository;

    //constructor for finals
    public HabitController(HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    //Action: method (to create habit request) in the controller
    @PostMapping
    void create(@RequestBody CreateHabitRequest request){
        Habit h = new Habit();
        h.setName(request.name());
        this.habitRepository.save(h);
    }

}
