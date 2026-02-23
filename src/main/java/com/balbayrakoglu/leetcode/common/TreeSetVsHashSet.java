package com.balbayrakoglu.leetcode.common;

public class TreeSetVsHashSet {

    /*
     * TreeSet and HashSet are both implementations of the Set interface in Java, but they have some key differences:
     *
     * 1. Ordering:
     *    - TreeSet: It is a sorted set that maintains its elements in a sorted order (natural ordering or using a Comparator).
     *    - HashSet: It does not maintain any order of its elements. The order of elements is not guaranteed.
     *
     * 2. Performance:
     *    - TreeSet: It has a time complexity of O(log n) for basic operations like add, remove, and contains due to its underlying tree structure.
     *    - HashSet: It has a time complexity of O(1) for basic operations like add, remove, and contains on average, due to its hash table implementation.
     *
     * 3. Null Elements:
     *    - TreeSet: It does not allow null elements. Attempting to add a null element will throw a NullPointerException.
     *    - HashSet: It allows one null element. You can add null to a HashSet without any issues.
     *
     * 4. Memory Usage:
     *    - TreeSet: It generally uses more memory than HashSet due to the overhead of maintaining the tree structure.
     *    - HashSet: It typically uses less memory than TreeSet as it relies on a hash table.
     *
     * In summary, if you need a sorted set and are okay with slower performance, TreeSet is the choice. If you need faster performance and don't care about order, HashSet is the better option.
     */

    public static void main(String[] args) {
        // Example usage of TreeSet and HashSet
        java.util.Set<String> treeSet = new java.util.TreeSet<>();
        java.util.Set<String> hashSet = new java.util.HashSet<>();

        // Adding elements
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("A"); // Duplicate element, will not be added
        try {
            treeSet.add(null); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Cannot add null to TreeSet: " + e.getMessage());
        }

        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("A"); // Duplicate element, will not be added
        hashSet.add(null); // This will be added successfully

        // Output the sets
        System.out.println("TreeSet: " + treeSet); // Output: [A, B, C] (sorted order)
        System.out.println("HashSet: " + hashSet); // Output: [A, B, C] (order not guaranteed)
    }
}