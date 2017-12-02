package com.service.cseexp1.controller;

import org.springframework.stereotype.Component;


@Component
public class Cseexp1Delegate implements Cseexp1 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
