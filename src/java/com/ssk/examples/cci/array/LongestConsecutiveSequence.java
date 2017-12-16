package com.ssk.examples.cci.array;

/**
 * Created by 212561830 on 11/11/17.
 */
public class LongestConsecutiveSequence {

    int[] temp;

    public int longestConsecutive(int[] nums) {
        sort(nums);

        if (nums.length == 0) {
            return 0;
        }
        int longestSequence = 1;
        int currentSequence = 1;

        for (int i = 1; i <nums.length-1 ; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    currentSequence += 1;
                }
                else {
                    longestSequence = Math.max(longestSequence, currentSequence);
                    currentSequence = 1;
                }
            }
        }

        return Math.max(longestSequence, currentSequence);
    }
    private int[] sort(int[] nums){
        temp = new int[nums.length];
        mergeSort(nums, 0, nums.length-1);
        return temp;
    }


    public void mergeSort(int[] a, int low, int high) {
        int center;
        if (low < high) {
            center = low + (high - low) / 2;// calculate the center index to split into sub arrays.
            mergeSort(a, low, center); // sorting left part of the array.
            mergeSort(a, center + 1, high);// sort right part of the array.
            merge(a, low, center, high);
        }
    }

    public void merge(int[] a, int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            temp[i] = a[i];
        }
        int i = low; // counter for lower part of array
        int j = middle + 1; // counter for higher part of the array
        int k = low; // stores temp index.
        while (i <= middle && j <= high) {
            if (temp[i] <= temp[j]) {
                a[k] = temp[i];
                i++;
            } else {
                a[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            a[k] = temp[i];
            k++;
            i++;
        }
    }
}
