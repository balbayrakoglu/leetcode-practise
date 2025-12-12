package com.balbayrakoglu.leetcode.strings;

public class GcdOfStrings {
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
