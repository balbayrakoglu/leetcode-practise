package com.balbayrakoglu.leetcode.common;

public class ArrayListVsLinkedList {

        /*
        * ArrayList and LinkedList are two common implementations of the List interface in Java, each with its own advantages and disadvantages.
        *
        * ArrayList:
        * - Backed by a dynamic array, which allows for fast random access (O(1) time complexity for get and set operations).
        * - Adding or removing elements from the end of the list is efficient (O(1) time complexity), but adding or removing elements from the middle or beginning can be slow (O(n) time complexity) due to the need to shift elements.
        * - Generally uses less memory than LinkedList because it doesn't require storing additional pointers for each element.
        *
        * LinkedList:
        * - Implemented as a doubly linked list, where each element (node) contains a reference to the previous and next node.
        * - Allows for efficient insertion and deletion of elements at any position (O(1) time complexity), but random access is slower (O(n) time complexity) because it requires traversing the list.
        * - Uses more memory than ArrayList due to storing additional pointers for each node.
        *
        * In summary, if you need fast random access and don't frequently add or remove elements from the middle of the list, ArrayList is a better choice. If you need efficient insertion and deletion at any position and don't require fast random access, LinkedList may be more suitable.
        */

    public static void main(String[] args) {
        // Example usage of ArrayList and LinkedList
        java.util.List<String> arrayList = new java.util.ArrayList<>();
        java.util.List<String> linkedList = new java.util.LinkedList<>();

        // Adding elements
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Accessing elements
        // Both ArrayList and LinkedList will return the same output, but the underlying operations differ in terms of performance.
        // For ArrayList, this is O(1) time complexity, while for LinkedList, this is O(n) time complexity due to the need to traverse the list.
        System.out.println("ArrayList element at index 1: " + arrayList.get(1)); // Output: B
        System.out.println("LinkedList element at index 1: " + linkedList.get(1)); // Output: B

        // Inserting an element in the middle
        arrayList.add(1, "D"); // This will shift elements to the right and may require resizing the underlying array if the capacity is exceeded
        linkedList.add(1, "D"); // This will not require shifting elements but will require updating pointers
        // Some performance differences may be observed here, especially as the size of the list grows.
        // Output the lists after insertion
        // Note: The output will be the same for both lists, but the underlying operations differ in terms of performance.
        // For small lists, the performance difference may not be noticeable, but for larger lists, the ArrayList may experience a significant slowdown due to the need to shift elements, while the LinkedList will maintain efficient insertion.
        System.out.println("ArrayList after insertion: " + arrayList); // Output: [A, D, B, C]
        System.out.println("LinkedList after insertion: " + linkedList); // Output: [A, D, B, C]
    }
}
