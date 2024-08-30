package com.doguy.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private final Laptop lap;


    @Autowired
    public Alien(Laptop lap) {
        this.lap = lap;
    }

    public void code() {
        lap.compile();
    }
}
