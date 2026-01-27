package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.text.Normalizer.normalize;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    private final GroupAnagram groupAnagrams = new GroupAnagram();


    @Test
    void groupAnagrams_shouldReturnArrayWithStrings_whenFullOfStringArrayGiven() {

        String[] input = {"act", "pots", "tops", "cat", "stop", "hat"};

        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        List<List<String>> normalized = normalize(result);

        List<List<String>> expected = normalize(Arrays.asList(
                Arrays.asList("hat"),
                Arrays.asList("act", "cat"),
                Arrays.asList("stop", "pots", "tops")
        ));

        assertEquals(expected, normalized);
    }

    private List<List<String>> normalize(List<List<String>> groups) {
        List<List<String>> copy = new ArrayList<>();

        for (List<String> group : groups) {
            List<String> inner = new ArrayList<>(group);
            inner.sort(String::compareTo);
            copy.add(inner);
        }

        copy.sort((a, b) -> {
            if (a.isEmpty() && b.isEmpty()) return 0;
            if (a.isEmpty()) return -1;
            if (b.isEmpty()) return 1;
            return a.get(0).compareTo(b.get(0));
        });

        return copy;
    }
}