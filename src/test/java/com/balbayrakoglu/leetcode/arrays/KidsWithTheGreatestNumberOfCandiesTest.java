package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    void kidsWithCandies() {
        KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();
        int[] list1 = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expectedList = List.of(true, true, true, false, true);
        assertEquals(expectedList, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(list1, extraCandies));
    }
}