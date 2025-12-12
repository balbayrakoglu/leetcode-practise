package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdOfStringsTest {

    @Test
    void gcdOfString() {
        GcdOfStrings gcdOfStrings = new GcdOfStrings();
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String expected = "AB";
        assertEquals(expected, gcdOfStrings.gcdOfString(str1,str2));

    }
}