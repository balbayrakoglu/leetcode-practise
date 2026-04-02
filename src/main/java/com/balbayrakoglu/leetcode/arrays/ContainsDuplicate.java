package com.balbayrakoglu.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
     Problem: Contains Duplicate
     Given an integer array `nums`, return true if any value appears at least twice in the array, and false if every element is distinct.

     Example:
     Input: nums = [1,2,3,1]
     Output: true
    */

    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
