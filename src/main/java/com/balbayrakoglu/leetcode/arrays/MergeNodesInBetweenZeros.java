package com.balbayrakoglu.leetcode.arrays;

public class MergeNodesInBetweenZeros {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" + "val=" + val + ", next=" + next + '}';
        }
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode outCurr = dummy;
        int sum = 0;

        head = head.next; // skipping first 0;
        while (head != null) {
            if (head.val == 0) {
                outCurr.next = new ListNode(sum);
                outCurr = outCurr.next;
                sum = 0;
            } else {
                sum += head.val;
            }
            head = head.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode input = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0, null))))))));
        System.out.println(mergeNodes(input));
    }
}
