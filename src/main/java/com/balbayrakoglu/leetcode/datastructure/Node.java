package com.balbayrakoglu.leetcode.datastructure;

public class Node {
    private String value;
    private Node next;

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "value='" + value + '\'' + ", next=" + next + '}';
    }

    public static void main(String[] args) {
        Node head = new Node("1", new Node("2", new Node("3", new Node("4", new Node("5", null)))));

        head = insertPosition(new Node("yeni", null), head, 4);
        head = deleteHead(head);
        head = insertHead(head, new Node("newHead", null));
        head = insertTail(head, new Node("newTail", null));
        head = deleteByValue(head, "3");

        System.out.println(head);
    }

    public static Node insertPosition(Node node, Node head, int position) {

        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be negative");
        }

        if (head == null) {
            throw new IllegalArgumentException("Node cannot be null");
        }

        if (position == 0) {
            node.next = head;
            return node;
        }

        int count = 1; // 1->2->3->4->5
        Node current = head;
        while (current != null) {
            if (count == position - 1) {
                node.next = current.next;
                current.next = node;
                return head;
            }
            current = current.next;
            count++;
        }
        System.out.println(head.toString());

        throw new IllegalArgumentException("Position out of bounds");
    }

    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }

        System.out.println(head.toString());
        return head.next;
    }

    public static Node insertHead(Node head, Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Node cannot be null");
        }
        node.next = head;
        System.out.println(node.toString());
        return node;
    }

    public static Node insertTail(Node head, Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Node cannot be null");
        }

        if (head == null) {
            return node;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println(head.toString());
        current.next = node;
        return head;
    }

    public static Node deleteByValue(Node head, String value) {
        if (head == null) {
            return null;
        }
        if (head.value.equalsIgnoreCase(value)) {
            return head.next;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.value.equalsIgnoreCase(value)) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }
        System.out.println(head.toString());
        return head;
    }
}
