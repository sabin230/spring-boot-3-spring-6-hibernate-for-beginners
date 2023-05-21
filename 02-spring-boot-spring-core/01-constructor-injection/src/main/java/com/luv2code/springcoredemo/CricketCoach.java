package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;
//@Component annotation needed so that spring can scan and inject dependency
//if @Component cannot be added, with@Bean and @Configuration class , dependency is injected
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
