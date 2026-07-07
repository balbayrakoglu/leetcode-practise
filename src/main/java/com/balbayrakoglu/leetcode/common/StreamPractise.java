package com.balbayrakoglu.leetcode.common;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractise {

    public static void main(String[] args) {
        //Given a list of integers, return a list containing only even numbers;
        List<Integer> practiseOne = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //List<Integer> practiseOne = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List evenNumbers = practiseOne.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(evenNumbers);

        //Find the maximum value in a list of integers
        List<Integer> practiseTwo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int maxValue = Integer.MIN_VALUE;
        for (Integer val : practiseTwo) {
            if (val > maxValue) {
                maxValue = val;
            }
        }

        Integer maxValueStream = practiseTwo.stream().max(Integer::compare).get();
        System.out.println(maxValueStream);

        //Calculate the sum of elements in a list of integers

        List<Integer> practiseThree = List.of(1, 2, 3, 4, 5);

        int sum = practiseThree.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

        //Convert all String in a list to Uppercase

        List<String> practiseFour = List.of("a", "b", "c", "d", "e", "f", "g", "h");

        List<String> upperCase = practiseFour.stream().map(String::toUpperCase).toList();

        System.out.println(upperCase);

        //Sort a List of integers in ascending order

        List<Integer> practiseFive = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(practiseFive.stream().sorted().toList());

        //Count the number of elements that are greater than 5

        List<Integer> practiseSix = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(practiseSix.stream().filter(e -> e > 5).count());


        Map<String, Integer> firstMap = new HashMap<>();


        List<String> strings = List.of("a", "b", "c", "d", "e", "a", "b", "c", "a", "b", "a");


        for (String s : strings) {
            firstMap.put(s, firstMap.getOrDefault(s, 0) + 1);
        }

        for (String s : strings) {
            firstMap.compute(s, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        //Second Highest Number in a list

        List<Integer> highestNumbers = Arrays.asList(1, 56, 239, 9, 0, 100, 234, 678);
        Integer highestNumber = highestNumbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(highestNumber);

        // Top K highest Numbers in the list.

        List<Integer> topKHighestNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> topKHighest = topKHighestNumbers.stream().sorted().skip(topKHighestNumbers.size() - 3).toList();
        List<Integer> topKHighestLimit = topKHighestNumbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();

        System.out.println(topKHighest);
        System.out.println(topKHighestLimit);

        //Max Number using reduce

        List<Integer> maxNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer maxNumberReduce = maxNumbers.stream().reduce(Integer::max).get();

        System.out.println(maxNumberReduce);

        //Find the duplicates in a list

        List<Integer> duplicatesList = List.of(0, 1, 2, 3, 4, 5, 1, 2, 3, 1);

        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = duplicatesList.stream()
                .filter(i -> Collections.frequency(duplicatesList, i) > 1)
                .collect(Collectors.toSet());
        duplicates.addAll(set);
        System.out.println(set);

    }
}
