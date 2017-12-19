package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSuSubArrayTest {
    @Test
    public void maxSum() throws Exception {
        int[] a1 = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSuSubArray maximumSuSubArray = new MaximumSuSubArray();

        assertEquals(6, maximumSuSubArray.maxSum(a1));
    }

}