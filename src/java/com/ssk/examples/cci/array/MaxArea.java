package com.ssk.examples.cci.array;

public class MaxArea {

    public int maxArea(int[] height) {
        if(height.length==0)
            return 0;
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        while(l<r){
            int area = Math.min(height[l], height[r])*(r-l); // calculate the area between least number and higher number.
            maxArea = Math.max(maxArea, area);
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}
