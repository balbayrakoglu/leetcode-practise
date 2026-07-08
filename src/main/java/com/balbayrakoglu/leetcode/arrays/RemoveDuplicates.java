package com.balbayrakoglu.leetcode.arrays;

public class RemoveDuplicates {
    /*
     Problem: Remove Duplicates from Sorted Array
     Given a sorted array `nums`, remove the duplicates in-place such that each element appears only once and return the new length.

     Example:
     Input: nums = [1,1,2]
     Output: 2 (nums becomes [1,2])

     Yaklasim (Pattern: Two Pointers - slow/fast):
     - slow: tekrarsiz bolgenin son indeksi; fast: diziyi tarayan isaretci.
     - nums[fast] != nums[slow] ise yeni benzersiz eleman bulundu -> slow ilerlet ve degeri kopyala.
     - Dizi sirali oldugu icin tekrarlar her zaman yan yanadir; bu yuzden tek karsilastirma yeter.

     Karmasiklik: Zaman O(n) | Alan O(1) (in-place)
     LeetCode: #26 Remove Duplicates from Sorted Array (Easy) - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if( nums[fast] != nums[slow]) {
                slow = slow +1;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
