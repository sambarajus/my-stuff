package com.ssk.examples.cci.array;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int lastMax = nums[0];
        int lastMin = nums[0];
        int max = nums[0];
        int maxAti, minAti;

        for(int i = 1; i<nums.length; i++){
            int maxProduct = lastMax * nums[i];
            int minProduct = lastMin * nums[i];
            maxAti = Math.max(Math.max(maxProduct, minProduct), nums[i]);//Max of products and value agt position
            minAti = Math.min(Math.min(maxProduct * nums[i], minProduct), nums[i]); //Min of products and value agt position
            max = Math.max(maxAti, max);
            lastMax = maxAti;
            lastMin = minAti;

        }
        return max;
    }
}
