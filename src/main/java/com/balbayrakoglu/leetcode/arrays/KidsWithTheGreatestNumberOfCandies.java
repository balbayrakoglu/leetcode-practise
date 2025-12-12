package com.balbayrakoglu.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null || candies.length == 0) {
            return List.of();
        }

        List<Boolean> result = new ArrayList<>(candies.length);

        int maxInArr = candies[0];
        for (int j : candies) {
            if (j > maxInArr) {
                maxInArr = j;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= maxInArr) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
