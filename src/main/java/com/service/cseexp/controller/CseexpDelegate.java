package com.service.cseexp.controller;

import org.springframework.stereotype.Component;


@Component
public class CseexpDelegate implements Cseexp {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
