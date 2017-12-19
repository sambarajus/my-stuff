package com.ssk.examples.cci.array;

public class MaximumSuSubArray {

    public int maxSum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int lastMax = nums[0];
        int lastMin = nums[0];
        int max = nums[0];
        int maxAti, minAti;

        for(int i = 1; i<nums.length; i++){
            int maxSum = lastMax + nums[i];
            int minSum = lastMin + nums[i];
            maxAti = Math.max(Math.max(maxSum, minSum), nums[i]);//Max of products and value agt position
            minAti = Math.min(Math.min(maxSum, minSum), nums[i]); //Min of products and value agt position
            max = Math.max(maxAti, max);
            lastMax = maxAti;
            lastMin = minAti;

        }
        return max;
    }
}
