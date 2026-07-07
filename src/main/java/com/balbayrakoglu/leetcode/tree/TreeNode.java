package com.balbayrakoglu.leetcode.tree;

public class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;

    public TreeNode(int value, TreeNode right, TreeNode left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                ", right=" + right +
                ", left=" + left +
                '}';
    }

    public static void main(String[] args) {

    }

    public static boolean contains(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.value == target) {
            return true;
        }
        return (contains(root.left, target) || contains(root.right, target));
    }

}
