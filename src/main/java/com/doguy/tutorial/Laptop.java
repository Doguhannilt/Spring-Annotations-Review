package com.doguy.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    public void compile() {
        System.out.println("Compile");
    }
}
