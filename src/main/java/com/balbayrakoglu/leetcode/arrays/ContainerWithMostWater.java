package com.balbayrakoglu.leetcode.arrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 2, 5, 4, 7, 3, 6};
        int left = 0;
        int right = arr.length - 1;
        int area = 0;

        while (left < right) {
            int sum = (right - left) * Math.min(arr[left], arr[right]);
            System.out.println(sum);
            area = Math.max(area, sum);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(area);
    }
}
