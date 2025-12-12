package com.balbayrakoglu.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Input array must contain at least two elements");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;  i< nums.length; i++){
            int current = nums[i];
            int complement = target - current;
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(current, i);
        }
        throw new IllegalStateException("No two sum solution found for the given input");
    }
}
