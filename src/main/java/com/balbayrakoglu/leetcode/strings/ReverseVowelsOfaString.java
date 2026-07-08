package com.balbayrakoglu.leetcode.strings;

public class ReverseVowelsOfaString {
    /*
     Problem: Reverse Vowels of a String
     Given a string `s`, reverse only the vowels of the string and return it.

     Example:
     Input: s = "hello"
     Output: "holle"

     Yaklasim (Pattern: Two Pointers - iki uctan):
     - left ve right sesli harf bulana kadar iceri ilerler; ikisi de sesli bulunca swap yapilir.
     - Sessiz harfler yerinde kalir, sadece sesliler ayna gorevi gorur.
     - Dosyanin altinda alternatif stack cozumu de yorum olarak mevcut (iki gecisli).

     Karmasiklik: Zaman O(n) | Alan O(n) (char dizisi kopyasi)
     LeetCode: #345 Reverse Vowels of a String (Easy) - https://leetcode.com/problems/reverse-vowels-of-a-string/
    */

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
