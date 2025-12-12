package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfaStringTest {

    @Test
    void reverseVowels() {
        ReverseVowelsOfaString reverseVowelsOfaString = new ReverseVowelsOfaString();
        assertEquals("BARUK", reverseVowelsOfaString.reverseVowels("BURAK"));

    }
}