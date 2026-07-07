package com.balbayrakoglu.leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion {
    public static void main(String[] args) {
        String[] dizi = {"a", "b", "c"};

        List<String> liste1 = Arrays.asList(dizi);

        System.out.println(liste1);

        List<String> liste2 = new ArrayList<>((Arrays.asList(dizi)));

        System.out.println(liste2);

        List<String> liste3 = Arrays.stream(dizi).toList();

        System.out.println(liste3);

        List<String> liste4 = List.of(dizi);

        System.out.println(liste4);


        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8};

        List<Integer> listInteger = Arrays.stream(sayilar).boxed().toList();

        System.out.println(listInteger);


        List<String> liste = new ArrayList<>(List.of("a", "b", "c"));

        String[] dizi1 = liste.toArray(new String[0]);

        System.out.println(dizi1);

        String[] dizi2 = liste.toArray(String[]::new);

        System.out.println(dizi2);

        List<Integer> listeSayilar = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        int[] dizi3 = listeSayilar.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(dizi3);
    }
}
