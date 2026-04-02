package com.balbayrakoglu.leetcode.arrays;

public class CanPlaceFlowers {
    /*
     Problem: Can Place Flowers
     Given a flowerbed (represented as an integer array containing 0 and 1), and a number n,
     return true if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

     Example:
     Input: flowerbed = [1,0,0,0,1], n = 1
     Output: true
    */

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }

        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == length - 1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    n--;

                    if (n == 0) {
                        return true;
                    }
                }
            }
        }
        return n <= 0;
    }
}
