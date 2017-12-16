package com.ssk.examples;

/**
 * Created by 212561830 on 11/15/17.
 */
public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0)
                leftSum += nums[i - 1];

            if (sum - leftSum - nums[i] == leftSum)
                return i;
        }
        return -1;
    }
}
