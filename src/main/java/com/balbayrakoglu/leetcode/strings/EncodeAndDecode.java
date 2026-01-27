package com.balbayrakoglu.leetcode.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EncodeAndDecode {

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
