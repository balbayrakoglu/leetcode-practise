package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(3, removeDuplicates.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 3}));
    }
}