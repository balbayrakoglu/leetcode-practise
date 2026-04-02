package com.balbayrakoglu.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    /*
     Problem: Encode and Decode Strings
     Design an algorithm to encode a list of strings to a single string and decode it back to the original list.

     Example:
     Input: ["hello","world"]
     Encoded: "5#hello5#world"
     Decoded: ["hello","world"]
    */

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str.length());
            result.append("#");
            result.append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        int n = str.length();

        while (i < n) {
            int len = 0;

            while (str.charAt(i) != '#') {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }

            i++;
            String temp = str.substring(i, i + len);
            result.add(temp);

            i += len;
        }

        return result;
    }
}
