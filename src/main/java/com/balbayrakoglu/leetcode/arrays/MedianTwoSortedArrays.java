package com.balbayrakoglu.leetcode.arrays;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    /*
     Problem: Median of Two Sorted Arrays
     Given two sorted arrays `nums1` and `nums2` of size m and n respectively, return the median of the two sorted arrays.

     Example:
     Input: nums1 = [1,3], nums2 = [2]
     Output: 2.0

     Yaklasim (Bu dosyadaki cozum: birlestir + sirala):
     - Iki diziyi tek dizide birlestirip siraladiktan sonra ortadaki eleman(lar)dan medyani hesapla.
     - Not: Sorunun ideal cozumu binary search ile O(log(min(m,n)))'dir; buradaki cozum
       anlasilirligi one alan O((m+n) log(m+n)) versiyondur. Iki sirali diziyi merge ederek
       O(m+n)'e de indirilebilir.

     Karmasiklik: Zaman O((m+n) log(m+n)) | Alan O(m+n)
     LeetCode: #4 Median of Two Sorted Arrays (Hard) - https://leetcode.com/problems/median-of-two-sorted-arrays/
    */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];

        for (int i = 0; i < n; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < m; i++) {
            merged[n + i] = nums2[i];
        }

        Arrays.sort(merged);

        int len = merged.length;

        if (len % 2 == 1) {
            return merged[len / 2];
        } else {
            return (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
        }
    }
}
