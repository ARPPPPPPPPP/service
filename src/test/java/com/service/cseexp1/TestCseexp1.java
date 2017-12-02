package com.service.cseexp1.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCseexp1 {

    Cseexp1Delegate cseexp1Delegate = new Cseexp1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseexp1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
