package com.balbayrakoglu.leetcode.arrays;

import java.util.Arrays;

public class ValidAnagram {
    /*
     Problem: Valid Anagram
     Given two strings `s` and `t`, return true if `t` is an anagram of `s`, and false otherwise.

     Example:
     Input: s = "anagram", t = "nagaram"
     Output: true

     Yaklasim (Bu dosyadaki cozum: sirala ve karsilastir):
     - Iki string'in char dizilerini siralayip eleman eleman karsilastir; uzunluklar farkliysa direkt false.
     - Alternatif: 26 elemanli sayac dizisi (s'de arttir, t'de azalt) ile O(n) / O(1).

     Karmasiklik: Zaman O(n log n) | Alan O(n)
     LeetCode: #242 Valid Anagram (Easy) - https://leetcode.com/problems/valid-anagram/
    */

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);

        for (int i = 0; i < firstString.length; i++) {
            if (firstString[i] != secondString[i]) {
                return false;
            }
        }

        return true;
    }
}
