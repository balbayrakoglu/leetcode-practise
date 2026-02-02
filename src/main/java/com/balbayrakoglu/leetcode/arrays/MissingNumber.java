package com.balbayrakoglu.leetcode.arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int index = 0;

        for (int i = 0; i <= n; i++) {
            index ^= i;
        }

        for (int num : nums) {
            index ^= num;
        }


        return index;
    }
}
