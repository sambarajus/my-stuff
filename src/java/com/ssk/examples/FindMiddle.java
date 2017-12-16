package com.ssk.examples;

/**
 * Created by 212561830 on 11/3/17.
 */
public class FindMiddle {

    public static void main(String args[]){
        int[] arr = {4,2,3,1,11,9,7,8,5,16};
        System.out.println(findMeddleIndex(arr));
        int midIndex = findMeddleIndex(arr);
        System.out.println(String.format("Middle Index: %d, Value: %d", midIndex, arr[midIndex]) );
    }

    public static int findMeddleIndex(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int mid = arr[0];

        for(int i = 0; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
            mid = (min+max)/2;
        }
        System.out.println(String.format("Min:%d, Max:%d, Middle: %d", min, max,mid));

        return findClosest(arr, mid, min);
    }

    private static int findClosest(int arr[], int mid, int min){
        int tmp=min;
        int lowIndex=0;
        int highIndex = 0;
        for(int i=0, j=arr.length-1 ; i<arr.length && j>=0;i++, j--){
            if(arr[i]==mid){
                lowIndex =  i;
                break;
            } else if(arr[i]<mid && arr[i]>tmp){
                tmp = arr[i];
                lowIndex=i;
            }

            if(arr[j]==mid){
                highIndex = j;
            } else if(arr[j]>mid && arr[j]<tmp){
                tmp = arr[j];
                highIndex=j;
            }
        }
        if((mid - arr[lowIndex])>(arr[highIndex]-mid))
            return highIndex;
        else
            return lowIndex;
    }

}
