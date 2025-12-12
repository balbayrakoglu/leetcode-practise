package com.balbayrakoglu.leetcode.strings;

public class MergeStringsAlternately {
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
