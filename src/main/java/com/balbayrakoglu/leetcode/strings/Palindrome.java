package com.balbayrakoglu.leetcode.strings;

import java.util.Locale;

public class Palindrome {

    /*
     Problem: Valid Palindrome
     Given a string `s`, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

     Example:
     Input: "A man, a plan, a canal: Panama"
     Output: true
    */

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        String cleaned = s.toLowerCase(Locale.ROOT);
        cleaned = cleaned.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
