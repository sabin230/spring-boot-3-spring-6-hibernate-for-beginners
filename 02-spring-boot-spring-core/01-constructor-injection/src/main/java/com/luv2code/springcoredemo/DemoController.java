package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // setter injection can be used for optional dependency
    //field injection is not recommended due to tight coupling...
    @Autowired    // define a constructor for dependency injection . Recommended for required dependency
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }  //Constructor has same name as class

    //http://localhost:8080/dailyworkout
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}






