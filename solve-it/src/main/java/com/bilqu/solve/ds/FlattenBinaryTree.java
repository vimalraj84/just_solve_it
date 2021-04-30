package com.bilqu.solve.ds;

import com.bilqu.solve.ds.util.IntTreeNode;
import com.bilqu.solve.ds.util.TreeNode;
import com.bilqu.solve.ds.util.TreePrinter;

import java.util.LinkedList;
import java.util.Stack;

public class FlattenBinaryTree {

    public static void main(String[] args) {
        IntTreeNode root = new IntTreeNode(1,new IntTreeNode(2, new IntTreeNode(3), new IntTreeNode(4)),new IntTreeNode(5, null, new IntTreeNode(6)));
        //1,2,3,4,5,6
        //1,null,2,null,3,null,4,null,5,null,6,null
        flatten(root);
        System.out.println(root);
    }

    private static void flatten(IntTreeNode root){

        if(root ==null){
            return;
        }

        IntTreeNode left = root.left;
        IntTreeNode right = root.right;

        root.left=null;//always left node will be null in case of flatten tree
        root.right=left; //Assign right with left node

        IntTreeNode current = root;

        while(current.right !=null) {
            current = current.right;
        }

        current.right =right;

        flatten(left);
        flatten(right);
    }
}
