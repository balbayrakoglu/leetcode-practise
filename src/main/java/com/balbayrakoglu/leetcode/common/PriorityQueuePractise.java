package com.balbayrakoglu.leetcode.common;

import java.util.PriorityQueue;

public class PriorityQueuePractise {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int min = 1;
        int max = 10;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            priorityQueue.add(((int) (Math.random() * range)) + min);
        }

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        while (priorityQueue.iterator().hasNext()) {
            System.out.println(priorityQueue.iterator().next().intValue());
        }
    }
}
