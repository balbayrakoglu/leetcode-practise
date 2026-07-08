package com.balbayrakoglu.leetcode.arrays;

public class ProductOfArrayExceptSelf {
    /*
     Problem: Product of Array Except Self
     Given an integer array `nums`, return an array `answer` such that answer[i] is the product of all the elements of nums except nums[i].
     Solve it without using division and in O(n) time.

     Example:
     Input: nums = [1,2,3,4]
     Output: [24,12,8,6]

     Yaklasim (Pattern: Prefix / Suffix carpimlari):
     - 1. gecis (soldan): ans[i] = i'nin solundaki tum elemanlarin carpimi.
     - 2. gecis (sagdan): ans[i] *= i'nin sagindaki tum elemanlarin carpimi (right degiskeniyle tasinir).
     - Boylece bolme kullanmadan her indeks icin sol_carpim * sag_carpim elde edilir.

     Karmasiklik: Zaman O(n) | Alan O(1) (cikti dizisi haric)
     LeetCode: #238 Product of Array Except Self (Medium) - https://leetcode.com/problems/product-of-array-except-self/
    */
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0, left = 1; i < nums.length; ++i) {
            ans[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1, right = 1; i >= 0; --i) {
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }

}
