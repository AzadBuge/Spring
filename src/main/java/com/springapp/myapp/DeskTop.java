package com.springapp.myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // use of primary to solve the confusion of by type
public class DeskTop implements ComputerInterFace {
    public void pc() {
        System.out.println("DeskTop");
    }
    
}
