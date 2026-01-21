package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram_shouldReturnTrue_whenInputAreAnagram() {
        String first = "racecar";
        String second = "carrace";
        ValidAnagram validAnagram = new ValidAnagram();

        assertTrue(validAnagram.isAnagram(first,second));
    }

    @Test
    void isAnagram_shouldReturnFalse_whenInputAreNotAnagram() {
        String first = "racecar";
        String second = "catrace";
        ValidAnagram validAnagram = new ValidAnagram();

        assertFalse(validAnagram.isAnagram(first,second));
    }
}