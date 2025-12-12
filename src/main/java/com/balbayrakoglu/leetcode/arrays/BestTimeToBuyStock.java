package com.balbayrakoglu.leetcode.arrays;

public class BestTimeToBuyStock {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0){
            return 0;
        }
        int minPricesSoFar = prices[0];
        int maxProfit = 0;

        for(int currentPrices : prices) {
            if (currentPrices < minPricesSoFar) {
               minPricesSoFar = currentPrices;
            }else {
                int potentialProfit = currentPrices - minPricesSoFar;
                if (potentialProfit > maxProfit) {
                    maxProfit = potentialProfit;
                }
            }
        }
        return maxProfit;
    }
}
