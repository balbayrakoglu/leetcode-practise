package com.balbayrakoglu.leetcode.arrays;

public class MaximumAverageSubarraySlidingWindow {
    /*
     Problem: Maximum Average Subarray I
     Given an array `nums` and an integer `k`, find a contiguous subarray of length k that has the maximum average value and return that value.

     Example:
     Input: nums = [1,12,-5,-6,50,3], k = 4
     Output: 12.75
    */

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < n; i++) {

            sum = sum - nums[i -k];
            sum = sum + nums[i ];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}
