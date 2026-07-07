package com.balbayrakoglu.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    public static void fizzBuzz() {
        Map<Integer, String> rules = new HashMap<>();
        rules.put(3, "Fizz");
        rules.put(5, "Buzz");

        for (int i = 1; i <= 100; i++) {
            StringBuilder result = new StringBuilder();

            for (Map.Entry<Integer, String> rule : rules.entrySet()) {
                if (i % rule.getKey() == 0) {
                    result.append(rule.getValue());
                }
            }
            System.out.println(result.isEmpty() ? String.valueOf(i) : result.toString());
        }
    }

    public static void main(String[] args) {
        var sum = 0;
        var result = 0;
        String input = "hello";
        for (int i = 0; i < input.length() - 1; i++) {
            System.out.println((int) input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            sum += 1;
            for (int j = 0; j < input.length() - 1; j++) {
                sum += 1;
                System.out.println(sum);
            }
        }

        for (int i = 0; i < input.length() - 1; i++) {
            result += 1;

            for (int j = i; j < input.length(); j++) {
                result += 1;
                System.out.println(result);
            }
        }

    }
}
