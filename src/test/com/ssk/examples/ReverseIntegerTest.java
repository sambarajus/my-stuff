package com.ssk.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 212561830 on 11/15/17.
 */
public class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void testReversingAnInteger() {
        assertEquals(1, reverseInteger.getIntegerReversed(1000));
        assertEquals(267, reverseInteger.getIntegerReversed(762));
        assertEquals(5602, reverseInteger.getIntegerReversed(2065));
        assertEquals(2001, reverseInteger.getIntegerReversed(1002));
        assertEquals(-5605, reverseInteger.getIntegerReversed(-5065));
    }

}