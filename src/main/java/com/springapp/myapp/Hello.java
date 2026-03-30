package com.springapp.myapp;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    public String build(){
        System.out.println("In Build");
        return "Spring Boot Developer Azad (Learner) ..!";
    }
}
