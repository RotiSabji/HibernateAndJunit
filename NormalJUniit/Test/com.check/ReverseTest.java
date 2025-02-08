package com.check;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {
    @Test
    public void checkReversed(){
        Reverse s=new Reverse();
//        String rev=s.reverseString("Java");
        String expected="avaJ";
        assertEquals(expected,s.reverseString("Java"));
    }
}
