package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProductTest {

    MaxProduct product = new MaxProduct();
    @Test
    public void maxProduct() throws Exception {
        int[] a1 = {2,3,-2,4};
        assertEquals(6,product.maxProduct(a1));

//        int[] a2 = {1,2,4,5,9,10,-3,2};
//        System.out.println(product.maxProduct(a2));
    }

}