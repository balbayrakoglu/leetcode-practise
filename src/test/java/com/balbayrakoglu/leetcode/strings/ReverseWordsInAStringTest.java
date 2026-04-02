package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInAStringTest {

    @Test
    void reverseWord() {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        assertEquals("blue is sky the", reverseWordsInAString.reverseWord("the sky is blue"));
        assertEquals("world hello", reverseWordsInAString.reverseWord("  hello world  "));
    }
}