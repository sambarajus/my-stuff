package com.ssk.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 212561830 on 11/15/17.
 */
public class FindPivotIndexTest {
    FindPivotIndex pivotIndex = new FindPivotIndex();
    @Test
    public void pivotIndex() throws Exception {
        int[] nums = {1, 7, 3, 6, 5, 6};
//        assertEquals(3, pivotIndex.pivotIndex(nums));
//
//        int[] nums2 = {1, 2, 3};
//        assertEquals(-1, pivotIndex.pivotIndex(nums2));
        int[] nums3 = {-1,-1,-1,-1,-1,0};
        assertEquals(2, pivotIndex.pivotIndex(nums3));
    }

}