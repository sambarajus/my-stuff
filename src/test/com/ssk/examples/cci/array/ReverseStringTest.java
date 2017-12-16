package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();
    @Test
    public void reverseString() throws Exception {
        assertEquals("olleh", reverseString.reverseString("hello"));
        assertEquals("h", reverseString.reverseString("h"));
    }

}