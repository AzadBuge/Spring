package com.springapp.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    private LapTop lapTop;
    // Setter injection
    @Autowired
    public void setLapTop(LapTop lapTop){
        this.lapTop = lapTop;
    }
    public void build(){
        System.out.println("In Build");
        lapTop.pc();
    }
}
