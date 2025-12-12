package com.balbayrakoglu.leetcode.strings;

import java.util.Locale;
import java.util.Stack;

public class ReverseVowelsOfaString {

    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    /*
   public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        // 1. First pass: collect all vowels into the stack
        for (char c : chars) {
            if (isVowel(c)) {
                stack.push(c);
            }
        }

        // 2. Second pass: replace vowels with vowels popped from stack (reversed order)
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = stack.pop();
            }
        }

        return new String(chars);
    }
      */
}
