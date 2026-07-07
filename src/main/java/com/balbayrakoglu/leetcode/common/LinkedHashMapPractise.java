package com.balbayrakoglu.leetcode.common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class LinkedHashMapPractise {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);

        System.out.println(hashMap);
        System.out.println(linkedHashMap);

        Map<String, Integer> map = new LinkedHashMap<>();

        map.compute("A", (key, existingValue) -> {
            if (existingValue == null) {
                return 1;
            }
            return existingValue + 1;
        });

        map.compute("A", (key, existingValue) -> {
            return 1;
        });

        map.compute("B", (key, existingValue) -> {
            if (existingValue == null) {
                return 1;
            }
            return existingValue + 1;
        });

        map.compute("A", (key, existingValue) -> {
            if (existingValue == null) {
                return 1;
            }
            return existingValue + 1;
        });
        map.compute("A", (key, oldValue) -> oldValue + 10);

        System.out.println(map);

        LruCache<Integer, String> cache = new LruCache<>(4);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.put(4, "D");
        System.out.println(cache);

        cache.put(5, "E");

        System.out.println(cache);
    }

}

class LruCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LruCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LruCache<?, ?> lruCache)) return false;
        if (!super.equals(o)) return false;
        return capacity == lruCache.capacity;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
