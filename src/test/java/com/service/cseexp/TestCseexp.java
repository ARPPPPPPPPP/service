package com.service.cseexp.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCseexp {

    CseexpDelegate cseexpDelegate = new CseexpDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseexpDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
