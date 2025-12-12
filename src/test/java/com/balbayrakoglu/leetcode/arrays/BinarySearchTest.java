package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search_shouldReturnValidNumber_whenGivenValidInput() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expectedIndex =4;
        int actualIndex = binarySearch.search(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }
}