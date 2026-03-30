package com.springapp.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {

    @Autowired // connects the component Hello and LapTop
    private LapTop lapTop ;
    public void build(){
        System.out.println("In Build");
        lapTop.pc();
    }
}
