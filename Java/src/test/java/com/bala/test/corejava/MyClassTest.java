package com.bala.test.corejava;

import com.bala.practice.start.StartService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {

    @Test
    public void testMethod() {
        StartService myClass = new StartService();
        int result = myClass.addNumber(5,7);
        assertEquals(12, result); // Example assertion
    }

//    @Test
//    public void test2Method() {
//        StartService myClass = new StartService();
//        int result = myClass.addNumber(5,7);
//        assertEquals(12, result); // Example assertion
//    }
}
