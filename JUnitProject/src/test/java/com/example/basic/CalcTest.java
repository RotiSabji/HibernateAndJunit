package com.example.basic;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void test(){
//        fail("not yet implemented yet");
//        assertEquals("java","java");
//        instantiate the class
        Calc test=new Calc();
        int actualAnswer=test.divide(8,2);
        int expectedResult=4;
        assertEquals(expectedResult,actualAnswer);
    }
}
