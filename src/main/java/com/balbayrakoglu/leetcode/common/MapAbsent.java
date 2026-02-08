package com.balbayrakoglu.leetcode.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAbsent {


    public static void main(String[] args) {
        // Example demonstrating putIfAbsent() method
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("key1", 1);
        map1.putIfAbsent("key2", 2); // key2 does not exist, so it will be added
        map1.putIfAbsent("key1", 3); // key1 already exists, so it will not be updated
        System.out.println("Using putIfAbsent(): " + map1); // Output: {key1=1, key2=2}

        // Example demonstrating computeIfAbsent() method
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("key1", 1);
        map2.computeIfAbsent("key2", k -> 2); // key2 does not exist, so the value is computed as 2
        map2.computeIfAbsent("key1", k -> 3); // key1 already exists, so the value is not recomputed
        System.out.println("Using computeIfAbsent(): " + map2); // Output: {key1=1, key2=2}


        Map<String, List<String>> map3 = new HashMap<>();
        String key = "fruits";
        map3.computeIfAbsent(key, k -> new ArrayList<>()).add("apple");
        map3.computeIfAbsent(key, k -> new ArrayList<>()).add("banana");
        System.out.println("Using computeIfAbsent() with List: " + map3); // Output: {fruits=[apple, banana]}


        Map<String, String> putIfMap = new HashMap<>(); // Basit değer atamak için

        putIfMap.putIfAbsent("lang", "Java");
        putIfMap.putIfAbsent("lang", "Python");

        System.out.println(putIfMap.get("lang")); // Java

        Map<String, List<String>> computeMap = new HashMap<>(); // Collection doldurmak için

        computeMap.computeIfAbsent("a", k -> new ArrayList<>()).add("one"); // "a" yoksa yeni ArrayList oluştur ve "one" ekle
        computeMap.computeIfAbsent("a", k -> new ArrayList<>()).add("two"); // "a" zaten var, bu yüzden mevcut listeye "two" ekle

        System.out.println(computeMap.get("a"));

        Map<String, Integer> counter = new HashMap<>();
        counter.put("apple", 2); // Başlangıç değeri

        counter.computeIfPresent("apple", (k, v) -> v + 1); // apple için değeri 1 artır
        counter.computeIfPresent("banana", (k, v) -> v + 1); // banana yok, bu yüzden hiçbir şey yapma

        System.out.println(counter); // {apple=3}

    }
}
