package com.balbayrakoglu.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    /*
     Problem: Longest Substring Without Repeating Characters
     Given a string `s`, find the length of the longest substring without repeating characters.

     Example:
     Input: s = "abcabcbb"
     Output: 3  (the answer is "abc")

     Yaklasim (Pattern: Sliding Window + Hash Map):
     - [left, right] penceresi tekrarsiz karakterleri temsil eder; right her adimda ilerler.
     - Yeni karakter pencere icinde daha once gorulduyse left'i "son gorulen indeks + 1"e zipla.
     - Map her karakterin son indeksini tutar; boylece left geriye gitmez.

     Karmasiklik: Zaman O(n) | Alan O(min(n, alfabe))
     LeetCode: #3 Longest Substring Without Repeating Characters (Medium) - https://leetcode.com/problems/longest-substring-without-repeating-characters/
    */

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
                left = lastIndex.get(c) + 1;
            }

            lastIndex.put(c, right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
