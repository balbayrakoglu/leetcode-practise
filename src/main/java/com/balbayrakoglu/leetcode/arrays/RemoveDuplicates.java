package com.balbayrakoglu.leetcode.arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if( nums[fast] != nums[slow]) {
                slow = slow +1;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
