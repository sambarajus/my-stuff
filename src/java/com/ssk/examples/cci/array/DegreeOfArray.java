package com.ssk.examples.cci.array;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> leftIndex = new HashMap();//Left occurance of x
        Map<Integer, Integer> rightIndex = new HashMap();//right occurance of x
        Map<Integer, Integer> numOfOccurances = new HashMap();

        int degree = 0;

        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            if(leftIndex.get(x)==null)
                leftIndex.put(x,i);
            rightIndex.put(x,i);
            numOfOccurances.put(x, numOfOccurances.getOrDefault(x,0)+1 );
            degree = degree< numOfOccurances.get(x) ? numOfOccurances.get(x) : degree;
        }
        int  subArrayLength = nums.length;

        for(int x: numOfOccurances.keySet()){
            if(degree==numOfOccurances.get(x)){
                subArrayLength = Math.min(subArrayLength, rightIndex.get(x)-leftIndex.get(x)+1);
            }
        }

        return subArrayLength;
    }
}
