package com.constructor.injection.service;

import org.springframework.stereotype.Component;

@Component
public class Water {

    private int drinkWater = 5;

    public int getDrinkWater() {
        return drinkWater;
    }

    public void setDrinkWater(int drinkWater) {
        this.drinkWater = drinkWater;
    }

    public void drink(){
        System.out.println("human drinking water "+ drinkWater + " in a day");

    }
}
