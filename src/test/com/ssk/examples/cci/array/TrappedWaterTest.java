package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrappedWaterTest {

    private TrappedWater trappedWater = new TrappedWater();
    @Test
    public void trap() throws Exception {

        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, trappedWater.trap(heights));
    }

}