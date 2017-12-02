package com.service.cseexp2.controller;

import org.springframework.stereotype.Component;


@Component
public class Cseexp2Delegate implements Cseexp2 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
