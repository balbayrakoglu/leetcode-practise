package com.balbayrakoglu.leetcode.arrays;

public class ProductOfArrayExceptSelf {
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
