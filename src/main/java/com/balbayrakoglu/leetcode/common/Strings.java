package com.balbayrakoglu.leetcode.common;

public class Strings {
    /*
     Purpose: Demonstrate String pool and string equality semantics in Java.
     Shows differences between string literals, runtime concatenation, and new String() instances.

     Example:
     String s1 = "Java"; String s2 = "Ja" + "va"; // s1 == s2 is true
     String s3 = new String("Java"); // s1 == s3 is false, but s1.equals(s3) is true
    */
    public void stringPool() {
        String s1 = "Java";
        String s2 = "Ja" + "va";
        System.out.println(s1 == s2); // true, because both s1 and s2 refer to the same string literal in the string pool
        String s3 = new String("Java"); // This creates a new String object on the heap, not the string pool
        System.out.println(s1 == s3); // false, because s3 is a new String object created on the heap, not the string pool
        System.out.println(s1.equals(s3)); // true, because the content of s1 and s3 is the same

        final String part = "Ja"; // This is a compile-time constant, so it can be used in string concatenation that will be interned in the string pool
        String ns1 = "Java"; // This is a string literal and will be interned in the string pool
        String ns2 = part + "va"; // This will be computed at runtime, and since 'part' is not a compile-time constant, ns2 will not be interned in the string pool
        System.out.println(ns1 == ns2); // false, because ns2 is computed at runtime and results in a new String object on the heap, while ns1 is a string literal in the string pool
    }
}
