package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void canPlaceFlowers_shouldReturnTrue_whenGivenValidInput() {
        CanPlaceFlowers solver = new CanPlaceFlowers();

        assertTrue(solver.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        assertFalse(solver.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        assertTrue(solver.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 3));
        assertTrue(solver.canPlaceFlowers(new int[]{0}, 1));
        assertFalse(solver.canPlaceFlowers(new int[]{1}, 1));
    }
}