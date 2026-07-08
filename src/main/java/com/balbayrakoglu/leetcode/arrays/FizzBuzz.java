package com.balbayrakoglu.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    /*
     Problem: Fizz Buzz
     1'den 100'e kadar sayilari yazdir; 3'e bolunenlerde "Fizz", 5'e bolunenlerde "Buzz",
     ikisine de bolunenlerde "FizzBuzz" yazdir.

     Yaklasim (Kural map'i ile genisletilebilir tasarim):
     - Bolen -> kelime eslesmeleri bir Map'te tutulur; yeni kural (orn. 7 -> "Jazz") tek satirla eklenir.
     - Her sayi icin eslesen kelimeler StringBuilder'da birlestirilir; hicbiri eslesmezse sayinin kendisi yazilir.
     - Klasik if/else zincirine gore daha esnek bir cozumdur (Open/Closed prensibi).

     Karmasiklik: Zaman O(n * k) (k: kural sayisi) | Alan O(k)
     LeetCode: #412 Fizz Buzz (Easy) - https://leetcode.com/problems/fizz-buzz/
    */


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
