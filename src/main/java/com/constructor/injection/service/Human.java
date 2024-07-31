package com.constructor.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

    private Air air;
    private Water water;
    private Food food;


    public Human(Air air, Water water, Food food) {
        this.air = air;
        this.water = water;
        this.food = food;
    }

    /* setter based injection
        * in here spring will create an object of air class and assign in air at line 9*

        /
        Disadvantage
        * Let suppose you forget to autowire your setting injection and you want to call a
        * method inside the air then it throw null pointer exception go below
        * */
    @Autowired
    public void setAir(Air air) {
        this.air = air;
    }


    @Autowired
    public void setWater(Water water) {
        this.water = water;
    }

    @Autowired
    public void setFood(Food food) {
        this.food = food;
    }

    public void live(){

        /* Disadvantage
            Let suppose you forget to autowire your setting injection and you want to call a
            method inside the air then it throw null pointer exception go below
        */
        //modifyWaterObject();
        air.breathe();
        water.drink();

        if(air==null || water==null || food==null){
            System.out.println("Dead ... Can't alive");
        }
        else{
            System.out.println("Live ... Living ....");
        }
    }

    /* Removes Immutability can't acheive immutability */
    public void modifyWaterObject(){
        Water waterObj = new Water();
        waterObj.setDrinkWater(1000);
        this.water = waterObj;
    }
}
