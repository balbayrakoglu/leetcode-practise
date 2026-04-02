package com.balbayrakoglu.leetcode.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    /*
     Problem: Valid Parentheses
     Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     An input string is valid if open brackets are closed by the same type of brackets and in the correct order.

     Example:
     Input: s = "()[]{}"
     Output: true
    */

    public boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(')) return false;
                if ((c == '}' && top != '{')) return false;
                if ((c == ']' && top != '[')) return false;
            }
        }
        return stack.isEmpty();
    }
}
