package com.balbayrakoglu.leetcode.strings;

public class LongestCommonPrefix {
    /*
     Problem: Longest Common Prefix
     Write a function to find the longest common prefix string amongst an array of strings.
     If there is no common prefix, return an empty string "".

     Example:
     Input: strs = ["flower","flow","flight"]
     Output: "fl"

     Yaklasim (Iki cozum iceriyor):
     - longestCommonPrefix: yatay tarama - prefix'i ilk kelime kabul et, uymayan her kelimede sondan kirp.
     - LongestCommonPrefixIndex: dikey tarama - karakter karakter ilerle, ilk uyusmazlikta o ana kadarki on-eki dondur.
     - Dikey tarama, kisa bir kelime erken uyusmazlik verdiginde daha az is yapar.

     Karmasiklik: Zaman O(S) (S: tum karakterlerin toplami) | Alan O(1)
     LeetCode: #14 Longest Common Prefix (Easy) - https://leetcode.com/problems/longest-common-prefix/
    */

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            String current = strs[i];

            while (!current.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }

        }

        return prefix;
    }


    public String LongestCommonPrefixIndex(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];
        for (int charIndex = 0; charIndex < first.length(); charIndex++) {
            char c = first.charAt(charIndex);

            for (int stringIndex = 1; stringIndex < strs.length; stringIndex++) {
                String current = strs[stringIndex];
                if (charIndex >= current.length() || current.charAt(charIndex) != c) {

                    return first.substring(0, charIndex);
                }
            }

        }
        return first;
    }
}
