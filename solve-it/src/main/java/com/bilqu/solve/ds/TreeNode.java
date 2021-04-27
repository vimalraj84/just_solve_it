package com.bilqu.solve.ds;

public class TreeNode<T> {
    private T head;
    private TreeNode<T> left;
    private TreeNode<T> right;


    public TreeNode(T head) {
        this.head = head;
    }


    public TreeNode(T head, TreeNode<T> left, TreeNode<T> right) {
        this.head = head;
        this.left = left;
        this.right = right;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "["+head + "(" + left + "," + right + ")]";
    }
}
