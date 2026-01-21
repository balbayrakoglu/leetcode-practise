package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, ls.lengthOfLongestSubstring("thisisalongx"));

    }
}