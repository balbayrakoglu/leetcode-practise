package com.balbayrakoglu.leetcode.arrays;

public class BinarySearch {

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
