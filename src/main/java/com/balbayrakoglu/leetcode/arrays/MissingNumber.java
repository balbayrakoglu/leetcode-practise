package com.balbayrakoglu.leetcode.arrays;

public class MissingNumber {
    /*
     Problem: Missing Number
     Given an array `nums` containing n distinct numbers taken from 0, 1, 2, ..., n,
     return the only number in the range that is missing from the array.

     Example:
     Input: nums = [3,0,1]
     Output: 2
    */

    public int missingNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        long n = nums.length +1;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        long expSum = n * (n + 1) / 2;
        return (int)(expSum - sum);
    }

    public int missingNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length +1 ;

        for(int i = 1; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return i;
            }

        }
        return -1;
    }
}
