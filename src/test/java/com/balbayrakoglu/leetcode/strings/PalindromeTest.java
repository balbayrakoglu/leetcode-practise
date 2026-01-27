package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

