package com.service.cseexp3.controller;

import org.springframework.stereotype.Component;


@Component
public class Cseexp3Delegate implements Cseexp3 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
