package com.ssk.examples.cci.array;

public class FindMinimumInRotatedArray {

    public int findMin(int[] nums) {
        if (nums.length <= 1)
            return nums[0];
        int i = 0;
        int j = nums.length - 1;
        int c = 0;
        while (i < j) {
            c = i + (j - i) / 2;
            if (nums[c] > nums[j]) {
                i = c + 1;
            } else if (nums[c] < nums[j]) {
                j = c;
            } else {
                j--;
            }
        }
        return nums[i];
    }
}
