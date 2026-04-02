package com.balbayrakoglu.leetcode.strings;

public class GcdOfStrings {
    /*
     Problem: Greatest Common Divisor of Strings
     For two strings `str1` and `str2`, return the largest string `x` such that both `str1` and `str2` are concatenations of `x`.

     Example:
     Input: str1 = "ABCABC", str2 = "ABC"
     Output: "ABC"
    */
    public String gcdOfString(String str1, String str2){
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int length1 = str1.length();
        int length2 = str2.length();
        while ( length2 != 0){
            int temps = length1 % length2;
            length1 = length2;
            length2 = temps;
        }
        return str1.substring(0, length1);
    }
}
