package com.balbayrakoglu.leetcode.arrays;

public class IncreasingTripletSubsequence {
    /*
     Problem: Increasing Triplet Subsequence
     Given an integer array `nums`, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].

     Example:
     Input: nums = [1,2,3,4,5]
     Output: true

     Yaklasim (Pattern: Greedy - iki aday takibi):
     - first: simdiye kadarki en kucuk deger; second: first'ten buyuk en kucuk ikinci deger.
     - second'dan da buyuk bir sayi gorulurse artan uclu vardir -> true.
     - Puf nokta: first sonradan guncellense bile second'in gecerliligi bozulmaz,
       cunku second atandigi anda ondan kucuk bir first zaten mevcuttu.

     Karmasiklik: Zaman O(n) | Alan O(1)
     LeetCode: #334 Increasing Triplet Subsequence (Medium) - https://leetcode.com/problems/increasing-triplet-subsequence/
    */
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {

                return true;
            }
        }
        return false;
    }
}
