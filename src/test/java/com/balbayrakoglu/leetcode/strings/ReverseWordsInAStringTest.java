package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {

    @Test
    void reverseWord() {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        assertEquals("blue is sky the", reverseWordsInAString.reverseWord("the sky is blue"));
        assertEquals("world hello", reverseWordsInAString.reverseWord("  hello world  "));
    }
}