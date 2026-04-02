package com.balbayrakoglu.leetcode.sort;

public class BubbleSort {

    /*
     Problem: Basit Sıralama ve Hedef Arama (Bubble/Selection benzeri yaklaşımla)
     Bu sınıftaki `bubbleSort(int[] arr, int target)` metodu verilen tamsayı dizisini
     yerinde artan sıraya göre sıralar ve sıralanmış dizideki `target` değerinin
     ilk bulunduğu indeksi döndürür. Eğer dizi null veya boşsa veya target bulunamazsa -1 döner.

     Örnek:
     Input: arr = [3, 1, 2], target = 2
     İşlem: arr sıralanır -> [1, 2, 3]
     Output: 1  (target 2 sıralanmış dizide indeksi 1)
    */
    public int bubbleSort(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
