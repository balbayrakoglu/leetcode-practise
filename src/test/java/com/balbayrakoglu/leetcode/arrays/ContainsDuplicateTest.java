package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void hasDuplicate_shouldReturnFalse_whenArrayHasNoDuplicate() {
        int[] nums =  {1,2,3,4};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        assertFalse(containsDuplicate.hasDuplicate(nums));
    }

    @Test
    void hasDuplicate_shouldReturnTrue_whenArrayHasDuplicate() {
        int[] nums =  {1,2,3,3};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        assertTrue(containsDuplicate.hasDuplicate(nums));
    }

}