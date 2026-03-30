package com.springapp.myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class DeskTop implements ComputerInterFace {
    public void pc() {
        System.out.println("DeskTop");
    }
    
}
