package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// SwimCoach does not have @Component so Configuration annotation with @Bean is used for dependency injection
@Configuration
public class SportConfig {

    @Bean("aquatic") // By defaul bean id is method Name. However, in this case it is aquatic. notice method name are lowercase
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
