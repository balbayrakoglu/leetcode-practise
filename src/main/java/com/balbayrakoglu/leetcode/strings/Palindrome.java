package com.balbayrakoglu.leetcode.strings;

import java.util.Locale;

public class Palindrome {

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
