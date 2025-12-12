package com.balbayrakoglu.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid_whenInputsAreValid_shouldReturnTrue() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertTrue(validParentheses.isValid("{[()]}"));
    }
}