package com.ssk.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 212561830 on 12/1/17.
 */
public class PowerTest {
    Power power = new Power();
    @Test
    public void raiseToPower() throws Exception {

        assertEquals(1000, (int)power.raiseToPower(10, 3));
        assertEquals(1, (int)power.raiseToPower(10, 0));
        assertEquals(10, (int)power.raiseToPower(10, 1));
        System.out.println(power.raiseToPower(10, -1));
    }

    @Test
    public void raise() throws Exception {

        assertEquals(10000, (int)power.raise(10, 4));
        assertEquals(1, (int)power.raise(10, 0));
        assertEquals(10, (int)power.raise(10, 1));
        System.out.println(power.raise(10, -1));
    }
}