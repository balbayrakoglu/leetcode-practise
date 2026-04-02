package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        String[] testInput = new String[]{"flower", "flow", "flight"};
        String expected = "fl";
        assertEquals(expected, longestCommonPrefix.longestCommonPrefix(testInput));

    }
}