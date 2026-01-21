package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveArrayTest {

    @Test
    void longestConsecutive_returnValidNumber_whenInputIsCorrect() {
        LongestConsecutiveArray solution = new LongestConsecutiveArray();

        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(9, solution.longestConsecutive(new int[]{0, -1, 1, 2, -2, 3, 4, 5, 6}));
        assertEquals(0, solution.longestConsecutive(new int[]{}));
        assertEquals(1, solution.longestConsecutive(new int[]{10}));
        assertEquals(3, solution.longestConsecutive(new int[]{1, 2, 0, 1}));
    }
}