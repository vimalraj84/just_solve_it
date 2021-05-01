package com.bilqu.solve.ds.util;

public class TreeNode_Int {
    public int root;
    public TreeNode_Int left;
    public TreeNode_Int right;


    public TreeNode_Int(int root) {
        this.root = root;
    }


    public TreeNode_Int(int head, TreeNode_Int left, TreeNode_Int right) {
        this.root = head;
        this.left = left;
        this.right = right;
    }


    @Override
    public String toString() {
        return "["+root + "(" + left + "," + right + ")]";
    }
}
