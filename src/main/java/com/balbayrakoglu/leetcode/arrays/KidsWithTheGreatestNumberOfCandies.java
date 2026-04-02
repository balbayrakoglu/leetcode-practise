package com.balbayrakoglu.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    /*
     Problem: Kids With the Greatest Number of Candies
     Given the array `candies` and the integer `extraCandies`, return a boolean list where each element indicates
     if the corresponding kid can have the greatest number of candies among all kids after receiving `extraCandies`.

     Example:
     Input: candies = [2,3,5,1,3], extraCandies = 3
     Output: [true,true,true,false,true]
    */
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
