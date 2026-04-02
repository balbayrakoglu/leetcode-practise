package com.balbayrakoglu.leetcode.arrays;

public class ProductOfArrayExceptSelf {
    /*
     Problem: Product of Array Except Self
     Given an integer array `nums`, return an array `answer` such that answer[i] is the product of all the elements of nums except nums[i].
     Solve it without using division and in O(n) time.

     Example:
     Input: nums = [1,2,3,4]
     Output: [24,12,8,6]
    */
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0, left = 1; i < nums.length; ++i) {
            ans[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1, right = 1; i >= 0; --i) {
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }

}
