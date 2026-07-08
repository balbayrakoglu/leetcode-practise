package com.balbayrakoglu.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    /*
     Problem: Merge Intervals
     Verilen araliklar dizisinde cakisan araliklari birlestir ve sonucu dondur.

     Ornek:
     Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     Output: [[1,6],[8,10],[15,18]]

     Yaklasim (Pattern: Siralama + tek gecis birlestirme):
     - Araliklari baslangic degerine gore sirala.
     - current araligin bitisi >= sonrakinin baslangici ise cakisiyorlar -> bitisleri max ile birlestir.
     - Cakismiyorsa sonraki aralik yeni current olur ve listeye eklenir.
     - Not: bu dosyadaki metot birlesmis araliklarin sadece bitis degerlerini int[] olarak dondurur.

     Karmasiklik: Zaman O(n log n) | Alan O(n)
     LeetCode: #56 Merge Intervals (Medium) - https://leetcode.com/problems/merge-intervals/
    */


    public static int[] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                merged.add(next);
                current = next;
            }
        }

        return merged.stream().flatMapToInt(Arrays::stream).toArray();
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}};
        int[] result = merge(intervals);
        System.out.println(Arrays.toString(result));
    }
}
