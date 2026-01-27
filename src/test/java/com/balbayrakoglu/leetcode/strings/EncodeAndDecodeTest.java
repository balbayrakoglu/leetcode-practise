package com.balbayrakoglu.leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeTest {

    private final EncodeAndDecode encodeAndDecode = new EncodeAndDecode();


    @Test
    void encode_shouldHandleEmptyList() {
        List<String> testInput = new ArrayList<>();
        String expected = "";
        assertEquals(expected, encodeAndDecode.encode(testInput));
    }

    @Test
    void encode_shouldHandleSingleEmptyString() {
        List<String> testInput = Collections.singletonList("");
        String expected = "0#";
        assertEquals(expected, encodeAndDecode.encode(testInput));
    }

    @Test
    void encode_shouldHandleStringsContainingSpecialCharacters() {
        List<String> testInput = Arrays.asList("Hello#World", "123#456");
        String expected = "11#Hello#World7#123#456";
        assertEquals(expected, encodeAndDecode.encode(testInput));
    }

    @Test
    void decode_shouldHandleEmptyString() {
        String testInput = "";
        List<String> expected = new ArrayList<>();
        assertEquals(expected, encodeAndDecode.decode(testInput));
    }

    @Test
    void decode_shouldHandleEncodedEmptyString() {
        String testInput = "0#";
        List<String> expected = Collections.singletonList("");
        assertEquals(expected, encodeAndDecode.decode(testInput));
    }

    @Test
    void decode_shouldHandleEncodedStringsWithSpecialCharacters() {
        String testInput = "11#Hello#World7#123#456";
        List<String> expected = Arrays.asList("Hello#World", "123#456");
        assertEquals(expected, encodeAndDecode.decode(testInput));
    }

    @Test
    void encodeAndDecode_shouldBeInverseOperations() {
        List<String> testInput = Arrays.asList("Hello", "World", "123", "");
        String encoded = encodeAndDecode.encode(testInput);
        List<String> decoded = encodeAndDecode.decode(encoded);
        assertEquals(testInput, decoded);
    }
}