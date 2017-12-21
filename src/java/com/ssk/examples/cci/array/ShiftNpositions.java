package com.ssk.examples.cci.array;

public class ShiftNpositions {
    public void shift(int nums[], int x){

        int n = nums.length;
        printArray(nums);

        for (int i = 0; i <n ; i++) {
            System.out.println(" i = "+i);
            if(i+x%n<n){
                int temp = nums[i];
                nums[i] = nums[i+x%n];
                nums[i+x%n] = temp;
            }
            printArray(nums);
        }
    }




    public void printArray(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            System.out.printf(nums[i]+" ");
        }
        System.out.println();
    }
}
