package com.balbayrakoglu.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveArray {
    /*
     Problem: Longest Consecutive Sequence
     Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.
     The algorithm should run in O(n) time.

     Example:
     Input: nums = [100,4,200,1,3,2]
     Output: 4  (sequence: [1,2,3,4])
    */
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
