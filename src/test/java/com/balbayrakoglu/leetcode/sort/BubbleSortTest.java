package com.balbayrakoglu.leetcode.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = 4;
        assertEquals(3, new BubbleSort().bubbleSort(arr, n));
    }
}