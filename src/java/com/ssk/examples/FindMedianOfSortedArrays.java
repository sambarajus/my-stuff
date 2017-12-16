package com.ssk.examples;

/**
 * Created by 212561830 on 11/11/17.
 */
public class FindMedianOfSortedArrays {

    public static void main(String args[]) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > 0 && nums2.length > 0) {
            int result[] = mergeArrays(nums1, nums2);
            return calculateMean(result);
        } else if (nums2.length > 0) {
            return calculateMean(nums2);
        } else {
            return calculateMean(nums1);
        }
    }

    int[] mergeArrays(int nums1[], int nums2[]) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        if (nums1.length > 0 && nums2.length > 0) {
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    result[k++] = nums1[i];
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    result[k++] = nums2[j];
                    j++;
                } else {
                    result[k++] = nums1[i];
                    i++;
                    result[k++] = nums2[j];
                    j++;
                }
            }
            while (i < nums1.length) {
                result[k++] = nums1[i];
                i++;
            }
            while (j < nums2.length) {
                result[k++] = nums2[j];
                j++;
            }
            return result;
        } else if (nums1.length > 0) {
            return nums1;
        } else {
            return nums2;
        }

    }

    double calculateMean(int[] result) {
        if (result.length == 2) {
            return (double) (result[0] + result[1]) / 2;
        }
        if (result.length % 2 == 0) {
            int middleIndex = result.length / 2;
            return (double) (result[middleIndex - 1] + result[middleIndex]) / 2;
        } else {
            return (double) result[result.length / 2];
        }
    }

}
