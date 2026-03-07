package com.balbayrakoglu.leetcode.common;

import java.util.Arrays;
import java.util.List;

public class Flatmap {

    public static void main(String[] args) {
        String[][] arrayOfArrays = {{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Using flatMap to flatten the array of arrays into a single stream
        String result = java.util.Arrays.stream(arrayOfArrays)
                .flatMap(java.util.Arrays::stream) // Flatten the inner arrays
                .reduce("", (acc, str) -> acc + str); // Concatenate the strings

        System.out.println(result); // Output: "abcdef"

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        System.out.println("Map:");
        list.stream().map(l -> l.stream()).forEach(System.out::println);
        System.out.println("Flatmap:");
        list.stream().flatMap(l -> l.stream()).forEach(System.out::println);
    }
}
