package com.balbayrakoglu.leetcode.strings;

public class MergeStringsAlternately {
    /*
     Problem: Merge Strings Alternately
     Given two strings word1 and word2, merge them by adding letters in alternating order, starting with word1.
     If one string is longer, append the remaining letters to the end.

     Example:
     Input: word1 = "abc", word2 = "pqr"
     Output: "apbqcr"
    */
    public String mergeAlternately(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return "";
        }
        if (word2.isEmpty()) {
            return word1;
        }
        if (word1.isEmpty()) {
            return word2;
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                result.append(word2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}
