package com.ssk.examples.cci.array;

public class TrappedWater {

    public int trap(int[] height) {


        if(height.length==0)
            return 0;
        int l = 0;
        int r = height.length-1;
        int trapped = 0;
        int leftMax = 0;
        int rightMax = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=leftMax)
                    leftMax = height[l];
                else
                    trapped+=leftMax-height[l];
                l++;
            } else{
                if(height[r]>=rightMax)
                    rightMax = height[r];
                else
                    trapped+=rightMax-height[r];
                r--;
            }
        }
        return trapped;
    }
}
