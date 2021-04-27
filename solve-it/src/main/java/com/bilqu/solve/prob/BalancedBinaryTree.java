package com.bilqu.solve.prob;


//Height-balanced binary tree is defined as:
//A binary tree in which the left and right subtrees of every node differ in height by no more than 1.

import com.bilqu.solve.ds.TreeNode;
import com.bilqu.solve.ds.TreePrinter;

public class BalancedBinaryTree {

    public static void main (String[] a){
        //{3,9,20,null,null,15,7};
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.setLeft(treeNode2);
        treeNode1.setRight(treeNode3);
        treeNode3.setLeft(treeNode4);
        treeNode3.setRight(treeNode5);
        TreePrinter.printNode(treeNode1);

        Integer[] tree2 = new Integer[] {3,null,20,15,7};
        Integer[] tree3 = new Integer[] {1,2,2,3,3,null,null,4,4};
        Integer[] tree4  = new Integer[] {};
    }




    private boolean isBalanced(TreeNode<Integer> root) {

        return false;
    }
}
