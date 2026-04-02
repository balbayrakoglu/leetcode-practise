package com.balbayrakoglu.leetcode.arrays;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    /*
     Problem: Median of Two Sorted Arrays
     Given two sorted arrays `nums1` and `nums2` of size m and n respectively, return the median of the two sorted arrays.

     Example:
     Input: nums1 = [1,3], nums2 = [2]
     Output: 2.0
    */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];

        for (int i = 0; i < n; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < m; i++) {
            merged[n + i] = nums2[i];
        }

        Arrays.sort(merged);

        int len = merged.length;

        if (len % 2 == 1) {
            return merged[len / 2];
        } else {
            return (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
        }
    }
}
