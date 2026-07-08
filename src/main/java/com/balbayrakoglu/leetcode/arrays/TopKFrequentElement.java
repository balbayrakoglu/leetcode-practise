package com.balbayrakoglu.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {
    /*
     Problem: Top K Frequent Elements
     Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

     Example:
     Input: nums = [1,1,1,2,2,3], k = 2
     Output: [1,2]

     Yaklasim (Bu dosyadaki cozum: frekans map'i + siralama):
     - Once her sayinin frekansini map'te say, sonra girisleri frekansa gore azalan sirala ve ilk k'yi al.
     - Alternatifler: min-heap ile O(n log k), bucket sort ile O(n) (frekanslar 1..n araliginda oldugu icin).

     Karmasiklik: Zaman O(n log n) | Alan O(n)
     LeetCode: #347 Top K Frequent Elements (Medium) - https://leetcode.com/problems/top-k-frequent-elements/
    */

    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freqMap.entrySet());

        entries.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}
