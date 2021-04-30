package com.bilqu.solve.ds.util;

public class IntTreeNode {

    public int val;
    public IntTreeNode left;
    public IntTreeNode right;

    public IntTreeNode(){

    }

    public IntTreeNode(int val){
        this.val = val;
    }

    public IntTreeNode(int val, IntTreeNode left, IntTreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return val +
                "->" + left +
                "->" + right ;
    }
}
