package com.ssk.examples;

/**
 *
 * Worst-case performance	O(n log n)
 * Best-case performance    O(n log n) typical, O(n) natural variant
 * Average performance	O(n log n)
 * Worst-case space complexity	О(n) total, O(n)
 */

/**
 * Created by 212561830 on 11/8/17.
 */
public class MergeSort {

    public int[] sort(int[] a){
        int[] r = new int[a.length];
        mergeSort(a, 0, a.length-1, r);
        return r;
    }
    public void mergeSort(int[] arr, int low, int high, int[] r){
        if(low==high)
            return;
        int mid = low+(high-low)/2;
        mergeSort(arr, low, mid, r);
        mergeSort(arr, mid+1, high, r );
        merge(arr, low, mid, high, r);
    }

    public void merge(int[] a, int low, int c, int high, int[] r){

        //populate temp array with initial values.
        for (int i = low; i <= high; i++) {
            r[i] = a[i];
        }
        int i = low; // counter for lower part of array
        int j = c + 1; // counter for higher part of the array
        int k = low; // stores temp index.

        while (i <= c && j <= high) {
            if (r[i] <= r[j]) {
                a[k] = r[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        while (i <= c) {
            a[k] = r[i];
            k++;
            i++;
        }
    }
}
