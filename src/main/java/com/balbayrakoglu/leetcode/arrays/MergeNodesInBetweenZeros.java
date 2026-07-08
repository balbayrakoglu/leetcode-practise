package com.balbayrakoglu.leetcode.arrays;

public class MergeNodesInBetweenZeros {
    /*
     Problem: Merge Nodes in Between Zeros
     0 ile baslayip 0 ile biten bagli listede, iki 0 arasindaki dugumlerin toplamini
     tek dugum yapip 0'lari kaldirarak yeni listeyi dondur.

     Ornek:
     Input: head = [0,3,1,0,4,5,2,0]
     Output: [4,11]

     Yaklasim (Pattern: Linked List - tek gecis + toplam biriktirme):
     - Ilk 0'i atla; 0 gorene kadar degerleri topla, 0 gorunce toplami yeni dugum olarak sonuca ekle.
     - Dummy (sahte) bas dugum kullanmak, sonuc listesinin basini yonetmeyi kolaylastirir.

     Karmasiklik: Zaman O(n) | Alan O(1) (sonuc listesi haric)
     LeetCode: #2181 Merge Nodes in Between Zeros (Medium) - https://leetcode.com/problems/merge-nodes-in-between-zeros/
    */


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
