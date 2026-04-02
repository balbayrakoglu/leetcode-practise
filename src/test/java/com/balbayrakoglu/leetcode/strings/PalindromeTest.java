package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @Test
    void isPalindrome() {
        String input = "Was it a car or a cat I saw?";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    void isPalindromeNotPalindrome() {
        String input = "tab a cat";
        assertFalse(palindrome.isPalindrome(input));
    }
}

