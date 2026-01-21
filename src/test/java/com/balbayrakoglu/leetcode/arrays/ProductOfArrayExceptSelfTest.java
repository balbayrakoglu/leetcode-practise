package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] input = new int[]{1,2,3,4};
        int[] expected = new int[]{24,12,8,6};
        assertArrayEquals(expected,productOfArrayExceptSelf.productExceptSelf(input));
    }
}