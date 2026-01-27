package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TopKFrequentElementTest {

    private final TopKFrequentElement topKFrequentElement = new TopKFrequentElement();

    @Test
    void topKFrequent_shouldReturnTwoOutput_whenGivenTwoFrequentInArray() {
        int[] input = {1, 2, 2, 3, 3, 3};
        int askedFrequent = 2;
        int[] expectedResult = {2, 3};
        assertEquals(expectedResult, topKFrequentElement.topKFrequent(input, askedFrequent));
    }
}