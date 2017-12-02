package com.service.cseexp3.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCseexp3 {

    Cseexp3Delegate cseexp3Delegate = new Cseexp3Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseexp3Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
