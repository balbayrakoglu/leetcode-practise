package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletSubsequenceTest {


    @Test
    void returnsTrueForIncreasingTriplet() {
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] input = {1, 2, 3, 4, 5};
        assertTrue(increasingTripletSubsequence.increasingTriplet(input));
    }

    @Test
    void returnsFalseForDecreasingSequence() {
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] input = {5, 4, 3, 2, 1};
        assertFalse(increasingTripletSubsequence.increasingTriplet(input));
    }

    @Test
    void returnsFalseForEmptyArray() {
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] input = {};
        assertFalse(increasingTripletSubsequence.increasingTriplet(input));
    }

    @Test
    void returnsFalseForArrayWithLessThanThreeElements() {
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] input = {1, 2};
        assertFalse(increasingTripletSubsequence.increasingTriplet(input));
    }

    @Test
    void returnsTrueForNonConsecutiveIncreasingTriplet() {
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] input = {2, 1, 5, 0, 4, 6};
        assertTrue(increasingTripletSubsequence.increasingTriplet(input));
    }

    @Test
    void returnsFalseForArrayWithDuplicatesOnly() {
        IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
        int[] input = {1, 1, 1, 1};
        assertFalse(increasingTripletSubsequence.increasingTriplet(input));
    }
}