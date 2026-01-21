package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarraySlidingWindowTest {

    @Test
    void findMaxAverage_returnValidResult_whenGivenValidInput() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75;
        double actual = MaximumAverageSubarraySlidingWindow.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }
}