package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectw51g {

        Projectw51gDelegate projectw51gDelegate = new Projectw51gDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectw51gDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}