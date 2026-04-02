package com.balbayrakoglu.leetcode.arrays;

public class BestTimeToBuyStock {

    /*
     Problem: Best Time to Buy and Sell Stock
     Verilen bir tamsayı dizisi `prices`, her indeks bir günün fiyatını temsil eder.
     Bir kere alım ve bir kere satım yaparak elde edilebilecek maksimum karı hesaplayın.
     Eğer kar elde edilemiyorsa 0 döndürün.

     Örnek:
     Input: prices = [7,1,5,3,6,4]
     Output: 5  (1 satın alma, 6 satış => kar 5)
    */

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
