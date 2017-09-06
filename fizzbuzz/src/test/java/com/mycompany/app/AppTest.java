package com.mycompany.app;

import org.junit.Test;

import static com.mycompany.app.App.*;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void divisibleCheckTest()
    {
        assertEquals("fizz",divisibleCheck(6,3,"fizz"));
        assertEquals("buzz",divisibleCheck(10,5,"buzz"));

        assertEquals("",divisibleCheck(10,3,"fizz"));
        assertEquals("",divisibleCheck(6,5,"buzz"));
    }

    @Test
    public void emptyStringCheckTest()
    {
        assertEquals("7",emptyStringCheck(7,""));
        assertEquals("",emptyStringCheck(3,"fizz"));
        assertEquals("",emptyStringCheck(5,"buzz"));
        assertEquals("",emptyStringCheck(15,"fizzbuzz"));
    }

    @Test
    public void printTest()
    {
        assertEquals("number: 15 output: fizzbuzz",print(15));
        assertEquals("number: 6 output: fizz",print(6));
        assertEquals("number: 10 output: buzz",print(10));
        assertEquals("number: 7 output: 7",print(7));
    }

}
