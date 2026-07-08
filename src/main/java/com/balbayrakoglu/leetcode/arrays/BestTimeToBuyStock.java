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

     Yaklasim (Pattern: Tek gecis / min takibi):
     - Su ana kadar gorulen en dusuk fiyati (minPricesSoFar) tut.
     - Her gun icin "bugun satarsam karim ne olur?" = price - minPricesSoFar hesapla, max'i guncelle.
     - Neden calisir: en iyi satis gunu icin en iyi alis gunu, ondan onceki minimum fiyattir.

     Karmasiklik: Zaman O(n) | Alan O(1)
     LeetCode: #121 Best Time to Buy and Sell Stock (Easy) - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
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
