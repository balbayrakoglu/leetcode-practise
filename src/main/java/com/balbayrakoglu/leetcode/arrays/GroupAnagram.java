package com.balbayrakoglu.leetcode.arrays;

import java.util.*;

public class GroupAnagram {
    /*
     Problem: Group Anagrams
     Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

     Example:
     Input: strs = ["eat","tea","tan","ate","nat","bat"]
     Output: [["eat","tea","ate"],["tan","nat"],["bat"]]

     Yaklasim (Pattern: Hash Map + kanonik anahtar):
     - Her kelimenin harflerini siralayarak "kanonik form" uret (ornegin eat -> aet).
     - Ayni kanonik forma sahip kelimeler anagramdir; map'te ayni anahtarin listesine eklenir.
     - Iyilestirme: siralama yerine 26'lik harf sayaci anahtar yapilirsa O(n*k) olur.

     Karmasiklik: Zaman O(n * k log k) (k: en uzun kelime) | Alan O(n * k)
     LeetCode: #49 Group Anagrams (Medium) - https://leetcode.com/problems/group-anagrams/
    */

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> sortedMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            sortedMap.computeIfAbsent(key, k -> new ArrayList<>());
            sortedMap.get(key).add(str);
        }


        return new ArrayList<>(sortedMap.values());
    }
}
