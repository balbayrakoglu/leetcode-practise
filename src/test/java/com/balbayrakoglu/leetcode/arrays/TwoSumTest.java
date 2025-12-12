package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum_shouldReturnValidValue_whenGivingAValidArray() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0,1}, result);
    }
}