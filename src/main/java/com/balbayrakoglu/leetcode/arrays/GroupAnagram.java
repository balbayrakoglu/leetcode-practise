package com.balbayrakoglu.leetcode.arrays;

import java.util.*;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }

        Map<String, List<String>> sortedMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!sortedMap.containsKey(key)) {
               sortedMap.put(key,new ArrayList<>());
            }
            sortedMap.get(key).add(str);
        }


        return new ArrayList<>(sortedMap.values());
    }
}
