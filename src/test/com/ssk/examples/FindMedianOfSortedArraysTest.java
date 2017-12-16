package com.ssk.examples;

import org.junit.Test;

/**
 * Created by 212561830 on 11/11/17.
 */
public class FindMedianOfSortedArraysTest {

    @Test
    public void findMedianSortedArrays() throws Exception {


        FindMedianOfSortedArrays test = new FindMedianOfSortedArrays();
        int[] n1 = {1,2};
        int[] n2 = {3,4};

        double median = test.findMedianSortedArrays(n1, n2);
        System.out.println( median);
        int[] n3 = {};
        int[] n4 = {2,3};
        median = test.findMedianSortedArrays(n3, n4);
        System.out.println( median);
        int[] n5 = {1,3};
        int[] n6 = {2};
        median = test.findMedianSortedArrays(n5, n6);
        System.out.println(median);
    }

}