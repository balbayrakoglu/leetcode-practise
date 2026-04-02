package com.balbayrakoglu.leetcode.common;

import java.util.ArrayList;

public class ArrayVsArrayList {

    /*
     Purpose: Illustrate differences between primitive arrays and ArrayList in Java.
     Shows fixed-size behavior of arrays vs. dynamic resizing of ArrayList.

     Example:
     int[] array = new int[5]; // fixed size
     ArrayList<Integer> arrayList = new ArrayList<>(); // dynamic
    */

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        // This will throw ArrayIndexOutOfBoundsException
        try {     array[5] = 6;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot add more elements to the array: " + e.getMessage());
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // This will not throw an exception, it will just resize the list
        arrayList.add(6);
        System.out.println("ArrayList after adding an element: " + arrayList);
    }
}
