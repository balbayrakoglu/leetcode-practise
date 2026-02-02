package com.balbayrakoglu.leetcode.strings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        System.out.println(prefix);
        for (int i = 0; i < strs.length; i++) {
            String current = strs[i];
            System.out.println("current " + current + " " + i);
            while (!current.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
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
