package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    void mergeAlternately_shouldReturnMergedString_whenGivenValidInput() {
    MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
    String word1 = "abc";
    String word2 = "pqr";
    String expected = "apbqcr";
    String actual = mergeStringsAlternately.mergeAlternately(word1, word2);
    assertEquals(expected, actual);
    }
}