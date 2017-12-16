package com.ssk.examples.cci.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 212561830 on 11/15/17.
 */
public class TwoSumProblem {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        int[] indexes =  new int[2];
        for(int i=0;i< nums.length;i++) {
            if(numberMap.containsKey(nums[i])) {
                int index = numberMap.get(nums[i]);
                indexes[0] = index+1;
                indexes[1] = i+1;
            }else {
                numberMap.put(target-nums[i], i);
            }
        }
        return indexes;
    }
}
