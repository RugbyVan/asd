package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectcav2 {

        Projectcav2Delegate projectcav2Delegate = new Projectcav2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectcav2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}