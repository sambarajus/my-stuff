package com.ssk.examples.cci.array;

import com.ssk.examples.cci.array.MaxProfit;
import org.junit.Test;

/**
 * Created by 212561830 on 11/12/17.
 */
public class MaxProfitTest {
    @Test
    public void maxProfit() throws Exception {
        MaxProfit maxProfit = new MaxProfit();
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit.maxProfit(arr));
    }

}