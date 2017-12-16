package com.ssk.examples.cci.array;

/**
 * Created by 212561830 on 11/12/17.
 */
public class MaxProfit {


    public int maxProfit(int[] prices) {
        int profit = 0;
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(String.format("Profit:%d, i: %d, price[i]:%d, minElement: %d",profit,i, prices[i], minElement));
            profit = Math.max(profit, prices[i] - minElement);
            minElement = Math.min(minElement, prices[i]);
        }
        return profit;
    }
}
