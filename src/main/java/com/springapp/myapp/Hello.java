package com.springapp.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    
    @Autowired
    private ComputerInterFace comp;

    public void build(){
        System.out.println("In Build");
        comp.pc();
    }
}
