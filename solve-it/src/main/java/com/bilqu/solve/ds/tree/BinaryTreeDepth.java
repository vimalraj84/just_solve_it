package com.bilqu.solve.ds.tree;

import com.bilqu.solve.ds.util.TreeNode_Int;
import com.bilqu.solve.ds.util.TreePrinter_Int;

public class BinaryTreeDepth {
    public static void main(String[] args) {
        TreeNode_Int t1 = new TreeNode_Int(1);
        t1.left = new TreeNode_Int(3, new TreeNode_Int(5),null);
        t1.right = new TreeNode_Int(2);

        TreePrinter_Int.printNode(t1);
        System.out.println(maxDepth(t1));

        TreeNode_Int t2 = new TreeNode_Int(2);
        t2.left = new TreeNode_Int(1,null,new TreeNode_Int(4));
        t2.right = new TreeNode_Int(3,null,new TreeNode_Int(7,new TreeNode_Int(9,null, new TreeNode_Int(2)),null));

        TreePrinter_Int.printNode(t2);
        System.out.println(maxDepth(t2));
    }

    private static int maxDepth(TreeNode_Int root){

        if(root == null)
            return 0;

       int leftDepth = maxDepth(root.left);
       int rightDepth = maxDepth(root.right);

       return Math.max(leftDepth,rightDepth)+1;

    }
}
