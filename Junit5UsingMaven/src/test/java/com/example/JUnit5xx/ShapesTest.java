package com.example.JUnit5xx;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapesTest {
    @Test
    void checkSquareArea(){
        Shapes s =new Shapes();

        assertEquals(576,s.squareArea(24));
    }
    @Test
    void anotherTest_Supplier(){
        assertEquals(5,6,()->"Test failed bro ");
    }
    @Test
    void checkArray(){
        int[] expected ={2,4,6,8};
        int[] actual={2,4,6,8};
        assertArrayEquals(expected,actual);
    }
}
