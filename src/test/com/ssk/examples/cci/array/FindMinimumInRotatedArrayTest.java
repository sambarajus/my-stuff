package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinimumInRotatedArrayTest {
    FindMinimumInRotatedArray minimumInRotatedArray = new FindMinimumInRotatedArray();
    @Test
    public void findMin() throws Exception {
        int a[] = {1,2,1};
        assertEquals(1,minimumInRotatedArray.findMin(a));

        int a1[] = {3,1,3};
        assertEquals(1,minimumInRotatedArray.findMin(a1));
        int a2[] = {1};
        assertEquals(1,minimumInRotatedArray.findMin(a2));


        int a3[] = {1,1};
        assertEquals(1,minimumInRotatedArray.findMin(a3));

        int a4[] = {1};
        assertEquals(1,minimumInRotatedArray.findMin(a4));

        int a5[] = {1,2,3,4,1,2};
        assertEquals(1,minimumInRotatedArray.findMin(a5));

        int a6[] = {1,3,3};
        assertEquals(1,minimumInRotatedArray.findMin(a6));

        int a7[] = {3,1,1};
        assertEquals(1,minimumInRotatedArray.findMin(a5));
    }

}