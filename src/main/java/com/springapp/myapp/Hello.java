package com.springapp.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    
    @Autowired
    @Qualifier("lapTop")
    private ComputerInterFace comp;

    public void build(){
        System.out.println("In Build");
        comp.pc();
    }
}
