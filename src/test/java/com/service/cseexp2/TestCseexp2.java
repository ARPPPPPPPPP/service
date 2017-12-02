package com.service.cseexp2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCseexp2 {

    Cseexp2Delegate cseexp2Delegate = new Cseexp2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseexp2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
