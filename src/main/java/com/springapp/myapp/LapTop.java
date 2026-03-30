package com.springapp.myapp;

import org.springframework.stereotype.Component;

@Component
public class LapTop implements ComputerInterFace{
    public void pc(){
        System.out.println("LapTop");
    }
}
