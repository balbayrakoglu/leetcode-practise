package com.balbayrakoglu.leetcode.arrays;

public class BinarySearch {
    /*
     Problem: Binary Search
     Given a sorted (ascending) integer array `arr` and a `target` value, return the index of `target` if it exists in the array, otherwise return -1.

     Example:
     Input: arr = [-1,0,3,5,9,12], target = 9
     Output: 4

     Yaklasim (Pattern: Binary Search):
     - Sirali dizide arama uzayini her adimda yariya indir: mid'e bak, target kucukse sola, buyukse saga daral.
     - Dikkat: mid = left + (right - left) / 2 yazimi (left + right) / 2'nin int tasmasini onler.
     - Dongu kosulu left <= right; esitlik kacarsa tek elemanli aralik kontrol edilmez.

     Karmasiklik: Zaman O(log n) | Alan O(1)
     LeetCode: #704 Binary Search (Easy) - https://leetcode.com/problems/binary-search/
    */

    public int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        do {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1 ;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }
        } while (left <= right);
        return -1;
    }
}
