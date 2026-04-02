package com.balbayrakoglu.leetcode.arrays;

import java.util.*;

public class GroupAnagram {
    /*
     Problem: Group Anagrams
     Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

     Example:
     Input: strs = ["eat","tea","tan","ate","nat","bat"]
     Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
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
