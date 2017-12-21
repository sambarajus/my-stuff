package com.ssk.examples;

public class QuickSort {

    public void quickSort(int[] arr, int lowIndex, int highIndex){
        int i=lowIndex;
        int j = highIndex;
        System.out.println(i+", "+j);
        int pivot =arr[lowIndex+(highIndex-lowIndex)/2];
        System.out.println(pivot);
        while (i<=j){

            while(arr[i]<pivot){
                i++;
            }

            while (arr[j]>pivot){
                j--;
            }
            // swap values...
            System.out.println("swap values..."+arr[i]+","+arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        if(lowIndex<j){
            quickSort(arr,lowIndex, j);
        }
        if(i<highIndex){
            quickSort(arr, i, highIndex);
        }

    }
}

