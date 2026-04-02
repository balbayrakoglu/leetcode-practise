package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @Test
    void missingNumberTest() {
        int[] arr = new int[]{1, 2, 3, 5, 6, 7};

        assertEquals(4, new MissingNumber().missingNumber(arr));
        assertEquals(4,  new MissingNumber().missingNumber2(arr));
    }

}