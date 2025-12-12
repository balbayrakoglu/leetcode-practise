package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyStockTest {

    @Test
    void maxProfit_shouldReturnMaxProfit_whenGivenValidInput() {
        BestTimeToBuyStock bestTimeToBuyStock = new BestTimeToBuyStock();
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = 5;
        int expectedMaxProfit = bestTimeToBuyStock.maxProfit(prices);
        assertEquals(maxProfit,expectedMaxProfit);

    }

    @Test
    void maxProfit_shouldReturnZero_whenPricesAlwaysDecrease() {
        BestTimeToBuyStock solver = new BestTimeToBuyStock();
        int[] prices = {7, 6, 4, 3, 1};
        int result = solver.maxProfit(prices);
        assertEquals(0, result);
    }

    @Test
    void maxProfit_shouldReturnZero_whenArrayHasSingleElement() {
        BestTimeToBuyStock solver = new BestTimeToBuyStock();
        int[] prices = {5};
        int result = solver.maxProfit(prices);
        assertEquals(0, result);
    }
}