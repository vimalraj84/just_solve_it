package com.bilqu.solve.ds;

import com.bilqu.solve.ds.util.TreeNode_Int;
import com.bilqu.solve.ds.util.TreePrinter_Int;
import com.sun.source.tree.Tree;

public class MergeTwoBinaryTree {

    public static void main(String[] args) {

        TreeNode_Int t1 = new TreeNode_Int(1);
        t1.left = new TreeNode_Int(3, new TreeNode_Int(5),null);
        t1.right = new TreeNode_Int(2);

        TreePrinter_Int.printNode(t1);
        

        TreeNode_Int t2 = new TreeNode_Int(2);
        t2.left = new TreeNode_Int(1,null,new TreeNode_Int(4));
        t2.right = new TreeNode_Int(3,null,new TreeNode_Int(7));

        TreePrinter_Int.printNode(t2);

        TreeNode_Int mergedTree = mergeTree(t1,t2);
        TreePrinter_Int.printNode(mergedTree);


    }

    private static TreeNode_Int mergeTree(TreeNode_Int t1, TreeNode_Int t2){

        if(t1 == null) return t2;

        if(t2 == null) return t1;

        t1.root +=t2.root;

        mergeTree(t1.left,t2.left);
        mergeTree(t1.right,t2.right);

        return t1;
    }

}
