package com.balbayrakoglu.leetcode.strings;

public class ReverseWordsInAString {
    public String reverseWord(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String[] parts = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {

            stringBuilder.append(parts[i]);
            if (i > 0) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }

    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        int n = s.length();
        StringBuilder result = new StringBuilder();
        int i = n - 1;

        while (i >= 0) {
            // 1. Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break; // no more words
            }

            // 2. Mark end of the word
            int end = i;

            // 3. Move left until start of word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            int start = i + 1; // word is [start, end]

            // 4. Append space if this is not the first word in result
            if (!result.isEmpty()) {
                result.append(' ');
            }

            // 5. Append the word itself
            result.append(s, start, end + 1);
        }

        return result.toString();
    }
}
