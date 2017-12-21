package com.ssk.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    MergeSort mergeSort = new MergeSort();

    @Test
    public void sort() throws Exception {
        int a[] = {2,1,1,3,5,4,6};
        int[] r = mergeSort.sort(a);
        assertEquals(1,r[0]);
        assertEquals(1,r[1]);
        assertEquals(2,r[2]);
    }

}