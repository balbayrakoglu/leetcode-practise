package com.balbayrakoglu.leetcode.arrays;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        Map<Character, Integer> charToLastIndex = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charToLastIndex.containsKey(currentChar)) {
                int lastIndex = charToLastIndex.get(currentChar);
                if (lastIndex >= left) {
                    left = lastIndex + 1;
                }
            }

            charToLastIndex.put(currentChar, right);

            int currentWindowLength = right - left + 1;
            if (currentWindowLength > maxLength) {
                maxLength = currentWindowLength;
            }
        }
        return maxLength;
    }
}
