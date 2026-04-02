package com.balbayrakoglu.leetcode.arrays;

public class IncreasingTripletSubsequence {
    /*
     Problem: Increasing Triplet Subsequence
     Given an integer array `nums`, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].

     Example:
     Input: nums = [1,2,3,4,5]
     Output: true
    */
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {

                return true;
            }
        }
        return false;
    }
}
