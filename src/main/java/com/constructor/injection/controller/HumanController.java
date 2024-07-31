package com.constructor.injection.controller;

import com.constructor.injection.service.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/human")
public class HumanController {

    //Field Based depdency injection
    @Autowired
    private Human human;



    //Constructor based dependency injection
    public HumanController(Human human) {
        this.human = human;
    }

    /*
    only difference in field based and construction based is immutability in
    field based we do not acheive immutability
    */

    //setterbased injection
    /* if we forget to autowire it and below we call human.live() method thorw
    * null pointer exception  */
    @Autowired
    public void setHuman(Human human) {
        this.human = human;
    }

    @GetMapping("/call")
    public void humanCall(){
        human.live();
    }
}
